package com.ktdsuniversity.edu.homework;

public class Quiz181849 {

	public static void main(String [] args) {
		// 문자열 숫자 N 을 정수로 바꾼다  
		// 정수로 바뀐 N을 하나씩 쪼갠다
		// 쪼갠숫자들을 하나씩 더해 출력한다.
		
		String number = "123456789";
		String[] trans = number.split("");
		
		int d = 0;
		for(int a = 0; a<trans.length; a++) {
	
			int c = Integer.parseInt(trans[a]);
			d+=c;
		}
		System.out.println(d);
	}

}
	
