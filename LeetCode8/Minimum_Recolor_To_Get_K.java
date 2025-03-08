package LeetCode8;

public class Minimum_Recolor_To_Get_K {
	public static int minimumRecolors(String blocks, int k) {
		int count = 0;
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < blocks.length(); i++) {
			if (i - k >= 0 && blocks.charAt(i - k) == 'B') {
				count--;
			}
			if (blocks.charAt(i) == 'B') {
				count++;
			}
			ans = Math.min(ans, k - count);
		}
		return ans;
	}

	public static void main(String[] args) {
		String blocks = "WBWBBBW";
		int k = 2;
		System.out.println(minimumRecolors(blocks, k));
	}

}
