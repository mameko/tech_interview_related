package c1_ArraysAndStrings;

import java.util.Arrays;

public class Solution7 {

	public int[][] rotateMatrix90DegreeRight(int[][] m) {
		if (m == null || m.length == 0 || m.length == 1) {
			return m;
		}

		int n = m.length;
		int layers = n / 2;

		for (int l = 0; l < layers; l++) {
			for (int j = l; j < n - l - 1; j++) {
				int temp = m[l][j];
				m[l][j] = m[n - 1 - j][l];
				m[n - 1 - j][l] = m[n - 1 - l][n - 1 - j];
				m[n - 1 - l][n - 1 - j] = m[j][n - 1 - l];
				m[j][n - 1 - l] = temp;
			}
		}

		return m;
	}

	public static void main(String[] args) {
		Solution7 sol = new Solution7();

		int[][] t1 = null;
		int[][] t2 = new int[0][0];
		int[][] t3 = { { 1 } };
		int[][] t4 = { { 1, 2 }, { 3, 4 } };
		int[][] t5 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] t6 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		System.out.println(Arrays.toString(sol.rotateMatrix90DegreeRight(t1)));
		System.out.println("--------");
		System.out.println(Arrays.deepToString(sol.rotateMatrix90DegreeRight(t2)));
		System.out.println("--------");
		System.out.println(Arrays.deepToString(sol.rotateMatrix90DegreeRight(t3)));
		System.out.println("--------");
		System.out.println(Arrays.deepToString(sol.rotateMatrix90DegreeRight(t4)));
		System.out.println("--------");
		System.out.println(Arrays.deepToString(sol.rotateMatrix90DegreeRight(t5)));
		System.out.println("--------");
		System.out.println(Arrays.deepToString(sol.rotateMatrix90DegreeRight(t6)));
	}

}
