package LeetCode4;

public class Lexicographically_Valid_Sequence {
    public static int[] constructDistancedSequence(int n) {
        boolean [] map=new boolean[n+1];
        int[] arr = new int[2*n-1];
        rec(arr,map,0,n);
        return arr;
    }
    private static boolean rec(int[] result, boolean[] used, int index, int n) {
        if (index == result.length) { 
            return true;
        }
        if (result[index] != 0) { 
            return rec(result, used, index + 1, n);
        }
        for (int num = n; num >= 1; num--) {
            if (used[num]) 
            	continue; 
            if (num == 1) { 
                result[index] = 1;
                used[num] = true;
                if (rec(result, used, index + 1, n)) 
                	return true;
                result[index] = 0;
                used[num] = false;
            } else { 
                int secondIdx = index + num;
                if (secondIdx < result.length && result[secondIdx] == 0) {
                    result[index] = num;
                    result[secondIdx] = num;
                    used[num] = true;
                    
                    if (rec(result, used, index + 1, n)) 
                    	return true;                    
                    result[index] = 0;
                    result[secondIdx] = 0;
                    used[num] = false;
                }
            }
        }
        return false;
    }

	public static void main(String[] args) {
		int n=5;
		int[] result= constructDistancedSequence(n);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+"  ");
		}

	}
}
