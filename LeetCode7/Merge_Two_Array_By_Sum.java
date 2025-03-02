package LeetCode7;

import java.util.Arrays;

public class Merge_Two_Array_By_Sum {
	public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int[][] arr = new int[nums1.length+nums2.length][2];
        int i=0; int j=0;int k =0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i][0] == nums2[j][0]){
            	arr[k][0] = nums1[i][0];
            	arr[k][1] = nums1[i][1] + nums2[j][1];
                i++;j++;
            }else if(nums1[i][0]<nums2[j][0]){
            	arr[k][0] = nums1[i][0];
            	arr[k][1] = nums1[i][1];
                i++;
            }else { 
                arr[k][0] = nums2[j][0];
                arr[k][1] = nums2[j][1];
                j++;
            }
            k++;
        }
        while(i<nums1.length){
        	arr[k][0] = nums1[i][0];
        	arr[k][1] = nums1[i][1];
            k++;i++;
        }
        while(j<nums2.length){
        	arr[k][0] = nums2[j][0];
        	arr[k][1] = nums2[j][1];
            k++;
            j++;
        }return Arrays.copyOf(arr, k);
    }

	public static void main(String[] args) {
		int[][] nums1 = {{1,2},{2,3},{4,5}}, nums2 = {{1,4},{3,2},{4,1}};
		int[][] ans = mergeArrays(nums1,nums2);
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[0].length;j++) {
				System.out.print(ans[i][j]+"  ");
			}System.out.println();
		}
	}

}
