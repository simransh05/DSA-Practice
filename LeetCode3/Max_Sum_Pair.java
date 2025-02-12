package LeetCode3;

import java.util.HashMap;

public class Max_Sum_Pair {
	public static int maximumSum(int[] nums) {
        return max(nums);
    }
    public static int max(int[] arr){
    	HashMap<Integer,Integer> map = new HashMap<>();
    	int ans =-1;
    	for(int num : arr) {
    		int sumDigit = sum(num);
    		if(map.containsKey(sumDigit)) {
    			ans = Math.max(ans, map.get(sumDigit)+num);
    		}map.put(sumDigit, Math.max(map.getOrDefault(sumDigit,0), num));
    	}return ans;
    }
    public static int sum(int n){
        int add = 0;
        while(n!=0){
            int digit = n%10;
            add+=digit;
            n/=10;
        }return add;
    }

	public static void main(String[] args) {
		int[]arr = {18,43,36,13,7};
		System.out.println(maximumSum(arr));
	}

}
