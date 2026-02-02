package com.ktdsuniversity.edu.generics.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListExam {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("오현석1");
		names.add("오현석2");
		names.add("오현석3");
		names.add("오현석4");
		names.add("오현석5");
		
		System.out.println(names);
		String name = null;
		for(int i = 0 ; i<names.size(); i++) {
			name = names.get(i);
			System.out.println(name);
		}
		
		int[] arr = new int[] {1, 2, 3};
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for(int value : arr) {
			System.out.println(value);
		}
		
		
		//List<Product> product = new ArrrayList<>();
		
		
		
	}

}
