package c3_StacksAndQueues;

public class Solution4_test {

	public static void main(String[] args) throws Exception {
		Solution4_QueueViaStack sol = new Solution4_QueueViaStack(10);
		
//		sol.dequue();//queue empty, can't dequeue
		
		sol.enqueue(1);
		sol.enqueue(2);
		sol.enqueue(3);
		sol.enqueue(4);
		sol.enqueue(5);
		sol.enqueue(6);
		sol.enqueue(7);
		sol.enqueue(8);
		sol.enqueue(9);
		sol.enqueue(10);
		
//		sol.enqueue(11);//queue full! can't enqueue
		
		System.out.println(sol.peek());
		System.out.println(sol.dequue());
		System.out.println(sol.peek());
		
		sol.enqueue(11);
		System.out.println(sol.peek());
		
	}

}
