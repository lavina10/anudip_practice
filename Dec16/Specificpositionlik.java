package Dec16practice;

import java.util.LinkedList;

public class Specificpositionlik {
	 public static void main(String[] args)
	    {
	    	//create the linklist
	    	LinkedList<String>linkedList = new LinkedList<String>();
	    	linkedList.add("red");
	    	linkedList.add("pink");
	    	linkedList.add("anudip");
	    	 System.out.println("linkedlist :"+linkedList);
	    	  //add elements in specific position
	    	 linkedList.add(3,"foundation");
	    	//print the elements
	    	 System.out.println("adding the elements"+ linkedList);
	    }

}
