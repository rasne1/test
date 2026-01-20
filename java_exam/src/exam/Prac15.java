package exam;

public class Prac15 {

	public static int getnumber(int number, int number2, int number3, int number4, int number5) {
		int result = number + number2 + number3 + number4 + number5;

		return result;

	}

	public static void main(String[] args) {
		int s = getnumber(1, 2, 3, 4, 5);
		System.out.println(s);

		s = getnumber(10, 20, 30, 40, 50);
		System.out.println(s);

		s = getnumber(100, 200, 300, 400, 500);
		System.out.println(s);
	}

}
