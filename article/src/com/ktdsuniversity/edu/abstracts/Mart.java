package com.ktdsuniversity.edu.abstracts;

public class Mart extends AbstractMart{
	/**
	 * 상속한 클래스가 추상 클래스 이면서 추상 메소드가 존재할경우 
	 * 추상 메소드를 구현하지 않으면 에러가 발생한다.
	 * 
	 * 
	 * 
	 * 해결 방법 
	 * 1.추상메소드를 서브 클래스에서 구현한다.---> 추상 메소드를 Override 한다.
	 * 2.서브 클래스를 추상 클래스로 변환한다. ---> 인스턴스로 생성할수 없다.
	 * 
	 * 
	 */
	public  Mart(int productPrice) {
		super(productPrice);
	}
	
	@Override
	public int usePoint(Guest guest) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void givePoint(Guest guest, int amount) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public int discount(Guest guest, int amount) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
