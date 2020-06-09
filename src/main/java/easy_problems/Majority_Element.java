package easy_problems;

import java.util.HashMap;
import java.util.Map;

/**
 169. Majority Element
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3
Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2
 
*/


public class Majority_Element {

	public int majorityElement(int[] nums) {

		if (nums.length == 0 || nums == null) {
			return -1;
		}

		int factor = nums.length / 2;

		Map<Integer, Integer> mp = new HashMap<>();
		for (int num : nums) {
			mp.put(num, mp.getOrDefault(num, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
			if (entry.getValue() > factor) {
				return entry.getKey();
			}
		}

		return -1;
	}
    
    public static void main(String[] args) {
		
    	
    	Majority_Element element = new Majority_Element();
    	System.out.println(element.majorityElement(new int[]{3,2,3}));
    	System.out.println(element.majorityElement(new int[]{2,2,1,1,1,2,2}));
    	
	}
	
}
