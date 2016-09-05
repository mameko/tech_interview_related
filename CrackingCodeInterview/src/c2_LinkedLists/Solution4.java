package c2_LinkedLists;

public class Solution4 {

	public ListNode<Integer> partition(ListNode<Integer> head, int x) {

		if (head == null || head.next == null) {
			return head;
		}

		ListNode<Integer> p = head;
		ListNode<Integer> left = head.next;
		boolean containX = false;
		while (p != null) {
			if (p.val.equals(x)) {
				containX = true;
				left = p;
				break;
			}
			p = p.next;
		}

		if (!containX) {
			return head;
		}

		ListNode<Integer> right = left.next;
		while (left != null && right != null) {
			while (left != right && left.val < x) {
				left = left.next;
			}

			while (right != null && right.val >= x) {
				right = right.next;
			}

			if (right == null) {
				break;
			}

			int temp = left.val;
			left.val = right.val;
			right.val = temp;
			
			right = right.next;
			left = left.next;
		}

		return head;
	}

	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		
		ListNode<Integer> t1 = null;
		ListNode<Integer> t2 = new ListNode<Integer>(-1);
		
		ListNode<Integer> t3 = new ListNode<Integer>(-1);
		ListNode<Integer> t3_1 = new ListNode<Integer>(5);
		t3.next = t3_1;

		ListNode<Integer> t4 = new ListNode<Integer>(-1);
		ListNode<Integer> t4_1 = new ListNode<Integer>(3);
		t4.next = t4_1;
		
		ListNode<Integer> t5 = new ListNode<Integer>(-1);
		ListNode<Integer> t5_1 = new ListNode<Integer>(5);
		ListNode<Integer> t5_2 = new ListNode<Integer>(5);
		t5.next = t5_1;
		t5_1.next = t5_2;
		
		ListNode<Integer> t6 = new ListNode<Integer>(-1);
		ListNode<Integer> t6_1 = new ListNode<Integer>(5);
		ListNode<Integer> t6_2 = new ListNode<Integer>(8);
		t6.next = t6_1;
		t6_1.next = t6_2;
		
		ListNode<Integer> t7 = new ListNode<Integer>(-1);
		ListNode<Integer> t7_1 = new ListNode<Integer>(8);
		ListNode<Integer> t7_2 = new ListNode<Integer>(5);
		t7.next = t7_1;
		t7_1.next = t7_2;
		
		ListNode<Integer> t8 = new ListNode<Integer>(-1);
		ListNode<Integer> t8_1 = new ListNode<Integer>(1);
		ListNode<Integer> t8_2 = new ListNode<Integer>(5);
		t8.next = t8_1;
		t8_1.next = t8_2;
		
		ListNode<Integer> t9 = new ListNode<Integer>(-1);
		ListNode<Integer> t9_1 = new ListNode<Integer>(5);
		ListNode<Integer> t9_2 = new ListNode<Integer>(1);
		t9.next = t9_1;
		t9_1.next = t9_2;
		
		ListNode<Integer> t10 = new ListNode<Integer>(-1);
		ListNode<Integer> t10_1 = new ListNode<Integer>(8);
		ListNode<Integer> t10_2 = new ListNode<Integer>(1);
		ListNode<Integer> t10_3 = new ListNode<Integer>(5);
		ListNode<Integer> t10_4 = new ListNode<Integer>(6);
		ListNode<Integer> t10_5 = new ListNode<Integer>(7);
		ListNode<Integer> t10_6 = new ListNode<Integer>(10);
		t10.next = t10_1;
		t10_1.next = t10_2;
		t10_2.next = t10_3;
		t10_3.next = t10_4;
		t10_4.next = t10_5;
		t10_5.next = t10_6;
		
		ListNode<Integer> t11 = new ListNode<Integer>(-1);
		ListNode<Integer> t11_1 = new ListNode<Integer>(5);
		ListNode<Integer> t11_2 = new ListNode<Integer>(1);
		ListNode<Integer> t11_3 = new ListNode<Integer>(2);
		ListNode<Integer> t11_4 = new ListNode<Integer>(3);
		ListNode<Integer> t11_5 = new ListNode<Integer>(6);
		t11.next = t11_1;
		t11_1.next = t11_2;
		t11_2.next = t11_3;
		t11_3.next = t11_4;
		t11_4.next = t11_5;
		
		ListNode<Integer> t12 = new ListNode<Integer>(-1);
		ListNode<Integer> t12_1 = new ListNode<Integer>(5);
		ListNode<Integer> t12_2 = new ListNode<Integer>(1);
		ListNode<Integer> t12_3 = new ListNode<Integer>(8);
		ListNode<Integer> t12_4 = new ListNode<Integer>(9);
		ListNode<Integer> t12_5 = new ListNode<Integer>(6);
		t12.next = t12_1;
		t12_1.next = t12_2;
		t12_2.next = t12_3;
		t12_3.next = t12_4;
		t12_4.next = t12_5;
		
		System.out.println(sol.partition(t1, 5));
		System.out.println(sol.partition(t2, 5));
		System.out.println(sol.partition(t3, 5));
		System.out.println(sol.partition(t4, 5));
		System.out.println(sol.partition(t5, 5));
		System.out.println("==========");
		System.out.println(sol.partition(t6, 5));
		System.out.println(sol.partition(t7, 5));
		System.out.println(sol.partition(t8, 5));
		System.out.println(sol.partition(t9, 5));
		System.out.println("==========");
		System.out.println(sol.partition(t10, 5));
		System.out.println(sol.partition(t10, 8));
		System.out.println(sol.partition(t11, 5));
		System.out.println(sol.partition(t11, 2));
		System.out.println(sol.partition(t12, 5));
	}

}
