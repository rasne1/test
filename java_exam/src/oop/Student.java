package oop;

public class Student {
/**
 * 총점수를 구한다 
 * 평균을 구하고 
 * 
 * 
 * 
 */
	int java;
	int python;
	int cpp;
	int csharp;
	
	public int getSumAllScores() {
	
		int total=java+python+cpp+csharp;
		return total;
	}
	
	public double getAverage() {
		
		double average= (double) (java+python+cpp+csharp)/4;
		return average;
		
	}
	public double getCourseCredit() {
		
		double course=(double) (getAverage()-55)/10;
		return course;
		
	}
	public String getABCDF() {
		
		if(4.1<=getCourseCredit()) {
			return "A+";
		}
		else if(3.6<=getCourseCredit()) {
			return "A";
		}
		else if(3.1<=getCourseCredit()) {
			return "B+";
		}
		else if(2.6<=getCourseCredit()) {
			return "B";
		}
		else if(1.6<=getCourseCredit()) {
			return "c";
		}
		else if(0.6<=getCourseCredit()) {
			return "D";
		}
		else {
			return "F";
		}
		
		
	}
}
