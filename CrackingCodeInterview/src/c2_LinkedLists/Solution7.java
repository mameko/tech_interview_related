package c2_LinkedLists;

public class Solution7 {

	public ListNode<Integer> intersection(ListNode<Integer> head1, ListNode<Integer> head2) {

		if (head1 == null || head2 == null || head1.next == null || head2.next == null) {
			return null;
		}

		int m = 0;
		int n = 0;
		ListNode<Integer> p1 = head1.next;
		ListNode<Integer> p2 = head2.next;

		while (p1 != null) {
			p1 = p1.next;
			m++;
		}

		while (p2 != null) {
			p2 = p2.next;
			n++;
		}

		p1 = head1;
		p2 = head2;

		int diff = Math.abs(m - n);
		while (diff > 0) {
			if (m > n) {
				p1 = p1.next;
			} else {
				p2 = p2.next;
			}
			diff--;
		}

		while (p1 != p2) {
			p1 = p1.next;
			p2 = p2.next;
		}

		return p1;

	}

	public static void main(String[] args) {
		Solution7 sol = new Solution7();

		ListNode<Integer> t1_h1 = null;
		ListNode<Integer> t1_h2 = null;

		System.out.println(sol.intersection(t1_h1, t1_h2));

		ListNode<Integer> t2_h1 = new ListNode<Integer>(-1);
		ListNode<Integer> t2_h2 = null;

		System.out.println(sol.intersection(t2_h1, t2_h2));

		ListNode<Integer> t3_h1 = null;
		ListNode<Integer> t3_h2 = new ListNode<Integer>(-1);

		System.out.println(sol.intersection(t3_h1, t3_h2));

		ListNode<Integer> t4_h1 = new ListNode<Integer>(-1);
		ListNode<Integer> t4_h2 = new ListNode<Integer>(-1);

		System.out.println(sol.intersection(t4_h1, t4_h2));

		ListNode<Integer> t5_h1 = new ListNode<Integer>(-1);
		ListNode<Integer> t5_shareNode = new ListNode<Integer>(1);
		ListNode<Integer> t5_h2 = new ListNode<Integer>(-1);
		t5_h1.next = t5_shareNode;
		t5_h2.next = t5_shareNode;

		 System.out.println(sol.intersection(t5_h1, t5_h2).val);

		ListNode<Integer> t6_h1 = new ListNode<Integer>(-1);
		ListNode<Integer> t6_h1_1 = new ListNode<Integer>(1);
		ListNode<Integer> t6_h1_2 = new ListNode<Integer>(3);
		ListNode<Integer> t6_h1_3 = new ListNode<Integer>(5);
		ListNode<Integer> t6_h2 = new ListNode<Integer>(-1);
		ListNode<Integer> t6_h2_1 = new ListNode<Integer>(2);
		ListNode<Integer> t6_h2_2 = new ListNode<Integer>(4);
		t6_h1.next = t6_h1_1;
		t6_h1_1.next = t6_h1_2;
		t6_h1_2.next = t6_h1_3;
		t6_h2.next = t6_h2_1;
		t6_h2_1.next = t6_h2_2;
		t6_h2_2.next = t6_h1_2;

		 System.out.println(sol.intersection(t6_h1, t6_h2).val);

		ListNode<Integer> t7_h1 = new ListNode<Integer>(-1);
		ListNode<Integer> t7_h1_1 = new ListNode<Integer>(1);
		ListNode<Integer> t7_h1_2 = new ListNode<Integer>(3);
		ListNode<Integer> t7_h2 = new ListNode<Integer>(-1);
		ListNode<Integer> t7_h2_1 = new ListNode<Integer>(2);
		ListNode<Integer> t7_h2_2 = new ListNode<Integer>(4);
		t7_h1.next = t7_h1_1;
		t7_h1_1.next = t7_h1_2;
		t7_h2.next = t7_h2_1;
		t7_h2_1.next = t7_h2_2;

		System.out.println(sol.intersection(t7_h1, t7_h2));//null pointer, so not print the value
	}

}
