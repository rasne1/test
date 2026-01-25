package restaurant;

public class Restaurant {
	
	private int capital;
	private String name;
	private int alcoholLimit;
	private int fullnessLimit;
	
	public Restaurant(String name, int capital, int fullnessLimit, int alcoholLimit  ) {
		this.name = name;
		this.capital = capital;
		this.alcoholLimit = alcoholLimit;
		this.fullnessLimit = fullnessLimit;
	}
	
	public String getRestaurantName() { //식당 이름
		return this.name;
	}
	
	public int getRestaurantCapital() { // 식당 자본금
		return this.capital;
	}
	
	public void setRestaurantCapital(int money) { //식당 자본금 증가량
		this.capital += money;
	}
	public int getAlcoholLimit() { // 식당 취함 기준
		return this.alcoholLimit;
	}
	public int getFullnessLimit() { // 식당 배부름 기준
		return this.fullnessLimit;
	}
	
	public boolean isConsumerFullness(Consumer Consumer,int status) { //배부름 판단
		return this.fullnessLimit >= Consumer.getConsumerFullness()+status;
		
	}
	public boolean isConsumerDrunkenness(Consumer Consumer,double status) { //취함 판단
		return this.alcoholLimit >= Consumer.getConsumerDrunkenness()+status;
				
		
	}
	
	
}
