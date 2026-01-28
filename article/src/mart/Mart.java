package mart;


public class Mart {
	private String itemName;
	private int price;
	private int locker;
	private int stock;
	private int refundMoney;
	
	
	public Mart(String itemName,int price,int stock) {

		this.itemName = itemName;
		this.price = price;
		this.stock = stock;
		
	}
	
	Buyer buyer = new Buyer();
	
	
	public String getItemName() {
		return this.itemName;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public int getLocker() {
		return this.locker;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	public void sellItem(int quantity ) {
	
		if(quantity<stock) {
			System.out.println("재고부족");
			
		}
		else {
			if(buyer.getWallet()>this.price*quantity) {
				
			}
			
		}
		this.stock -=quantity;
		this.locker+=this.price*quantity;
		this.refundMoney +=this.price*quantity;
	}
	
	public void refund() {
		if(refundMoney == 0) {
			return;
		}
		else {
			System.out.println(this.refundMoney+" 원 환불합니다.");
			return;
		}
	}

	
}
