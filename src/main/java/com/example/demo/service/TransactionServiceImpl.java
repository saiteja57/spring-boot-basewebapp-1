package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.ModifyRequest;
import com.example.demo.model.UpdateResponse;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Override
	public UpdateResponse update(String firstname, String lastname) {
		// TODO Auto-generated method stub
		UpdateResponse response = new UpdateResponse();
		response.setStatusCode(200);
		response.setStatusMessage("SUCCESS");
		response.setUpdatedNames(firstname+ " JOHN "+ lastname);
		return response;
	}

	@Override
	public int modify(ModifyRequest request) {
		return 1;
	}
	
	
}
