package com.example.demo.model;

public class UpdateResponse {
private int statusCode;
private String statusMessage;
private String updatedNames;
public int getStatusCode() {
	return statusCode;
}
public void setStatusCode(int statusCode) {
	this.statusCode = statusCode;
}
public String getStatusMessage() {
	return statusMessage;
}
public void setStatusMessage(String statusMessage) {
	this.statusMessage = statusMessage;
}
public String getUpdatedNames() {
	return updatedNames;
}
public void setUpdatedNames(String updatedNames) {
	this.updatedNames = updatedNames;
}

}
