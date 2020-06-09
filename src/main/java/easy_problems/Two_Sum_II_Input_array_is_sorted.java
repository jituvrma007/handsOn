package easy_problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 167. Two Sum II - Input array is sorted
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

Note:
Your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution and you may not use the same element twice.

Example:
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */

public class Two_Sum_II_Input_array_is_sorted {

	
	//Using Map order of 1
	public int[] twoSum(int[] numbers, int target) {

		if (numbers == null | numbers.length == 0)
			return numbers;

		Map<Integer, Integer> mp = new HashMap<>();
		for (int i = 0; i <= numbers.length - 1; i++) {
			mp.put(numbers[i], i);
		}

		for (int i = 0; i <= numbers.length - 1; i++) {
			int minus = target - numbers[i];

			if (mp.containsKey(minus)) {
				return new int[] { i + 1, mp.get(minus) + 1 };
			}

		}

		throw new IllegalArgumentException("threr is no two sum pair according to target !");
	}
	
	// Brute Force N^2
	public int[] twoSumUsingBruteForce(int[] numbers, int target) {

		if (numbers == null | numbers.length == 0)
			return numbers;

		for (int i = 0; i <= numbers.length - 1; i++) {
			for (int j = i + 1; j <= numbers.length - 1; j++) {

				if (numbers[i] + numbers[j] == target) {
					return new int[] { i + 1, j + 1 };
				}

			}
		}

		throw new IllegalArgumentException("threr is no two sum pair according to target !");
	}
	
	
	// Two pointers --> This is the best approach.
	public int[] twoSumUsingTwoPointers(int[] numbers, int target) {

		if (numbers == null | numbers.length == 0)
			return numbers;

		int i = 0;
		int j = numbers.length - 1;

		while (i < j) {
			if (numbers[i] + numbers[j] == target)
				return new int[] { i + 1, j + 1 };
			else if (numbers[i] + numbers[j] > target)
				j--;
			else
				i++;
		}
		throw new IllegalArgumentException("threr is no two sum pair according to target !");
	}
	

    public static void main(String[] args) {
		Two_Sum_II_Input_array_is_sorted sorted = new Two_Sum_II_Input_array_is_sorted();
		System.out.println(Arrays.toString(sorted.twoSumUsingTwoPointers(new int[]{2,7,11,15}, 9)));
	}
}
