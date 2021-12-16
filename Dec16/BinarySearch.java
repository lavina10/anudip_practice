package Dec16practice;

public class BinarySearch {
	 public static int binarySearch(int[] nums, int flag) {
	        int num = nums.length - 1;
	        int lo_num = 0;
	        while (num >= lo_num) {
	            int guess = (lo_num + num) >>> 1;   
	            if (nums[guess] > flag) {
	                num = guess - 1;
	            } else if (nums[guess] < flag) {
	                lo_num = guess + 1;
	            } else {
	                return guess;
	            }
	        }
	        return -1;
	    }
	 
	    public static void main(String[] args) {
	        int[] nums = {1,2,3,4,5};
	        int search_num = 4;
	        int index = binarySearch(nums, search_num);
	        if (index == -1) {
	            System.out.println(search_num + " is not in the array");
	        } else {
	            System.out.println(search_num + " is at index " + index);
	        }
	    }
	}


