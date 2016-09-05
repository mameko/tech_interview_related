package c2_LinkedLists;

public class ListNode<T> {
	T val;
	ListNode<T> next;
	
	public ListNode(T value) {
		this.val = value;
	}
	
	
	@Override
	public String toString() {
		ListNode<T> cur = next;
		StringBuilder sb = new StringBuilder();
		while (cur!=null) {
			sb.append(cur.val.toString() + " ,");
			cur = cur.next;			
		}
		return sb.toString();
	}
}
