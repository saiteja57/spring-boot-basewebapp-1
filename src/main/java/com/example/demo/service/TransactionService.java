package com.example.demo.service;
import com.example.demo.model.ModifyRequest;
import com.example.demo.model.UpdateResponse;

public interface TransactionService {
	public UpdateResponse update(String firstname, String lastname);
	public int modify(ModifyRequest request);

}
