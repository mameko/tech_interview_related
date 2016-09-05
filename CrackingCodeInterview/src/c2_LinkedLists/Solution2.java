package c2_LinkedLists;

public class Solution2 {

	public ListNode<Integer> returnKthToLast(ListNode<Integer> head, int k) {

		if (head == null) {
			return head;
		}

		ListNode<Integer> p = head;
		int n = 0;
		while (p.next != null) {
			p = p.next;
			n++;
		}

		if (k > n) {
			return null;
		} else if (k == n) {
			return head.next;
		}

		ListNode<Integer> fast = head;
		ListNode<Integer> slow = head;
		for (int i = 0; i < k; i++) {
			fast = fast.next;
		}

		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}

		return slow;
	}

	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		
		ListNode<Integer> t1 = null;
		ListNode<Integer> t2 = new ListNode<Integer>(-1);
		
		ListNode<Integer> t3 = new ListNode<Integer>(-1);
		ListNode<Integer> t3_1 = new ListNode<Integer>(1);
		t3.next = t3_1;
		
		ListNode<Integer> t9 = new ListNode<Integer>(-1);
		ListNode<Integer> t9_1 = new ListNode<Integer>(1);
		ListNode<Integer> t9_2 = new ListNode<Integer>(2);
		ListNode<Integer> t9_3 = new ListNode<Integer>(3);
		ListNode<Integer> t9_4 = new ListNode<Integer>(4);
		ListNode<Integer> t9_5 = new ListNode<Integer>(5);
		t9.next = t9_1;
		t9_1.next = t9_2;
		t9_2.next = t9_3;
		t9_3.next = t9_4;
		t9_4.next = t9_5;
		
		System.out.println(sol.returnKthToLast(t1, 0));
		System.out.println(sol.returnKthToLast(t2, 0));
		System.out.println("========");
		
		System.out.println(sol.returnKthToLast(t3, 7));
		System.out.println(sol.returnKthToLast(t3, 1).val);
		System.out.println(sol.returnKthToLast(t3, 0).val);
		System.out.println("========");
		
		System.out.println(sol.returnKthToLast(t9, 2).val);
		System.out.println(sol.returnKthToLast(t9, 5).val);
		System.out.println(sol.returnKthToLast(t9, 0).val);
	}

}
