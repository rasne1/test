package exam;

public class Prac10 {

		public static void printNumber(int number1) {
		int b=0;
		
		for(int a = 4; a<=number1; ++a) {
			boolean s =true;
			b+=a;
			for(int c = 1; c<a; ++c) {
				if(a%c==0){
					s=false;
					break;
				}
					System.out.println(a);
				
			}
		public static void main (String[]args) {
			printNumber(20);
			
		}
		
	}

