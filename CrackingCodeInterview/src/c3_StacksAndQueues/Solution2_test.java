package c3_StacksAndQueues;

public class Solution2_test {

	public static void main(String[] args) throws Exception {
		Solution2_minStack sol = new Solution2_minStack(5);

//		System.out.println(sol.pop());// "stack empty, can't pop." as expected
//		sol.push(1);
//		System.out.println(sol.min());
//		System.out.println(sol.pop());
		
//		System.out.println(sol.min());//"tack empty, can't min", as expected
		
		sol.push(5);
		sol.push(4);
		System.out.println(sol.min());
		sol.push(2);
		sol.push(3);
		System.out.println(sol.min());
		sol.push(6);
		System.out.println(sol.min());
		
	}

}
