package com.tnsif.javainterface;

import java.util.Scanner;

public class evenorodd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("the "+num+" is a even");
		}else {
			System.out.println("the "+num+" is a odd");
		}
		
	}

}
