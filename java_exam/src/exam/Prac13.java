package exam;

public class Prac13 {
	
	public static String getFizz(int number) {
		String result ="";
		if( number%3==0 && number%5==0){
			result = "FizzBuzz";
		}
		else if (number%5==0) {
			result = "Buzz";
		}
		else if(number % 3 ==0) {
			result = "Fizz";
		}
		
		return result;
		
	
	}
	public static void main(String[]args) {

		String result =getFizz(15);
		System.out.println(result);
	}
	
	
}
