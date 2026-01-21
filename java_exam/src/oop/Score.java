package oop;

public class Score {
	
	public static void main (String [] args) {
		
		Student score = new Student();
		score.java = 100;
		score.python=97;
		score.cpp=81;
		score.csharp=99;
		
		int total = score.getSumAllScores();
		double average = score.getAverage();
		double course=score.getCourseCredit();
		String grade =score.getABCDF();
		
		System.out.println("총합 "+total);
		System.out.println("평균 "+average);
		System.out.println("학점 "+course);
		System.out.println("등급 "+grade);
				
	}
	
	
}
