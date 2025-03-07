package LeetCode8;

import java.util.ArrayList;
import java.util.List;

public class Closed_Prime_Number_In_Range {
	public static int[] closestPrimes(int left, int right) {
		int[] nums = { -1, -1 }; // Default value if no prime pair found
		List<Integer> list = new ArrayList<>();

		for (int i = left; i <= right; i++) { // Include left and right
			if (isPrime(i)) {
				list.add(i);
			}
		}

		if (list.size() < 2) {
			return nums;
		}

		int minGap = Integer.MAX_VALUE;
		for (int i = 1; i < list.size(); i++) {
			int gap = list.get(i) - list.get(i - 1);
			if (gap < minGap) {
				minGap = gap;
				nums[0] = list.get(i - 1);
				nums[1] = list.get(i);
			}
		}
		return nums;
	}

	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		if (n == 2 || n == 3)
			return true;
		if (n % 2 == 0 || n % 3 == 0)
			return false;

		for (int i = 5; i * i <= n; i += 6) {
			if (n % i == 0 || n % (i + 2) == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int left = 10;
		int right = 19;
		int[] ans = closestPrimes(left, right);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + "  ");
		}
	}

}
