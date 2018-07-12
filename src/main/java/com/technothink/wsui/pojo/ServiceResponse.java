package com.technothink.wsui.pojo;

public class ServiceResponse {

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	private String message;
	public ServiceResponse(String message, int status, Object data) {
		super();
		this.message = message;
		this.status = status;
		this.data = data;
	}

	private int status;
	private Object data;

}
