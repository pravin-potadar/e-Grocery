package com.nt.entity;

import java.time.LocalDate;
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
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders") // Use plural to avoid conflict with SQL reserved word "order"
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    // User who placed the order
//    private Long userId;

    // Ordered product
//    private Long productId;
    
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

//    @ManyToOne
//    @JoinColumn(name = "product_id")
//    private Product product;


    private int quantity;

    private double price;

    private double totalPrice;

    private LocalDateTime orderDate;

    private LocalDate deliveryDate;

    private String status;          // e.g., "Pending", "Confirmed", "Shipped"
    private String paymentStatus;   // e.g., "Paid", "Unpaid", "COD"
    
    
    
   

   
}
