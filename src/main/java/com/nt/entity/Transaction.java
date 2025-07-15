package com.nt.entity;

import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "transactions")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    @Column(nullable = false)
    private String paymentMethod; // Razorpay, COD

    @Column(nullable = false)
    private String transactionStatus; // Success, Failed

    @Column(nullable = false, unique = true)
    private String transactionReference; // Razorpay Payment ID or COD_xxx

    @Column(nullable = false)
    private double amount;

    private LocalDateTime transactionDate;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;
}
