package mart;


public class Mart {

	private int change;
	
	
	
	public int sell(Buyer buyer,Common common, int quantity) {
		int originalMoney = buyer.getWallet();
		int amount = 0;
		if(common.getStock()<quantity) {
			System.out.println("재고부족");
			return 0;
		}
		else if(buyer.getWallet()<(common.getPrice()*quantity)) {
			System.out.println("잔액부족");
			return 0;
		}
		else {
			amount = (common.getPrice()*quantity);
			buyer.decreaseWallet(amount);
			common.decreaseStock(quantity);
			this.change = originalMoney-amount;
			if(this.change==0) {
				return 0;
			}
			else {
				System.out.println("거스름돈 : "+change+" 입니다.");
			}
			return amount;
		}
		
			
	}
	
	
}
