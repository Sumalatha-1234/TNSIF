package com.tnsif.lambdaexpression;

interface Sayable{
	public String Say();
}

public class Withoutparameter {
	public static void main(String[] args) {
		Sayable s=()->{return "I have nothing to say";};
		System.out.println(s.Say());
	}
}