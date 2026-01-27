package com.ktdsuniversity.edu.string;

public class StringConcat {
	
	public static void main (String [] args) {
		
		String abcd = "sadasdasdasdasdasd";
		StringBuffer longString = new StringBuffer();
		for(int i = 0 ; i<100; i++) {
			longString.append("sadasdasdasdasdasd");
		}
		String resultString = longString.toString();
		System.out.println(">>"+resultString);
	}
	
	
	public static void appendString(StringBuffer buffer) {
		
		buffer.append("1323123");
	}
		
}
