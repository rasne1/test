package com.ktdsuniversity.edu.array;

public class Q5597 {
	
	public static void main(String [] args) {
		
		
		int [] array = {3,29,38,12,57,74,40,85,61};
		int maxNum = array[0];
		int count = array[0];
		for(int a= 0; a<array.length; a++) {
			if(array[a]>maxNum) {
				maxNum = array[a];
				count ++;
				}
			
			}
			
		System.out.println(maxNum+" "+count);	
	}
	
	

}
