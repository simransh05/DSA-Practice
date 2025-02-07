package LeetCode1;

import java.util.HashMap;

public class Tuple_With_Same_Product {
	public static int tupleSameProduct(int[] nums) {
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                if (map.containsKey(product)) {
                    count += map.get(product) * 8; // 8 ways to make these pairs
                }
                map.put(product, map.getOrDefault(product, 0) + 1); // if present then get +1 else 0+1
            }
        }
        return count;
    }

	public static void main(String[] args) {
		int[] arr = {1,2,4,5,10};
		System.out.println(tupleSameProduct(arr));
	}

}
