package c3_StacksAndQueues;

import java.util.Stack;

public class Solution5_SortStack {

	int compacity;
	Stack<Integer> mainS = new Stack<>();
	Stack<Integer> tempS = new Stack<>();

	public Solution5_SortStack(int comp) {
		compacity = comp;
	}
	
	public void push(Integer elem) throws Exception {
		if (mainS.size() >= compacity) {
			throw new Exception("stack full, can't push");
		}

		while (!mainS.empty() && mainS.peek() < elem) {
			tempS.push(mainS.pop());
		}
		
		mainS.push(elem);
		
		while (!tempS.empty()) {
			mainS.push(tempS.pop());
		}
	}
	
	public Integer pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("stack empty, can't pop");
		}
		return mainS.pop();
	}
	
	public Integer peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("stack empty, can't pop");
		}
		return mainS.peek();
	}
	
	public boolean isEmpty() {
		return mainS.isEmpty();
	}
}
