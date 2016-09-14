package c5_BitManipulation;

public class Solution4 {

	public void nextNum(int input) {

		if (input < 0) {
			System.out.println("Error");
			return;
		}

		if (input == 0) {
			System.out.println("MAX : 0, MIN : 0");
			return;
		}

		String tmp = Integer.toBinaryString(input);
		char[] cs = tmp.toCharArray();

		int i = 1;
		int j = cs.length - 1;

		while (i < j) {
			while (cs[i] == '1' && i < j) {
				i++;
			}

			while (cs[j] == '0' && i < j) {
				j--;
			}

			char t = cs[i];
			cs[i] = cs[j];
			cs[j] = t;
		}

		String maxS = new String(cs);
		String minS = new StringBuilder(maxS).reverse().toString();

		System.out.println("MAX : " + maxS + ", MIN : " + minS);
	}

	public static void main(String[] args) {
		Solution4 sol = new Solution4();
//		
//		System.out.println(Integer.toBinaryString(-1));
//		sol.nextNum(-1);		
//		System.out.println();
//		
//		System.out.println(Integer.toBinaryString(0));
//		sol.nextNum(0);
//		System.out.println();
//		
//		System.out.println(Integer.toBinaryString(1));
//		sol.nextNum(1);
//		System.out.println();
//		
//		System.out.println(Integer.toBinaryString(2));
//		sol.nextNum(2);
//		System.out.println();
//		
//		System.out.println(Integer.toBinaryString(3));
//		sol.nextNum(3);
//		System.out.println();
//		
//		System.out.println(Integer.toBinaryString(4));
//		sol.nextNum(4);
//		System.out.println();
//		
//		System.out.println("---------------");
		
		System.out.println(Integer.toBinaryString(5));
		sol.nextNum(5);
		System.out.println();
		
		System.out.println(Integer.toBinaryString(9));
		sol.nextNum(9);
		System.out.println();
		
		System.out.println(Integer.toBinaryString(2356));
		sol.nextNum(2356);
		System.out.println();
		
		System.out.println(Integer.toBinaryString(1768));
		sol.nextNum(1768);
		System.out.println();
	}

}
