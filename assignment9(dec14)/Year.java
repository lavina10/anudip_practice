package prac;
import java.util.Scanner;
public class Year {
public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year:");
		int l=sc.nextInt();
		if(l%4==0) {
			System.out.println(+l+ " is a leap year");
		}
		else {
			System.out.println(+l+" is not a leap year");
		}
}
}
