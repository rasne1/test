package mart;

public class Buyer {
	
	
	private String customer;
	private int wallet;
	private int point;
	private int quantity;
	
	
	public Buyer(String customer, int wallet, int point,int quantity) {
		this.customer = customer;
		this.wallet = wallet;
		this.point = point;
		this.quantity = quantity;
	}
	
	public Buyer() {
		
	}
	
	public String getCustomerName() {
		return this.customer;
	}
	
	public int getWallet() {
		return this.wallet;
	}
	
	public int getPoint() {
		return this.point;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void usePoint(int point) {
		this.point -=point;
	}
	
	public int addPoint(int point) {
		return this.point +=point;
	}
	
	
	public void decreaseWallet(int amount) {
		this.wallet-=amount;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
