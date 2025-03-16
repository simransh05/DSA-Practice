package LeetCode9;

public class House_Robber_IV {
	public static int minCapability(int[] nums, int k) {
		int low = 1;
		int high = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			high = Math.max(high, nums[i]);
		}
		int ans = high;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (isPossible(nums, k, mid)) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

	public static boolean isPossible(int[] arr, int k, int val) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= val) {
				count++;
				i++;
			}
		}
		return count >= k;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 9 };
		int k = 2;
		System.out.println(minCapability(arr, k));

	}

}
