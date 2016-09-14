package c5_BitManipulation;

public class Solution2 {

	public String binaryToStringPoint(double input) {
		if (input > 1 || input < 0) {
			return "Error";
		}

		int count = 0;
		StringBuilder result = new StringBuilder();
		String one = "1";
		String zero = "0";
		double divisor = 1;

		for (int i = 0; i < 32; i++) {
			divisor = divisor / 2;

			if (input >= divisor) {
				input = input - divisor;
				result.append(one);
				if (input <= 0) {
					break;
				}
			} else {
				result.append(zero);
			}
			count++;
			if (count > 31) {
				break;
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		System.out.println(sol.binaryToStringPoint(3));
		System.out.println(sol.binaryToStringPoint(0.1));
		System.out.println(sol.binaryToStringPoint(0.9));
		System.out.println(sol.binaryToStringPoint( 0.5));
		System.out.println(sol.binaryToStringPoint(0.75));
		System.out.println(sol.binaryToStringPoint(0.625));
		System.out.println(sol.binaryToStringPoint(0.8125));
		System.out.println(sol.binaryToStringPoint(0.99));
		System.out.println(sol.binaryToStringPoint(0.005));
		System.out.println(sol.binaryToStringPoint(0.123));

	}

}
