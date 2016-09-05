package c2_LinkedLists;

public class Solution1 {

	public void removeDups(ListNode<Integer> head) {
		if (head == null || head.next == null || head.next.next == null) {
			return;
		}

		ListNode<Integer> valueNow = head.next;
		ListNode<Integer> pre = head.next;
		ListNode<Integer> cur = pre.next;
		while (valueNow.next != null) {
			while (cur != null) {
				if (valueNow.val.equals(cur.val)) {
					pre.next = cur.next;
				} else {
					pre = pre.next;
				}
				cur = cur.next;
			}

			valueNow = valueNow.next;
			if (valueNow == null) {
				break;
			}
			pre = valueNow;
			cur = pre.next;
		}

	}

	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		
		ListNode<Integer> t1 = null;
		ListNode<Integer> t2 = new ListNode<Integer>(-1);
		
		ListNode<Integer> t3 = new ListNode<Integer>(-1);
		ListNode<Integer> t3_1 = new ListNode<Integer>(1);
		t3.next = t3_1;

		ListNode<Integer> t4 = new ListNode<Integer>(-1);
		ListNode<Integer> t4_1 = new ListNode<Integer>(1);
		ListNode<Integer> t4_2 = new ListNode<Integer>(1);
		t4.next = t4_1;
		t4_1.next = t4_2;
		
		ListNode<Integer> t5 = new ListNode<Integer>(-1);
		ListNode<Integer> t5_1 = new ListNode<Integer>(1);
		ListNode<Integer> t5_2 = new ListNode<Integer>(2);
		ListNode<Integer> t5_3 = new ListNode<Integer>(1);
		t5.next = t5_1;
		t5_1.next = t5_2;
		t5_2.next = t5_3;

		ListNode<Integer> t6 = new ListNode<Integer>(-1);
		ListNode<Integer> t6_1 = new ListNode<Integer>(1);
		ListNode<Integer> t6_2 = new ListNode<Integer>(1);
		ListNode<Integer> t6_3 = new ListNode<Integer>(2);
		ListNode<Integer> t6_4 = new ListNode<Integer>(2);
		t6.next = t6_1;
		t6_1.next = t6_2;
		t6_2.next = t6_3;
		t6_3.next = t6_4;
		
		ListNode<Integer> t7 = new ListNode<Integer>(-1);
		ListNode<Integer> t7_1 = new ListNode<Integer>(1);
		ListNode<Integer> t7_2 = new ListNode<Integer>(1);
		ListNode<Integer> t7_3 = new ListNode<Integer>(2);
		ListNode<Integer> t7_4 = new ListNode<Integer>(1);
		t7.next = t7_1;
		t7_1.next = t7_2;
		t7_2.next = t7_3;
		t7_3.next = t7_4;
		
		ListNode<Integer> t8 = new ListNode<Integer>(-1);
		ListNode<Integer> t8_1 = new ListNode<Integer>(1);
		ListNode<Integer> t8_2 = new ListNode<Integer>(2);
		ListNode<Integer> t8_3 = new ListNode<Integer>(2);
		t8.next = t8_1;
		t8_1.next = t8_2;
		t8_2.next = t8_3;
		
		ListNode<Integer> t9 = new ListNode<Integer>(-1);
		ListNode<Integer> t9_1 = new ListNode<Integer>(1);
		ListNode<Integer> t9_2 = new ListNode<Integer>(2);
		ListNode<Integer> t9_3 = new ListNode<Integer>(3);
		ListNode<Integer> t9_4 = new ListNode<Integer>(4);
		t9.next = t9_1;
		t9_1.next = t9_2;
		t9_2.next = t9_3;
		t9_3.next = t9_4;
		
		sol.removeDups(t1);
		System.out.println(t1);
		sol.removeDups(t2);
		System.out.println(t2);
		sol.removeDups(t3);
		System.out.println(t3);
		sol.removeDups(t4);
		System.out.println(t4);
		
		System.out.println("------");
		
		sol.removeDups(t5);
		System.out.println(t5);
		sol.removeDups(t6);
		System.out.println(t6);
		sol.removeDups(t7);
		System.out.println(t7);
		sol.removeDups(t8);
		System.out.println(t8);
		sol.removeDups(t9);
		System.out.println(t9);
		
	}

	
}
