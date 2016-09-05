package c4_TreesAndGraphs;

import java.util.ArrayList;

public class Solution11_randomNode {
	ArrayList<BTNodeWithParentLink<Integer>> storatge = new ArrayList<>();
	BTNodeWithParentLink<Integer> root;
	BTNodeWithParentLink<Integer> loc;
	BTNodeWithParentLink<Integer> modifyingNode;

	public void insert(int nodevale) {
		BTNodeWithParentLink<Integer> node = new BTNodeWithParentLink<Integer>(nodevale);
		if (root == null) {
			root = node;
		} else {
			find(node.val, root);
			if (loc.val > nodevale) {
				loc.left = node;
			} else {
				loc.right = node;
			}
			node.parent = loc;
			loc = null;
		}
		storatge.add(node);
	}

	private boolean find(Integer nodeval, BTNodeWithParentLink<Integer> roottmp) {
		if (roottmp == null) {
			return true;
		}

		if (roottmp.val == nodeval) {
			return true;
		} else if (roottmp.val < nodeval) {
			if (roottmp.right == null) {
				loc = roottmp;
			}
			return find(nodeval, roottmp.right);
		} else {
			if (roottmp.left == null) {
				loc = roottmp;
			}
			return find(nodeval, roottmp.left);
		}
	}

	public void delete(int nodeval) throws Exception {
		if (root == null) {
			throw new Exception("can't delete, no node in the tree");
		}

		if (!find(nodeval, root)) {
			throw new Exception("can't delete, node is not in the tree");
		}

		BTNodeWithParentLink<Integer> node = findNode(nodeval);
		BTNodeWithParentLink<Integer> parent = node.parent;

		if (node.left == null && node.right == null) {

			if (parent == null) {
				root = null;
			} else {
				if (node == parent.left) {
					node.parent.left = null;
				} else {
					node.parent.right = null;
				}
			}
			storatge.remove(node);
		} else if (node.left == null || node.right == null) {

			if (parent == null) {
				if (node.left != null) {
					root = node.left;
				} else {
					root = node.right;
				}
			} else {
				if (node.left != null) {
					if (parent.left == node) {
						parent.left = node.left;
					} else {
						parent.right = node.left;
					}
					node.left.parent = parent;
				} else {
					if (parent.right == node) {
						parent.right = node.right;
					} else {
						parent.right = node.right;
					}
					node.right.parent = parent;
				}
			}
			storatge.remove(node);
		} else {
			Solution6 sol = new Solution6();
			BTNodeWithParentLink<Integer> s = sol.successor(node);
			modifyingNode = node;
			node.val = s.val;
			delete(s.val);
		}
	}

	private BTNodeWithParentLink<Integer> findNode(int nodeval) {
		for (BTNodeWithParentLink<Integer> n : storatge) {
			if (nodeval == n.val && n != modifyingNode) {
				return n;
			}
		}
		return null;
	}

	public BTNodeWithParentLink<Integer> getRandom() throws Exception {
		if (root == null) {
			throw new Exception("can't get random node no node in the tree");
		}
		int ranNum = (int) (Math.random() * storatge.size());
		return storatge.get(ranNum);
	}
}
