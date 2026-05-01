package com.tnsif.statickeyword;


class Student{
	String name;
	int id;
	static String collegeName="Atria";
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
		this.collegeName = collegeName;
	}
	void showdetails() {
		System.out.println("Student "+name +" id "+id+" collegeName: "+collegeName);
	}
}
public class Staticvariable {
	public static void main(String[] args) {
		Student s1=new Student("Guru",1);
		Student s2=new Student("Rahul",3);
		Student s3=new Student("Prajwal",7);
		Student s4=new Student("roshan",4);
		
		s1.showdetails();
		s2.showdetails();
		s3.showdetails();
		s4.showdetails();
	}
}
