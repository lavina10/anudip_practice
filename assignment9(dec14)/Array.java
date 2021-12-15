package prac;

public class Array {
	public static void main(String args[]) {
		int array[] = {1,2,3,4,5};
		int add=0;
		for(int i:array) {
			add=add+i;
		}
		System.out.println("Sum of array:-\n"+add);
	}
}
