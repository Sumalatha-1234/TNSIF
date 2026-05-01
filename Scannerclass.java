package com.tnsif.inheritence;

import java.util.Scanner;
public class Scannerclass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name=sc.nextLine();
		System.out.println("Enter the age of the "+ name+": ");
		int age=sc.nextInt();
		System.out.println("Name: "+name+" and sumalaAge: "+age);
	}

}
