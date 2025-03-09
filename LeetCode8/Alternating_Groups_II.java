package LeetCode8;

public class Alternating_Groups_II {
	public static int numberOfAlternatingGroups(int[] colors, int k) {
		int n = colors.length;
		int count = 0;
		int left = 0;
		for (int right = 1; right < n + k - 1; right++) {
			if (colors[right % n] == colors[(right - 1) % n]) {
				left = right;
			}
			if (right - left + 1 >= k) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 1, 0 };
		int k = 3;
		System.out.println(numberOfAlternatingGroups(arr, k));

	}

}
