package LeetCode2;

import java.util.HashMap;

public class Count_Number_Of_Bad_Pairs {
	public static long countBadPairs(int[] nums) { // O(n^2) 
        long count =0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(j-i!=nums[j]-nums[i]){
                    count++;
                }  
            }
        }return count; // TLE for bigger inputs
    }
	public static long CountPairs(int[] arr) {
		HashMap<Integer,Integer> map = new HashMap<>();
		long n = arr.length;
		long total = (n*(n-1))/2;
		long good =0;
		for(int i=0;i<n;i++) {
			int val = i-arr[i];
			if(map.containsKey(val)) {
				good+=map.get(val);
			}map.put(val, map.getOrDefault(val, 0)+1);
		}return total- good;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(countBadPairs(arr));
		System.out.println(CountPairs(arr));
	}

}
