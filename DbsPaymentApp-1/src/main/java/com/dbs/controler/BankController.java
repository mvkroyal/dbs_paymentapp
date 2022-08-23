package com.dbs.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.models.Bank;
import com.dbs.models.Customer;
import com.dbs.repository.BankRepository;

@RestController
@RequestMapping("/bank")
public class BankController {
	
	private final BankRepository bankRepository;
	
	@Autowired
	public BankController(BankRepository bankRepository) {
		
		this.bankRepository = bankRepository;
	}
	//getting all bank details
	@GetMapping("/details")
	public List<Bank> getAllbanks()
	{
		return bankRepository.findAll();
	}
	
	
	//getting bank details by id
	@GetMapping("/{id}")
	public String getbankNAme(@PathVariable String id)
	{
		Bank bank= bankRepository.findById(id)
				.orElseThrow();
	
		return bank.getBankName();
	}
	
}
