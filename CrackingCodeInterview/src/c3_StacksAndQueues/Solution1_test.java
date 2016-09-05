package c3_StacksAndQueues;

public class Solution1_test {

	public static void main(String[] args) throws Exception {
		Solution1_3in1Class sol = new Solution1_3in1Class(10);

		System.out.println(sol.isS1Empty());
		System.out.println(sol.isS2Empty());
		System.out.println(sol.isS3Empty());
		
		sol.pushS1(1);
		sol.pushS2(2);
		sol.pushS3(3);

		//pop stack 1, return 1
		System.out.println(sol.popS1());
		//throw exception while try to pop stack when empty
		System.out.println(sol.popS1());
		
		sol.pushS1(4);
		sol.pushS1(5);
		sol.pushS1(6);
		sol.pushS2(7); 
		sol.pushS2(8);//adding too much element in, throw exception as expected
		
		System.out.println(sol.peekS1());// return 6
		System.out.println(sol.popS1());
		System.out.println(sol.peekS1());//return 5
		
		sol.pushS3(9);
		sol.pushS3(10);
//		sol.pushS3(11);//adding too much to stack 3, throw exception as expected
		
		System.out.println(sol.isS1Empty());
		System.out.println(sol.isS2Empty());
		System.out.println(sol.isS3Empty());
	}

}
