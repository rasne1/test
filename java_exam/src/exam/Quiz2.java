package exam;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 800_000;
		int father = 40 ;
		int mother = 36;
		int doughter = 36;
		
		int adultFlightFare = 300_000;
		int kidFlightFare = 120_000;
		int totalmoney = 0;

		
		if(father>19) {
			totalmoney += adultFlightFare;
		}
		
		else if (father<19) {
			totalmoney += kidFlightFare;
		}
		
		if(mother>19) {
			totalmoney += adultFlightFare;
		}
		
		else if (mother<19) {
			totalmoney += kidFlightFare;
		}
		
		if(doughter>19) {
			totalmoney += adultFlightFare;
		}
		
		else if (doughter<19) {
			totalmoney += kidFlightFare;
		}
		
		if(money>totalmoney) {
		
			System.out.println("여행가자.");
		
		}
		else if (money<totalmoney) {
			
			System.out.println("다음에 가자.");
			
		}		
	}

}
