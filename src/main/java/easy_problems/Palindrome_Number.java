package easy_problems;

/**
 
 9. Palindrome Number
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:
Input: 121
Output: true

Example 2:
Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 
 */



public class Palindrome_Number {

	
	public boolean isPalindrome(int x) {

		if (x < 0)
			return false;

		int num = 0;
		int orgNum = x;
		while (x != 0) {
			num = num * 10 + x % 10;
			x = x / 10;
		}

		return num == orgNum;
	}
    
    public static void main(String[] args) {
		Palindrome_Number number = new Palindrome_Number();
		System.out.println(number.isPalindrome(121)); // true
		System.out.println(number.isPalindrome(-121)); // false
		System.out.println(number.isPalindrome(10)); // false

	}
	
}
