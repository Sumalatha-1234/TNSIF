package com.tnsif.exceptionhandling;

public class nestedtrycatch {
	public static void check() {
		String str="TNS";
		
		int slength=str.length();
		System.out.println("String length "+slength);
		
		String str2=null;
		int y=6;
		try {
			try {
				System.out.println(str.charAt(y));
			}catch(StringIndexOutOfBoundsException e){
				System.out.println(e.getMessage());
			}
			System.out.println("string length "+str2.length());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
public static void main(String[] args) {
	nestedtrycatch.check();
}
}
