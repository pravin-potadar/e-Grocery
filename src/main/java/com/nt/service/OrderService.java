package com.nt.service;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.OrderItemRepository;
import com.nt.dao.OrderRepository;
import com.nt.dao.ProductsRepository;
import com.nt.dao.TransactionRepository;
import com.nt.entity.Order;
import com.nt.entity.OrderItem;
import com.nt.entity.Product;
import com.nt.entity.Transaction;
import com.nt.entity.Users;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private OrderItemRepository orderItemRepository;

	@Autowired
	private TransactionRepository transactionRepository;

	@Autowired
	private ProductsRepository productRepository;

	@Transactional
	public void saveRazorpayOrder(Product product, Integer quantity, Double netAmount, String landmark,
			String fullAddress, String pinCode, String paymentId, Users user) {

		Order order = new Order();
		order.setUser(user); // ✅ Set the user here
		order.setOrderDate(LocalDateTime.now());
		order.setDeliveryDate(LocalDate.now().plusDays(5));
		order.setStatus("Confirmed");
		order.setPaymentStatus("Paid");
		order.setLandmark(landmark);
		order.setFullAddress(fullAddress);
		order.setPinCode(pinCode);

		Order savedOrder = orderRepository.save(order);

		OrderItem item = new OrderItem();
		item.setOrder(savedOrder);
		item.setProduct(product);
		item.setQuantity(quantity);
		item.setPrice(product.getPrice());

		orderItemRepository.save(item);

		Transaction txn = new Transaction();
		txn.setOrder(savedOrder);
		txn.setAmount(netAmount);
		txn.setTransactionDate(LocalDateTime.now());
		txn.setTransactionStatus("Success");
		txn.setTransactionReference(paymentId);
		txn.setPaymentMethod(paymentId.startsWith("COD_") ? "COD" : "Razorpay");

		transactionRepository.save(txn);

		product.setStock(product.getStock() - quantity);
		productRepository.save(product);
	}

}
