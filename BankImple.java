package com.tnsif.javainterface;

public class BankImple implements Bank{
	@Override
	public void withdraw(Account account,double amount) {
		if(account.getBalance()-amount>MINIBAL) {
			account.setBalance(account.getBalance()-amount);
			System.out.println("withdrawn rupees of "+amount);
		}
		else {
			System.err.println("Insufficient balance to withdraw");
		}
	}
	
	@Override
	public void deposit(Account account,double amount) {
		
	}

}
