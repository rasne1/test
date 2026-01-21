package oop;

public class Buyer {
	
	int wallet;	//지갑
	int itemWeight; // 구매할려는 물건 무게
	int totalWeight; // 총 들수있는 무게
	int weight; // 
	public void setWallet(int count) {
		wallet= count;
	}
	public void setTotalWeight(int count) {
		totalWeight = count;
	}
	
	public void buyInventory(int orderItem) { 
		int buyCount=orderItem;
			if(wallet<=1000) { // 돈이 충분한지 체크 
				System.out.println("돈이 부족합니다.");
				return;
			
			}
			
			if (itemWeight + (orderItem * 500) > totalWeight) { // 들수있는 무게 체크
	            System.out.println("더 이상 장바구니를 들 수 없습니다");
	            return;
			}
		
		itemWeight += buyCount*500; // 구매할려는 물건 무게 += 구매개수 * 500
		wallet -= buyCount * 1000;	// 지갑 -=구매개수 *1000
	}	
	public void endBuy() {
		System.out.println("무게 "+ itemWeight + "g");
		System.out.println("지갑 "+ wallet);
	}
}
