package easy_problems;
/**
 136. Single Number
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:
Input: [2,2,1]
Output: 1

Example 2:
Input: [4,1,2,1,2]
Output: 4
 */

public class Single_Number {
    public int singleNumber(int[] nums) {
        
		int cap = 0;
		for (int i : nums) {
			cap = cap ^ i;
		}
		return cap;
    }

	public static void main(String[] args) {
		
		Single_Number number = new Single_Number();
		number.singleNumber(new int[] {4,1,2,1,2});
		number.singleNumber(new int[] {2,2,1});
	}
}
