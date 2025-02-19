package LeetCode4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Happy_String {
	static List<String > list = new ArrayList<>();
    public static String getHappyString(int n, int k) {
        String str ="";
        Happy(n,str);
        if(list.size()<k) return "";
        Collections.sort(list);
        return list.get(k-1);

    }
    public static void Happy(int n,String curr){
        if(curr.length()==n){
            list.add(curr);
            return ;
        }
        for(char str='a';str<='c';str++){
            if(curr.length()>0 && curr.charAt(curr.length()-1)==str){
                continue;
            }
            Happy(n,curr+str);
        }
    }

	public static void main(String[] args) {
		int n =1 ;
		int k = 3;
		System.out.println(getHappyString(n,k));

	}

}
