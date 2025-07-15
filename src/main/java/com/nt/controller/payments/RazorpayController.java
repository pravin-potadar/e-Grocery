package com.nt.controller.payments;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.entity.Product;
import com.nt.entity.Users;
import com.nt.service.OrderService;
import com.nt.service.ProductsService;

@Controller
public class RazorpayController {

    @Autowired
    private ProductsService productService;

    @Autowired
    private OrderService orderService;

    // STEP 1: Payment form handler
    @PostMapping("finalPayment")
    public String finalPaymentHandler(
            @RequestParam("productId") int productId,
            @RequestParam("quantity") int quantity,
            @RequestParam("netAmount") double netAmount,
            @RequestParam("landmark") String landmark,
            @RequestParam("fullAddress") String fullAddress,
            @RequestParam("pinCode") String pinCode,
            @RequestParam("paymentMethod") String paymentMethod,
            HttpSession session,
            Model model) {

        Product product = productService.getProductById(productId);
        Users user = (Users) session.getAttribute("user"); // ✅ Get user from session

        if (product == null || user == null) {
            model.addAttribute("error", "Product or User not found.");
            return "UserModel/paymentMethod";
        }

        if ("razorpay".equalsIgnoreCase(paymentMethod)) {
            // Store in session for next step (razorpay page)
            session.setAttribute("product", product);
            session.setAttribute("quantity", quantity);
            session.setAttribute("netAmount", netAmount);
            session.setAttribute("landmark", landmark);
            session.setAttribute("fullAddress", fullAddress);
            session.setAttribute("pinCode", pinCode);
            session.setAttribute("user", user); // ✅ Ensure user stays in session

            return "UserModel/razorpayPage";
        } else if ("cod".equalsIgnoreCase(paymentMethod)) {
            String paymentId = "COD_" + System.currentTimeMillis();

            orderService.saveRazorpayOrder(product, quantity, netAmount,
                    landmark, fullAddress, pinCode, paymentId, user); // ✅ pass user

            session.invalidate();
            model.addAttribute("message", "Your order was placed successfully (Cash on Delivery).");
            return "UserModel/orderSuccess";
        }

        model.addAttribute("error", "Invalid payment method selected.");
        return "UserModel/paymentMethod";
    }

}
