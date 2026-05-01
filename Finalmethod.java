package com.tnsif.finalKeyword;
//demo for final method cannot override

class Ecommerceplatform{
	final void calculate() {
		System.out.println("base discount 10%");
	}
}
class Amazon extends Ecommerceplatform{
	//Override
	 // final void calculate() {   //the final method cannot be override.
		//System.out.println("base discount 20%");
//	}
	//super.calculate();
}

public class Finalmethod {
	public static void main(String[] args) {
		Amazon a=new Amazon();
		a.calculate();
		
	}

}
