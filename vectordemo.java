package com.tnsif.collectionframework;

import java.util.Vector;
public class vectordemo {
	public static void main(String[] args) {
		Vector<String> n=new Vector<String>();
		n.add("A");
		n.add("b");
		n.add("h");
		n.add("A");
		n.add(null);
		
		System.out.println(n);
		System.out.println(n.size());
		System.out.println(n.get(4));
		
		n.add(8,"rash");
		System.out.println(n);
		
	    n.set(2, "tulsi");
	    System.out.println(n);
	    System.out.println(n.capacity());
	    
	    System.out.println(n.contains("A"));
	    System.out.println(n.indexOf("h"));
	    
	    n.remove(0);
	    System.out.println(n);
	}

}
