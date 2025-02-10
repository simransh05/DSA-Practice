package LeetCode2;

public class Clear_Digits {
    public static String clearDigits(String s) {
        return clear(s);
    }
    public static String clear(String s){
    	StringBuilder sb = new StringBuilder(s);
    	for(int i=0;i<sb.length();i++) {
    		if(sb.charAt(i)>='0' && sb.charAt(i)<='9') {
    			if(i>0) {
    			    sb.delete(i-1, i+1);
    			    i-=2;
    			}else {
    				sb.deleteCharAt(i);
    				i--;
    			}
    		}
    	}return sb.toString();
    }

	public static void main(String[] args) {
		String s = "a1bc2d3";
		System.out.println(clearDigits(s));
	}

}
