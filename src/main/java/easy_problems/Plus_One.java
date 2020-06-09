package easy_problems;

import java.util.Arrays;

/**
 * 66. Plus One Given a non-empty array of digits representing a non-negative
 * integer, plus one to the integer.
 * 
 * The digits are stored such that the most significant digit is at the head of
 * the list, and each element in the array contain a single digit.
 * 
 * You may assume the integer does not contain any leading zero, except the
 * number 0 itself.
 * 
 * Example 1:
 * 
 * Input: [1,2,3] Output: [1,2,4] Explanation: The array represents the integer
 * 123.
 * 
 * Example 2: Input: [4,3,2,1] Output: [4,3,2,2] Explanation: The array
 * represents the integer 4321.
 * 
 */

public class Plus_One {

	public int[] plusOne(int[] digits) {

		if (digits.length == 0 || digits == null) {
			return digits;
		}

		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] == 9) {
				digits[i] = 0;
			} else {
				digits[i] = ++digits[i];
				System.out.println(Arrays.toString(digits));
				return digits;

			}

		}

		int arr[] = new int[digits.length + 1];
		arr[0] = 1; // Trick here, because int arr always initialized to 0

		System.out.println(Arrays.toString(arr));
		return arr;
	}

	public static void main(String[] args) {
		Plus_One one = new Plus_One();
		one.plusOne(new int[] { 1, 2, 3 });
		one.plusOne(new int[] { 4, 3, 2, 1 });

		one.plusOne(new int[] { 9, 9, 9 });
		one.plusOne(new int[] { 9 });

	}

}
