package com.ktdsuniversity.edu.app.v1;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {
	
	
	private List<Contact> contactList;
	
	public ContactManager() {
		this.contactList = new ArrayList<>();
		
	}
	
	
	//1. contactList 에 Contact 인스턴스를 추가하는 기능
	public void addAddress(Contact contact) {
		contactList.add(contact);
	}
	
	//2. contactList 에 모든 연락처 정보를 출력하는 기능.
	public void printAllAddress() {
		System.out.println("-----전체 연락처 -----");
		if(contactList == null) {
			System.out.println("저장된 연락처 없음");
		}
		for(Contact contact : contactList) {
			
			
			System.out.println("fist Name : " + contact.getFirstName() 
							   +" last Name : "+ contact.getLastName() );
			if(contact.getEmail() == null) {
				System.out.println("이메일 : 저장된 이메일이 없습니다.");
			}
			else {
				System.out.println("이메일 : " + contact.getEmail());
				
			}
			for (Phone phone : contact.getPhones()) {
				if(contact.getPhones() == null) {
					System.out.println("저장된 번호가 없습니다.");
				}
				System.out.println("전화 타입 : " + phone.getPhoneType());
				System.out.println("전화번호 : "+phone.getPhoneNumber());
			}
		
			if(contact.getCompany() == null) {
				System.out.println("저장된 회사이름이 없습니다.");
			}
			
			else if (contact.getCompany() != null) {
				System.out.println("회사 이름 : " + contact.getCompany().getCompanyName() );
			}
			
			if(contact.getCompany() == null ||contact.getCompany().getJob() == null) {
				System.out.println("저장된 직책이 없습니다.");
			}	
			else{
				System.out.println("회사 직책 : " + contact.getCompany().getJob());
			}
			if(contact.getCompany() == null || contact.getCompany().getAddress() == null) {
				System.out.println("저장된 주소가 없습니다.");
					
				}
			else {
				System.out.println("회사 주소 : " + contact.getCompany().getAddress());
			}
		}
		System.out.println("-------------");	
	}
		
	
	//3. contactList에서 전화번호 검색 결과 출력하는 기능  // 필터
	//   예> 010을 파라미터로 전달하면 전화번호에 010이 보함된 연락처의 모든 정보를 출력.
	
	public List<Contact> findNumber(String number ) {
		List<Contact> result = new ArrayList<>();
		for(Contact c : contactList ) {
			for(Phone phone : c.getPhones() ) {
				if(!phone.getPhoneNumber().contains(number)) {
					
				}
				else if(phone.getPhoneNumber().contains(number)) {
					result.add(c);
					break;
				
				}
			
			
			}
		}
		return result;
		
	}
	
	//4. contactList에서 이름 검색 결과 출력하는 기능. // Map + List ? 
	// 	 예>"김" 을 파라미터로 전달하면 name, firstName, lastName, companyName
	//		에 "김" 이 포함된 연락처의 모든정보를 출력.
	public void nameInfo(String key) {
		for(Contact c : contactList) {
			if(!c.getLastName().contains(key)) {
				System.out.println("정보가 없습니다.");
				return;
			}
			if(c.getLastName().contains(key)) {
				
				System.out.println("이름 : "+c.getName());
				System.out.println("fist Name : " + c.getFirstName());
				System.out.println("last Name : " + c.getLastName());
				
				if(c.getCompany() != null) {
					System.out.println("회사 이름 : "+c.getCompany().getCompanyName());
				}
				
				
			}
		}
		
	}
	
	
	//5. contactList에서 email 검색 결과 출력하는 기능. // 
	//	 예> "@abc.com" 을 파라미터로 전달하면 이메일에 "@abc.com" 이 포함된 연락처의 모든정보를 출력
	public void findEmail(String address ) {
		for(Contact c : contactList ) {
				if(c.getEmail() == null) {
					System.out.println("메일주소가 없습니다.");
					continue;
				}
				if(c.getEmail().contains(address)) {
					System.out.println("이메일 : "+c.getEmail());
				
				}
			}
		
		}
	
	
	
	//6. 연락처 정보 수정 기능 //map.?
	//	 예> 다양한 검색의 결과중 하나를 선택해 연락처 정보를 수정할 수 있는 기능.
	//	 이름을 변경, 전화번호 추가, 전화번호 수정, 회사 정보 수정
	
	//7. 연락처 정보 삭제 기능. // remove?
	//	 예> 다양한 검새긔 결과중 하나를 선택해 contactList에서 제거하는 기능.
	public void deletInfo(int index) {
		if(index >= 0 && index< this.contactList.size()) {
			this.contactList.remove(index);
		}
	}
	
	

}
