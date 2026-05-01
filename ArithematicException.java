package com.tnsif.exceptionhandling;

public class ArithematicException {
	public static void main(String[] args) {
		int num=50/5;
		System.out.println(num);
		int num1=50/10;
		System.out.println(num1);
		
		try {
			int num2=50/0;
		}catch(Exception e) {
			System.out.println(e);
		}
		int num3=70/3;
		System.out.println(num3);
	}

}
