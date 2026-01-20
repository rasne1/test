package exam;

public class Prac11 {
	
	public static void printMax(int number1, int number2) {
		
	}
		public static void moreMax(int number1,int number2) {
			
		int b = 0;
		
		if(number1 > number2 ) {
			b+=number1;
			
		}
		else if (number1 < number2) {
			b+=number2;
		}
		System.out.println(b);
		
	}
	public static void main(String[]args) {
		moreMax(10,20);
	}
		

}