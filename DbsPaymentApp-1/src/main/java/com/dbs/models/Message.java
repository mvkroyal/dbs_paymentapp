package com.dbs.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.condition.ConditionalOnCloudPlatform;

@Entity
@Table(name="message")
public class Message {
	 @Id
	 private String messageCode;
	 
	 @Column(name="instruction")
	 private String instruction;

	public String getMessageCode() {
		return messageCode;
	}

	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	

	public Message() {
		
	}

	public Message(String messageCode, String instruction) {
		
		this.messageCode = messageCode;
		this.instruction = instruction;
	}
	 
	 

}
