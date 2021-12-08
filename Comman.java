package prac;
import java.util.*;
public class Comman {
	public static void main(String[] args) 
    {
       String[] array1 = {"Lavina","Ruchira","vaibhav"};
 
       String[] array2 = {"pooja","komal","Ruchira","anju"};
       
       System.out.println("Array1 : "+Arrays.toString(array1));
       System.out.println("Array2 : "+Arrays.toString(array2));
 
       HashSet<String> set = new HashSet<String>();
 
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i].equals(array2[j]))
                {
                	set.add(array1[i]);
                }
                
            }
        }
            System.out.println("Common element : "+(set));
        }
    }

