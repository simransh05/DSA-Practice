package LeetCode5;

public class Odd_SubArray_Sum {
	public static int numOfSubarrays(int[] arr) {
        int odd =0; int even =1; int sum=0;int count=0;int mod = 1_000_000_007;
        for(int i : arr){
            sum+=i;
            if(sum%2==0){
                count=(count+odd)%mod;
                even++;
            }else {
                count=(count+even)%mod;
                odd++;
            }
        }return count;
    }

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		System.out.println(numOfSubarrays(arr)); 
	}

}
