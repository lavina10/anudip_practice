package prac;
import java.util.Scanner;
public class Max {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char str = ' ';
		int i, max = -1;
		int[] arr = new int[256];

		System.out.print("Enter String to find Maximum Char Occurrence =  ");
		String maxOccStr= sc.nextLine();

		for(i = 0; i < maxOccStr.length(); i++)
		{
			arr[maxOccStr.charAt(i)]++;
		}
		for(i = 0; i < maxOccStr.length(); i++) 
		{
			char ch = maxOccStr.charAt(i);
			if(max < arr[ch]) {
				max = arr[ch];
				str = ch;
			}
		}
		System.out.println("\nThe Maximum Occurring Character = " +  str);
		System.out.format("'%c' Character Occurs %d Times ", str, max);	


	}

}
