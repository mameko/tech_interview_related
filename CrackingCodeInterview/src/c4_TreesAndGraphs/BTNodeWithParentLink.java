package c4_TreesAndGraphs;

public class BTNodeWithParentLink<T>{

	BTNodeWithParentLink<T> parent;
	T val;
	BTNodeWithParentLink<T> left;
	BTNodeWithParentLink<T> right;
	
	public BTNodeWithParentLink(T value) {
		val = value;
	}
	
	@Override
	public String toString() {
		return val.toString();
	}

}
