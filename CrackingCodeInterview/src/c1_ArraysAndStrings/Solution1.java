package c1_ArraysAndStrings;

import java.util.Arrays;

public class Solution1 {

	public boolean isUnique(String s) {
		if (s == null || s.length() == 0) {
			return false;
		}
		
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		
		for (int i = 0; i < chars.length - 1; i++) {
			if (chars[i] == chars[i+1]) {
				return false;
			}
		}
		
		return true;		
	}
	
	public static void main(String[] args) {

		Solution1 sol = new Solution1();
		
		System.out.println(sol.isUnique(""));
		System.out.println(sol.isUnique("a"));
		System.out.println(sol.isUnique(null));
		System.out.println(sol.isUnique("abacd"));
		System.out.println(sol.isUnique("abcde"));
		System.out.println(sol.isUnique("abcda"));
	}

}
