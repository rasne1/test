package mart;

public class Buyer {
	
	
	private String customer;
	private int wallet;
	private int point;
	private int quantity;
	private int payMoney;
	private int grade;
	
	
	public Buyer(String customer, int wallet, int point,int quantity,int grade) {
		this.customer = customer;
		this.wallet = wallet;
		this.point = point;
		this.quantity = quantity;
		this.grade = grade;
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
	
	public void addPayMoney(int total) {
		 this.payMoney =total;
		
		
	}
	public int payMoney() {
		return this.payMoney;
	}
	
	
	public void decreasePoint(int point) {
		this.point -=point;
	}
	
	
	public int addPoint(int point) {
		return this.point +=point;
	}
	
	
	public int decreaseWallet(int amount) {
		this.wallet -=amount;
		return this.wallet;
		
	}
	
	public void getGrade() {
		if(this.grade==0) {
			System.out.println("등급 : 일반");
		}
		else if (this.grade==1) {
			System.out.println("등급 : Vip");
		}
		else if(this.grade==2) {
			System.out.println("등급 : VVip");
		}
		
	}
	
	public int getGradeValue() {
		return this.grade;
	}
	

	
	
	
	
	
	
	
	
	
	
	

}
