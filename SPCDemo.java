package com.tnsif.streamAPI;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
//demo for the supplier,predicate and the consumer

public class SPCDemo {
	public static void main(String[] args) {
		//Supplier: no input , return value
		
		Supplier<String> s=()->"Hello from supplier";
		String value=s.get();
		System.out.println(value);
		
		//Predicate: takes one input, return boolean value
		
		Predicate<Integer> iseven=number->number%2==0;
		int testnumber=10;
		if(iseven.test(testnumber)) {
			System.out.println(testnumber+" is even");
		}else {
			System.out.println(testnumber+" is odd");
		}
		//consumer: takes one input, return nothing
		
		Consumer<String> c=message->System.out.println("Consumer method"+message);
		c.accept("this is test message");
		System.out.println(c);
	}
}