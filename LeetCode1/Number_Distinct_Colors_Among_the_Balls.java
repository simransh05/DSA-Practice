package LeetCode1;

import java.util.HashMap;
import java.util.HashSet;

public class Number_Distinct_Colors_Among_the_Balls {
public static int[] queryResults(int limit, int[][] queries) {
	HashMap<Integer,Integer> map = new HashMap<>();
    HashMap<Integer,Integer> colorFreq = new HashMap<>();
    int[]result = new int[queries.length];
    HashSet<Integer> set= new HashSet<>();
    for(int i=0;i<queries.length;i++){
        int ball =  queries[i][0];
        int color = queries[i][1];
         if (map.containsKey(ball)) { 
            int oldColor = map.get(ball);
            colorFreq.put(oldColor, colorFreq.get(oldColor) - 1);
            if (colorFreq.get(oldColor) == 0) {
                set.remove(oldColor); 
            }
        }
        map.put(ball, color);
        colorFreq.put(color, colorFreq.getOrDefault(color, 0) + 1);
        set.add(color);
        result[i]=set.size();
    }return result;
    }

	public static void main(String[] args) {
		int limit = 4;
		int[][] arr= {{1,4},{2,5},{1,3},{3,4}};
		int[] result = queryResults(limit,arr);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}

}
