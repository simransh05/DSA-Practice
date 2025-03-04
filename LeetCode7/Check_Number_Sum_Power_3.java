package LeetCode7;

public class Check_Number_Sum_Power_3 {
	public static boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if (n % 3 == 2) {
                return false;
            }
            n /= 3;
        }
        return true;
    }

	public static void main(String[] args) {
		int n  = 21;
		System.out.println(checkPowersOfThree(n));

	}

}
