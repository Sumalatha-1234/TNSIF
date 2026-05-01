package com.tnsif.javaabstract;

public class Excecutor {
	public static void main(String[] args) {
		MyTest obj=new Addition();
		
		obj.calculate();
		obj.display();
		
		Substraction obj1=new Substraction();
		obj1.calculate();
		
	}

}
