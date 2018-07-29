package com.example.demo.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.InsertResponse;
import com.example.demo.service.InsertService;

@RestController
public class InsertController {
	private final InsertService insertService;
	
	@Autowired
	public InsertController(InsertService insertService) {
		this.insertService = insertService;
	}

	@RequestMapping(value = "/insert", produces = {APPLICATION_JSON_VALUE}, method = RequestMethod.PUT)
	public InsertResponse getValue(@RequestParam String username) {
		InsertResponse response = new InsertResponse();
		response = insertService.insert(username);
	System.out.println(response.getStatusCode()+" "+response.getStatusMessage());
		return response;
	}
	
	
}
