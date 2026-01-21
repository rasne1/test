package exam;

public class Prac17 {
	
	public static String grade(int number) {
		
		if(number>=60) {
			return "합 격";
		}
		else {
			return "불합격";
		}
		
	}
	public static void main(String[]args) {
		String s = grade(75);
		System.out.println(s);
		
		s = grade(50);
		System.out.println(s);
	}
}