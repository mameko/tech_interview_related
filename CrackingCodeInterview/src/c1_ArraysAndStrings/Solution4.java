package c1_ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;

public class Solution4 {

	public boolean palindromePermutation(String s) {
		if (s == null) {
			return false;
		}

		if (s.length() == 0) {
			return true;
		}

		int len = s.length();

		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < len; i++) {
			char c = s.charAt(i);
			if (c != ' ') {
				if (!map.containsKey(c)) {
					map.put(c, 1);
				} else {
					map.put(c, map.get(c) + 1);
				}
			}

		}
		
		int oddCount = 0;
		for(Map.Entry<Character, Integer> e : map.entrySet()){
			if (!isEven(e.getValue())) {
				oddCount ++;
			}
		}
		
		if (oddCount > 1) {
			return false;
		}
		
		return true;
	}

	private boolean isEven(Integer i) {
		return i%2 == 0;
	}
	
	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		
		System.out.println(sol.palindromePermutation(null));
		System.out.println(sol.palindromePermutation(""));
		System.out.println(sol.palindromePermutation("a"));
		System.out.println(sol.palindromePermutation("ab"));
		System.out.println(sol.palindromePermutation("aa"));
		System.out.println(sol.palindromePermutation("level"));
		System.out.println(sol.palindromePermutation("aabb"));
		System.out.println(sol.palindromePermutation("abc"));
	}

}
