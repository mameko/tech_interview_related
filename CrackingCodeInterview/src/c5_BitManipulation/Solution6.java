package c5_BitManipulation;

public class Solution6 {

	public int conversion(int A, int B) {
		if (A == B) {
			return 0;
		}

		int result = A ^ B;
		return Integer.bitCount(result);
	}

	public static void main(String[] args) {

		Solution6 sol = new Solution6();
		
		System.out.println(sol.conversion(0, 0));
		System.out.println(sol.conversion(1, 1));
		System.out.println(Integer.toBinaryString(29));
		System.out.println(Integer.toBinaryString(15));
		System.out.println(sol.conversion(29, 15));
		System.out.println(Integer.toBinaryString(8));
		System.out.println(Integer.toBinaryString(4));
		System.out.println(sol.conversion(8, 4));
		System.out.println(Integer.toBinaryString(33));
		System.out.println(Integer.toBinaryString(21));
		System.out.println(sol.conversion(33, 2));
	}

}
