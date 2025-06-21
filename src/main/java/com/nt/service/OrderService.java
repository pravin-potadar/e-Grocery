package com.nt.service;

import org.springframework.stereotype.Service;

import com.nt.entity.Product;

@Service
public class OrderService {

    public void saveRazorpayOrder(Product product, Integer quantity, Double netAmount, String landmark,
                                   String fullAddress, String pinCode, String paymentId) {
        // TODO: Save order logic goes here
        System.out.println("Saving order:");
        System.out.println("Product: " + product.getName());
        System.out.println("Quantity: " + quantity);
        System.out.println("Amount: " + netAmount);
        System.out.println("Address: " + fullAddress + ", " + landmark + " - " + pinCode);
        System.out.println("Payment ID: " + paymentId);
    }

}
