package c8_RecusionAndDP;

public class Solution3 {

	public int magicIndex(int[] A) {

		if (A == null || A.length == 0) {
			return -1;
		}

		int low = 0;
		int high = A.length - 1;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (A[mid] == mid) {
				return mid;
			} else if (A[mid] < mid) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		Solution3 sol = new Solution3();

		int[] A1 = null;
		System.out.println(sol.magicIndex(A1));

		int[] A2 = {};
		System.out.println(sol.magicIndex(A2));

		int[] A3 = { -3 };
		System.out.println(sol.magicIndex(A3));

		int[] A4 = { 0 };
		System.out.println(sol.magicIndex(A4));

		int[] A5 = { -1, 1 };
		System.out.println(sol.magicIndex(A5));

		int[] A6 = { 0, 7 };
		System.out.println(sol.magicIndex(A6));

		int[] A7 = { -3, -2, -1, 0, 1, 2, 3, 4, 8 };
		System.out.println(sol.magicIndex(A7));

		int[] A8 = { -3, -2, 2, 5, 7, 8, 9, 11, 13 };
		System.out.println(sol.magicIndex(A8));

		int[] A9 = { -3, -2, 2, 2, 7, 8, 9, 11, 13 };
		System.out.println(sol.magicIndex(A9));
	}

}
