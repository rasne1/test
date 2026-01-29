package mart;

public class Test {
	
	
	
	public static void main(String [] args) {
		
		Common[] common = {new Common("식자재",3000,30),
						   new Common("과자",2000,20),
						   new Common("음료",4500,50),
						   new Common("주류",6000,80)};
		
		Buyer[] buyer = {new Buyer("고객1",50_000,200,5),
						 new Buyer("고객2",70_000,0,2),
						 new Buyer("고객3",30_000,0,3)};
		
		Buyer[] buyer2 = {new Buyer("고객1",50_000,300,3),
				  		  new Buyer("고객2",70_000,400,2),
				  		  new Buyer("고객3",30_000,500,3)};
		
		
		Mart mart = new Mart();
		Convenience convenience = new Convenience();
		
		
		for(int a = 0; a<buyer.length; a++) { // 마트
			int originalMoney = buyer[a].getWallet();
			System.out.println();
			System.out.println("고객명 : "+buyer[a].getCustomerName());
			System.out.println("지불금액: "+originalMoney);
			System.out.println("보유포인트 : "+buyer[a].getPoint());
			System.out.println("구입물품 :" +common[1].getItemName());
			System.out.println("구입수량 :" +buyer[a].getQuantity());
			System.out.println("가격 : "+common[1].getPrice()*buyer[a].getQuantity());
			System.out.println("재고 : "+common[1].getStock());
			mart.sell(buyer[a],common[1], 3);
		}
		for(int a = 0; a<buyer.length; a++) { // 마트
			int originalMoney = buyer[a].getWallet();
			System.out.println();
			System.out.println("고객명 : "+buyer[a].getCustomerName());
			System.out.println("지불금액: "+originalMoney);
			System.out.println("보유포인트 : "+buyer[a].getPoint());
			System.out.println("구입물품 :" +common[1].getItemName());
			System.out.println("구입수량 :" +buyer[a].getQuantity());
			System.out.println("가격 : "+common[1].getPrice()*buyer[a].getQuantity());
			System.out.println("재고 : "+common[1].getStock());
			convenience.sell(buyer[a],common[1], 3);
		}
		
		
	}	

}
