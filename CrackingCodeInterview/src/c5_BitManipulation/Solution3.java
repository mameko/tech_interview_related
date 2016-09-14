package c5_BitManipulation;

public class Solution3 {

	public int flipBitToWin(int input) {
		if (input < 0) {
			return Integer.MIN_VALUE;
		}

		char[] in = Integer.toBinaryString(input).toCharArray();
		int max = Integer.MIN_VALUE;
		int cur = 0;
		int lastChangeVal = 0;

		for (int i = 0; i < in.length; i++) {
			cur++;
			if (in[i] == '0') {
				cur = cur - lastChangeVal;
				lastChangeVal = cur;
			}

			if (cur > max) {
				max = cur;
			}
		}

		return max;
	}

	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		
		System.out.println(Integer.toBinaryString(-1));
		System.out.println(sol.flipBitToWin(-1));
		
		System.out.println(Integer.toBinaryString(0));
		System.out.println(sol.flipBitToWin(0));
		
		System.out.println(Integer.toBinaryString(2));
		System.out.println(sol.flipBitToWin(2));
		
		System.out.println(Integer.toBinaryString(3));
		System.out.println(sol.flipBitToWin(3));
		
		System.out.println("================");
		
		System.out.println(Integer.toBinaryString(1775));
		System.out.println(sol.flipBitToWin(1775));
		
		System.out.println(Integer.toBinaryString(5));
		System.out.println(sol.flipBitToWin(5));
		
		System.out.println(Integer.toBinaryString(4));
		System.out.println(sol.flipBitToWin(4));
		
		System.out.println(Integer.toBinaryString(2565));
		System.out.println(sol.flipBitToWin(2565));
		
		System.out.println(Integer.toBinaryString(9999));
		System.out.println(sol.flipBitToWin(9999));
	}

}
