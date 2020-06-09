package easy_problems;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/*
 *  
 * 
1. Two Sum
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

 * */
public class Two_Sum {

	public int[] twoSum(int[] nums, int target) {

		if (nums == null || nums.length ==0)
		{
			throw new IllegalArgumentException("invalid output");
		}
		
		Map<Integer, Integer> mp = new TreeMap<>();

		for (int i = 0; i < nums.length; i++) {
			mp.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++) {
			int minus = target - nums[i];

			if (mp.containsKey(minus) && i != mp.get(minus))
				return new int[] { i, mp.get(minus) };
		}
		throw new IllegalArgumentException("invalid output");
	}

	public static void main(String[] args) {

		Two_Sum sum = new Two_Sum();
		System.out.println(Arrays.toString(sum.twoSum(new int[] { 2, 7, 11, 15 }, 9))); //[0, 1]
		System.out.println(Arrays.toString(sum.twoSum(new int[] { 3,2,4}, 6))); //[1, 2]

	}

}
