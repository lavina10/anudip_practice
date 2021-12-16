package Dec16practice;

import java.util.LinkedList;
public class insert {
    public static void main(String[]args)
    {
    	LinkedList<String> linkedList = new LinkedList <String>();
    	linkedList.add("B");
    	linkedList.add("C");
    	linkedList.add("D");
    	System.out.println("linkedlist :"+linkedList);
    	linkedList.addFirst("A");
    	linkedList.addLast("E");
    	System.out.println("adding the elements in First and Last position"+ linkedList);
    	
    }
}
