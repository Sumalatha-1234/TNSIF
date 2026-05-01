package com.tnsif.exceptionhandling;

public class Multiplecatchblock {
	public static void main(String[] args) {
		int number[] = new int[4];
		
		try{
			int i=number[8];
		}catch(ArithmeticException e) {
			System.out.println("welcome");
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("good bye");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("hi");
		}
	}
}
