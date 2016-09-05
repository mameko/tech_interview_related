package c2_LinkedLists;

import java.util.Stack;

public class Solution5_2 {

	public ListNode<Integer> sumListForwardOrder(ListNode<Integer> head1, ListNode<Integer> head2) {
		if (head1 == null || head2 == null) {
			return null;
		}

		if (head1.next == null && head2.next != null) {
			return head2;
		}

		if (head1.next != null && head2.next == null) {
			return head1;
		}

		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		Stack<Integer> resultStack = new Stack<>();

		ListNode<Integer> p1 = head1.next;
		ListNode<Integer> p2 = head2.next;

		while (p1 != null) {
			s1.push(p1.val);
			p1 = p1.next;
		}

		while (p2 != null) {
			s2.push(p2.val);
			p2 = p2.next;
		}

		int carry = 0;

		while (!s1.empty() && !s2.empty()) {
			int num1 = s1.pop();
			int num2 = s2.pop();

			int sum = num1 + num2 + carry;
			resultStack.push(sum % 10);
			carry = sum / 10;
		}

		while (!s1.empty()) {
			int sum = s1.pop() + carry;
			resultStack.push(sum % 10);
			carry = sum / 10;
		}

		while (!s2.empty()) {
			int sum = s2.pop() + carry;
			resultStack.push(sum % 10);
			carry = sum / 10;
		}

		if (carry != 0) {
			resultStack.push(carry);
		}

		ListNode<Integer> result = new ListNode<Integer>(-1);
		ListNode<Integer> p3 = result;
		ListNode<Integer> node = null;
		while (!resultStack.empty()) {
			node = new ListNode<Integer>(resultStack.pop());
			p3.next = node;
			p3 = p3.next;
		}

		return result;
	}

	public static void main(String[] args) {
		Solution5_2 sol = new Solution5_2();

		ListNode<Integer> t1_h1 = null;
		ListNode<Integer> t1_h2 = null;

		System.out.println(sol.sumListForwardOrder(t1_h1, t1_h2));

		ListNode<Integer> t2_h1 = new ListNode<Integer>(-1);
		ListNode<Integer> t2_h2 = null;

		System.out.println(sol.sumListForwardOrder(t2_h1, t2_h2));

		ListNode<Integer> t3_h1 = null;
		ListNode<Integer> t3_h2 = new ListNode<Integer>(-1);

		System.out.println(sol.sumListForwardOrder(t3_h1, t3_h2));

		ListNode<Integer> t4_h1 = new ListNode<Integer>(-1);
		ListNode<Integer> t4_h2 = new ListNode<Integer>(-1);

		System.out.println(sol.sumListForwardOrder(t4_h1, t4_h2));

		System.out.println("----------------");

		ListNode<Integer> t5_h1 = new ListNode<Integer>(-1);
		ListNode<Integer> t5_h2 = new ListNode<Integer>(-1);
		ListNode<Integer> t5_h2_1 = new ListNode<Integer>(5);
		t5_h2.next = t5_h2_1;

		System.out.println(sol.sumListForwardOrder(t5_h1, t5_h2));

		ListNode<Integer> t6_h1 = new ListNode<Integer>(-1);
		ListNode<Integer> t6_h1_1 = new ListNode<Integer>(7);
		t6_h1.next = t6_h1_1;
		ListNode<Integer> t6_h2 = new ListNode<Integer>(-1);

		System.out.println(sol.sumListForwardOrder(t6_h1, t6_h2));
		System.out.println(sol.sumListForwardOrder(t6_h1, t5_h2));

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

		System.out.println(sol.sumListForwardOrder(t7_h1, t7_h2));

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

		System.out.println(sol.sumListForwardOrder(t8_h1, t8_h2));

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

		System.out.println(sol.sumListForwardOrder(t9_h1, t9_h2));

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

		System.out.println(sol.sumListForwardOrder(t10_h1, t10_h2));
	}

}
