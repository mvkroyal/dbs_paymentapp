package com.dbs.controler;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.models.Customer;
import com.dbs.repository.CustomerRepository;
@CrossOrigin("*")
@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	private final CustomerRepository customerRepository;
	
	@Autowired
	public CustomerController(CustomerRepository customerRepository) {
		
		this.customerRepository = customerRepository;
	}
	//get all customers

@GetMapping("/details")
	public List<Customer> showCustomers() {
		return customerRepository.findAll();
	}
	
	//getting details of customer by its customer id
	@GetMapping("/{id}")
	public Customer getCustomerDetails(@PathVariable long id )
	{
		Customer customer= customerRepository.findById(id)
				.orElseThrow();
	
		return customer;
	}
	
	//doing updation in the customer account balance
	@PutMapping("/{id}")
	public boolean updateCustomerDetail(@RequestBody Customer customer,@PathVariable long customerId  ) {
		Customer customer1=customerRepository.findById(customerId)
				.orElseThrow();
		customer1.setClearBalance(customer.getClearBalance());
	return true;
		
	}
	

}
