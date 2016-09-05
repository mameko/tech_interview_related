package c4_TreesAndGraphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution3 {

	public ArrayList<ArrayList<BTNode<Integer>>> listOfDepth(BTNode<Integer> root) {

		ArrayList<ArrayList<BTNode<Integer>>> result = new ArrayList<>();
		if (root == null) {
			return result;
		}

		Queue<BTNode<Integer>> valQ = new LinkedList<>();
		Queue<Boolean> levelQ = new LinkedList<>();

		ArrayList<BTNode<Integer>> temp = new ArrayList<>();
		valQ.offer(root);
		levelQ.offer(true);

		while (!valQ.isEmpty()) {

			BTNode<Integer> node = valQ.poll();
			temp.add(node);
			Boolean level = levelQ.poll();
			if (node.left != null) {
				valQ.offer(node.left);
				levelQ.offer(!level);
			}

			if (node.right != null) {
				valQ.offer(node.right);
				levelQ.offer(!level);
			}

			if (level != levelQ.peek()) {
				result.add(temp);
				temp = new ArrayList<BTNode<Integer>>();
			}

		}
		return result;
	}

	public static void main(String[] args) {

		Solution3 sol = new Solution3();

		BTNode<Integer> t1 = null;
		BTNode<Integer> t2 = new BTNode<Integer>(1);
		System.out.println(sol.listOfDepth(t1));
		System.out.println(sol.listOfDepth(t2));

		BTNode<Integer> t3 = new BTNode<Integer>(1);
		BTNode<Integer> t3_2 = new BTNode<Integer>(2);
		t3.right = t3_2;
		System.out.println(sol.listOfDepth(t3));

		BTNode<Integer> t4 = new BTNode<Integer>(1);
		BTNode<Integer> t4_2 = new BTNode<Integer>(2);
		BTNode<Integer> t4_3 = new BTNode<Integer>(3);
		t4.left = t4_2;
		t4.right = t4_3;
		System.out.println(sol.listOfDepth(t4));

		BTNode<Integer> t5 = new BTNode<Integer>(1);
		BTNode<Integer> t5_2 = new BTNode<Integer>(2);
		BTNode<Integer> t5_3 = new BTNode<Integer>(3);
		t5.right = t5_2;
		t5_2.right = t5_3;
		System.out.println(sol.listOfDepth(t5));

		System.out.println("--------------");

		BTNode<Integer> t6 = new BTNode<Integer>(1);
		BTNode<Integer> t6_2 = new BTNode<Integer>(2);
		BTNode<Integer> t6_3 = new BTNode<Integer>(3);
		BTNode<Integer> t6_4 = new BTNode<Integer>(4);
		BTNode<Integer> t6_5 = new BTNode<Integer>(5);
		BTNode<Integer> t6_6 = new BTNode<Integer>(6);
		BTNode<Integer> t6_7 = new BTNode<Integer>(7);
		BTNode<Integer> t6_8 = new BTNode<Integer>(8);
		BTNode<Integer> t6_9 = new BTNode<Integer>(9);
		BTNode<Integer> t6_10 = new BTNode<Integer>(10);

		t6_5.left = t6_4;
		t6_4.left = t6_3;
		t6_3.right = t6_2;
		t6_5.right = t6;
		t6.left = t6_6;
		t6.right = t6_7;
		t6_7.right = t6_8;
		t6_8.right = t6_9;
		t6_9.right = t6_10;

		System.out.println(sol.listOfDepth(t6_5));
		
		BTNode<Integer> t7 = new BTNode<Integer>(1);
		BTNode<Integer> t7_2 = new BTNode<Integer>(2);
		BTNode<Integer> t7_3 = new BTNode<Integer>(3);
		BTNode<Integer> t7_4 = new BTNode<Integer>(4);
		BTNode<Integer> t7_5 = new BTNode<Integer>(5);
		BTNode<Integer> t7_6 = new BTNode<Integer>(6);
		BTNode<Integer> t7_7 = new BTNode<Integer>(7);
		BTNode<Integer> t7_8 = new BTNode<Integer>(8);
		BTNode<Integer> t7_9 = new BTNode<Integer>(9);

		t7_2.left = t7_7;
		t7_7.right = t7_8;
		t7_8.left = t7;
		t7_2.right = t7_3;
		t7_3.left = t7_4;
		t7_4.left = t7_5;
		t7_5.left = t7_6;
		t7_6.right = t7_9;
		System.out.println(sol.listOfDepth(t7_2));

	}

}
