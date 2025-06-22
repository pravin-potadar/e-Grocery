package com.nt.service;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.OrderRepository;
import com.nt.dao.TransactionRepository;
import com.nt.entity.Order;
import com.nt.entity.Product;
import com.nt.entity.Transaction;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    @Transactional
    public void saveRazorpayOrder(Product product, Integer quantity, Double netAmount, String landmark,
                                   String fullAddress, String pinCode, String paymentId) {

        // Step 1: Save Order
        Order order = new Order();
        order.setUser(product.getUser()); // or get from session
        order.setQuantity(quantity);
        order.setPrice(Double.parseDouble(product.getPrice())); // assuming stored as String
        order.setTotalPrice(netAmount);
        order.setOrderDate(LocalDateTime.now());
        order.setDeliveryDate(LocalDate.now().plusDays(5)); // Estimated
        order.setStatus("Confirmed");
        order.setPaymentStatus("Paid");

        Order savedOrder = orderRepository.save(order);

        // Step 2: Save Transaction
        Transaction txn = new Transaction();
        txn.setOrder(savedOrder);
        txn.setAmount(netAmount);
        txn.setTransactionDate(LocalDateTime.now());
        txn.setTransactionStatus("Success");
        txn.setTransactionReference(paymentId);
        txn.setPaymentMethod(paymentId.startsWith("COD_") ? "COD" : "Razorpay");

        transactionRepository.save(txn);

        // Step 3: Optional - Reduce stock (if using numeric stock)
        // int newStock = Integer.parseInt(product.getStock()) - quantity;
        // product.setStock(String.valueOf(newStock));
        // productRepository.save(product);
    }
}
