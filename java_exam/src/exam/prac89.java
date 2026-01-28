package exam;

import java.util.Arrays;

public class prac89 {
	
	public static void main(String [] args) {
		int [] arr = {15, 3, 27, 9, 20};
		
		
		Arrays.sort(arr);
		int maxnum=arr[0];
		int lownum=arr[0];
		
		for(int a= 0 ; a<arr.length; a++) {
			if(arr[a]>maxnum) {
				maxnum=arr[a];
			}
			if(arr[a]<lownum) {
				lownum=arr[a];
			}
			
		}
		
		System.out.println(maxnum);
		System.out.println(lownum);
		System.out.println(maxnum-lownum);
		
		System.out.println(arr[0]);
		System.out.println(arr[4]);
		System.out.println(arr[4]-arr[0]);
		
		
	}
	
	
	
	
}
