package com.techelevator.tenmo.model;

import java.math.BigDecimal;

public class Account {
	
	private int accountId;
	private int userId;
	private BigDecimal balance;
	
	
	public int accountId() {
		return accountId;
		
	}
	public void setaccountId(int accountId) {
			this.accountId = accountId;
	}
	public void setuserId(int userId) {
		this.userId = userId;
	}
	public void setbalance(BigDecimal balance) {
		this.balance = balance;
	}
	public BigDecimal getbalance() {
		return balance;
	}
	public int userId() {
		return userId;
	}
	
	

}
