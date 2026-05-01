package com.tnsif.statickeyword;

//demo for static method

class Paymentgateway{
	static void shownotification() {
		System.out.println("supported bank : sbi, hdfc.....");
	}
}
public class Staticmethod {
	public static void main(String[] args) {
		Paymentgateway.shownotification();
	}

}
