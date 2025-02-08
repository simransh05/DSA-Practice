package LeetCode2;

import java.util.HashMap;
import java.util.TreeSet;

public class NumberContainers {
    HashMap<Integer,Integer> map ;
    HashMap<Integer, TreeSet<Integer>> set ;
    public NumberContainers() {
        map = new HashMap<>();
        set = new HashMap<>();
    }
    
    public void change(int index, int number) {
        if(map.containsKey(index)){
            int old = map.get(index);
            set.get(old).remove(index);
            if(set.get(old).isEmpty()){
                set.remove(old);
            }
        }
        map.put(index,number);
        set.putIfAbsent(number,new TreeSet<>());
        set.get(number).add(index);
    }
    
    public int find(int number) {
        if(!set.containsKey(number) || set.get(number).isEmpty()){
            return -1;
        }return set.get(number).first();
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
