package LeetCode7;

public class Count_Number_Of_Colored_Cell {
	public static long coloredCells(int n) {
        long count =0;
        count=(long) Math.pow(n,2)+(long) Math.pow(n-1,2);
        return count;
    }

	public static void main(String[] args) {
		int n = 5;
		System.out.println(coloredCells(n));

	}

}
