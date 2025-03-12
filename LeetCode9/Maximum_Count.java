package LeetCode9;

public class Maximum_Count {
	public static int maximumCount(int[] nums) {
		int countNeg = 0;
		int countPos = 0;
		int maxCount = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				countPos += 1;
			} else if (nums[i] < 0) {
				countNeg += 1;
			}
			if (countPos > countNeg) {
				maxCount = countPos;
			} else {
				maxCount = countNeg;
			}
		}
		return maxCount;
	}

	public static void main(String[] args) {
		int[] nums = {-2,-1,-1,1,2,3};
		System.out.println(maximumCount(nums));
	}

}
