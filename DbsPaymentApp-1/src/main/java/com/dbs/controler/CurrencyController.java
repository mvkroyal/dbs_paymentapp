package com.dbs.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.models.Currency;
import com.dbs.repository.CurrencyRepository;

@RestController
@RequestMapping("/currency")
public class CurrencyController {
	
	private final CurrencyRepository currencyRepository ;
	
	@Autowired
	public CurrencyController(CurrencyRepository currencyRepository) {
		super();
		this.currencyRepository = currencyRepository;
	}
	
	//get value of currency code
	@GetMapping("/{code}")
	public double getCurValue(@PathVariable String code)
	{
		Currency currency=currencyRepository.getById(code);
		return currency.getCurrencyValue();
	}
	
	
	
	
	
	

}
