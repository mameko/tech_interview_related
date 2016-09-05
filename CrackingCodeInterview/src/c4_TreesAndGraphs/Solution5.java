package c4_TreesAndGraphs;

import java.util.ArrayList;

public class Solution5 {

	public boolean validateBST(BTNode<Integer> root) {
		if (root == null) {
			return true;
		}

		ArrayList<Integer> inOrderT = new ArrayList<>();

		helper(inOrderT, root);

		for (int i = 1; i < inOrderT.size(); i++) {
			if (inOrderT.get(i) < inOrderT.get(i - 1)) {
				return false;
			}
		}

		return true;
	}

	private void helper(ArrayList<Integer> inOrderT, BTNode<Integer> root) {
		if (root == null) {
			return;
		}
		helper(inOrderT, root.left);
		inOrderT.add(root.val);
		helper(inOrderT, root.right);

	}

	public static void main(String[] args) {
		Solution5 sol = new Solution5();

		BTNode<Integer> t1 = null;
		BTNode<Integer> t2 = new BTNode<Integer>(1);

		System.out.println(sol.validateBST(t1));
		System.out.println(sol.validateBST(t2));

		BTNode<Integer> t3 = new BTNode<Integer>(1);
		BTNode<Integer> t3_2 = new BTNode<Integer>(2);
		t3.right = t3_2;
		System.out.println(sol.validateBST(t3));

		BTNode<Integer> t4 = new BTNode<Integer>(1);
		BTNode<Integer> t4_2 = new BTNode<Integer>(2);
		t4_2.right = t4;
		System.out.println(sol.validateBST(t4_2));

		System.out.println("=========");

		BTNode<Integer> t5 = new BTNode<Integer>(1);
		BTNode<Integer> t5_2 = new BTNode<Integer>(2);
		BTNode<Integer> t5_3 = new BTNode<Integer>(3);
		t5_2.left = t5;
		t5_2.right = t5_3;
		System.out.println(sol.validateBST(t5_2));

		BTNode<Integer> t6 = new BTNode<Integer>(1);
		BTNode<Integer> t6_2 = new BTNode<Integer>(2);
		BTNode<Integer> t6_3 = new BTNode<Integer>(3);
		t6.right = t6_2;
		t6_2.right = t6_3;
		System.out.println(sol.validateBST(t6));

		BTNode<Integer> t7 = new BTNode<Integer>(1);
		BTNode<Integer> t7_2 = new BTNode<Integer>(2);
		BTNode<Integer> t7_3 = new BTNode<Integer>(3);
		t7_2.left = t7_3;
		t7_2.right = t7;
		System.out.println(sol.validateBST(t7_2));

		BTNode<Integer> t8 = new BTNode<Integer>(1);
		BTNode<Integer> t8_2 = new BTNode<Integer>(2);
		BTNode<Integer> t8_3 = new BTNode<Integer>(3);
		t8_3.left = t8_2;
		t8_2.left = t8;
		System.out.println(sol.validateBST(t8_3));

		System.out.println("==========");

		BTNode<Integer> t9_2 = new BTNode<Integer>(2);
		BTNode<Integer> t9_3 = new BTNode<Integer>(3);
		BTNode<Integer> t9_4 = new BTNode<Integer>(4);
		BTNode<Integer> t9_5 = new BTNode<Integer>(5);
		BTNode<Integer> t9_6 = new BTNode<Integer>(6);
		BTNode<Integer> t9_7 = new BTNode<Integer>(7);
		t9_5.left = t9_4;
		t9_3.left = t9_2;
		t9_3.right = t9_4;
		t9_5.right = t9_6;
		t9_6.right = t9_7;
		System.out.println(sol.validateBST(t9_5));

		BTNode<Integer> t10_2 = new BTNode<Integer>(2);
		BTNode<Integer> t10_3 = new BTNode<Integer>(3);
		BTNode<Integer> t10_4 = new BTNode<Integer>(4);
		BTNode<Integer> t10_5 = new BTNode<Integer>(5);
		t10_5.left=t10_2;
		t10_5.right=t10_3;
		t10_3.right=t10_4;
		System.out.println(sol.validateBST(t10_5));
	}

}
