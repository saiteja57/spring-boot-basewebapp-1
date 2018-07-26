package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.InsertResponse;

@Service
public class InsertServiceImpl implements InsertService{

	@Override
	public InsertResponse insert(String username) {
		InsertResponse response = new InsertResponse();
		response.setStatusCode(200);
		response.setStatusMessage("This is the username:"+username);
		return response;
	}

	
}
