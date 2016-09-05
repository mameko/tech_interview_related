package c3_StacksAndQueues;

import java.util.Stack;

public class Solution4_QueueViaStack {

	int compacity;
	int total = 0;
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();

	public Solution4_QueueViaStack(int comp) {
		compacity = comp;
	}

	public void enqueue(Integer elem) throws Exception {
		if (total < compacity) {
			s1.push(elem);
			total++;
		} else {
			throw new Exception("queue full! can't enqueue");
		}
	}

	public Integer peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("queue empty, can't dequeue");
		}

		if (s2.isEmpty()) {
			transferS();
		}

		return s2.peek();
	}

	public Integer dequue() throws Exception {
		if (isEmpty()) {
			throw new Exception("queue empty, can't dequeue");
		}

		if (s2.empty()) {
			transferS();
		}
		total--;

		return s2.pop();
	}

	public boolean isEmpty() {
		if (s1.isEmpty() && s2.empty()) {
			return true;
		}
		return false;
	}

	private void transferS() {
		while (!s1.empty()) {
			s2.push(s1.pop());
		}
	}
}
