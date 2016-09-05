package c2_LinkedLists;

import java.util.HashMap;

public class Solution8 {

	public ListNode<String> loopDetection(ListNode<String> head) {
		if (head == null || head.next == null) {
			return null;
		}

		HashMap<ListNode<String>, String> map = new HashMap<>();
		ListNode<String> p = head.next;
		while (p != null) {
			if (map.containsKey(p)) {
				return p;
			} else {
				map.put(p, p.val);
				p = p.next;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Solution8 sol = new Solution8();

		ListNode<String> t1 = null;
		ListNode<String> t2 = new ListNode<String>("");

		System.out.println(sol.loopDetection(t1));
		System.out.println(sol.loopDetection(t2));
		
		ListNode<String> t3 = new ListNode<String>("");
		ListNode<String> t3_1 = new ListNode<String>("a");
		t3.next = t3_1;
		
		System.out.println(sol.loopDetection(t3));
		
		ListNode<String> t4 = new ListNode<String>("");
		ListNode<String> t4_1 = new ListNode<String>("a");
		t4.next = t4_1;
		t4_1.next = t4_1;
		
		System.out.println(sol.loopDetection(t4).val);
		
		ListNode<String> t5 = new ListNode<String>("");
		ListNode<String> t5_1 = new ListNode<String>("a");
		ListNode<String> t5_2 = new ListNode<String>("b");
		t5.next = t5_1;
		t5_1.next = t5_2;
		t5_2.next = t5_1;
		
		System.out.println(sol.loopDetection(t5).val);
		
		ListNode<String> t6 = new ListNode<String>("");
		ListNode<String> t6_1 = new ListNode<String>("a");
		ListNode<String> t6_2 = new ListNode<String>("b");
		ListNode<String> t6_3 = new ListNode<String>("c");
		ListNode<String> t6_4 = new ListNode<String>("d");
		t6.next = t6_1;
		t6_1.next = t6_2;
		t6_2.next = t6_3;
		t6_3.next = t6_4;
		t6_4.next = t6_2;
		
		System.out.println(sol.loopDetection(t6).val);
		
		ListNode<String> t7 = new ListNode<String>("");
		ListNode<String> t7_1 = new ListNode<String>("a");
		ListNode<String> t7_2 = new ListNode<String>("b");
		t7.next = t7_1;
		t7_1.next = t7_2;
		
		System.out.println(sol.loopDetection(t7));
	}

}
