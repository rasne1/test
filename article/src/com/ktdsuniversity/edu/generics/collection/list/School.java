package com.ktdsuniversity.edu.generics.collection.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {
	
	public static void printStudents(Map<Integer, List<Student>> classes, int classNum) {
		
		
		
		List<Student> students = classes.get(classNum);
		
		if(students != null) {
			
			for(Student Student : students) {
				System.out.println(classNum + "반의학생 "+ Student);
			}
		}	
		
	}
	
	
	
	public static void main(String[] args) {
		
		Map<Integer,List<Student>> classes = new HashMap<>();
		
		classes.put(1, new ArrayList<>());
		classes.put(2, new ArrayList<>());
		
		
		List<Student> students = classes.get(1);
		students.add(new Student(1,"김범수"));
		students.add(new Student(2,"나얼"));
		students.add(new Student(3,"박효신"));
		students.add(new Student(4,"이수"));
		
		
		System.out.println(classes);
		System.out.println(classes.size());
		
		printStudents(classes,0);
		printStudents(classes,1);
		printStudents(classes,2);
		printStudents(classes,3);
		
		
		//for(Integer key : classes.keySet()) { // Map은 반복시키지 않는다 굳이 
			//System.out.println(classes.get(key));
		//}
		
		
		
	}
	
	
}
