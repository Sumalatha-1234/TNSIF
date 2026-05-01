package com.tnsif.finalKeyword;

class UPIAPP{
	final int max=10000;
	
	void showLimit() {
		System.out.println("amount: "+max);
	}
	
}
public class Finalvariable {
	public static void main(String[] args) {
		UPIAPP u=new UPIAPP();
		u.showLimit();
		//u.max=2000;
	}

}
