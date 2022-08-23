package com.dbs.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.models.Transaction;
import com.dbs.repository.TransactionRepo;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
	
	private final TransactionRepo transactionRepo;
	@Autowired
	public TransactionController(TransactionRepo transactionRepo) {
		super();
		this.transactionRepo = transactionRepo;
		
	}
	
	
	//get all transaction history
	@GetMapping("/all")
	public List<Transaction> getAllTransaction(){
		return transactionRepo.findAll();
	}
	
	@PostMapping("/add")
	public Transaction createTransaction(@RequestBody Transaction transaction) {
		return transactionRepo.save(transaction);
	}
	
	@GetMapping("/{transaction_Id}")
	public Transaction getAllTransactionById(@PathVariable long transaction_Id){
		Transaction transaction=transactionRepo.getById(transaction_Id);
								
		return transaction;	
	}

	

}
