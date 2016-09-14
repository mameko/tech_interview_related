package c4_TreesAndGraphs;

public class Solution2 {

	public BTNode<Integer> minimalTree(int[] A) {

		if (A == null || A.length == 0) {
			return null;
		}

		return buildBST(A, 0, A.length - 1);
	}

	private BTNode<Integer> buildBST(int[] A, int low, int high) {

		int mid = low + (high - low) / 2;

		BTNode<Integer> node = new BTNode<Integer>(A[mid]);
		if (low < mid) {
			node.left = buildBST(A, low, mid - 1);
		}

		if (high > mid) {
			node.right = buildBST(A, mid + 1, high);
		}

		return node;
	}

	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		
		int[] A1 = null;
		int[] A2 = {};
		int[] A3 = {1};
		int[] A4 = {1,2};
		int[] A5 = {1,2,3};
		int[] A6 = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(sol.minimalTree(A1));
		System.out.println(sol.minimalTree(A2));
		BTNode<Integer> tmp3 = sol.minimalTree(A3);
		BTNode<Integer> tmp4 = sol.minimalTree(A4);
		BTNode<Integer> tmp5 = sol.minimalTree(A5);
		BTNode<Integer> tmp6 = sol.minimalTree(A6);
	}
	
}
