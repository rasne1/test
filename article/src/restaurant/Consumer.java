package restaurant;

import restaurant.exception.CashException;
import restaurant.exception.DrunkenException;
import restaurant.exception.FullException;

public class Consumer {
	private String name;
	private int wallet;
	private int nowFullness;
	private int nowDrunkenness;
	
	
	public Consumer(String name,int wallet, int nowFullness, int nowDrunkenness) {
		this.name = name;
		this.wallet = wallet;
		this.nowFullness = nowFullness ;
		this.nowDrunkenness = nowDrunkenness;
		
	}
	
	public String getName() { //손님 이름
		return this.name;
	}
	public int getWallet() { // 손님 지갑
		return this.wallet;
	}
	
	public int getConsumerFullness() { // 현재 배부름
		return this.nowFullness;
	}
	
	public double getConsumerDrunkenness() { // 현재 취함
		return this.nowDrunkenness;
	}

	
	public boolean isMoneyEnough(int money) { // 지갑에 돈이있는가 판단
		return this.wallet>money;
		
	}
	
	public void consumer(Restaurant restaurant, Menu menu, int count) { //주문 로직

		int totalPrice = menu.getPrice() * count;
		int myFullness = menu.getFullnessIncrease() * count;
		double myAlcohol  = menu.getAlcoholIncrease() * count*0.1;

	
		if (!this.isMoneyEnough(totalPrice)) {
			throw new CashException("소지금 부족");
		}

	
		if (myFullness > 0 && myAlcohol == 0) {
			if (!restaurant.isConsumerFullness(this, myFullness)) {
				throw new FullException("배가 너무 부릅니다"); 
			}
			else {
			this.wallet -= totalPrice;
			this.nowFullness += myFullness;
			System.out.println("주문 성공");
			restaurant.setRestaurantCapital(totalPrice);
			return;
			}
		}	

	
		if (myAlcohol > 0 && myFullness == 0) {
			if (!restaurant.isConsumerDrunkenness(this, myAlcohol)) {
				throw new DrunkenException("너무 취했습니다.");
				
			}
			else {
			this.wallet -= totalPrice;
			this.nowDrunkenness += myAlcohol;
			System.out.println("주문 성공");
			restaurant.setRestaurantCapital(totalPrice);
			return;
			}
		}
	}	

}

		
