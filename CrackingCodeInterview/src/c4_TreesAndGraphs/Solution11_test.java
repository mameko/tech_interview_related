package c4_TreesAndGraphs;

public class Solution11_test {

	public static void main(String[] args) throws Exception {
		Solution11_randomNode sol = new Solution11_randomNode();

		// System.out.println(sol.getRandom());
		// sol.delete(1);
		// sol.insert(1);
		// System.out.println(sol.root);
		// sol.delete(1);
		// System.out.println(sol.root);

		// sol.insert(5);
		// sol.insert(3);
		// sol.insert(6);
		// sol.insert(1);
		// sol.insert(4);
		//
		// System.out.println(sol.getRandom());
		// System.out.println(sol.getRandom());
		// System.out.println(sol.getRandom());
		// System.out.println(sol.getRandom());
		// System.out.println(sol.getRandom());

		sol.insert(4);
		sol.insert(2);
		sol.insert(6);
		sol.insert(0);
		sol.insert(-1);
		sol.insert(1);
		sol.insert(3);
		sol.insert(5);
		sol.insert(8);
		sol.insert(10);
		sol.insert(9);

		// sol.delete(-1);//left leaf
		// sol.delete(3);//right leaf
		// sol.delete(10);//only have left subtree
		// sol.delete(8);// only have right subtree
		sol.delete(4);// have both left & right subtree

		System.out.println(sol.getRandom());
	}

}
