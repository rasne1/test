package mart;

public class Convenience extends Mart {
	
	private int point;
	@Override
	public int sell(Buyer buyer,Common common,int quantity) {
		int total = common.getPrice()*quantity;
		int originalMoney = buyer.getWallet();
		
		if(common.getStock()<quantity) {
			System.out.println(" 재고 부족 ");
			return 0;
		}
		
		int amount = total;
		int usePoint = 0;
		
		if(buyer.getPoint() >= 100) {
			usePoint = Math.min(buyer.getPoint(), total);
			amount = total - usePoint;
			buyer.usePoint(usePoint);
		}
		if(buyer.getWallet()<amount) {
			System.out.println("금액부족");
			return 0;
		}
		
		common.decreaseStock(quantity);
		buyer.decreaseWallet(amount);
		
		int money = originalMoney-amount;
		if(money==0) {

		}
		else {
			System.out.println("거스름돈 : "+money+" 입니다.");
		}
		int plusPoint = (int)(total*0.01);
		buyer.addPoint(plusPoint);
		System.out.println("사용포인트 : "+usePoint+" 입니다.");
		System.out.println("적립포인트 : "+plusPoint+" 입니다.");
		
		return amount;
		
		
	}
	
	

}
