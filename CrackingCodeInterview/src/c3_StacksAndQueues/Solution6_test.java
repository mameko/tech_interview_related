package c3_StacksAndQueues;

public class Solution6_test {

	public static void main(String[] args) throws Exception {
		Solution6_AnimalShelter sol = new Solution6_AnimalShelter();

//		sol.dequeCat();//no cat in the shelter
//		sol.dequeuDog();//no dogs in the shelter
//		sol.dequeuAny();//no animal in the shelter
		
		sol.enqueue(new Cat());
		sol.enqueue(new Dog());
		sol.enqueue(new Cat());
		sol.enqueue(new Cat());
		
		System.out.println(sol.dequeCat());
		System.out.println(sol.dequeuAny());
		System.out.println(sol.dequeuAny());
		
		sol.enqueue(new Dog());
		System.out.println(sol.dequeuDog());
	}

}
