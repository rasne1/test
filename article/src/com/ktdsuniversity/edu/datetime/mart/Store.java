package com.ktdsuniversity.edu.datetime.mart;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.datetime.kakao.Friend;

public class Store {
	
	private List<Item>items;
	
	public Store() {
		this.items = new ArrayList<>();
		
	}
	
	public void add(Item item) {
		//추가
		this.items.add(item);
	}
	public void sell(Base base) {
		
		/**
		 * index에 할당되어있는 제품의 소비기한이 당일이라면 
		 * "오늘까지 드세요"를 출력한다
		 * 소비기한이 3일내에 도래한다면 
		 * "가능한 빨리 드세요" 를 출력한다
		 * 소비기한이 지났다면 
		 * "소비기한이 지나 판매하지 않습니다" 를 출력.
		 */
		
		LocalDate tempExpireDate = null;
		for(Item i : this.items) {
			tempExpireDate = LocalDate.parse(i.getExpireDate().toString());
			tempExpireDate = tempExpireDate.withYear(LocalDate.now().getYear()); 
			
			
			if(base == Base.FUTURE) { //소비기한 3일 이내
				if(tempExpireDate.isAfter(LocalDate.now())
						&& tempExpireDate.isBefore(LocalDate.now().plusDays(4))) {
					System.out.println("가능한 빨리 드세요." + i);
				}
			}
			
			else if(base == Base.NOW) { //소비기한 당일
				if(tempExpireDate.equals(LocalDate.now())) {
					System.out.println("오늘까지 드세요" + i);
				}
				
			}
			else if(base == Base.PAST) { // 소비기한 지남
				if(tempExpireDate.isBefore(LocalDate.now())
						&&tempExpireDate.isAfter(LocalDate.now().minusDays(4))){
					System.out.println("소비기한이 지나 판매하지 않습니다." + i);
				}
			}
		}
		
		
		
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		
		if(this.items.size() == 0 ) {
			buffer.append("등록된 제품이 없습니다.");
		}
		else {
			for(Item i : this.items) {
				buffer.append(i);
				buffer.append("\n");
			}
		}
		
		return buffer.toString();
	}

}
