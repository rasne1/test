package com.ktdsuniversity.edu.array;

public class Q10871 {

	public static void main (String [] args) {
		
		int [] numArray = {1,4,1,2,4,2,4,2,3,4,4};
		int baseNum = 5;
		
		for(int a= 0; a<numArray.length; a++) {
			if(numArray[a]<baseNum) {
				System.out.println(numArray[a]);
			}
		}
		
	}
	
	
	
}
