package LeetCode10;

import java.util.HashMap;

public class Divide_Into_2_Pair {
	public static boolean divideArray(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		for (int freq : map.values()) {
			if (freq % 2 != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 2, 3, 2, 2, 2 };
		System.out.println(divideArray(arr));

	}

}
