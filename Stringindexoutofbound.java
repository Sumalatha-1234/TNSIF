package com.tnsif.exceptionhandling;

public class Stringindexoutofbound {
	public static void main(String[] args) {
		String str="atria college";
		try {
			char ch=str.charAt(20);
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("exception caught");
		}
	}

}
