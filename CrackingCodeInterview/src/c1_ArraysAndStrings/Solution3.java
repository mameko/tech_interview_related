package c1_ArraysAndStrings;

public class Solution3 {

	public char[] URLify(String s, int l) {
		if (s == null || s.length() == 0) {
			return "".toCharArray();
		}

		char[] c = s.toCharArray();

		if (l == 0) {
			for (int i = 0; i < c.length; i = i + 3) {
				c[i] = '%';
				c[i + 1] = '2';
				c[i + 2] = '0';
			}
			return c;
		}

		int i = c.length - 1;
		int j = l - 1;

		while (j < i) {
			if (c[j] != ' ') {
				c[i] = c[j];
				i--;
			} else {
				c[i] = '0';
				c[i - 1] = '2';
				c[i - 2] = '%';

				i = i - 3;
			}
			j--;
		}

		return c;
	}

	public static void main(String[] args) {

		Solution3 sol = new Solution3();

		System.out.println(sol.URLify(null, 0));
		System.out.println(sol.URLify("", 0));
		System.out.println(sol.URLify("   ", 0));
		System.out.println(sol.URLify("      ", 0));
		System.out.println(sol.URLify("ab cd  ", 5));
		System.out.println(sol.URLify("abcd", 4));
		System.out.println(sol.URLify(" ab  ", 3));
	}

}
