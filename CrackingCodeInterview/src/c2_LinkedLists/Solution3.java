package c2_LinkedLists;

public class Solution3 {

	public ListNode<String> deleteMiddleNode(ListNode<String> head) {
		if (head == null) {
			return null;
		}

		ListNode<String> p = head;
		int n = 0;
		while (p.next != null) {
			p = p.next;
			n++;
		}

		if (n < 3) {
			return head;
		}

		ListNode<String> fast = head.next;
		ListNode<String> slow = head.next;
		ListNode<String> pre = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			pre = pre.next;
		}

		pre.next = slow.next;
		return head;
	}

	public static void main(String[] args) {
		Solution3 sol = new Solution3();

		ListNode<String> t1 = null;
		ListNode<String> t2 = new ListNode<String>("");

		ListNode<String> t3 = new ListNode<String>("");
		ListNode<String> t3_1 = new ListNode<String>("a");
		t3.next = t3_1;

		ListNode<String> t4 = new ListNode<String>("");
		ListNode<String> t4_1 = new ListNode<String>("a");
		ListNode<String> t4_2 = new ListNode<String>("b");
		t4.next = t4_1;
		t4_1.next = t4_2;

		ListNode<String> t5 = new ListNode<String>("");
		ListNode<String> t5_1 = new ListNode<String>("a");
		ListNode<String> t5_2 = new ListNode<String>("b");
		ListNode<String> t5_3 = new ListNode<String>("c");
		ListNode<String> t5_4 = new ListNode<String>("d");
		ListNode<String> t5_5 = new ListNode<String>("e");
		t5.next = t5_1;
		t5_1.next = t5_2;
		t5_2.next = t5_3;
		t5_3.next = t5_4;
		t5_4.next = t5_5;

		ListNode<String> t6 = new ListNode<String>("");
		ListNode<String> t6_1 = new ListNode<String>("a");
		ListNode<String> t6_2 = new ListNode<String>("b");
		ListNode<String> t6_3 = new ListNode<String>("c");
		ListNode<String> t6_4 = new ListNode<String>("d");
		ListNode<String> t6_5 = new ListNode<String>("e");
		ListNode<String> t6_6 = new ListNode<String>("f");
		t6.next = t6_1;
		t6_1.next = t6_2;
		t6_2.next = t6_3;
		t6_3.next = t6_4;
		t6_4.next = t6_5;
		t6_5.next = t6_6;

		System.out.println("t1 " + sol.deleteMiddleNode(t1));
		System.out.println("t2 " + sol.deleteMiddleNode(t2));
		System.out.println("t3 " + sol.deleteMiddleNode(t3));
		System.out.println("t4 " + sol.deleteMiddleNode(t4));
		System.out.println("t5 " + sol.deleteMiddleNode(t5));
		System.out.println("t6 " + sol.deleteMiddleNode(t6));
	}

}
