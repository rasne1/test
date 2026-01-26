package com.ktdsuniversity.edu.homework;

public class Quiz181878 {
	
	public static void main (String [] args) {
		
		String alphabet = "AbCdEfG";
		String english="aBc";
		String transAlPhabet=alphabet.toLowerCase();
		String transEnglish=english.toLowerCase();
		boolean isAlphabet = transAlPhabet.contains(transEnglish);
		if(isAlphabet) {
			System.out.println("1");
			
		}
		else {
			System.out.println("0");
		}
		
	}

}
