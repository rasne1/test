package com.ktdsuniversity.edu.datetime.mart;

public class Test {
	
	public static void main(String[] args) {
		
		Store tem = new Store();
		
		tem.add(new Item("우유","2026-02-06"));
		tem.add(new Item("사과","2026-02-04"));
		tem.add(new Item("고기","2026-02-01"));
		tem.add(new Item("상추","2026-02-02"));
		tem.add(new Item("양배추","2026-02-05"));
		tem.add(new Item("버섯","2026-02-07"));
		
		
		tem.sell(Base.FUTURE);
		tem.sell(Base.NOW);
		tem.sell(Base.PAST);
		
		
		System.out.println(tem);
	}

}
