package com.nt.controller.payments;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Product;
import com.nt.service.OrderService;
import com.nt.service.ProductsService;

@RestController
public class RazorpayController {

    @Autowired
    private ProductsService productService;

    @Autowired
    private OrderService orderService;


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
        Model model
    ) {
        Product product = productService.getProductById(productId);

        session.setAttribute("product", product);
        session.setAttribute("quantity", quantity);
        session.setAttribute("netAmount", netAmount);
        session.setAttribute("landmark", landmark);
        session.setAttribute("fullAddress", fullAddress);
        session.setAttribute("pinCode", pinCode);

        if ("razorpay".equals(paymentMethod)) {
            return "UserModel/razorpayPage";
        } else if ("cod".equals(paymentMethod)) {
            String paymentId = "COD_" + System.currentTimeMillis();
            orderService.saveRazorpayOrder(product, quantity, netAmount, landmark, fullAddress, pinCode, paymentId);
            session.invalidate();
            model.addAttribute("message", "Your order was placed successfully (Cash on Delivery).");
            return "UserModel/orderSuccess";
        }

        model.addAttribute("error", "Invalid payment method selected.");
        return "UserModel/paymentMethod";
    }

    // ✅ Changed mapping to avoid conflict
    @PostMapping("/razorpaySuccess")
    public String razorpaySuccess(
        @RequestParam String paymentId,
        HttpSession session,
        Model model
    ) {
        Product product = (Product) session.getAttribute("product");
        Integer quantity = (Integer) session.getAttribute("quantity");
        Double netAmount = (Double) session.getAttribute("netAmount");
        String landmark = (String) session.getAttribute("landmark");
        String fullAddress = (String) session.getAttribute("fullAddress");
        String pinCode = (String) session.getAttribute("pinCode");

        orderService.saveRazorpayOrder(product, quantity, netAmount, landmark, fullAddress, pinCode, paymentId);

        session.invalidate();
        model.addAttribute("message", "Payment Successful via Razorpay!");
        return "UserModel/orderSuccess";
    }
}
