package com.tnsif.javainterface;

public class Dog implements Animal ,Pet{
        @Override
        public void play() {
        	System.out.println("The dog plays");
        }
        
       // @Overrride
        public void sound() {
        	System.out.println("The Dog barks");
        }
        
        public static void main(String[] args) {
			Dog obj=new Dog();
			obj.sound();
			obj.play();
			
		}
}
