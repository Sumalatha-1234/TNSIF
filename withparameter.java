package com.tnsif.lambdaexpression;
//demo for parameter

interface Demo{
	String say(String message);
}
public class withparameter {
	public static void main(String[] args) {
		Demo d=(message)->{
			String s1="I would like to say hi!!  ";
			String s2=s1+message;
			return s2;
		};
		System.out.println(d.say("time is precious"));
	}

}