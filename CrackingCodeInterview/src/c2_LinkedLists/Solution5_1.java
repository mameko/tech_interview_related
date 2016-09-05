package c2_LinkedLists;

public class Solution5_1 {

	public ListNode<Integer> sumListReverse(ListNode<Integer> head1, ListNode<Integer> head2) {
		if (head1 == null || head2 == null) {
			return null;
		}

		if (head1.next == null && head2.next != null) {
			return head2;
		}

		if (head1.next != null && head2.next == null) {
			return head1;
		}

		ListNode<Integer> head3 = new ListNode<Integer>(-1);
		ListNode<Integer> p1 = head1.next;
		ListNode<Integer> p2 = head2.next;
		ListNode<Integer> p3 = head3;

		ListNode<Integer> node = null;
		int carry = 0;
		while (p1 != null && p2 != null)

		{
			int sum = p1.val + p2.val + carry;
			node = new ListNode<Integer>(sum % 10);
			p3.next = node;
			carry = sum / 10;

			p1 = p1.next;
			p2 = p2.next;
			p3 = p3.next;
		}

		while (p1 != null)

		{
			int sum = carry + p1.val;
			node = new ListNode<Integer>(sum % 10);
			p3.next = node;
			carry = sum / 10;
			p1 = p1.next;
			p3 = p3.next;

		}

		while (p2 != null)

		{
			int sum = carry + p2.val;
			node = new ListNode<Integer>(sum % 10);
			p3.next = node;
			carry = sum / 10;
			p2 = p2.next;
			p3 = p3.next;

		}

		if (carry != 0) {
			node = new ListNode<Integer>(carry);
			p3.next = node;
		}
		return head3;

	}

	public static void main(String[] args) {
		Solution5_1 sol = new Solution5_1();

		ListNode<Integer> t1_h1 = null;
		ListNode<Integer> t1_h2 = null;

		System.out.println(sol.sumListReverse(t1_h1, t1_h2));

		ListNode<Integer> t2_h1 = new ListNode<Integer>(-1);
		ListNode<Integer> t2_h2 = null;

		System.out.println(sol.sumListReverse(t2_h1, t2_h2));

		ListNode<Integer> t3_h1 = null;
		ListNode<Integer> t3_h2 = new ListNode<Integer>(-1);

		System.out.println(sol.sumListReverse(t3_h1, t3_h2));

		ListNode<Integer> t4_h1 = new ListNode<Integer>(-1);
		ListNode<Integer> t4_h2 = new ListNode<Integer>(-1);

		System.out.println(sol.sumListReverse(t4_h1, t4_h2));

		System.out.println("----------------");

		ListNode<Integer> t5_h1 = new ListNode<Integer>(-1);
		ListNode<Integer> t5_h2 = new ListNode<Integer>(-1);
		ListNode<Integer> t5_h2_1 = new ListNode<Integer>(5);
		t5_h2.next = t5_h2_1;

		System.out.println(sol.sumListReverse(t5_h1, t5_h2));

		ListNode<Integer> t6_h1 = new ListNode<Integer>(-1);
		ListNode<Integer> t6_h1_1 = new ListNode<Integer>(7);
		t6_h1.next = t6_h1_1;
		ListNode<Integer> t6_h2 = new ListNode<Integer>(-1);

		System.out.println(sol.sumListReverse(t6_h1, t6_h2));
		System.out.println(sol.sumListReverse(t6_h1, t5_h2));

		System.out.println("----------------");

		ListNode<Integer> t7_h1 = new ListNode<Integer>(-1);
		ListNode<Integer> t7_h1_1 = new ListNode<Integer>(9);
		ListNode<Integer> t7_h1_2 = new ListNode<Integer>(9);
		ListNode<Integer> t7_h1_3 = new ListNode<Integer>(9);
		t7_h1.next = t7_h1_1;
		t7_h1_1.next = t7_h1_2;
		t7_h1_2.next = t7_h1_3;
		ListNode<Integer> t7_h2 = new ListNode<Integer>(-1);
		ListNode<Integer> t7_h2_1 = new ListNode<Integer>(1);
		ListNode<Integer> t7_h2_2 = new ListNode<Integer>(1);
		ListNode<Integer> t7_h2_3 = new ListNode<Integer>(1);
		t7_h2.next = t7_h2_1;
		t7_h2_1.next = t7_h2_2;
		t7_h2_2.next = t7_h2_3;

		System.out.println(sol.sumListReverse(t7_h1, t7_h2));

		ListNode<Integer> t8_h1 = new ListNode<Integer>(-1);
		ListNode<Integer> t8_h1_1 = new ListNode<Integer>(1);
		ListNode<Integer> t8_h1_2 = new ListNode<Integer>(1);
		ListNode<Integer> t8_h1_3 = new ListNode<Integer>(1);
		t8_h1.next = t8_h1_1;
		t8_h1_1.next = t8_h1_2;
		t8_h1_2.next = t8_h1_3;
		ListNode<Integer> t8_h2 = new ListNode<Integer>(-1);
		ListNode<Integer> t8_h2_1 = new ListNode<Integer>(2);
		ListNode<Integer> t8_h2_2 = new ListNode<Integer>(3);
		ListNode<Integer> t8_h2_3 = new ListNode<Integer>(4);
		t8_h2.next = t8_h2_1;
		t8_h2_1.next = t8_h2_2;
		t8_h2_2.next = t8_h2_3;

		System.out.println(sol.sumListReverse(t8_h1, t8_h2));

		ListNode<Integer> t9_h1 = new ListNode<Integer>(-1);
		ListNode<Integer> t9_h1_1 = new ListNode<Integer>(9);
		ListNode<Integer> t9_h1_2 = new ListNode<Integer>(9);
		ListNode<Integer> t9_h1_3 = new ListNode<Integer>(9);
		t9_h1.next = t9_h1_1;
		t9_h1_1.next = t9_h1_2;
		t9_h1_2.next = t9_h1_3;
		ListNode<Integer> t9_h2 = new ListNode<Integer>(-1);
		ListNode<Integer> t9_h2_1 = new ListNode<Integer>(1);
		t9_h2.next = t9_h2_1;

		System.out.println(sol.sumListReverse(t9_h1, t9_h2));

		ListNode<Integer> t10_h1 = new ListNode<Integer>(-1);
		ListNode<Integer> t10_h1_1 = new ListNode<Integer>(1);
		t10_h1.next = t10_h1_1;
		ListNode<Integer> t10_h2 = new ListNode<Integer>(-1);
		ListNode<Integer> t10_h2_1 = new ListNode<Integer>(8);
		ListNode<Integer> t10_h2_2 = new ListNode<Integer>(8);
		ListNode<Integer> t10_h2_3 = new ListNode<Integer>(8);
		t10_h2.next = t10_h2_1;
		t10_h2_1.next = t10_h2_2;
		t10_h2_2.next = t10_h2_3;

		System.out.println(sol.sumListReverse(t10_h1, t10_h2));
	}

}
