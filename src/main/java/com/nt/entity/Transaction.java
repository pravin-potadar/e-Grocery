package com.nt.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter 
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;
    
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;


//    private Long orderId;            // Link to Order

    private String paymentMethod;    // e.g., "UPI", "COD", "CreditCard"
    
    private String transactionStatus; // e.g., "Success", "Failed", "Pending"
    
    private String transactionReference; // Optional: bank or payment gateway ID

    private double amount;

    private LocalDateTime transactionDate;

 
}
