package LeetCode1;

public class Check_If_Array_is_Sorted {
	public static boolean check(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(sort(nums)){
                return true;
            }rotate(nums);
        }return false;
    }
    public static void rotate(int [] arr){
        int first=arr[0];
        for(int i=0;i<arr.length-1;i++){
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }arr[arr.length-1]=first;
    }
    public static boolean sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }return true;
    }

	public static void main(String[] args) {
		int[] arr = {3,4,5,1,2};
		System.out.println(check(arr));

	}

}
