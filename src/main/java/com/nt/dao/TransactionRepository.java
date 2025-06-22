package com.nt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer>{

}
