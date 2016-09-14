package c4_TreesAndGraphs;

public class Solution6 {

	public BTNodeWithParentLink<Integer> successor(BTNodeWithParentLink<Integer> node) {
		BTNodeWithParentLink<Integer> result = null;
		if (node == null) {
			return result;
		}

		if (node.right != null) {
			BTNodeWithParentLink<Integer> p = node.right;

			while (p.left != null) {
				p = p.left;
			}

			result = p;
		} else if (node.parent.left == node) {
			result = node.parent;
		} else if (node.parent.right == node) {
			BTNodeWithParentLink<Integer> gp = node.parent.parent;
			if (gp == null || gp.val < node.val) {
				result = null;
			} else {
				result = gp;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Solution6 sol = new Solution6();

		BTNodeWithParentLink<Integer> node_1 = new BTNodeWithParentLink<Integer>(-1);
		BTNodeWithParentLink<Integer> node0 = new BTNodeWithParentLink<Integer>(0);
		BTNodeWithParentLink<Integer> node1 = new BTNodeWithParentLink<Integer>(1);
		BTNodeWithParentLink<Integer> node2 = new BTNodeWithParentLink<Integer>(2);
		BTNodeWithParentLink<Integer> node3 = new BTNodeWithParentLink<Integer>(3);
		BTNodeWithParentLink<Integer> node4 = new BTNodeWithParentLink<Integer>(4);
		BTNodeWithParentLink<Integer> node5 = new BTNodeWithParentLink<Integer>(5);
		BTNodeWithParentLink<Integer> node6 = new BTNodeWithParentLink<Integer>(6);
		BTNodeWithParentLink<Integer> node8 = new BTNodeWithParentLink<Integer>(8);
		BTNodeWithParentLink<Integer> node9 = new BTNodeWithParentLink<Integer>(9);
		BTNodeWithParentLink<Integer> node10 = new BTNodeWithParentLink<Integer>(10);

		node4.left = node2;
		node2.parent = node4;
		node2.left = node0;
		node0.parent = node2;
		node0.left = node_1;
		node_1.parent = node0;
		node0.right = node1;
		node1.parent = node0;
		node2.right = node3;
		node3.parent = node2;
		node4.right = node6;
		node6.parent = node4;
		node6.left = node5;
		node5.parent = node6;
		node6.right = node8;
		node8.parent = node6;
		node8.right = node10;
		node10.parent = node8;
		node10.left = node9;
		node9.parent = node10;

		System.out.println(sol.successor(null));
		System.out.println(sol.successor(node_1));
		System.out.println(sol.successor(node0));
		System.out.println(sol.successor(node1));
		System.out.println(sol.successor(node2));
		System.out.println(sol.successor(node3));
		System.out.println(sol.successor(node4));
		System.out.println(sol.successor(node5));
		System.out.println(sol.successor(node6));
		System.out.println(sol.successor(node8));
		System.out.println(sol.successor(node9));
		System.out.println(sol.successor(node10));

	}

}
