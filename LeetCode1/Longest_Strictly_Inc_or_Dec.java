package LeetCode1;

public class Longest_Strictly_Inc_or_Dec {
	public static  int longestMonotonicSubarray(int[] nums) {
        int incLength =1;int decLength=1; int inc =1;int dec =1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                incLength++;
                inc = Math.max(inc,incLength);
                decLength=1;
            }else if(nums[i]<nums[i-1]){
                decLength++;
                dec = Math.max(dec,decLength);
                incLength=1;
            }else {
                incLength=1;
                decLength=1;
            }
        }return Math.max(dec,inc);
    }

	public static void main(String[] args) {
		int []arr = {1,4,3,3,2};
		System.out.println(longestMonotonicSubarray(arr));

	}

}
