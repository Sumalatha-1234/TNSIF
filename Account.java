package com.tnsif.javainterface;

public class Account {
	
	private int accno;
	private String accname;
	private double balance;
	private Bank bank;
	
	public Account(int accno,String accname,double balance,Bank bank) {
		super();
		this.accno=accno;
		this.accname=accname;
		this.balance=balance;
		this.bank=bank;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}

}
