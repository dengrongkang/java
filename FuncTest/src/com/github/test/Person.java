package com.github.test;

public class Person {
	String name;
	int year;
	double ti;
	public Person(String string, int i, double d) {
		// TODO Auto-generated constructor stub
		name=string;
		year=i;
		ti=d;
	}
	public void sayHello() {
		System.out.println("Hello,my name is "+name+" "+year+" old year "+ti+" long");
	}
}
