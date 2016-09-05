package c4_TreesAndGraphs;

public class Solution4 {

	public boolean checkBalanced(BTNode<Integer> root) {
		if (root == null) {
			return true;
		}

		Result res = cbHelper(root);
		return res.isBalanced;
	}

	private Result cbHelper(BTNode<Integer> root) {
		Result cur = new Result();

		if (root == null) {
			cur.isBalanced = true;
			return cur;
		}

		Result left, right;
		left = cbHelper(root.left);
		right = cbHelper(root.right);

		if (!left.isBalanced || !right.isBalanced || (Math.abs(left.height - right.height) > 1)) {
			cur.isBalanced = false;
			return cur;
		} else {
			cur.height = Math.max(left.height, right.height) + 1;
			cur.isBalanced = true;
		}

		return cur;
	}

	public static void main(String[] args) {
		Solution4 sol = new Solution4();

		BTNode<Integer> t1 = null;
		BTNode<Integer> t2 = new BTNode<Integer>(1);

		System.out.println(sol.checkBalanced(t1));
		System.out.println(sol.checkBalanced(t2));

		BTNode<Integer> t3 = new BTNode<Integer>(1);
		BTNode<Integer> t3_2 = new BTNode<Integer>(2);
		t3.right = t3_2;
		System.out.println(sol.checkBalanced(t3));

		BTNode<Integer> t4 = new BTNode<Integer>(1);
		BTNode<Integer> t4_2 = new BTNode<Integer>(2);
		BTNode<Integer> t4_3 = new BTNode<Integer>(3);
		t4.right = t4_2;
		t4_2.right = t4_3;
		System.out.println(sol.checkBalanced(t4));

		BTNode<Integer> t5 = new BTNode<Integer>(1);
		BTNode<Integer> t5_2 = new BTNode<Integer>(2);
		BTNode<Integer> t5_3 = new BTNode<Integer>(3);
		t5.left = t5_2;
		t5.right = t5_3;
		System.out.println(sol.checkBalanced(t5));

		System.out.println("===========");

		BTNode<Integer> t6 = new BTNode<Integer>(1);
		BTNode<Integer> t6_2 = new BTNode<Integer>(2);
		BTNode<Integer> t6_3 = new BTNode<Integer>(3);
		BTNode<Integer> t6_4 = new BTNode<Integer>(4);
		BTNode<Integer> t6_6 = new BTNode<Integer>(6);
		BTNode<Integer> t6_7 = new BTNode<Integer>(7);
		t6.left = t6_2;
		t6_2.left = t6_6;
		t6_2.right = t6_7;
		t6.right = t6_3;
		t6_3.right = t6_4;
		System.out.println(sol.checkBalanced(t6));

		BTNode<Integer> t7 = new BTNode<Integer>(1);
		BTNode<Integer> t7_2 = new BTNode<Integer>(2);
		BTNode<Integer> t7_3 = new BTNode<Integer>(3);
		BTNode<Integer> t7_4 = new BTNode<Integer>(4);
		BTNode<Integer> t7_5 = new BTNode<Integer>(5);
		t7.left = t7_2;
		t7.right =t7_3;
		t7_3.right = t7_4;
		t7_4.left = t7_5;
		System.out.println(sol.checkBalanced(t7));
	}
}

class Result {
	boolean isBalanced;
	int height;
}
