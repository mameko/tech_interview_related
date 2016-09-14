package c5_BitManipulation;

public class Solution7 {

	public Integer pairwiseSwap(Integer input) {
		return ((input & 0xaaaaaaaa) >>> 1) | ((input & 0x55555555) << 1);
	}

	public static void main(String[] args) {
		Solution7 sol = new Solution7();

		System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
		System.out.println(Integer.toBinaryString(sol.pairwiseSwap(Integer.MAX_VALUE)));
		System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
		System.out.println(Integer.toBinaryString(sol.pairwiseSwap(Integer.MIN_VALUE)));
		System.out.println(Integer.toBinaryString(sol.pairwiseSwap(0)));
		System.out.println(Integer.toBinaryString(sol.pairwiseSwap(1)));
		System.out.println(Integer.toBinaryString(-1));
		System.out.println(Integer.toBinaryString(sol.pairwiseSwap(-1)));
		System.out.println(Integer.toBinaryString(12345));
		System.out.println(Integer.toBinaryString(sol.pairwiseSwap(12345)));
		System.out.println(Integer.toBinaryString(99));
		System.out.println(Integer.toBinaryString(sol.pairwiseSwap(99)));
		System.out.println(Integer.toBinaryString(678));
		System.out.println(Integer.toBinaryString(sol.pairwiseSwap(678)));
		System.out.println(Integer.toBinaryString(107));
		System.out.println(Integer.toBinaryString(sol.pairwiseSwap(107)));
		System.out.println(Integer.toBinaryString(50));
		System.out.println(Integer.toBinaryString(sol.pairwiseSwap(50)));
		System.out.println(Integer.toBinaryString(sol.pairwiseSwap(5)));
	}

}
