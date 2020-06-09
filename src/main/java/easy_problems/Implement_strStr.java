package easy_problems;

/**
 * 28. Implement strStr() Implement strStr().
 * 
 * Return the index of the first occurrence of needle in haystack, or -1 if
 * needle is not part of haystack.
 * 
 * Example 1:
 * 
 * Input: haystack = "hello", needle = "ll" Output: 2 Example 2:
 * 
 * Input: haystack = "aaaaa", needle = "bba" Output: -1
 * 
 * 
 */

public class Implement_strStr {

	public int strStr(String haystack, String needle) {
		if(haystack == null || needle ==null) return -1;
		return haystack.indexOf(needle);
	}

	public static void main(String[] args) {
		Implement_strStr str = new Implement_strStr();
		System.out.println(str.strStr("hello", "ll"));
		System.out.println(str.strStr("aaaaa", "bba"));
		System.out.println(str.strStr("", "a"));
		System.out.println(str.strStr("", ""));

	}
}
