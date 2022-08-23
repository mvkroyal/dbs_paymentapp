package com.dbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.models.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction, Long> {

}
