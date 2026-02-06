package com.ktdsuniversity.edu.fp.basic.stream.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.ktdsuniversity.edu.fp.basic.stream.object.Dish;
import com.ktdsuniversity.edu.fp.basic.stream.object.DishList;
import com.ktdsuniversity.edu.fp.basic.stream.object.DishType;
import com.ktdsuniversity.edu.fp.basic.stream.object.FoodType;

public class StreamBasic {
	
	
	
	
	
	
	public void printDishUseFor() {
		
		System.out.println("전체 요리 목록 - 칼로리가 500미만인 && FoodType이 MEAT인 && DishType이 Fish- for");
		
		List<Dish> dishList = DishList.makeDishList();
		for(Dish dish : dishList) {
			if(dish.getCalories() < 500 && dish.getFoodType() == FoodType.MEAT && dish.getDishType()==DishType.FISH) {
				System.out.println(dish);
			}
		}
		
		
	}
	
	
	public void printDishUseStrem() {
		
		System.out.println("전체 요리 목록 -칼로리가 500미만인 && FoodType이 MEAT인 && DishType이 Fish  - list.forEach");
		
		List<Dish> dishList = DishList.makeDishList();
		//dishList.forEach(dish -> System.out.println(dish));
		
		//dishList.forEach(System.out :: println);
		dishList.forEach(dish -> {
			if(dish.getCalories()< 500 && dish.getFoodType() == FoodType.MEAT && dish.getDishType()==DishType.FISH ) {
				System.out.println(dish);
			}
		});
		
		
		System.out.println("전체 요리 목록 -칼로리가 500미만인 && FoodType이 MEAT인 && DishType이 Fish- stream");
		
		// stream 을 사용할수 있는 대상 -> List, Set
		dishList //List <Dish>
				.stream() //stream<Dish>
//				.peek(dish -> {
//					System.out.println("첫번쨰 filter를 수행하기 이전의 인스턴스 값");
//					System.out.println("1. "+dish.getName());
//					System.out.println("1. "+dish.getCalories());
//					System.out.println("1. "+dish.getFoodType());
//					System.out.println("1. "+dish.getDishType());
//				})//stream<Dish> (현재 반복중인 인스턴스를 확인 - 디버깅 용도)
				.filter(dish -> dish.getCalories()<500 ) // stream<Dish>
//				.peek(dish -> {
//					System.out.println("두번쨰 filter를 수행하기 이전의 인스턴스 값");
//					System.out.println("2. "+dish.getName());
//					System.out.println("2. "+dish.getCalories());
//					System.out.println("2. "+dish.getFoodType());
//					System.out.println("2. "+dish.getDishType());
//				})//stream<Dish> (현재 반복중인 인스턴스를 확인 - 디버깅 용도)
				.filter(dish -> dish.getFoodType() == FoodType.MEAT ) //stream<Dish>  //&& 일떄는 떨어뜨려서 쓰지만 || 쓸떈 붙여 써야한다.
//				.peek(dish -> {
//					System.out.println("세번쨰 filter를 수행하기 이전의 인스턴스 값");
//					System.out.println("3. "+dish.getName());
//					System.out.println("3. "+dish.getCalories());
//					System.out.println("3. "+dish.getFoodType());
//					System.out.println("3. "+dish.getDishType());
//				})//stream<Dish> (현재 반복중인 인스턴스를 확인 - 디버깅 용도)
				.filter(dish -> dish.getDishType()==DishType.FISH ) //stream<Dish>
//				.peek(dish -> {
//					System.out.println("네번쨰 filter를 수행하기 이전의 인스턴스 값");
//					System.out.println("4. "+dish.getName());
//					System.out.println("4. "+dish.getCalories());
//					System.out.println("4. "+dish.getFoodType());
//					System.out.println("4. "+dish.getDishType());
//				})//stream<Dish> (현재 반복중인 인스턴스를 확인 - 디버깅 용도)
				.forEach(dish->System.out.println(dish));
		
		
	}
	
	public void pirntEvenNumbers() {
		
		List<Integer>numbers = Arrays.asList(2,35,4,7,33,24,33);
		
		//numbers 에 있는 값을 전부 2를 곱해서 짝수로 만들어 출력한다.
		numbers.stream()
			   .map(number -> number*2)
			   .forEach(System.out :: println);
		
		//2. numbers 에 있는 값에서 중복된 숫자는 모두 제거하고 나머지 숫자에 전부 2를 곱해서 짝수로 만들어 출력한다.
		numbers.stream() //Stream<Integer>
		   .distinct() //Stream<Integer>
		   .map(number -> number*2)//Stream<Integer>
		   .forEach(System.out :: println);
		
	}
	
	
	public String makeString() {
		//모든 VEGETABLES 메뉴의 이름들을 ","로 연결한 문자열을 반환한다.
		
		List<Dish> dishList = DishList.makeDishList();
		
		String dishesName = dishList.stream() //Stream<Dish>
									.filter(dish -> dish.getFoodType() == FoodType.VEGETABLES) //Stream<Dish>
									.map(Dish :: getName) //Stream<String>
									.collect( Collectors.joining(", "));
		
		
		
		return dishesName;
	}
	
	public List<Dish> getHealthyDishes(){
		// 변경 불가능한 List ( add불가)
		
		List<Dish> dishes = DishList.makeDishList();
		
		List<Dish> result = dishes.stream()
								  .filter(dish -> dish.getCalories()<400)
								  .toList();
		
		return result;
	}
	
	public List<Dish> getHealthyDishes2(){
		// 변경 가능한 List ( add 가능 )
		
		List<Dish> dishes = DishList.makeDishList();
		
		List<Dish> result = dishes.stream()
								  .filter(dish -> dish.getCalories()<400)
								  .collect(Collectors.toList());
		
		return result;
	}
	
	
	
	
	
	public static void main(String[] args) {
		StreamBasic basic = new StreamBasic();
		
		
		
		basic.pirntEvenNumbers();
		
		basic.printDishUseFor();
		basic.printDishUseStrem();
		String dishesName = basic.makeString();
		System.out.println(dishesName);
		
		List<Dish> result = basic.getHealthyDishes();
		System.out.println(result);
		//result.add(new Dish("곱창",FoodType.MEAT,3000,DishType.MEAT));// 수정불가능 
		List<Dish> result2 = basic.getHealthyDishes2();
		result2.add(new Dish("곱창",FoodType.MEAT,3000,DishType.MEAT));
		System.out.println(result2);
		
	}
	
	
	
	

}
