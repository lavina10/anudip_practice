package Dec16practice;
import java.util.ArrayList;
public class RemoveElement {
 public static void main(String[] args)
 {
	 ArrayList<Integer> al=new ArrayList<>();
	 al.add(10);
	 al.add(20);
	 al.add(30);
	 System.out.println(al);
	 al.remove(2);
	 System.out.println("Final Removing arraylist :"+al);
 }
}
