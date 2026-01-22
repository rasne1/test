package oop;

public class Seller { //판매자
	

	int inventory; //재고
	int money;	//자본금
	boolean end;
	
	public Seller(int inventory) { //재고 수량 
		this.inventory= inventory;
		
	}
	
	public void sellInventory(int orderItem) { //판매
		int sellCount=0;
			if(inventory<=0) { //재고가 0일떄 
				end = false;
				System.out.println("품절되었습니다.");
				return;
			
		}
		else if(inventory>orderItem) { //재고가 주문물건보다 많을떄 
				sellCount=orderItem;
		}
		else if (inventory==orderItem) { // 재고 와 주문물건이 같을떄 
				sellCount=inventory;
		}
		else if (inventory<orderItem) { // 재고가 주문물량보다 부족할떄
				sellCount=inventory;
		}
		inventory -= sellCount; //재고 - 실제 구매물량
		money += sellCount * 1000; // 자본금 + (실제구매물량 * 1000)
		
	}	
	public void endStore() {
		System.out.println("재고 "+ inventory);
		System.out.println("자본금 "+ money);
	}
}
