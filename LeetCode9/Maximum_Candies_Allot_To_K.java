package LeetCode9;

public class Maximum_Candies_Allot_To_K {
	public static int maximumCandies(int[] candies, long k) {
		int left = 1;
		int right = max(candies);
		int ans = 0;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			long count = 0;
			for (int candy : candies) {
				count += candy / mid;
			}
			if (count >= k) {
				ans = mid;
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return ans;
	}

	public static int max(int[] arr) {
		int maximum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (maximum < arr[i]) {
				maximum = arr[i];
			}
		}
		return maximum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 10 };
		int k = 5;
		System.out.println(maximumCandies(arr, k));

	}

}
