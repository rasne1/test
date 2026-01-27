package com.ktdsuniversity.edu.array;

public class Q2562 {
	
	public static void main(String [] args) {
		
		
		int [] array= {3,1,4,5,7,9,6,10,11,12,13,14,15,16,17,
						18,19,20,21,22,23,24,25,26,27,28,29,30};
		int temp = 0;
		for(int a = 0; a<array.length; a++) {
			for(int j = a+1; j<array.length; j++) {
				if(array[a]>array[j]) {
					temp = array[a];
					array[a]=array[j];
					array[j]=temp;
				}
					
					
			}
			
			if(array[a]+1 != array[a+1]) {
				System.out.println(array[a]+"");
			}
				
		}
		
		
	}
	
	

}
