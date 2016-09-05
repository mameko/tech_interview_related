package c1_ArraysAndStrings;

import java.util.Arrays;

public class Solution8 {

	public int[][] zeroMatrix(int[][] m) {
		if (m == null || m.length == 0 || m[0].length == 0) {
			return m;
		}

		int col1st = 1;
		for (int i = 0; i < m.length; i++) {
			if (m[i][0] == 0) {
				col1st = 0;
			}
		}
		
		for (int j = 0; j < m[0].length; j++) {
			if (m[0][j] == 0) {
				m[0][0] = 0;
			}
		}
		
		

		for (int i = m.length - 1; i > 0; i--) {
			for (int j = m[0].length - 1; j > 0; j--) {
				if (m[i][j] == 0) {
					m[i][0] = 0;
					m[0][j] = 0;

				}
			}
		}

		for (int i = m.length - 1; i >= 0; i--) {
			for (int j = m[0].length - 1; j > 0; j--) {
				if (m[i][0] == 0 || m[0][j] == 0) {
					m[i][j] = 0;
				}
			}
		}

		if (col1st == 0) {
			for (int i = 0; i < m.length; i++) {
				m[i][0] = 0;
			}
		}
		return m;

	}

	public static void main(String[] args) {
		Solution8 sol = new Solution8();

		int[][] m0 = null;
		int[][] m0_1 = {};
		int[][] m1 = { {} };
		int[][] m2 = { { 1 } };
		int[][] m3 = { { 0 } };
		int[][] m4 = { { 0, 1 }, { 1, 1 } };
		int[][] m5 = { { 1, 1 }, { 0, 1 } };
		int[][] m6 = { { 1, 0, 1 }, { 1, 1, 1 }, { 1, 0, 1 } };
		int[][] m7 = { { 1, 0, 1 }, { 0, 1, 1 }, { 0, 1, 0 } };
		int[][] m8 = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		int[][] m9 = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		int[][] m10 = { { 1, 1, 1 }, { 0, 1, 1 }, { 1, 1, 1 } };
		int[][] m11 = { { 0, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		int[][] m12 = { { 1, 0, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };

		System.out.println(Arrays.deepToString(sol.zeroMatrix(m0)));
		System.out.println(Arrays.deepToString(sol.zeroMatrix(m0_1)));
		System.out.println(Arrays.deepToString(sol.zeroMatrix(m1)));
		System.out.println(Arrays.deepToString(sol.zeroMatrix(m2)));
		System.out.println(Arrays.deepToString(sol.zeroMatrix(m3)));
		System.out.println(Arrays.deepToString(sol.zeroMatrix(m4)));
		System.out.println(Arrays.deepToString(sol.zeroMatrix(m5)));
		System.out.println(Arrays.deepToString(sol.zeroMatrix(m6)));
		System.out.println(Arrays.deepToString(sol.zeroMatrix(m7)));
		System.out.println(Arrays.deepToString(sol.zeroMatrix(m8)));
		System.out.println(Arrays.deepToString(sol.zeroMatrix(m9)));
		System.out.println(Arrays.deepToString(sol.zeroMatrix(m10)));
		System.out.println(Arrays.deepToString(sol.zeroMatrix(m11)));
		System.out.println(Arrays.deepToString(sol.zeroMatrix(m12)));
	}

}
