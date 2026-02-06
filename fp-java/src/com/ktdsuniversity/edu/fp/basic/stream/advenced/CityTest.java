package com.ktdsuniversity.edu.fp.basic.stream.advenced;

import java.util.List;
import java.util.Optional;

public class CityTest {
	
	public static void main(String[] args) {
		List<City> cities = City.loadCityDate();
		cities.forEach(System.out :: println);
		
		for(City city : cities) {
			if(city.getCountryId() == 3907) {
				System.out.println(city.getCountryName());
			}
		}
		
		//==>stream Code 로 구현
		System.out.println();
		cities.stream() //Stream<City>
			  .filter(city -> city.getStateId() ==3907)//Stream<City>
		//	  .map(city -> city.getCountryName()) //Stream < String>
			  .map(City :: getCountryName)
			  .distinct()
		//	  .forEach(countryName -> System.out.println (countryName));
			  .forEach(System.out :: println);
		
		
		// countryName 이 " South Korea" 인 City의 _Native를 출력.
		System.out.println();
		cities.stream()
			  .filter(city -> city.getCountryName().equals("South Korea"))
			  .forEach(city -> System.out.println(city.get_native()));
		
		// countryName 이 " South Korea" 이면서 _native의 길이가 3이상인 City 의 _native를 출력
		System.out.println();
		cities.stream()
		  .filter(city -> city.getCountryName().equals("South Korea"))
		  .filter(city -> city.get_native().length()>=3)
		  .skip(3)
		  .limit(3)
		  .forEach(city -> System.out.println(city.get_native()));
	
		// _native의 값이 한글로만 이루어진 값 중에서 글자의 _native의 길이가 4글자 이상인 것의 
		// name을 중복없이 조회한다.
		System.out.println();
		cities.stream()
			  .filter(city -> city.get_native().matches("^[가-힣]{4,}$"))
			  .map(City :: get_native)
			  .distinct()
		//	  .forEach(System.out :: print);
			  .forEach(city->System.out.println(city));
		
		//애월읍의 stateName을 출력하라
		Optional<City> found = cities.stream() // Stream<City>
									 .filter(city ->city.getName().equals("Gaigeturi"))//Stream<city>
									 .findFirst();//optional<city>
		System.out.println(found.orElse(null).getStateName());
		
		
		Optional<City> found2 = cities.stream() // Stream<City>
				 .filter(city ->city.getName().equals("305051jncvjnvk"))//Stream<city>
				 .findFirst();//optional<city>
//		System.out.println(found2.orElse(null).getStateName()); //Error
		
		//Optional 을 사용하는 case 1
		City city = found2.orElse(null);
		if(city !=null) {
			System.out.println(city.getStateName());
		}
		//Optional 을 사용하는 case 2
		if(found2.isPresent()) {
			System.out.println(found2.get().getStateName());
		}
		//Optional 을 사용하는 case 3
		City city2 = found2.orElse(new City(""));
		System.out.println(city2.getStateName());
		
		
		
		cities.stream()
			  .peek(_city-> System.out.println(_city.getCountryCode()))
			  .filter(_city -> true)
			  .map(_city -> _city.get_native());
		
		System.out.println("~~~~~");
		
		
		
		// 예시> 한글로만 이루어져 있는가 ?
		String name = "오현석";
		
		System.out.println(name + "은 한글로만 이루어져 있다 ?" + name.matches("^[가-힣]{4,}$"));//한글
		
	}
	
	
	
	
	
	

}
