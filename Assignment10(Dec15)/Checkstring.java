package prac;

import java.util.Scanner;

public class Checkstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter the String 1:"); 
	       String str1 = sc.nextLine();
	        
	       System.out.println("Enter the String 2:"); 
	       String str2 = sc.nextLine();
	       if(str1.equals(str2)) {
	    	   System.out.println("String1 is eual to string2"); 
	       }
	       else {
	    	   System.out.println("String1 is not eual to string2"); 
	       }
	}
    
}
