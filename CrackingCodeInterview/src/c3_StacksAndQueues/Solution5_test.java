package c3_StacksAndQueues;

public class Solution5_test {

	public static void main(String[] args) throws Exception {
		Solution5_SortStack sol = new Solution5_SortStack(5);
		
//		sol.pop();//stack empty, can't pop
//		sol.push(1);
//		sol.push(5);
//		sol.push(4);
//		sol.push(5);
//		sol.push(5);
//		sol.push(0);//stack full, can't push
//		
//		System.out.println(sol.pop());//1
		
		//1, 4, 5, 5, 7
		sol.push(7);
		sol.push(5);
		sol.push(4);
		sol.push(5);
		sol.push(1);
		
		System.out.println(sol.pop());
		System.out.println(sol.pop());
		System.out.println(sol.pop());
		System.out.println(sol.pop());
		System.out.println(sol.pop());
	}

}
