package LeetCode3;

import java.util.PriorityQueue;

public class Minimum_Operations {
	public static int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add((long)num);
        }
        if (pq.peek() >= k) {
            return 0;
        }
        int count = 0;
        while (pq.size() > 1) {  
            long x = pq.poll();
            long y = pq.poll(); 
            long newVal = x * 2+ y; 
            pq.add((long)newVal);
            count++;
            if (pq.peek() >= k) {
                return count;
            }
        }
        return pq.peek() >= k ? count : -1;
    }

	public static void main(String[] args) {
		int[] arr = {2,11,10,1,3};
		int k=10;
		System.out.println(minOperations(arr,k));
	}

}
