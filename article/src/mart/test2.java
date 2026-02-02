package mart;

public class test2 {

	
	public static void main(String[] args) {
		
		Mart2 mart = new Mart2();
		Convenience2 convenience= new Convenience2();
		Department department = new Department();
		
		Common[] common = {new Common("식자재",3000,30),
				   		   new Common("과자",3000,20),
				   		   new Common("음료",4500,50),
				   		   new Common("주류",6000,80)};

		Buyer[] buyer = {new Buyer("고객1",50_000,200,5,0),
				 		 new Buyer("고객2",2000,1000,2,0),
				 		 new Buyer("고객3",30_000,20000,3,0),
				 		 new Buyer("고객4",30_000,30000,3,1),
				 		 new Buyer("고객5",30_000,40000,3,2)};
	
		
			int money =mart.sell(buyer[0],common[1], 3);
			System.out.println("===마트===");
			System.out.println("고객명 : "+buyer[0].getCustomerName());
			System.out.println("보유금액 : "+buyer[0].getWallet());
			System.out.println("판매금액 : "+money);		   
			mart.getChange(buyer[0]);
			
			
			int money2 =convenience.sell(buyer[1],common[2], 3);
			System.out.println();
			System.out.println("===편의점===");
			System.out.println("고객명 : "+buyer[1].getCustomerName());
			System.out.println("보유금액 :"+buyer[1].getWallet());
			System.out.println("보유 포인트 : "+buyer[1].getPoint());
			System.out.println("판매금액 : "+money2);
			convenience.getChange(buyer[1]);
			convenience.addPoints(buyer[1]);
			
			int money3 =department.sell(buyer[2],common[3], 3);
			System.out.println();
			System.out.println("===백화점===");
			System.out.println("고객명 : "+buyer[2].getCustomerName());
			buyer[2].getGrade();
			System.out.println("보유금액 :"+buyer[2].getWallet());
			System.out.println("보유 포인트 : "+buyer[2].getPoint());
			System.out.println("판매금액 : "+money3);
			department.getChange(buyer[2]);
			department.addPoints(buyer[2]);
			
			int money4 =department.sell(buyer[3],common[2], 3);
			System.out.println();
			System.out.println("===백화점===");
			System.out.println("고객명 : "+buyer[3].getCustomerName());
			buyer[3].getGrade();
			System.out.println("보유금액 :"+buyer[3].getWallet());
			System.out.println("보유 포인트 : "+buyer[3].getPoint());
			System.out.println("판매금액 : "+money4);
			department.getChange(buyer[3]);
			department.addPoints(buyer[3]);
			
			int money5 =department.sell(buyer[4],common[2], 3);
			System.out.println();
			System.out.println("===백화점===");
			System.out.println("고객명 : "+buyer[4].getCustomerName());
			buyer[4].getGrade();
			System.out.println("보유금액 :"+buyer[4].getWallet());
			System.out.println("보유 포인트 : "+buyer[4].getPoint());
			System.out.println("판매금액 : "+money5);
			department.getChange(buyer[4]);
			department.addPoints(buyer[4]);


	}
}	
