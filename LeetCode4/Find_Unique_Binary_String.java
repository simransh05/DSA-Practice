package LeetCode4;

public class Find_Unique_Binary_String {
	public static String findDifferentBinaryString(String[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            char flipped = nums[i].charAt(i) == '0' ? '1' : '0';
            sb.append(flipped);
        }return sb.toString();
    }

	public static void main(String[] args) {
		String[] arr = {"111","011","001"};
		System.out.println(findDifferentBinaryString(arr));
	}

}
