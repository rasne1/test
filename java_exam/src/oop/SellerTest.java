package oop;

public class SellerTest {
	
	public static void main(String[]args) {
		
		Seller store = new Seller();
		store.setInventory(0);//재고 개수
		store.sellInventory(5);//구매하고자하는 개수 
		store.endStore();
		
		
	}

}
