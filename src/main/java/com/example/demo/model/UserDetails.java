package com.example.demo.model;
import javax.persistence.*;

@Entity
@Table
public class UserDetails {
	
	@Id
	private Integer customerId;

	private String userName;
	
	public UserDetails() {
		
	}

	public UserDetails(Integer customerId, String userName) {
		super();
		this.customerId = customerId;
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	
}
