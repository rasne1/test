package mart;


public class Convenience2 extends Mart2 {
	

	@Override
	public void getChange(Buyer buyer) {
		int usepoint = 0;
		if(buyer.getPoint()<100) {
		}
		
		else if(buyer.getPoint()>=100) {
			usepoint =(Math.min(buyer.getPoint(),buyer.payMoney()));
			buyer.decreasePoint(usepoint);
			System.out.println("사용포인트 : "+usepoint);	
		}
		int totalPrice = buyer.payMoney()- usepoint;
		int change = buyer.decreaseWallet(totalPrice);
		System.out.println("잔돈 : "+change);
		
	}
	
	public int addPoints(Buyer buyer) { // 포인트 적립
		int point = (int)(buyer.payMoney() * 0.001);
		buyer.addPoint(point);
		System.out.println("적립포인트 : "+point);
		System.out.println("현재포인트 : "+buyer.getPoint());
		return buyer.getPoint(); 
		
	}
	
	


	

	

}
