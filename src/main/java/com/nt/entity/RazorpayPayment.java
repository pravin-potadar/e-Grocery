package com.nt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "razorpay_payments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RazorpayPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;       // Razorpay Order ID
    private String paymentId;     // Razorpay Payment ID
    private String signature;     // Razorpay Signature (for verification)

    private Double amount;        // Total amount paid
    private String currency;      // E.g., INR
    private String status;        // e.g., created, captured, failed

    private String email;         // User email (optional)
    private String contact;       // User contact number (optional)

    private String createdAt;     // Timestamp when payment was created
}
