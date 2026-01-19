package exam;

import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		int inputNumber = 0;
		//사용자가 입력하는 값이 100 이하 일 동안만 { } 실행해라.
		//while (inputNumber <= 100) {
			
			
			//inputNumber = keyboard.nextInt();
			//System.out.println(inputNumber);
		//}
		
		//System.out.println("종료합니다.");
		
		int value = 0;
		int answer = 0;
		while(true) { 
			System.out.println("숫자를 입력하세요.");
			value = keyboard.nextInt();
			if (answer == value) {
				System.out.println("정답입니다 .");
				break;
			}
			else if (answer > value ) {
				System.out.println("up");
			}
			else { System.out.println("down");
			
			}
		}
		
		
		
		
		
	}

}