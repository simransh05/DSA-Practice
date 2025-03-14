package LeetCode9;

public class Zero_Array_Transformation_II {
	public static int minZeroArray(int[] nums, int[][] queries) {
		int left = 1, right = queries.length;
		int result = -1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (canMakeZero(nums.clone(), queries, mid)) {
				result = mid;
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return result;
	}

	private static boolean canMakeZero(int[] nums, int[][] queries, int k) {
		int n = nums.length;
		int[] diff = new int[n + 1];
		for (int i = 0; i < k; i++) {
			int l = queries[i][0], r = queries[i][1], val = queries[i][2];
			diff[l] -= val;
			if (r + 1 < n)
				diff[r + 1] += val;
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += diff[i];
			nums[i] += sum;
			if (nums[i] > 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 0, 2 };
		int[][] queries = { { 0, 2, 1 }, { 0, 2, 1 }, { 1, 1, 3 } };
		System.out.println(minZeroArray(nums, queries));

	}

}
