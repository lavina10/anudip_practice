package Dec16practice;

public class Arraybinarysearch {
	public static void binarySearch(int arr[], int first, int last, int num){  
		   int mid = (first + last)/2;  
		   while( first <= last ){  
		      if ( arr[mid] < num ){  
		        first = mid + 1;     
		      }else if ( arr[mid] == num ){  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Element is not found!");  
		   }  
		 }  
		 public static void main(String args[]){  
		        int arr[] = {1,2,3,4,5,6,7,8,9,10};  
		        int num = 7;  
		        int last=arr.length-1;  
		        binarySearch(arr,0,last,num);     
		 }
}
