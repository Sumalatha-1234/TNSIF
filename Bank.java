package com.tnsif.javainterface;

public interface Bank {
	
	double MINIBAL=1000;
	double DEPOSITLIMIT=25000;
	
	void withdraw(Account account,double amount);
	void deposit(Account account,double amount);
	
	

}
