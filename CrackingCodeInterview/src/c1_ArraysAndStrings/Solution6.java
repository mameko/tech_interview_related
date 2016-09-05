package c1_ArraysAndStrings;

public class Solution6 {

	public String stringCompress(String s) {
		if (s ==null || s.length()==0) {
			return "emptySring";
		}
		
		char last = s.charAt(0);
		int count = 1;
		StringBuilder sb = new StringBuilder();
		sb.append(last);
		
		for (int i = 1; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == last) {
				count++;
			} else {
				last = c;
				sb.append(count);
				sb.append(last);
				count = 1;
			}
		}
		
		sb.append(count);
//		System.out.println("- debug - " + sb.toString());
		if (s.length() <= sb.length()) {
			return s;
		} else {
			return sb.toString();
		}
		
	}
	public static void main(String[] args) {
		Solution6 sol = new Solution6();
		
		System.out.println(sol.stringCompress(""));
		System.out.println(sol.stringCompress(null));
		System.out.println(sol.stringCompress("a"));
		System.out.println(sol.stringCompress("ab"));
		System.out.println(sol.stringCompress("aa"));
		System.out.println("-------------------");
		System.out.println(sol.stringCompress("aaaaa"));
		System.out.println(sol.stringCompress("aaaaac"));
		System.out.println(sol.stringCompress("abc"));
		System.out.println(sol.stringCompress("abbc"));
		System.out.println(sol.stringCompress("accccc"));
		System.out.println(sol.stringCompress("aabbb"));
	}

}
