package LeetCode9;

public class Number_Of_SubString_Containing_3_Char {
	public static int numberOfSubstrings(String s) {
		int[] count = new int[3];
		int left = 0;
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++;
			while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
				result += s.length() - i;
				count[s.charAt(left) - 'a']--;
				left++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String s = "abcabc";
		System.out.println(numberOfSubstrings(s));

	}

}
