package LeetCode4;

public class Letter_Tiles_Possibility {
    public static int numTilePossibilities(String tiles) {
    	char[] ch = tiles.toCharArray();
        return rec(0,ch);
    }
    public static int rec(int si,char[] arr) {
    	int ans =0;
    	if(si==arr.length) {
    		return 0;
    	}for(int i=si;i<arr.length;i++) {
    		if(!possible(si,i-1,arr[i],arr)) {
    			swap(si,i,arr);
    			ans+=1+rec(si+1,arr);
    			swap(si,i,arr);
    		}
    	}return ans;
    }
    public static boolean possible(int i , int j,char ch, char[]arr ) {
    	while(i<=j) {
    		if(arr[i++]==ch) return true;
    	}return false;
    }
    public static  void swap(int i,int j,char[] arr) {
    	char temp = arr[i];
    	arr[i]=arr[j];
    	arr[j]=temp;
    }

	public static void main(String[] args) {
		String s="AAB";
		System.out.println(numTilePossibilities(s));

	}

}
