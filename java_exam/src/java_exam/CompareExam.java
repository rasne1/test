package java_exam;

public class CompareExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 10;
		
		// age 가 10대인지 확인해 본다
		// 10 <= age < 20
		// 10대가 맞다면 true 아니라면 false 를 출력
		boolean isteenager = 10<= age && 20>age;
				
			System.out.println (isteenager);
			
		
		
		
		// age 가 20대 인지 확인해본다 .
		// 20 <= age < 30
			//가게의 방문한 고객의 나이 
			int customerAge = 16;
			// 고객의 지갑에 들어있는 돈
			int customerWallet= 3000;
			
			// A가게는 19세 이상의 고객만 방문할 수 있다.
			// A 가게에서 판매하는 모든 제품의 가격은 1500이다.
			// 고객은 가게에서 제품을 구매할수 있을까?
			boolean iscustomer = (customerAge >= 19 && customerWallet >= 1500);
			System.out.println(iscustomer);
			
			int customerAge1 = 25;
			int customerWallet1 = 1300;
			//나이가 19 이상이고 돈이 2000원이상 또는 나이가 3의 배수 면 true 
			boolean iscustomer1 = (customerAge1 >= 19 && (customerWallet1 >= 2000 || customerAge1 % 3==0));
			
			System.out.println(iscustomer1);
			//보기편하게 나눌때 예시
			boolean isAdult = customerAge1 >= 19;
			boolean isBuyer = customerWallet1 >= 2000 || customerAge1 %3 ==0;
			
			System.out.println(isAdult && isBuyer);
			
			
			
			
			
	}

}
