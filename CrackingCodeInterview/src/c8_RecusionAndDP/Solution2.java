package c8_RecusionAndDP;

import java.util.LinkedList;
import java.util.List;

public class Solution2 {

	public LinkedList<int[]> robotInAGrid(boolean[][] A) {

		if (A == null || A.length == 0 || A[0].length == 0) {
			return null;
		}

		LinkedList<int[]> result = new LinkedList<>();
		int r = A.length;
		int c = A[0].length;
		nextstep(A, 0, 0, result, r, c);
		return result;

	}

	private void nextstep(boolean[][] a, int i, int j, LinkedList<int[]> res, int r, int c) {
		if (i < r && j < c && (a[i][j] == true)) {
			int[] tmp = { i, j };
			res.add(tmp);

			if (i < r && j + 1 < c && (a[i][j + 1] == true)) {
				nextstep(a, i, j + 1, res, r, c);
			}

			if (((res.getLast()[0] == r - 1) && (res.getLast()[1] == c - 1))) {
				return;
			}

			if (i + 1 < r && j < c && (a[i + 1][j] == true)) {
				nextstep(a, i + 1, j, res, r, c);
			}

			if (!((res.getLast()[0] == r - 1) && (res.getLast()[1] == c - 1))) {
				res.removeLast();
			}
		} else {
			return;
		}

	}

	public static void main(String[] args) {
		Solution2 sol = new Solution2();

		// boolean[][] A1 = null;
		// System.out.println(sol.robotInAGrid(A1));
		//
		// boolean[][] A2 = {};
		// System.out.println(sol.robotInAGrid(A2));
		//
		// boolean[][] A3 = { {} };
		// System.out.println(sol.robotInAGrid(A3));

		// boolean[][] A4 = { { true } };
		// sol.printList(sol.robotInAGrid(A4));

		// boolean[][] A5 = { { true }, { true } };
		// sol.printList(sol.robotInAGrid(A5));

		// boolean[][] A6 = { { true, true } };
		// sol.printList(sol.robotInAGrid(A6));

		// boolean[][] A7 = { { true, false } };
		// sol.printList(sol.robotInAGrid(A7));

		// boolean[][] A8 = { { true, false } };
		// sol.printList(sol.robotInAGrid(A8));

		// boolean[][] A9 = { { true, true, false }, { true, true, true } };
		// sol.printList(sol.robotInAGrid(A9));

		// boolean[][] A10 = { { true, true, false }, { true, true, false } };
		// sol.printList(sol.robotInAGrid(A10));

		// boolean[][] A11 = { { true,false,true }, { false, true, true } };
		// sol.printList(sol.robotInAGrid(A11));

		boolean[][] A12 = { { true, false, true }, { true, true, true } };
		sol.printList(sol.robotInAGrid(A12));

	}

	private void printList(List<int[]> l) {
		System.out.print("[");
		for (int[] pair : l) {
			System.out.print(" (" + pair[0] + "," + pair[1] + ") ");
			System.out.print(",");
		}
		System.out.print("]");
	}

}
