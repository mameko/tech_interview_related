package c4_TreesAndGraphs;

public class Solution10 {

	public boolean checkSubTree(BTNode<Integer> root1, BTNode<Integer> root2) {
		if (root1 == null && root2 == null) {
			return true;
		}

		if (root1 == null || root2 == null) {
			return false;
		}

		BTNode<Integer> t2int1 = nodeinT1(root1, root2);

		if (t2int1 == null) {
			return false;
		}

		boolean res = check2treethesame(t2int1, root2);
		return res;
	}

	private boolean check2treethesame(BTNode<Integer> t1, BTNode<Integer> t2) {
		if (t1 == null && t2 == null) {
			return true;
		} else if (t1 == null || t2 == null) {
			return false;
		}

		if (t1.val != t2.val) {
			return false;
		}

		boolean left = check2treethesame(t1.left, t2.left);
		if (left == false) {
			return false;
		}

		boolean right = check2treethesame(t1.right, t2.right);
		if (right == false) {
			return false;
		}

		return true;
	}

	private BTNode<Integer> nodeinT1(BTNode<Integer> root1, BTNode<Integer> root2) {
		if (root1 == null) {
			return null;
		}

		if (root1.val == root2.val) {
			return root1;
		}
		BTNode<Integer> left = nodeinT1(root1.left, root2);
		if (left != null) {
			return left;
		}
		BTNode<Integer> right = nodeinT1(root1.right, root2);
		if (right != null) {
			return right;
		}
		return null;
	}

	public static void main(String[] args) {
		Solution10 sol = new Solution10();

		BTNode<Integer> t1_root1 = null;
		BTNode<Integer> t1_root2 = null;

		System.out.println(sol.checkSubTree(t1_root1, t1_root2));

		BTNode<Integer> t1_root3 = new BTNode<Integer>(1);
		System.out.println(sol.checkSubTree(t1_root1, t1_root3));
		BTNode<Integer> t1_root4 = new BTNode<Integer>(1);
		System.out.println(sol.checkSubTree(t1_root4, t1_root2));

		System.out.println("---------");

		BTNode<Integer> t2_root1 = new BTNode<Integer>(1);
		BTNode<Integer> t2_root2 = new BTNode<Integer>(1);
		System.out.println(sol.checkSubTree(t2_root1, t2_root2));

		BTNode<Integer> t3_root1 = new BTNode<Integer>(1);
		BTNode<Integer> t3_root1_2 = new BTNode<Integer>(2);
		BTNode<Integer> t3_root2 = new BTNode<Integer>(2);
		t3_root1.right = t3_root1_2;
		System.out.println(sol.checkSubTree(t3_root1, t3_root2));

		BTNode<Integer> t4_root1 = new BTNode<Integer>(1);
		BTNode<Integer> t4_root1_2 = new BTNode<Integer>(2);
		BTNode<Integer> t4_root2 = new BTNode<Integer>(3);
		t4_root1.right = t4_root1_2;
		System.out.println(sol.checkSubTree(t4_root1, t4_root2));

		System.out.println("---------");

		BTNode<Integer> t5_root1_1 = new BTNode<Integer>(1);
		BTNode<Integer> t5_root1_3 = new BTNode<Integer>(3);
		BTNode<Integer> t5_root1_5 = new BTNode<Integer>(5);
		BTNode<Integer> t5_root1_7 = new BTNode<Integer>(7);
		BTNode<Integer> t5_root1_6 = new BTNode<Integer>(6);
		BTNode<Integer> t5_root1_8 = new BTNode<Integer>(8);
		BTNode<Integer> t5_root1_9 = new BTNode<Integer>(9);
		t5_root1_5.left = t5_root1_3;
		t5_root1_3.left = t5_root1_1;
		t5_root1_3.right = t5_root1_7;
		t5_root1_5.right = t5_root1_6;
		t5_root1_6.right = t5_root1_8;
		t5_root1_8.left = t5_root1_9;
		BTNode<Integer> t5_root2_6 = new BTNode<Integer>(6);
		BTNode<Integer> t5_root2_8 = new BTNode<Integer>(8);
		BTNode<Integer> t5_root2_9 = new BTNode<Integer>(9);
		t5_root2_6.right = t5_root2_8;
		t5_root2_8.left = t5_root2_9;

		System.out.println(sol.checkSubTree(t5_root1_5, t5_root2_6));

		BTNode<Integer> t5_root3_3 = new BTNode<Integer>(3);
		BTNode<Integer> t5_root3_7 = new BTNode<Integer>(7);
		BTNode<Integer> t5_root3_1 = new BTNode<Integer>(1);
		t5_root3_3.right = t5_root3_7;
		t5_root3_7.right = t5_root3_1;
		System.out.println(sol.checkSubTree(t5_root1_5, t5_root3_3));
	}

}
