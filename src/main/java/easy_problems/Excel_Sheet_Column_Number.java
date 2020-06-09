package easy_problems;
/**
 171. Excel Sheet Column Number
Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
    ...
    
Example 1:
Input: "A"
Output: 1

Example 2:
Input: "AB"
Output: 28

Example 3:
Input: "ZY"
Output: 701
 */

public class Excel_Sheet_Column_Number {

	public int titleToNumber(String s) {
		if (s.equals("") || s == null)
			return -1;

		int result = 0;
		for (int i = 0; i < s.length(); i++) {

			result = result * 26;
			result = result + (s.charAt(i) - 'A') + 1;
		}

		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {

		Excel_Sheet_Column_Number number = new Excel_Sheet_Column_Number();
		number.titleToNumber("AB");
	}
}
