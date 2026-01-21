package exam;

public class Prac18 {
	public static String computeGrade(int subA,int subB,int subC,int subD,int subE ) {
		int amount =  subA+subB+subC+subD+subE;
		double average= calcAverage(amount,5);
		String grade = calcGrade(average); 
		return grade;
		
	}
	public static double calcAverage(int amount, int subjectCount) {
		double score = (double) amount / (double) subjectCount;
		return score;
		
		
	}
	public static String calcGrade(double average) {
		if(average>=90) {
			return "A";
		}
		else if(average>=80) {
			return "B";
		}
		else if(average>=70) {
			return "C";
		}
		else if(average>=60) {
			return "D";
		}
		else {
			return "F";
		}
		
	}
	public static void main (String [] args) {
		String grade = computeGrade(100,95,95,100,100);
		System.out.println(grade);
	}

}
