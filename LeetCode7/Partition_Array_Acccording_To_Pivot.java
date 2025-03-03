package LeetCode7;

public class Partition_Array_Acccording_To_Pivot {
	public static int[] pivotArray(int[] nums, int pivot) { // O(3*n) = O(n)
        int[] ans = new int[nums.length]; int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                ans[idx++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                ans[idx++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                ans[idx++]=nums[i];
            }
        }return ans;
    }

	public static void main(String[] args) {
		int[] nums = {9,12,5,10,14,3,10};
		int pivot = 10;
		int [] ans = pivotArray(nums,pivot);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+"  ");
		}
		

	}

}
