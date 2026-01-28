package mart;

public class Common {
	
	private String name;
	private int price;
	private int stock;
	
	public Common(String name,int price,int stock) {
		
		this.name = name;
		this.price = price;
		this.stock = stock;
			
	}
	
	public String getItemName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	public int setPrice() {
		return this.price;
	}
	
	public int getStock() {
		return this.stock;
	}
	public void decreaseStock(int quantity) {
		this.stock-=quantity;

	}

}
