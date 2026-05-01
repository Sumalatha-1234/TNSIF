package com.tnsif.javainterface;

interface Smartdevice{
	void turnOn();
	void turnOff();
	void getStatus();
}
//class implements the interface

class Smartlight implements Smartdevice{

	@Override
	public void turnOn() {
		System.out.println("Turn on the light");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Turn of the light");
		
	}

	@Override
	public void getStatus() {
		System.out.println("Get the status");
	}
	
}

public class interfacedemo {
	public static void main(String[] args) {
		Smartlight sl=new Smartlight();
		sl.turnOn();
		sl.turnOff();
		sl.getStatus();
	}
}