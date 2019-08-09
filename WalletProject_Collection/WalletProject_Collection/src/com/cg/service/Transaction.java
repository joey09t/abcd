package com.cg.service;

import com.cg.bean.Account;
import com.cg.exception.InsuffecientFundException;

public interface Transaction extends AccountOperation {
	public double withdraw(Account ob, double amount) throws InsuffecientFundException;
	public double deposite(Account ob, double amount);
	public int transferMoney(Account from, Account to, double amount) throws InsuffecientFundException;
	
	public default void printStatement(Account ob) {
		System.out.println("------------------------------------------");
		System.out.println("Statement for Account No "+ob.getAid());
		System.out.println("Account Holder "+ob.getAccountholder());
		System.out.println("Balance is =>"+ob.getBalance());
		System.out.println("------------------------------------------");
	}
}
