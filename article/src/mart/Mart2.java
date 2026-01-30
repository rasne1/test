package mart;


public class Mart2 {

	private int change;
	private int total;
	
	
	
	
	public int sell(Buyer buyer,Common common,int quantity ) {
		
		this.total = common.getPrice()*quantity;
		if(buyer.getWallet()< total) {
			System.out.println("자금부족");
			return 0;
		}
		if(common.getStock()<quantity) {
			System.out.println("재고부족");
			return 0;
		}
		
		buyer.addPayMoney(total);
		
		return this.total;
		
		
	}
	
	public void getChange(Buyer buyer) {
		this.change = buyer.decreaseWallet(total);
		System.out.println("잔돈 : "+change);
		
	}
	
}
