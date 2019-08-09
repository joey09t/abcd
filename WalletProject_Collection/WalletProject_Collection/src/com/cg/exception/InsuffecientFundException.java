package com.cg.exception;

public class InsuffecientFundException extends Exception {
	private double balance;
	public InsuffecientFundException() {
		// TODO Auto-generated constructor stub
	}
	public InsuffecientFundException(String msg, double balance) {
		// TODO Auto-generated constructor stub
		super(msg);
		this.balance=balance;
	}
	@Override
	public String toString() {
		return "InsuffecientFundException [balance=" + balance + "]"+super.getMessage();
	}
	
}
