package com.ktdsuniversity.edu.homework;

public class Quiz181843 {
	
	// 단어 N 안에 B가 들어가는지 확인하고 
	// 맞다면 1 틀리다면 0 출력
	
	public static void main (String [] args) {
		
		String word = "banana";
		boolean isword = word.contains("wxyz");
		if(isword) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		
	}
	

}
