package mart;

public class Department extends Convenience2 {

	@Override
	public void getChange(Buyer buyer) {
		int usepoint = 0;
		int totalPrice = 0;
		int discount = 0;
		int beforePrice = 0;
		
		if(buyer.getGradeValue()==1) {
				discount = (int)(buyer.payMoney()*0.03);
				System.out.println("할인금액 : "+discount);
		}
		else if(buyer.getGradeValue()==2) {
				discount =(int)(buyer.payMoney()*0.1);
				System.out.println("할인금액 : "+discount);
		}
		
		else {
			 	discount = 0;
			 	
		}
		
		
		if(buyer.getPoint()<10000) {    //포인트사용
			beforePrice = buyer.payMoney()-discount;
			
		}
		
		else if(buyer.getPoint()>=10000) {
			beforePrice = buyer.payMoney()-discount;
			int max = Math.min(buyer.getPoint(),beforePrice);
			usepoint =(int)(Math.random()*(max+1));
			buyer.decreasePoint(usepoint);
			System.out.println("사용포인트 : "+usepoint);	
		}
		totalPrice = beforePrice-usepoint;
		int change = buyer.decreaseWallet(totalPrice);
		System.out.println("잔돈 : "+change);
		

	}
	
	
	@Override
	public int addPoints(Buyer buyer) { //포인트 적립
		if(buyer.getGradeValue()==0) {
			int point = (int)(buyer.payMoney() * 0.005);
			buyer.addPoint(point);
			System.out.println("적립포인트 : "+point);
			System.out.println("현재포인트 : "+buyer.getPoint());
			
		}
		else if(buyer.getGradeValue()==2) {
			int point = (int)(buyer.payMoney() * 0.03);
			buyer.addPoint(point);
			System.out.println("적립포인트 : "+point);
			System.out.println("현재포인트 : "+buyer.getPoint());
			
			
		}
		else {

			System.out.println("적립포인트 : 0");
			System.out.println("현재포인트 : "+buyer.getPoint());
		}
		
		return buyer.getPoint(); 
	}
	

}
