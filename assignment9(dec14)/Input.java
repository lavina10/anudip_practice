package prac;
import java.util.Scanner;

public class Input {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);     
		System.out.println("Enter the number1:"); 
		int a=sc.nextInt();						
		
		Scanner sa=new Scanner(System.in);					
		System.out.println("Enter the number2:");				
		int b=sa.nextInt();									
		
		Scanner sb=new Scanner(System.in);					
		System.out.println("Enter the number3:");				
		int c=sa.nextInt();								
		
		int sum = a+ b + c;									
		System.out.println("The Addition  is : "+sum);
		int average = sum/3;								
		System.out.println("The Average of : "+average);
		int product =a*b*c;									
		System.out.println("The Product of : "+product);
		int largest = Math.max(a, b);						
		largest=Math.max(largest, c);						
		System.out.println("The largest number: "+largest);
		int smallest = Math.min(a, b);						
		smallest=Math.min(smallest, c);						
		System.out.println("The smallest number: "+smallest);
		
		

	}
}
