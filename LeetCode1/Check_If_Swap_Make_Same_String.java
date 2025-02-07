package LeetCode1;

import java.util.ArrayList;
import java.util.List;

public class Check_If_Swap_Make_Same_String {
	public static boolean areAlmostEqual(String s1, String s2) { // if u have no limit of swap
        int[] freq = new int[26];
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            int idx= ch-'a';
            if(freq[idx]!=0){
                freq[idx]++;
            }else {
                freq[idx]=1;
            }
        }
        for(int i=0;i<s2.length();i++){
            char ch = s2.charAt(i);
            int idx= ch-'a';
            if(freq[idx]!=0){
                freq[idx]--;
            }else {
                return false;
            }
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                return false;
            }
        }return true;
    }
	// when u have Atmost 1 swap
	public static boolean OneSwap(String s1, String s2) {
		if(s1.equals(s2)) return true;
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				list.add(i);
			}if(list.size()>2) return false; // only one swap
		}
		return list.size()==2 && list.get(0)==list.get(1) && list.get(1)==list.get(0); 
	} //  0 ==0 && 3==3(index must be same if only 2 items can swap

	public static void main(String[] args) {
		String s1 ="abcd";
		String s2 ="dcba";
		System.out.println(areAlmostEqual(s1,s2));
		System.out.println(OneSwap(s1,s2));
	}

}
