package easy_problems;

/**
 125. Valid Palindrome
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
 */

public class Valid_Palindrome {

	public boolean isPalindrome(String s) {
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		Valid_Palindrome valid_Palindrome = new Valid_Palindrome();
		System.out.println(valid_Palindrome.isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(valid_Palindrome.isPalindrome("race a car"));
	}
}
