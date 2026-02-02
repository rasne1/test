package com.ktdsuniversity.edu.generics;

import java.util.Arrays;

public class ScoreListTest {
	
	public static void main(String[] args) {
		
		ScoreList<Integer,Integer> list = new ScoreList<>();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		
		
		Reducer<Integer,Integer> listReducer = new Reducer<>() {

			@Override
			public Integer reduce(Integer input, Integer output) {
				// TODO Auto-generated method stub
				return input + output;
			}
		};
		
		int sum = list.sum(listReducer, 0);
		System.out.println(sum);
		
		
		
		
		
		int value = list.get(3);
		System.out.println(value);
		
		
		
		
		ScoreList<String,String> strList = new ScoreList<>();
		strList.add("hahaha");
		strList.add("hoho");
		strList.add("hoho");
		
		String concat = "";
		
		for(int i=0; i<3; i++) {
			concat +=strList.get(i);
		}
		System.out.println(concat);
		
		
		
		String strvalue =strList.get(0);
		System.out.println(strvalue);
		
		
		
		ScoreList<String[],String> arraylist = new ScoreList<>();
		arraylist.add(new String [] {"asd","asdasdadd"});
		arraylist.add(new String [] {"a233","sssssd"});
		
		Reducer<String[],String> arrayReducer = new Reducer<>() {

			@Override
			public String reduce(String[] input, String output) {
				
				for(int i = 0; i<input.length; i++) {
					output +=input[i];
				}
				
				return output;
			}
			
		};
		
		String arrayResult = arraylist.sum(arrayReducer, "");
		System.out.println(arrayResult);
		
	}
}
