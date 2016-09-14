package c4_TreesAndGraphs;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Solution9 {

	public Set<LinkedList<Integer>> BSTSequence(BTNode<Integer> root) {
		if (root == null) {
			return null;
		}
		Set<LinkedList<Integer>> res = new LinkedHashSet<>();

		LinkedList<LinkedList<Integer>> maydup = helper(root);
		res.addAll(maydup);

		return res;
	}

	private LinkedList<LinkedList<Integer>> helper(BTNode<Integer> root) {

		if (root == null) {
			return null;
		}
		LinkedList<LinkedList<Integer>> tmpres = new LinkedList<LinkedList<Integer>>();

		LinkedList<LinkedList<Integer>> leftside = helper(root.left);
		LinkedList<LinkedList<Integer>> rightside = helper(root.right);

		if (leftside == null && rightside == null) {
			LinkedList<Integer> tmp = new LinkedList<>();
			tmp.add(root.val);
			tmpres.add(tmp);
			return tmpres;
		} else if (leftside == null) {
			for (LinkedList<Integer> rs : rightside) {
				rs.addFirst(root.val);
			}
			tmpres.addAll(rightside);
		} else if (rightside == null) {
			for (LinkedList<Integer> ls : leftside) {
				ls.addFirst(root.val);
			}
			tmpres.addAll(leftside);
		} else {

			for (LinkedList<Integer> ll : leftside) {
				for (LinkedList<Integer> lr : rightside) {
					LinkedList<Integer> tmp1 = new LinkedList<Integer>();
					tmp1.addAll(ll);
					tmp1.addAll(lr);
					tmp1.addFirst(root.val);
					tmpres.add(tmp1);
				}
			}

			for (LinkedList<Integer> lr : rightside) {
				for (LinkedList<Integer> ll : leftside) {
					LinkedList<Integer> tmp2 = new LinkedList<Integer>();
					tmp2.addAll(lr);
					tmp2.addAll(ll);
					tmp2.addFirst(root.val);
					tmpres.add(tmp2);
				}
			}

		}
		return tmpres;
	}

	public static void main(String[] args) {
		Solution9 sol = new Solution9();

		BTNode<Integer> t1 = null;
		BTNode<Integer> t2 = new BTNode<Integer>(1);

		System.out.println(sol.BSTSequence(t1));
		System.out.println(sol.BSTSequence(t2));

		BTNode<Integer> t3 = new BTNode<Integer>(1);
		BTNode<Integer> t3_2 = new BTNode<Integer>(2);
		t3.right = t3_2;
		System.out.println(sol.BSTSequence(t3));

		BTNode<Integer> t3__ = new BTNode<Integer>(1);
		BTNode<Integer> t3_2_ = new BTNode<Integer>(2);
		t3_2_.left = t3__;
		System.out.println(sol.BSTSequence(t3_2_));

		BTNode<Integer> t4 = new BTNode<Integer>(1);
		BTNode<Integer> t4_2 = new BTNode<Integer>(2);
		BTNode<Integer> t4_3 = new BTNode<Integer>(3);
		t4_2.left = t4;
		t4_2.right = t4_3;
		System.out.println(sol.BSTSequence(t4_2));

		System.out.println("--------");

		BTNode<Integer> t5 = new BTNode<Integer>(1);
		BTNode<Integer> t5_3 = new BTNode<Integer>(3);
		BTNode<Integer> t5_4 = new BTNode<Integer>(4);
		BTNode<Integer> t5_5 = new BTNode<Integer>(5);
		BTNode<Integer> t5_6 = new BTNode<Integer>(6);
		t5_5.right = t5_6;
		t5_5.left = t5_3;
		t5_3.left = t5;
		t5_3.right = t5_4;

		System.out.println(sol.BSTSequence(t5_5));

		BTNode<Integer> t6_6 = new BTNode<Integer>(6);
		BTNode<Integer> t6_3 = new BTNode<Integer>(3);
		BTNode<Integer> t6_4 = new BTNode<Integer>(4);
		BTNode<Integer> t6_5 = new BTNode<Integer>(5);
		t6_5.left = t6_3;
		t6_5.right = t6_6;
		t6_3.right = t6_4;
		
		System.out.println(sol.BSTSequence(t6_5));
	}

}
