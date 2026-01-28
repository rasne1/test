package mart;


public class Mart {

	private int safe;
	private int money;
	
	
	public Mart() {
		
	}

	
	public int getSafe() {
		return this.safe;
	}
	

	public void sell(Buyer buyer,Common common,int quantity) {
		int originalMoney = buyer.getWallet();
		if(common.getStock()<quantity) {
			System.out.println("재고부족");
			return;
			
		}
		else {
			if(buyer.getWallet()>common.getPrice()*quantity) {
				System.out.println("구매성공");
				common.decreaseStock(quantity);
				buyer.decreaseWallet(common.getPrice()*quantity);
				this.safe +=common.getPrice()*quantity;
				this.money =originalMoney-(common.getPrice()*quantity);
			}
			
		}
		
	}
	
	public void refund() {
		if(this.money == 0) {
			return;
		}
		else {
			System.out.println("잔돈 "+this.money+" 원 입니다.");
			return;
		}
	}

	
}
