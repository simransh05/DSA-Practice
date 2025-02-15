package LeetCode3;

public class Punishment_Number_Of_Integer {
	public static int punishmentNumber(int n) {
        int sum =0;
        for(int i=1;i<=n;i++){
            int square = i*i;
            if(contiguous(String.valueOf(square),0,i)){
                sum+=i*i;
            }
        }return sum;
    }
    public static boolean contiguous(String s,int index, int target){
        if(index==s.length()){
            return target==0;
        }int num = 0;
        for (int j = index; j < s.length(); j++) {
            num = num * 10 + (s.charAt(j) - '0');  
            if (num > target) break;  
            if (contiguous(s, j + 1, target - num)) {
                return true;
            }
        }
        return false;
    }

	public static void main(String[] args) {
		int n =10;
		System.out.println(punishmentNumber(n));

	}

}
