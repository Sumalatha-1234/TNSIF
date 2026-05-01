package com.tnsif.javaabstract;

abstract class Demo {
	public void calling() {
		System.out.println("Calling"); //concrete method
	}
	
	public abstract void AllIntegration();
	public abstract void Satelitedemo();
	public abstract void healthmonitoring();
	

}

class Test1 extends Demo{
	@Override
	public void AllIntegration() {
		System.out.println("Welcome");
	}
	
	@Override
	public void Satelitedemo() {
		System.out.println("welcome to python");
	}
	
	@Override
	public void healthmonitoring() {
		System.out.println("welcome to ai");
		
	}
}
public class AbstractionDemo{
	public static void main(String[] args) {
		Test1 t=new Test1();
		t.AllIntegration();
		t.Satelitedemo();
		t.healthmonitoring();
	}
}
