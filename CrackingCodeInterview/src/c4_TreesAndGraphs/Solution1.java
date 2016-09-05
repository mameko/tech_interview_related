package c4_TreesAndGraphs;

public class Solution1 {

	public boolean routeBetweenNodes(GNode A, GNode B, MyGraphAL G) {
		if (G == null || G.nodes.length == 0) {
			return false;
		}

		return helper(G, A, B);
	}

	private boolean helper(MyGraphAL G, GNode nodeCur, GNode nodeTaget) {
		nodeCur.isVisited = true;
		boolean result = false;
		if (nodeCur == nodeTaget) {
			return true;
		} else if (nodeCur.neighbours.size() != 0) {
			for (GNode nei : nodeCur.neighbours) {
				if (!nei.isVisited) {
					result = result || helper(G, nei, nodeTaget);
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Solution1 sol = new Solution1();

		 MyGraphAL G1 = null;
		 GNode[] nodes = new GNode[0];
		 MyGraphAL G2 = new MyGraphAL(nodes);
		
		 System.out.println(sol.routeBetweenNodes(new GNode(), new GNode(),
		 G1));
		 System.out.println(sol.routeBetweenNodes(new GNode(), new GNode(),
		 G2));

		/*
		 * haven't solve this part yet - how to make no self refer node don't have a path to itself
		GNode[] nodes3 = new GNode[1];
		GNode n3_1 = new GNode();
		n3_1.value = "a";
		MyGraphAL G3 = new MyGraphAL(nodes3);
		System.out.println(sol.routeBetweenNodes(n3_1, n3_1, G3));
		n3_1.neighbours.add(n3_1);
		System.out.println(sol.routeBetweenNodes(n3_1, n3_1, G3));
		*/
		
		GNode[] nodes4 = new GNode[2];
		GNode n4_1 = new GNode();
		n4_1.value = "a";
		GNode n4_2 = new GNode();
		n4_2.value = "b";
		n4_1.neighbours.add(n4_2);
		MyGraphAL G4 = new MyGraphAL(nodes4);
		System.out.println(sol.routeBetweenNodes(n4_1, n4_2, G4));
		
		GNode[] nodes5 = new GNode[2];
		GNode n5_1 = new GNode();
		n5_1.value = "a";
		GNode n5_2 = new GNode();
		n5_2.value = "c";
		GNode n5_3 = new GNode();
		n5_3.value = "b";
		n5_1.neighbours.add(n5_2);
		MyGraphAL G5 = new MyGraphAL(nodes5);
		System.out.println(sol.routeBetweenNodes(n5_1, n5_3, G5));
		
		GNode[] nodes6 = new GNode[4];
		GNode n6_1 = new GNode();
		n6_1.value = "a";
		GNode n6_2 = new GNode();
		n6_2.value = "c";
		GNode n6_3 = new GNode();
		n6_3.value = "b";
		GNode n6_4 = new GNode();
		n6_4.value = "d";
		n6_1.neighbours.add(n6_2);
		n6_1.neighbours.add(n6_4);
		n6_4.neighbours.add(n6_3);
		MyGraphAL G6 = new MyGraphAL(nodes6);
		System.out.println(sol.routeBetweenNodes(n6_1, n6_3, G6));
		
		GNode[] nodes7 = new GNode[3];
		GNode n7_1 = new GNode();
		n7_1.value = "a";
		GNode n7_2 = new GNode();
		n7_2.value = "b";
		GNode n7_3 = new GNode();
		n7_3.value = "c";
		n7_1.neighbours.add(n7_2);
		n7_2.neighbours.add(n7_3);
		n7_3.neighbours.add(n7_1);
		MyGraphAL G7 = new MyGraphAL(nodes7);
		System.out.println(sol.routeBetweenNodes(n7_1, n7_3, G7));
		
		GNode[] nodes8 = new GNode[3];
		GNode n8_1 = new GNode();
		n8_1.value = "a";
		GNode n8_2 = new GNode();
		n8_2.value = "b";
		GNode n8_3 = new GNode();
		n8_3.value = "c";
		n8_1.neighbours.add(n8_2);
		n8_3.neighbours.add(n8_2);
		n8_3.neighbours.add(n8_1);
		MyGraphAL G8 = new MyGraphAL(nodes8);
		System.out.println(sol.routeBetweenNodes(n8_1, n8_3, G8));
		
	}

}
