package com.ktdsuniversity.edu.array;

public class Q10818 {
	
	public static void main(String [] args) {
		
		
		int [] array = {20,10,35,30,7};
		int lowNum = array[0];
		int maxNum = array[0];
		for(int a= 0; a<array.length; a++) {
			if(array[a]>maxNum) {
				maxNum = array[a];
				
				}
			
			if(array[a]<lowNum) {
				lowNum = array[a];
			}
			}
			
		System.out.println(maxNum+" "+lowNum);	
	}
	
	

}
