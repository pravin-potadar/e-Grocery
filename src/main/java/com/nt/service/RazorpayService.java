//package com.nt.service;
//
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//
//import org.json.JSONObject;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.nt.dao.RazorpayPaymentRepository;
//import com.nt.entity.RazorpayPayment;
//import com.razorpay.Order;
//import com.razorpay.RazorpayClient;
//
//@Service
//public class RazorpayService {
//
//    private RazorpayClient razorpayClient;
//
//    @Autowired
//    private RazorpayPaymentRepository paymentRepository;
//
//    public RazorpayService() throws Exception {
//        // Replace with your actual Razorpay Key and Secret
//        razorpayClient = new RazorpayClient("YOUR_KEY_ID", "YOUR_SECRET_KEY");
//    }
//
//    public String createOrder(Double amount) throws Exception {
//        JSONObject orderRequest = new JSONObject();
//        orderRequest.put("amount", (int)(amount * 100)); // amount in paise
//        orderRequest.put("currency", "INR");
//        orderRequest.put("receipt", "txn_" + System.currentTimeMillis());
//
//        Order order = razorpayClient.Orders.create(orderRequest);
//        return order.toString(); // send full order JSON to frontend
//    }
//
//    public RazorpayPayment savePayment(RazorpayPayment payment) {
//        payment.setCreatedAt(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
//        return paymentRepository.save(payment);
//    }
//
//    public boolean verifySignature(String orderId, String paymentId, String signature, String secret) {
//        try {
//            String data = orderId + '|' + paymentId;
//            String generatedSignature = javax.crypto.Mac.getInstance("HmacSHA256")
//                .doFinal(data.getBytes(), new javax.crypto.spec.SecretKeySpec(secret.getBytes(), "HmacSHA256"))
//                .toString();
//
//            return generatedSignature.equals(signature);
//        } catch (Exception e) {
//            return false;
//        }
//    }
//}
