package dec17practice;

import java.util.Arrays;
import java.util.List;
public class Return {
	 public static List<Object> getDetails() 
         { 
          String Name = "Lavina"; 
          int Id = 101; 
          return Arrays.asList(Name, Id); 
         } 
	      //driver code
         public static void main(String[] args) 
        { 
         List<Object> Employee = getDetails(); 
          System.out.println(Employee); 

	    } 
	}

