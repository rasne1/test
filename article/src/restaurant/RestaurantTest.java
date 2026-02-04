package restaurant;

import java.util.ArrayList;
import java.util.List;

import restaurant.exception.CashException;
import restaurant.exception.DrunkenException;
import restaurant.exception.FullException;

public class RestaurantTest {
	/*식당test
	*손님이 메뉴판을 보고 고른다
	*지갑에 돈이충분한가 ?
	*(돈이없다면) 끝
	*(충분하면 ) 손님이 주문한다
	*손님의 배부름도와 취함도를 체크하고 기준 미만이 라면 주문 수락
	*(배부름과 취함이 기준이상) 끝  
	*음식과 술이 나온다(음식무게만큼 배부름도 와 알콜비율 10% 만큼취함증가)

	*식사를 종료할떄 계산 ( 손님 지갑 금액감소 , 식당 자본금 증가 ) 


	*식당
	*자본금 / 이름 / 기준

	*자본금의 증감

	*손님

	*지갑 / 배부름도 / 취함도 / 이름/ 
	*무엇으로 주문할것인가
	*지갑에 돈이있는가 ?
	*현재 내 배부름도
	*현재 내 취함도
	*가게 주문기준에 충족되는가 ?
	*지갑 돈의 증감

	*메뉴판
	*음식 / 술 / 
	*음식 마다 배부름도 +  
	*술 알콜비율 10% +
	*음식 가격
	*/
	
