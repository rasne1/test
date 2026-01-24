package restaurant;

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
	
	public String getName() {
		return this.name;
	}
	public int getWallet() {
		return this.wallet;
	}
	
	public int getConsumerFullness() {
		return this.nowFullness;
	}
	
	public double getConsumerDrunkenness() {
		return this.nowDrunkenness;
	}

	
	public boolean isMoneyEnough(int money) {
		return this.wallet>money;
		
	}
	
	public void consumer(Restaurant restaurant, Menu menu, int count) {

	    int totalPrice = menu.getPrice() * count;
	    int myFullness = menu.getFullnessIncrease() * count;
	    double myAlcohol  = menu.getAlcoholIncrease() * count*0.1;

	  
	    if (!this.isMoneyEnough(totalPrice)) {
	        System.out.println("주문실패 - 소지금 부족");
	        return;
	    }

	
	    if (myFullness > 0 && myAlcohol == 0) {
	        if (!restaurant.isConsumerFullness(this, myFullness)) {
	            System.out.println("주문실패 - 배가 부릅니다.");
	            return;
	        }

	        this.wallet -= totalPrice;
	        this.nowFullness += myFullness;
	        System.out.println("주문 성공");
	        restaurant.setRestaurantCapital(totalPrice);
	        return;
	    }

	   
	    if (myAlcohol > 0 && myFullness == 0) {
	        if (!restaurant.isConsumerDrunkenness(this, myAlcohol)) {
	            System.out.println("주문실패 - 너무 취했습니다.");
	            return;
	        }

	        this.wallet -= totalPrice;
	        this.nowDrunkenness += myAlcohol;
	        System.out.println("주문 성공");
	        restaurant.setRestaurantCapital(totalPrice);
	        return;
	    }
	}

}

		
