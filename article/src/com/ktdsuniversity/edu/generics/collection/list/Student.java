package com.ktdsuniversity.edu.generics.collection.list;

public class Student {

	
	private int number;
	private String name;
	
	
	public Student(int number, String name) {
		this.number = number;
		this.name = name;
		
		
		
	}
	
	
	@Override
	public String toString() {
		return "student [number = " + this.number + ", name="+this.name+"]";
	}
	
	
}
