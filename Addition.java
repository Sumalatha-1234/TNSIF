package com.tnsif.javaabstract;

public class Addition extends MyTest{
	
	@Override
	void calculate() {
		int a,b,result;
		a=10;
		b=2;
		
		result=a+b;
		System.out.println("The sum: "+result);
	}
}