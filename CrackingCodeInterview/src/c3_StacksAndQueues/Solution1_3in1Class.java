package c3_StacksAndQueues;

public class Solution1_3in1Class {
	int ARRAYSIZE;
	int[] A;
	int s1B;
	int s2B;
	int s3B;

	int s1T;
	int s2T;
	int s3T;

	public Solution1_3in1Class(int size) {
		ARRAYSIZE = size;
		A = new int[ARRAYSIZE];
		s1B = -1;
		s2B = ARRAYSIZE / 3 * 2 +1;
		s3B = s2B - 1;
		s1T = s1B;
		s2T = s2B;
		s3T = s3B;
	}
	
	//isEmpty
	private boolean stackEmpty(int stackNum) {
		switch (stackNum) {
		case 1:
			if ((s1T - s1B) == 0) {
				return true;
			}
			break;
		case 2:
			if ((s2T - s2B) == 0) {
				return true;
			}
			break;
		case 3:
			if ((s3T - s3B) == 0) {
				return true;
			}
			break;
		}
		return false;
	}

	public boolean isS1Empty() {
		return stackEmpty(1);
	}

	public boolean isS2Empty() {
		return stackEmpty(2);
	}

	public boolean isS3Empty() {
		return stackEmpty(3);
	}

	//pushing
	private void pushToStack(int stackNum, int elem) {
		switch (stackNum) {
		case 1:
			A[++s1T] = elem;
			break;
		case 2:
			A[--s2T] = elem;
			break;
		case 3:
			A[++s3T] = elem;
			break;
		}
	}
	
	public void pushS1(int elem) throws Exception {
		if (s1T == s2T - 1) {
			throw new Exception("Stack1 is full, can't push");
		}
		
		pushToStack(1, elem);
	}
	
	public void pushS2(int elem) throws Exception {
		if (s1T ==s2T - 1) {
			throw new Exception("Stack2 is full, can't push");
		}
		
		pushToStack(2, elem);
	}
	
	public void pushS3(int elem) throws Exception {
		if (s3T == A.length - 1) {
			throw new Exception("Stack3 is full, can't push");
		}
		
		pushToStack(3, elem);
	}
	
	//Poping
	private int popStack(int stackNumber) {
		switch (stackNumber) {
		case 1:
			return A[s1T--];
		case 2:
			return A[s2T++];
		case 3:
			return A[s3T--];
		}
		return -1;
	}
	
	public int popS1() throws Exception {
		if (isS1Empty()) {
			throw new Exception("can't pop stack1 because it is empty");
		}
		
		return popStack(1);
	}
	
	public int popS2() throws Exception {
		if (isS2Empty()) {
			throw new Exception("can't pop stack1 because it is empty");
		}
		
		return popStack(2);
	}
	
	public int popS3() throws Exception {
		if (isS3Empty()) {
			throw new Exception("can't pop stack1 because it is empty");
		}
		
		return popStack(3);
	}
	
	//peeking
	private int peekStack(int stackNum) {
		switch (stackNum) {
		case 1:
			return A[s1T];
		case 2:
			return A[s2T];
		case 3:
			return A[s3T];
		}
		
		return -1;
	}
	
	public int peekS1() throws Exception {
		if (isS1Empty()) {
			throw new Exception("stack1 is empty!");
		}
		
		return peekStack(1);
	}
	
	public int peekS2() throws Exception {
		if (isS2Empty()) {
			throw new Exception("stack2 is empty!");
		}
		
		return peekStack(2);
	}
	
	public int peekS3() throws Exception {
		if (isS3Empty()) {
			throw new Exception("stack3 is empty!");
		}
		
		return peekStack(3);
	}
}
