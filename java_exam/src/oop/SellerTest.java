package oop;

public class SellerTest {
	
	public static void main(String[]args) {
		
		Seller store = new Seller(5);
		
		store.sellInventory(5);//구매하고자하는 개수 
		store.endStore();
		
		
	}

}
