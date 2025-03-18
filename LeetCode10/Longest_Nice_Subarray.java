package LeetCode10;

public class Longest_Nice_Subarray {
	public static int longestNiceSubarray(int[] nums) {
		int left = 0;
		int bitmask = 0;
		int maxLen = 0;
		for (int i = 0; i < nums.length; i++) {
			while ((nums[i] & bitmask) != 0) {
				bitmask ^= nums[left];
				left++;
			}
			bitmask |= nums[i];
			maxLen = Math.max(maxLen, i - left + 1);
		}
		return maxLen;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 8, 48, 10 };
		System.out.println(longestNiceSubarray(arr));

	}

}
