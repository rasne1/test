package java_exam;

public class MethodExam {

	public static int computeAdd(int number1, int number2) {
		int computeResult = number1 + number2;
		return computeResult;
		
	}
	
	public static void printMyName(String name) {
		System.out.println("제 이름은 "+ name + "입니다.");
		if(name.length()<3) {
			return;
		}
		
	}
	
	public static void main(String[]args) {
		
		int resultAdd = computeAdd(19,21);
		System.out.println(resultAdd);
		/*System.out.println("제 이름은 오현석 입니다.");
		System.out.println("제 이름은 000 입니다.");
		System.out.println("제 이름은 춘식이 입니다.");
		printMyName("오현석");
		printMyName("ㅇㅇㅇ");
		printMyName("춘식이");*/
		
		
	}
}
