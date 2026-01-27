package com.ktdsuniversity.edu.array;

import java.util.Arrays;

public class Q181853 {
	
	public static void main(String [] args) {
		
		int [] numList = {12, 4, 15, 46, 38, 1, 14};
		int temp = 0;
		for(int a = 0; a<numList.length; a++) {
			for(int b= a+1; b<numList.length; b++) {
				if(numList[a]>numList[b]) {
					temp=numList[a];
					numList[a] = numList[b];
					numList[b] = temp;
				}
			}
		}	
			int[] result = new int [numList.length-2];
			for(int c=0; c<numList.length-2; c++) {
				result[c] = numList[c];
			}
			System.out.println(Arrays.toString(result));
		
		
		
		
		
	}

}
