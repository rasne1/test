package restaurant;

public class Menu {
	
	int jjajangmyeon;
	int beer;
	
	
	public int getisfoodChange() {
		this.jjajangmyeon +=1000;
		return this.jjajangmyeon;
		
	}
	
	public int getAlcoholChange() {
		this.beer += 10; 
		return this.beer;
	}
	
	
	
	

}
