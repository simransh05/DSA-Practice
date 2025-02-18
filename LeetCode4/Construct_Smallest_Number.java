package LeetCode4;

import java.util.Stack;

public class Construct_Smallest_Number {
	public static String smallestNumber(String pattern) {
        return smallest(pattern);
    }
    public static String smallest(String pattern ){
        int val =1; int[] ans = new int[pattern.length()+1];
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<=pattern.length();i++){
            if(i==pattern.length() || pattern.charAt(i)=='I'){
                ans[i]=val;
                val++;
                while(!stk.isEmpty()){
                    ans[stk.pop()] = val;
                    val++;
                }
            }else{
                stk.push(i);
            }
        }String str ="";
        for(int i=0;i<ans.length;i++){
            str+=ans[i];
        }return str;
    }

	public static void main(String[] args) {
		String s  = "IIIDIDDD";
		System.out.println(smallestNumber(s));
	}

}
