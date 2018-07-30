package com.example.demo.model;

public class ModifyResponse {
	private int statusCode;
	private String StatusMessage;
	private int responseData;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusMessage() {
		return StatusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		StatusMessage = statusMessage;
	}
	public int getResponseData() {
		return responseData;
	}
	public void setResponseData(int responseData) {
		this.responseData = responseData;
	}
	
	

}
