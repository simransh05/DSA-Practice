package LeetCode8;

public class Find_Missing_And_Repeated_Values {
	public static int[] findMissingAndRepeatedValues(int[][] grid) {
		int n = grid.length;
		int[] ques = new int[n * n + 1];
		int[] ans = new int[2];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				ques[grid[i][j]]++;
			}
		}
		for (int i = 0; i < ques.length; i++) {
			if (ques[i] == 2) {
				ans[0] = i;
			}
			if (ques[i] == 0) {
				ans[1] = i;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[][] grid = { { 9, 1, 7 }, { 8, 9, 2 }, { 3, 4, 6 } };
		int[] ans = findMissingAndRepeatedValues(grid);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + "  ");
		}

	}

}