	public static void main(String[]args) {
		Consumer [] consumer = {new Consumer("고객1",32000, 0, 0),
								new Consumer("고객2",20000, 0, 0),
								new Consumer("고객3",21000,0, 0)};
		
		Restaurant[] restaurant = {new Restaurant(Res.북경반점, 0, 1800 , 20),
									new Restaurant(Res.자금성, 0, 1900 , 20)};
		
		//메뉴 
		Menu menu1 = new Menu(ResMenu.짜장면,7000,800,0);
		Menu menu2 = new Menu(ResMenu.탕수육,14000,1000,0);
		Menu menu3 = new Menu(ResMenu.이과두주,9000,0,60);
		Menu menu4 = new Menu(ResMenu.연태고량주,8000,0,30);
						
		Menu menu5 = new Menu(ResMenu.짜장면,8000,700,0);
		Menu menu6 = new Menu(ResMenu.탕수육,12000,1200,0);
		Menu menu7 = new Menu(ResMenu.이과두주,7000,0,70);
		Menu menu8 = new Menu(ResMenu.연태고량주,8000,0,20);
		Menu[] menus = {menu1, menu2,menu3,menu4};
		Menu[] menus2 = {menu5,menu6,menu7,menu8};
		
		//손님 정보
		for(int a=0; a<menus.length; a++) {
			int selectMenu1 = (int)(Math.random()*4);
			System.out.println();
			System.out.println("고객명 : "+consumer[0].getName()+"\n현재 소지금 : "+consumer[0].getWallet());
			System.out.println("주문 음식 : "+menus [selectMenu1].getName()+" "+menus [selectMenu1].getPrice());
			System.out.println("현재 배부름도 : "+consumer[0].getConsumerFullness()+"\n현재 취함도 : "+consumer[0].getConsumerDrunkenness());
			System.out.println(restaurant[0].getRestaurantName()+" 기준");
			System.out.println("배부름 : "+restaurant[0].getFullnessLimit()+"\n취함 : "+restaurant[0].getAlcoholLimit());
			try{
				consumer[0].consumer(restaurant[0],menus[selectMenu1],1);
			}
			catch (FullException e){
				System.out.println(e.getMessage());
			}
			catch (DrunkenException e){
				System.out.println(e.getMessage());
			}
			catch (CashException e){
				System.out.println(e.getMessage());
			}
			catch (NullPointerException e) {
				System.out.println("시스템 오류");
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("잘못 선택");
			}
			
			
		}
		for(int a=0; a<menus2.length; a++) {
			int selectMenu2 = (int)(Math.random()*4);
			System.out.println();
			System.out.println("고객명 : "+consumer[1].getName()+"\n현재 소지금 : "+consumer[1].getWallet());
			System.out.println("주문 음식 : "+menus2 [selectMenu2].getName()+" "+menus2 [selectMenu2].getPrice());
			System.out.println("현재 배부름도 : "+consumer[1].getConsumerFullness()+"\n현재 취함도 : "+consumer[1].getConsumerDrunkenness());
			System.out.println(restaurant[1].getRestaurantName()+" 기준");
			System.out.println("배부름 : "+restaurant[1].getFullnessLimit()+"\n취함 : "+restaurant[1].getAlcoholLimit());
			try{
				consumer[1].consumer(restaurant[1],menus2[selectMenu2],1);
			}
			catch (FullException e){
				System.out.println(e.getMessage());
			}
			catch (DrunkenException e){
				System.out.println(e.getMessage());
			}
			catch (CashException e){
				System.out.println(e.getMessage());
			}
			catch (NullPointerException e) {
				System.out.println("시스템 오류");
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("잘못 선택");
			}
		}
		for(int a=0; a<menus.length; a++) {
			int selectMenu3 = (int)(Math.random()*4);
			System.out.println();
			System.out.println("고객명 : "+consumer[2].getName()+"\n현재 소지금 : "+consumer[2].getWallet());
			System.out.println("주문 음식 : "+menus [selectMenu3].getName()+" "+menus [selectMenu3].getPrice());
			System.out.println("현재 배부름도 : "+consumer[2].getConsumerFullness()+"\n현재 취함도 : "+consumer[2].getConsumerDrunkenness());
			System.out.println(restaurant[0].getRestaurantName()+" 기준");
			System.out.println("배부름 : "+restaurant[0].getFullnessLimit()+"\n취함 : "+restaurant[0].getAlcoholLimit());
			try{
				consumer[2].consumer(restaurant[0],menus[selectMenu3],1);
			}
			catch (FullException e){
				System.out.println(e.getMessage());
			}
			catch (DrunkenException e){
				System.out.println(e.getMessage());
			}
			catch (CashException e){
				System.out.println(e.getMessage());
			}
			catch (NullPointerException e) {
				System.out.println("시스템 오류");
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("잘못 선택");
			}
			
			
		}
		
		
		//가게 정보
		System.out.println();
		System.out.println("가게명 : "+restaurant[0].getRestaurantName()+"\n현재 자본금 : "+restaurant[0].getRestaurantCapital());
		System.out.println("메뉴\n"+ menu1.getName()+" "+ menu1.getPrice() +"원 "+ menu1.getFullnessIncrease()+"g");	
		System.out.println( menu2.getName()+" "+ menu2.getPrice() +"원 "+ menu2.getFullnessIncrease()+"g");	
		System.out.println( menu3.getName()+" "+ menu3.getPrice() +"원 "+ menu3.getAlcoholIncrease()+"%");	
		System.out.println( menu4.getName()+" "+ menu4.getPrice() +"원 "+ menu4.getAlcoholIncrease()+"%");	
		
		System.out.println();
		System.out.println("가게명 : "+restaurant[1].getRestaurantName()+"\n현재 자본금 : "+restaurant[1].getRestaurantCapital());
		System.out.println("메뉴\n"+ menu5.getName()+" "+ menu5.getPrice() +"원 "+ menu5.getFullnessIncrease()+"g");	
		System.out.println( menu6.getName()+" "+ menu6.getPrice() +"원 "+ menu6.getFullnessIncrease()+"g");	
		System.out.println( menu7.getName()+" "+ menu7.getPrice() +"원 "+ menu7.getAlcoholIncrease()+"%");	
		System.out.println( menu8.getName()+" "+ menu8.getPrice() +"원 "+ menu8.getAlcoholIncrease()+"%");	
		
	}
	
	
}

