package com.nt.controller.payments;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.entity.Product;
import com.nt.service.OrderService;
import com.nt.service.ProductsService;

@Controller
public class RazorpayController {

    @Autowired
    private ProductsService productService;

    @Autowired
    private OrderService orderService;

    // STEP 1: Payment form handler
    @PostMapping("/finalPayment")
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
        if (product == null) {
            model.addAttribute("error", "Product not found.");
            return "UserModel/paymentMethod";
        }

        // Store payment data in session
        session.setAttribute("product", product);
        session.setAttribute("quantity", quantity);
        session.setAttribute("netAmount", netAmount);
        session.setAttribute("landmark", landmark);
        session.setAttribute("fullAddress", fullAddress);
        session.setAttribute("pinCode", pinCode);

        // Decide payment method
        if ("razorpay".equalsIgnoreCase(paymentMethod)) {
            return "UserModel/razorpayPage"; // JSP page to initiate Razorpay
        } else if ("cod".equalsIgnoreCase(paymentMethod)) {
            String paymentId = "COD_" + System.currentTimeMillis();

            orderService.saveRazorpayOrder(product, quantity, netAmount, landmark, fullAddress, pinCode, paymentId);

            session.invalidate();
            model.addAttribute("message", "Your order was placed successfully (Cash on Delivery).");
            return "UserModel/orderSuccess";
        }

        model.addAttribute("error", "Invalid payment method selected.");
        return "UserModel/paymentMethod";
    }

    // STEP 2: Razorpay success callback
    @PostMapping("/razorpaySuccess")
    public String razorpaySuccess(
            @RequestParam String paymentId,
            HttpSession session,
            Model model) {

        Product product = (Product) session.getAttribute("product");
        Integer quantity = (Integer) session.getAttribute("quantity");
        Double netAmount = (Double) session.getAttribute("netAmount");
        String landmark = (String) session.getAttribute("landmark");
        String fullAddress = (String) session.getAttribute("fullAddress");
        String pinCode = (String) session.getAttribute("pinCode");

        if (product == null || quantity == null || netAmount == null) {
            model.addAttribute("error", "Session expired or invalid.");
            return "UserModel/paymentMethod";
        }

        orderService.saveRazorpayOrder(product, quantity, netAmount, landmark, fullAddress, pinCode, paymentId);

        session.invalidate();
        model.addAttribute("message", "Payment Successful via Razorpay!");
        return "UserModel/orderSuccess";
    }
}
