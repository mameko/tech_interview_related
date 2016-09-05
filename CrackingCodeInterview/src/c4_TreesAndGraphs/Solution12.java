package c4_TreesAndGraphs;

import java.util.LinkedList;

public class Solution12 {

	public int pathWithSum(BTNode<Integer> root, int sum) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		MyResult res = helper(root, sum);
		return res.count;
	}

	private MyResult helper(BTNode<Integer> root, int sum) {
		MyResult tmp = new MyResult();

		if (root == null) {
			return tmp;
		}

		MyResult leftres = helper(root.left, sum);
		MyResult rightres = helper(root.right, sum);

		int count = leftres.count + rightres.count;

		LinkedList<Integer> leftlist = leftres.addableVals;
		LinkedList<Integer> rightlist = rightres.addableVals;

		LinkedList<Integer> curlist = new LinkedList<>();
		curlist.add(root.val);

		for (Integer l : leftlist) {
			curlist.add(root.val + l);
		}

		for (Integer r : rightlist) {
			curlist.add(root.val + r);
		}

		for (Integer c : curlist) {
			if (c == sum) {
				count++;
			}
		}

		tmp.count = count;
		tmp.addableVals = curlist;
		return tmp;
	}

	public static void main(String[] args) {
		Solution12 sol = new Solution12();

		BTNode<Integer> t1 = null;
		System.out.println(sol.pathWithSum(t1, 0));

		BTNode<Integer> t2 = new BTNode<Integer>(1);
		System.out.println(sol.pathWithSum(t2, 1));
		System.out.println(sol.pathWithSum(t2, 3));

		System.out.println("----------");

		BTNode<Integer> t3 = new BTNode<Integer>(1);
		BTNode<Integer> t3_2 = new BTNode<Integer>(2);
		t3.right = t3_2;
		System.out.println(sol.pathWithSum(t3, 1));
		System.out.println(sol.pathWithSum(t3, 3));
		System.out.println(sol.pathWithSum(t3, 2));
		System.out.println(sol.pathWithSum(t3, 4));

		System.out.println("----------");

		BTNode<Integer> t4_root = new BTNode<Integer>(3);
		BTNode<Integer> t4_1 = new BTNode<Integer>(-1);
		BTNode<Integer> t4_2 = new BTNode<Integer>(2);
		BTNode<Integer> t4_3 = new BTNode<Integer>(3);
		BTNode<Integer> t4_4 = new BTNode<Integer>(4);
		BTNode<Integer> t4_5 = new BTNode<Integer>(5);
		BTNode<Integer> t4_6 = new BTNode<Integer>(-6);
		t4_root.left = t4_2;
		t4_2.left = t4_5;
		t4_2.right = t4_6;
		t4_root.right = t4_1;
		t4_1.left = t4_4;
		t4_1.right = t4_3;
		System.out.println(sol.pathWithSum(t4_root, 5));
		System.out.println(sol.pathWithSum(t4_root, 2));

		System.out.println("----------");

		BTNode<Integer> t5_1 = new BTNode<Integer>(1);
		BTNode<Integer> t5_4 = new BTNode<Integer>(4);
		BTNode<Integer> t5_5 = new BTNode<Integer>(5);
		BTNode<Integer> t5_6 = new BTNode<Integer>(6);
		BTNode<Integer> t5_7 = new BTNode<Integer>(7);
		BTNode<Integer> t5_8 = new BTNode<Integer>(-8);
		t5_1.left = t5_5;
		t5_1.right = t5_6;
		t5_6.left = t5_4;
		t5_6.right = t5_7;
		t5_7.right = t5_8;
		System.out.println(sol.pathWithSum(t5_1, 6));
	}

}

class MyResult {
	int count = 0;
	LinkedList<Integer> addableVals = new LinkedList<>();
}
