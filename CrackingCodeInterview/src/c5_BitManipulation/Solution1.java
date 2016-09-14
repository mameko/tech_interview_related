package c5_BitManipulation;

public class Solution1 {

	public int insertion(int i, int j, int M, int N) {
		if (i < 0 || i > 31 || j < 0 || j > 31) {
			return -1;
		}

		if (j < i) {
			return N;
		}

		if (j == 31 && i == 0) {
			return M;
		}

		M = M << i;
		int mask = 1 << (j - i + 1);
		mask = mask - 1;
		mask = mask << i;
		mask = ~mask;
		N = N & mask;
		return M ^ N;
	}

	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		System.out.println(sol.insertion(-1, -41, 15, 45));// i,j invalid range
		System.out.println(sol.insertion(0, 31, 21, 50));// replace all
		System.out.println(sol.insertion(5, 4, 0, 50));// replace 1 digit
		System.out.println("==========");

		System.out.println(Integer.toBinaryString(50));
		int tmp = sol.insertion(3, 3, 1, 50);
		System.out.println(Integer.toBinaryString(tmp));// replace 1 digit
		tmp = sol.insertion(2, 3, 2, 50);
		System.out.println(Integer.toBinaryString(tmp));// replace 2 digit
		System.out.println("==========");

		System.out.println(Integer.parseInt("10000000000", 2));
		System.out.println(Integer.parseInt("10011", 2));
		tmp = sol.insertion(2, 6, 19, 1024);
		System.out.println(Integer.toBinaryString(tmp));
		System.out.println("==========");

		System.out.println(Integer.toBinaryString(500));
		tmp = sol.insertion(2, 3, 3, 500);
		System.out.println(Integer.toBinaryString(tmp));// replace digit

	}

}
