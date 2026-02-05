package com.ktdsuniversity.edu.calc;

public class Test {
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		
		
		
		// num1, num2를 더해 반환한다.
		
		int result = calc.calc2(1, 2, (num1,num2)-> num1 + num2 );
		// num1, num2를 제곱한 수를 반환한다.
		int result2 =calc.calc2(1, 2, (num1,num2)->(int)Math.pow(num1, num2));
		// num1, num2를 큰수를 반환
		int result3 =calc.calc2(1, 2, (num1,num2)->Math.max(num1, num2));
		// num1, num2를 작은수를 반환.
		int result4 =calc.calc2(1, 2, (num1,num2)->Math.min(num1, num2));
		// num1, num2를 배수라면 0을 반환.
		int result5 =calc.calc2(6, 2, (num1,num2)->
													{if(num1%num2 == 0) {
														return 0;}
													else{
														return 1;
														}
															});
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
	}

}
