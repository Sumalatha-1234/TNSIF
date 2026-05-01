package com.tnsif.collectionframework;

import java.util.Stack;
public class Stackdemo {
	public static void main(String[] args) {
		Stack<Integer> n=new Stack<Integer>();
		
		n.push(2);
		n.push(4);
		n.push(6);
		n.push(8);
		n.push(9);
		
		System.out.println(n);
		for(int d:n) {
			System.out.println(d);
		}
		System.out.println(n.peek());
		System.out.println(n.search(34));
		
		n.pop();
		n.pop();
		System.out.println(n);
	}

}
