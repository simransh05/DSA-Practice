package LeetCode1;

public class Maximum_Sum_Subarray {
	public static int maximum(int[]nums) {
		int maxSum = nums[0], sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) { // if increase then only add
                sum += nums[i];
            } else {
                sum = nums[i]; // reset to nums[i]
            }maxSum = Math.max(maxSum, sum);
        }return maxSum;
	}

	public static void main(String[] args) {
		int[] arr = {10,20,30,5,10,50};
		System.out.println(maximum(arr));

	}

}
