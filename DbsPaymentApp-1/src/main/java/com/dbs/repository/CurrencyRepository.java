package com.dbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.models.Currency;

public interface CurrencyRepository extends JpaRepository<Currency, String>{

}
