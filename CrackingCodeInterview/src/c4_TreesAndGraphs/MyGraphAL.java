package c4_TreesAndGraphs;

import java.util.ArrayList;

public class MyGraphAL {
	GNode[] nodes;
	public MyGraphAL(GNode[] nodes) {
		this.nodes = nodes;
	}
}

class GNode {
	String value;
	ArrayList<GNode> neighbours = new ArrayList<>();
	boolean isVisited = false;
}