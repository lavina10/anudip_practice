package prac;
import java.io.*;
public class Fiboo {
	public static void main(String[] args) {

		int n = 10;
	    int Start = 0;
	    int second = 1;
	    System.out.println("Fibonacci Series:");
	    for (int i = 1; i <= n; ++i) {
	      System.out.print(Start + ", ");
	      int nextterm = Start + second;     
	      Start = second;              
	      second = nextterm;
	    }
}
}