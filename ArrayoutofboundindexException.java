package com.tnsif.exceptionhandling;

public class ArrayoutofboundindexException {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,8};
		try {
			int num=arr[6];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}