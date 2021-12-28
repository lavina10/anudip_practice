package dec17practice;

public class Grade {
	public static void main(String[] args) {
		// any varible
		char grade = 'u'; 
		// marks get.
		int Marks = 85; 
        //Condition for the exams
		if (Marks >= 90) {
			grade = 'A';
			System.out.println("Perfect");
		} else if (Marks >= 80) {
			grade = 'B';
			System.out.println("Excellent");
		} else if (Marks >= 75) {
			grade = 'C';
			System.out.println("Distinction");
		} else if (Marks >= 60) {
			grade = 'D';
			System.out.println("First class");
		} else {
			grade = 'F';
			System.out.println("Need to study More.");
		}
	}
}
