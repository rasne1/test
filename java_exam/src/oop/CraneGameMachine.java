package oop;

public class CraneGameMachine {
	
	boolean isinsertCoin;
	int dolls;

	public void insertCoin() {
		int coin = 1;
		if(coin<0 && dolls<=0) {
			isinsertCoin = false;
		}
		else {
			isinsertCoin = true;
		}
	}
		
	public int doGame() {
			
		if (isinsertCoin) {
			int doll = (int)(Math.random()*2);
			if (doll<=2) {
				doll-=1;
				return;
			}
			else {
				
			}
			
			
		}
	
	}
	
		
		
		
	

}
