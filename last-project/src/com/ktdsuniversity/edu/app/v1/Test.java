package com.ktdsuniversity.edu.app.v1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContactManager c = new ContactManager();
		
		Contact c1 = new Contact();
		
		c1.setName("김민수");
		c1.setFirstName("민수");
		c1.setLastName("김");
		//c1.setEmail("nana@abc.com");
		
		c1.getPhones().add(new Phone(Phone.Type.PERSONAL,"010-123-1234"));
		
		
		Contact c2 = new Contact();
	
		c2.setName("김철수");
		c2.setFirstName("철수");
		c2.setLastName("김");
		c2.setEmail("aa@abc.com");
		
		
		c2.getPhones().add(new Phone(Phone.Type.PERSONAL,"010-456-7890"));
		c2.getPhones().add(new Phone(Phone.Type.HOME,"02-123-4567"));
		
		Company com = new Company();
		com.setCompanyName("KTDS");
		com.setAddress("서울 강남구");
		
		
		
		c2.setCompany(com);
		c2.getCompany().setJob("사원");
		
		c.addAddress(c1);
		c.addAddress(c2);
		
		
		
		
		
		c.printAllAddress();
		System.out.println("번호 입력");
		String input = sc.nextLine();
		c.findNumber(input);
		//c.findEmail(input);
		//c.nameInfo(input);
		//c.deletInfo(1);
		//c.printAllAddress();
		
		
		
	}
	
	
}
