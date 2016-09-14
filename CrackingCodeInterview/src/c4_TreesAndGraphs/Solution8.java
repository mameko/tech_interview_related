package c4_TreesAndGraphs;

public class Solution8 {

	public BTNode<Integer> firstCommonAncestor(int n1, int n2, BTNode<Integer> root) {
		if (n1 < 0 || n2 < 0 || root == null) {
			return null;
		}

		return helper(n1, n2, root);
	}

	private BTNode<Integer> helper(int n1, int n2, BTNode<Integer> root) {

		if (root == null) {
			return null;
		}

		BTNode<Integer> p1 = helper(n1, n2, root.left);
		BTNode<Integer> p2 = helper(n1, n2, root.right);

		if ((p1 != null && p2 != null) || root.val == n1 || root.val == n2) {
			return root;
		} else if (p1 != null) {
			return p1;
		} else if (p2 != null) {
			return p2;
		} else {
			return null;
		}
	}

	public static void main(String[] args) {
		Solution8 sol = new Solution8();

		BTNode<Integer> t1 = null;
		BTNode<Integer> t2 = new BTNode<Integer>(1);

		System.out.println(sol.firstCommonAncestor(1, 1, t1));
		System.out.println(sol.firstCommonAncestor(1, 1, t2));

		BTNode<Integer> t3 = new BTNode<Integer>(1);
		BTNode<Integer> t3_1 = new BTNode<Integer>(2);
		t3.right = t3_1;
		System.out.println(sol.firstCommonAncestor(1, 2, t3));

		BTNode<Integer> t4 = new BTNode<Integer>(1);
		BTNode<Integer> t4_1 = new BTNode<Integer>(2);
		BTNode<Integer> t4_2 = new BTNode<Integer>(3);
		t4.left = t4_1;
		t4.right = t4_2;
		System.out.println(sol.firstCommonAncestor(3, 2, t4));

		System.out.println("---------");

		BTNode<Integer> t5 = new BTNode<Integer>(1);
		BTNode<Integer> t5_2 = new BTNode<Integer>(2);
		BTNode<Integer> t5_3 = new BTNode<Integer>(3);
		BTNode<Integer> t5_4 = new BTNode<Integer>(4);
		BTNode<Integer> t5_5 = new BTNode<Integer>(5);
		BTNode<Integer> t5_6 = new BTNode<Integer>(6);
		BTNode<Integer> t5_7 = new BTNode<Integer>(7);
		BTNode<Integer> t5_8 = new BTNode<Integer>(8);
		BTNode<Integer> t5_9 = new BTNode<Integer>(9);
		BTNode<Integer> t5_10 = new BTNode<Integer>(10);
		BTNode<Integer> t5_11 = new BTNode<Integer>(11);
		t5.left = t5_2;
		t5_2.left = t5_4;
		t5_4.left = t5_5;
		t5_5.right = t5_11;
		t5_2.right = t5_6;
		t5.right = t5_3;
		t5_3.right = t5_7;
		t5_7.right = t5_8;
		t5_8.right = t5_9;
		t5_9.left = t5_10;
		
		System.out.println(sol.firstCommonAncestor(5, 6, t5));
		System.out.println(sol.firstCommonAncestor(5, 2, t5));
		System.out.println(sol.firstCommonAncestor(4, 9, t5));
		System.out.println(sol.firstCommonAncestor(10, 8, t5));
	}

}
