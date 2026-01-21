package oop;

public class BuyerTest {
	
	public static void main (String[]args) {
		
		Buyer customer = new Buyer();
	
		
		
		customer.setWallet(3000);
		customer.setTotalWeight(1500);
		customer.buyInventory(4);
		customer.endBuy();
		
		
	}

}
