package LeetCode1;

public class Special_ArrayI {
	public static boolean isArraySpecial(int[] nums) {
        if(nums.length==1){
            return true;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]%2==0 && nums[i-1]%2==0 || nums[i]%2!=0 && nums[i-1]%2!=0){
                return false;
            }
        }return true;
    }

	public static void main(String[] args) {
		int[] arr = {2,1,4};
		System.out.println(isArraySpecial(arr));

	}

}
