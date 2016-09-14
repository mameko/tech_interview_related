package c8_RecusionAndDP;

import java.util.LinkedList;

public class Solution4 {

	@SuppressWarnings("unchecked")
	public LinkedList<LinkedList<Integer>> powerSet(int[] set) {

		LinkedList<LinkedList<Integer>> res = new LinkedList<>();

		if (set == null || set.length == 0) {
			return res;
		}

		res.add(new LinkedList<>());// add empty set

		for (int i : set) {

			LinkedList<LinkedList<Integer>> tmp = new LinkedList<LinkedList<Integer>>();
			for (LinkedList<Integer> linkedList : res) {
				tmp.add((LinkedList<Integer>) linkedList.clone());
			}

			for (LinkedList<Integer> l : tmp) {
				l.add(i);
			}
			res.addAll(tmp);
		}

		return res;
	}

	public static void main(String[] args) {
		Solution4 sol = new Solution4();

		int[] set1 = null;
		System.out.println(sol.powerSet(set1));

		int[] set2 = {};
		System.out.println(sol.powerSet(set2));

		int[] set3 = { 1 };
		System.out.println(sol.powerSet(set3));

		int[] set4 = { 1, 2 };
		System.out.println(sol.powerSet(set4));

		int[] set5 = { 1, 2, 3 };
		System.out.println(sol.powerSet(set5));

		int[] set6 = { 1, 2, 3, 4 };
		System.out.println(sol.powerSet(set6));

		int[] set7 = { 1, 2, 3, 4, 5 };
		System.out.println(sol.powerSet(set7));

	}
}
