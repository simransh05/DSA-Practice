package LeetCode7;

public class Apply_Operation_To_Array {
	public static int[] applyOperations(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                ans[i]=2*nums[i];
                ans[i+1]=0;
                i++;
            }else {
            	ans[i]=nums[i];
            }ans[nums.length-1]=nums[nums.length-1];
        }int idx =0;
        for(int i:ans) {
        	if(i!=0) {
        		ans[idx++]=i;
        	}
        }while(idx<ans.length) {
        	ans[idx++]=0;
        }
        return ans;
    }

	public static void main(String[] args) {
		int[] arr = {1,2,2,1,1,0};
		int[] ans  = applyOperations(arr);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+"  ");
		}

	}

}
