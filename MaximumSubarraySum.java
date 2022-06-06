import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
        long max=0;
        long sum=0;
        
        for(int i=0;i<arr.length;i++){
            sum+=new Long(arr[i]);
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
	}

}
