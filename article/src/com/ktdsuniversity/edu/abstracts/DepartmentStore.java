package com.ktdsuniversity.edu.abstracts;

public class DepartmentStore extends AbstractMart {
	
	public DepartmentStore(int productPrice) {
		super(productPrice);
	}

	@Override
	public int usePoint(Guest guest) {
		
		return 0;
	}
	
	@Override
	public void givePoint(Guest guest, int amount) {
		if( guest instanceof VVIP) {
			guest.addPoint((int)(amount*0.03));
		}
		
		else if ( guest instanceof VIP) {
			
		}
		
		else if (guest instanceof Guest) {
			guest.addPoint((int)(amount*0.05));
		}
		
		
	}

	@Override
	public int discount(Guest guest, int amount) {
		
		return 0;
	}
	
	
	
}
