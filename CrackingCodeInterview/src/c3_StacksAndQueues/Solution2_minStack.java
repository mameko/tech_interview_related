package c3_StacksAndQueues;

public class Solution2_minStack {

	int compacity;
	int[] realStack;
	int[] auxStack;
	int topR = -1;
	int topA = -1;

	public Solution2_minStack(int comp) {
		compacity = comp;
		realStack = new int[compacity];
		auxStack = new int[compacity];
	}

	public void push(int elem) throws Exception {

		if (topR >=compacity) {
			throw new Exception("stack full, can't push");
		}
		
		if (topR == -1) {
			auxStack[++topA] = elem;
		} else {
			int min = Math.min(auxStack[topA], elem);
			auxStack[++topA] = min;
		}
		
		realStack[++topR] = elem;
	}
	
	public int pop() throws Exception {
		
		if (topR == -1) {
			throw new Exception("stack empty, can't pop");
		}
		
		topA--;
		return realStack[topR--];
	}
	
	public int min() throws Exception {
		if (topA == -1) {
			throw new Exception("stack empty, can't min");
		}
		return auxStack[topA];
	}

}
