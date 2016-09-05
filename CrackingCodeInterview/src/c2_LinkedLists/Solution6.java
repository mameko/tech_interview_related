package c2_LinkedLists;

import java.util.Stack;

public class Solution6 {

	public boolean isParlindromeList(ListNode<Character> head) {
		if (head == null || head.next == null) {
			return false;
		}

		ListNode<Character> p = head.next;
		int count = 0;

		while (p != null) {
			p = p.next;
			count++;
		}

		boolean isOdd = count % 2 == 1;

		p = head.next;

		Stack<Character> auxS = new Stack<>();
		int counter = 0;
		while (counter < count / 2) {
			auxS.push(p.val);
			p = p.next;
			counter++;
		}

		if (isOdd) {
			p = p.next;
		}

		while (!auxS.empty()) {
			if (p.val != auxS.pop()) {
				return false;
			}
			p = p.next;
		}

		return true;
	}

	public static void main(String[] args) {
		Solution6 sol = new Solution6();
		
		ListNode<Character> t1 = null;
		ListNode<Character> t2 = new ListNode<Character>(' ');

		ListNode<Character> t3 = new ListNode<Character>(' ');
		ListNode<Character> t3_1 = new ListNode<Character>('a');
		t3.next = t3_1;

		ListNode<Character> t4 = new ListNode<Character>(' ');
		ListNode<Character> t4_1 = new ListNode<Character>('a');
		ListNode<Character> t4_2 = new ListNode<Character>('a');
		t4.next = t4_1;
		t4_1.next = t4_2;

		ListNode<Character> t5 = new ListNode<Character>(' ');
		ListNode<Character> t5_1 = new ListNode<Character>('a');
		ListNode<Character> t5_2 = new ListNode<Character>('b');
		t5.next = t5_1;
		t5_1.next = t5_2;

		ListNode<Character> t6 = new ListNode<Character>(' ');
		ListNode<Character> t6_1 = new ListNode<Character>('a');
		ListNode<Character> t6_2 = new ListNode<Character>('b');
		ListNode<Character> t6_3 = new ListNode<Character>('a');
		t6.next = t6_1;
		t6_1.next = t6_2;
		t6_2.next = t6_3;
		
		ListNode<Character> t7 = new ListNode<Character>(' ');
		ListNode<Character> t7_1 = new ListNode<Character>('a');
		ListNode<Character> t7_2 = new ListNode<Character>('b');
		ListNode<Character> t7_3 = new ListNode<Character>('c');
		t7.next = t7_1;
		t7_1.next = t7_2;
		t7_2.next = t7_3;
		
		ListNode<Character> t8 = new ListNode<Character>(' ');
		ListNode<Character> t8_1 = new ListNode<Character>('a');
		ListNode<Character> t8_2 = new ListNode<Character>('b');
		ListNode<Character> t8_3 = new ListNode<Character>('c');
		ListNode<Character> t8_4 = new ListNode<Character>('c');
		ListNode<Character> t8_5 = new ListNode<Character>('b');
		ListNode<Character> t8_6 = new ListNode<Character>('a');
		t8.next = t8_1;
		t8_1.next = t8_2;
		t8_2.next = t8_3;
		t8_3.next = t8_4;
		t8_4.next = t8_5;
		t8_5.next = t8_6;
		
		System.out.println(sol.isParlindromeList(t1));
		System.out.println(sol.isParlindromeList(t2));
		System.out.println(sol.isParlindromeList(t3));
		System.out.println(sol.isParlindromeList(t4));
		System.out.println(sol.isParlindromeList(t5));
		System.out.println(sol.isParlindromeList(t6));
		System.out.println(sol.isParlindromeList(t7));
		System.out.println(sol.isParlindromeList(t8));
		

	}
}
