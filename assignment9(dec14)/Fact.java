package prac;
import java.util.Scanner;
public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int fact=1;      
		
		Scanner sc=new Scanner(System.in);     
		System.out.println("Enter the number:"); 
		int num=sc.nextInt();			
		
		for(i=1;i<=num;i++) { 			
			fact= fact *i;    
		}
		System.out.println("Factorial of "+num+ ":"+fact);
		

}
	

	}


