package com.nt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nt.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
