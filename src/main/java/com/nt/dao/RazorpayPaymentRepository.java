package com.nt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.RazorpayPayment;

public interface RazorpayPaymentRepository extends JpaRepository<RazorpayPayment, Long> {
    RazorpayPayment findByOrderId(String orderId);
}

