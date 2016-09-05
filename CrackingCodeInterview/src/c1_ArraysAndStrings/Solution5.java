package c1_ArraysAndStrings;

public class Solution5 {

	public boolean zeroOrOneEditDistance(String s1, String s2) {
		if (s1==null && s2 == null) {
			return true;
		}
		
		if(s1==null || s2 == null){
			return false;
		}
		
		String ls = "";
		String ss = "";
		
		if (s1.length() > s2.length()) {
			ls = s1;
			ss = s2;
		} else {
			ls = s2;
			ss = s1;
		}
		
		int diff = Math.abs(s1.length() - s2.length());
		if (diff > 1) {
			return false;
		} else if (diff == 1) {
			for (int i = 0; i < ss.length(); i++) {
				if (ls.charAt(i) != ss.charAt(i)) {
					return ls.substring(i + 1).equals(ss.substring(i));
				}
			}
		} else {
			int count = 0;
			for (int i = 0; i < ss.length(); i++) {
				if (ls.charAt(i) != ss.charAt(i)) {
					count++;
				}
				if (count > 1) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		
		System.out.println(sol.zeroOrOneEditDistance("", ""));
		System.out.println(sol.zeroOrOneEditDistance("", null));
		System.out.println(sol.zeroOrOneEditDistance(null, ""));
		System.out.println(sol.zeroOrOneEditDistance(null, null));
		System.out.println("------------");
		System.out.println(sol.zeroOrOneEditDistance("ab", "ac"));
		System.out.println(sol.zeroOrOneEditDistance("abc", "ab"));
		System.out.println(sol.zeroOrOneEditDistance("ab", "abc"));
		System.out.println(sol.zeroOrOneEditDistance("abcd", "ab"));
		System.out.println(sol.zeroOrOneEditDistance("def", "ab"));
		System.out.println("------------");
		System.out.println(sol.zeroOrOneEditDistance("aabbb", "abbb"));
		System.out.println(sol.zeroOrOneEditDistance("aaccb", "abbb"));
	}

}
