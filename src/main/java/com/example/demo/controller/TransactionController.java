package com.example.demo.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UpdateResponse;
import com.example.demo.service.TransactionService;

@RestController
public class TransactionController {
	
	private final TransactionService transactionService;
	
	@Autowired
	public TransactionController(TransactionService transactionService) {
		this.transactionService = transactionService;
	}

	@RequestMapping(value ="/update", produces= {APPLICATION_JSON_VALUE}, method= RequestMethod.PUT)
public UpdateResponse getValue(@RequestParam String firstname, @RequestParam String lastname) {
		UpdateResponse response= new UpdateResponse();
		response = transactionService.update(firstname, lastname);
		return response;
	}

}
