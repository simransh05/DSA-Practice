package LeetCode6;

public class Absolute_Sum {
	public static int maxAbsoluteSum(int[] nums) {
        int max  = kadane(nums);
        int min = kadaneMin(nums);
        return  Math.max(max,Math.abs(min));
    }
    public static int kadane(int[]nums){
        int sum =0 ; int max =Integer.MIN_VALUE; 
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max = Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }return max;
    }
    public static int kadaneMin(int[]nums){
        int sum =0 ; int min =Integer.MAX_VALUE; 
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            min = Math.min(min,sum);
            if(sum>0){
                sum=0;
            }
        }return min;
    }

	public static void main(String[] args) {
		int[] arr = {2,-5,1,-4,3,-2};
		System.out.println(maxAbsoluteSum(arr));

	}

}
