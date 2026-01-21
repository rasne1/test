package exam;

public class Prac10 {

		public static void printNumber(int number1) {
		
		for(int a = 4; a<=number1; ++a) {
			boolean s =true;
			
		
			for(int c = 2; c<a; ++c) {
				if(a%c==0){
					s=false;
					break;
		    }			
		}	
					if(s) {
						System.out.println(a);
					}
				
		
}
}
		public static void main (String[]args) {
			printNumber(20);
}
}
			
		
		
	

