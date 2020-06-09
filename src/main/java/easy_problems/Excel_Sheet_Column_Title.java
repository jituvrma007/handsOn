package easy_problems;

/**
 168. Excel Sheet Column Title
Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
    ...
Example 1:
Input: 1
Output: "A"

Example 2:
Input: 28
Output: "AB"

Example 3:
Input: 701
Output: "ZY"
 */
public class Excel_Sheet_Column_Title {
	public String convertToTitle(int n) {
		if (n < 1)
			return null;

		StringBuilder result = new StringBuilder();

		while (n != 0) {
			int reminder = n % 26;

			if (reminder == 0) {
				result = result.append('Z');
				n = (n / 26) - 1;
			} else {
				result = result.append((char) ((reminder - 1) + 'A'));
				n = n / 26;
			}
		}
		result.reverse();

		System.out.println(result.toString());
		return result.toString();
	}
	

	public static void main(String[] args) {
		Excel_Sheet_Column_Title title = new Excel_Sheet_Column_Title();
		title.convertToTitle(28);
	}
}
