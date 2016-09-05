package c4_TreesAndGraphs;

public class BTNode<T> {
	
	T val;
	BTNode<T> left;
	BTNode<T> right;
	
	public BTNode(T value) {
		val = value;
	}
	
	@Override
	public String toString() {
		return val.toString();
	}
}
