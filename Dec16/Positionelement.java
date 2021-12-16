package Dec16practice;
import java.util.LinkedList;
import java.util.Iterator;

public class Positionelement {
	public static void main(String[] args) {
	    // create linked list
	     LinkedList<String> Ll = new LinkedList<String>();
	   // use add() method to add values in the linked list
	          Ll.add("Anudip");
	          Ll.add("Foundation");
	          Ll.add("Lavina");
	          Ll.add("Gaykar");
	          Ll.add("Student");
	      
	      // print before the showing index list
	   System.out.println("Original linked list:" + Ll);  
	  for(int p=0; p < Ll.size(); p++)
	   {
	      System.out.println("Element at index "+p+": "+Ll.get(p));
	    } 
	 }
}
