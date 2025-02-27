package LeetCode6;

import java.util.HashSet;

public class Length_Of_Longest_Fibo {
	public static int lenLongestFibSubseq(int[] arr) {
        int length =0; int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int prev = arr[j];
                int curr = arr[i]+arr[j];
                int len = 2;
                while(set.contains(curr)){
                    int temp = curr;
                    curr+=prev ;
                    prev=temp;
                    length= Math.max(length,++len);
                }
            }
        }return length;
    }

	public static void main(String[] args) {
		int[] arr = {1,3,7,11,12,14,18};
		System.out.println(lenLongestFibSubseq(arr));

	}

}
