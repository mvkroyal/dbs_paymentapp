package com.dbs.controler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.models.Message;
import com.dbs.repository.MessageRepository;

@RestController
@RequestMapping("message")
public class MessageController {
	
	private final MessageRepository messageRepository;
	
	@Autowired
	public MessageController(MessageRepository messageRepository) {
		super();
		this.messageRepository = messageRepository;
	}
	//get all mesaages
	
	 
	//get message by code
	@GetMapping("/{code}")
	public String getInstruction(@PathVariable String code) {
		Message message=messageRepository.getById(code);
		return message.getInstruction();
	}
	

}
