package LeetCode10;

public class Maximum_Time_Repair_Cars {
	public static long repairCars(int[] ranks, int cars) {
		long low = 1, high = Long.MAX_VALUE;
		long ans = high;
		while (low <= high) {
			long mid = high - (high - low) / 2;
			if (check(ranks, cars, mid)) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

	public static boolean check(int[] arr, int cars, long time) {
		long count = 0;
		for (int i = 0; i < arr.length && count < cars; i++)
			count += (long) Math.sqrt(time / arr[i]);
		return (count >= cars);
	}

	public static void main(String[] args) {
		int[] arr = { 4, 2, 3, 1 };
		int car = 10;
		System.out.println(repairCars(arr,car));
	}

}
