package c3_StacksAndQueues;

public class Solution3_test {

	public static void main(String[] args) throws Exception {
		Solution3_SetOfStacks sol = new Solution3_SetOfStacks(17, 5);
		
//		sol.pop();//stack empty, can't pop, as expected
		sol.push(1);
		sol.push(2);
		sol.push(3);
		sol.push(4);
		sol.push(5);
		
		sol.push(6);
		sol.push(7);
		sol.push(8);
		sol.push(9);
		sol.push(10);
		
		sol.push(11);
		sol.push(12);
		sol.push(13);
		sol.push(14);
		sol.push(15);
		
		sol.push(16);
		sol.push(17);
//		sol.push(18);//stack full
		

//		System.out.println(sol.popAt(5));//index not exist
//		System.out.println(sol.popAt(-1));//index not exist
		
		System.out.println(sol.pop());
		System.out.println(sol.popAt(3));
		System.out.println(sol.pop());
		System.out.println(sol.pop());
		System.out.println(sol.pop());
		System.out.println(sol.pop());
		System.out.println(sol.popAt(1));
		System.out.println(sol.pop());
		System.out.println(sol.pop());
		System.out.println(sol.pop());
		
		
	}

}
