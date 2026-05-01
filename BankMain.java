package com.tnsif.javainterface;

public class BankMain {
	public static void main(String[] args) {
		BankImple obj=new BankImple();
		Account acc=new Account(101,"bob",3000,obj);
	    obj.withdraw(acc,1000);
		
	}

}
