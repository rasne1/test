package com.ktdsuniversity.edu.coffee;

public class CoffeShop {

	Coffe hot;
	Coffe ice;
	
	
	public CoffeShop(Coffe hot, Coffe ice) {
		this.hot = hot;
		this.ice = ice;
		
		
	}
	
	/**
	 * 커피숍에서 커피를 판매한다
	 * @param menu 메뉴들의 번호 1: hot 2:ice
	 * @param quantity 주문 수량
	 * @return 주문 가격
	 */
	
	
	public int orderCoffe(int menu, int quantity) {
		
		 if(menu ==1) {
			if(quantity>this.hot.getStock()) {
				System.out.println("재고가 없어 판매하지 않습니다.");
				return 0;
			}
			else {
				System.out.println(this.hot.getName() + "음료를 " + quantity + "개 주문 받았습니다.");
				int stock = this.hot.getStock();
				stock -=quantity;
				this.hot.setStock(stock);
				return hot.getPrice() + quantity;	
			}
			
		}
		else if(menu ==2) {
			 if(quantity>this.ice.getStock()) {
				System.out.println("재고가 없어 판매하지 않습니다.");
				return 0;
			}
			 else {
				System.out.println(this.ice.getName() + "음료를 " + quantity + "개 주문 받았습니다.");
				int stock = this.ice.getStock();
				stock -=quantity;
				this.ice.setStock(stock);	
				return ice.getPrice() + quantity;
			 }
			
		}
		
		else {
			System.out.println("존재하지 않는 음료 입니다.");
			return 0;
		}
		
	}
	
}
