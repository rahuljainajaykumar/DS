package Test;

import java.util.HashMap;
import java.util.Map;

public class StringT {
	public static int majorityElement(int[] nums) {
	    int result = 0, count = 0;
	 
	    for(int i = 0; i<nums.length; i++ ) {
	        if(count == 0){
	            result = nums[ i ];
	            count = 1;
	        }else if(result == nums[i]){
	           count++;
	        }else{
	           count--;
	        }
	    }
	 
	    return result;
	}
	public static void main(String[] args) {
		int[] n={3,3,3,1,5,5};
		System.out.println(majorityElement(n));
	}
	
}
