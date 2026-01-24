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
	
	public String getRestaurantName() {
		return this.name;
	}
	
	public int getRestaurantCapital() {
		return this.capital;
	}
	
	public void setRestaurantCapital(int money) {
		this.capital += money;
	}
	public int getAlcoholLimit() {
		return this.alcoholLimit;
	}
	public int getFullnessLimit() {
		return this.fullnessLimit;
	}
	
	public boolean isConsumerFullness(Consumer Consumer,int status) {
		return this.fullnessLimit >= Consumer.getConsumerFullness()+status;
		
	}
	public boolean isConsumerDrunkenness(Consumer Consumer,double status) {
		return this.alcoholLimit >= Consumer.getConsumerDrunkenness()+status;
				
		
	}
	
	
}
