package c8_RecusionAndDP;

public class Solution1 {

	public int tripleStep(int n) {
		if (n < 0 || n > Integer.MAX_VALUE / 3) {
			return -1;
		}

		int[] result = new int[n + 3];

		result[1] = 1;
		result[2] = 2;
		result[3] = 4;

		if (n > 3) {
			for (int i = 4; i < n + 1; i++) {
				result[i] = result[i - 1] + result[i - 2] + result[i - 3];
			}
		}

		return result[n];
	}

	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		int n1 = -3;
		System.out.println(sol.tripleStep(n1));

		int n2 = Integer.MAX_VALUE;
		System.out.println(sol.tripleStep(n2));

		int n3 = 1;
		System.out.println(sol.tripleStep(n3));

		int n4 = 2;
		System.out.println(sol.tripleStep(n4));

		int n5 = 3;
		System.out.println(sol.tripleStep(n5));

		int n6 = 4;
		System.out.println(sol.tripleStep(n6));

		int n7 = 5;
		System.out.println(sol.tripleStep(n7));

		int n8 = 50;
		System.out.println(sol.tripleStep(n8));
	}

}
