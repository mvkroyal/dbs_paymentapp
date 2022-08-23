package com.dbs.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.models.Bank;

public interface BankRepository extends JpaRepository<Bank, String> {
	
	
	
	
	

}
