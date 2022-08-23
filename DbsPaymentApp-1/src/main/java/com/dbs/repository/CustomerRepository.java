package com.dbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
