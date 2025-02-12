package LeetCode3;

import java.util.Stack;

public class Remove_All_Occurrence{
	public static String removeOccurrences(String s, String part) {
		Stack<Character> stk = new Stack<>();
        for(int j=0;j<s.length();j++){
            stk.push(s.charAt(j));
            if (stk.size() >= part.length()) {
                boolean match = true;
                for (int k = 0; k < part.length(); k++) {
                    if (stk.get(stk.size() - part.length() + k) != part.charAt(k)) {
                        match = false;
                        break;
                    }
                }
                if(match){
                    for(int k=0;k<part.length();k++){
                        stk.pop();
                    }
                }
            }
        }StringBuilder sb= new StringBuilder();
        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }return sb.reverse().toString();    
    }

	public static void main(String[] args) {
		String s ="daabcbaabcbc";
		String part ="abc";
		System.out.println(removeOccurrences(s,part));

	}

}
