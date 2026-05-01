package com.tnsif.exceptionhandling;

public class Nullpointerexception {
	public static void main(String[] args) {
		String str=null;
		
		try {
			System.out.println(str.length());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
