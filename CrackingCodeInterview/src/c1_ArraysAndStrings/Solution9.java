package c1_ArraysAndStrings;

public class Solution9 {

	public boolean stringRotate(String s1, String s2) {
		if (s1 == null && s2 == null) {
			return true;
		}

		if (s1 == null || s2 == null) {
			return false;
		}

		if (s1.length() != s2.length()) {
			return false;
		}
		
		String s2s2 = s2+s2;
		return s2s2.contains(s1);
	}

	public static void main(String[] args) {
		Solution9 sol = new Solution9();
		
		String t1_s1 = null;
		String t1_s2 = null;
		
		String t2_s1 = "";
		String t2_s2 = "";
		
		String t3_s1 = "ab";
		String t3_s2 = "a";
		
		String t4_s1 = null;
		String t4_s2 = "a";
		
		String t5_s1 = "a";
		String t5_s2 = null;
		
		String t6_s1 = "erbottlewat";
		String t6_s2 = "waterbottle";
		
		String t7_s1 = "ab";
		String t7_s2 = "ba";
		
		String t8_s1 = "abc";
		String t8_s2 = "dab";
		
		String t9_s1 = "arbottlewat";
		String t9_s2 = "waterbottle";

		
		System.out.println(sol.stringRotate(t1_s1, t1_s2));
		System.out.println(sol.stringRotate(t2_s1, t2_s2));
		System.out.println(sol.stringRotate(t3_s1, t3_s2));
		System.out.println(sol.stringRotate(t4_s1, t4_s2));
		System.out.println(sol.stringRotate(t5_s1, t5_s2));
		System.out.println();
		System.out.println(sol.stringRotate(t6_s1, t6_s2));
		System.out.println(sol.stringRotate(t7_s1, t7_s2));
		System.out.println(sol.stringRotate(t8_s1, t8_s2));
		System.out.println(sol.stringRotate(t9_s1, t9_s2));
	}

}
