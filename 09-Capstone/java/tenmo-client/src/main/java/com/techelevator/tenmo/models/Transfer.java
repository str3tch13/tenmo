package com.techelevator.tenmo.models;

import java.math.BigDecimal;

public class Transfer {
	private BigDecimal amount;
	private int account_to;
	//private int account_from;
	
	
	public Transfer(BigDecimal amount, int account_to) {
		super();
		this.amount = amount;
		this.account_to = account_to;
	}
		//this.account_from = account_from;
//	}
//	public int getAccount_from() {
//		return account_from;
//	}
//	public void setAccount_from(int account_from) {
//		this.account_from = account_from;
//	}

	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public int getAccount_to() {
		return account_to;
	}
	public void setAccount_to(int account_to) {
		this.account_to = account_to;
	}

}
