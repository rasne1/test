package exam;

public class Prac14 {
	
	public static String randomNumber(int number1,int number2) {
		String result ="";
	
		if((number1*number2)%2==0) {
			result = "짝수";
		}
		else if((number1*number2)%2!=0) {
			result ="홀수";
		}
		return result;
	}
		
	public static void main (String[]args) {
		
		String result =randomNumber(3,5);
		System.out.println(result);
	}

}
