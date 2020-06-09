package easy_problems;

/**
 198. House Robber
You are a professional robber planning to rob houses along a street. 
Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.

Example 1:
Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
             Total amount you can rob = 1 + 3 = 4.
Example 2:
Input: nums = [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
             Total amount you can rob = 2 + 9 + 1 = 12.
 
Constraints:
0 <= nums.length <= 100
0 <= nums[i] <= 400 
 
 */

public class House_Robber {

	public int robUsingOddEven(int[] nums) {
		int even = 0;
		int odd = 0;

		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				even += nums[i];
				even = even > odd ? even : odd;

			} else {
				odd += nums[i];
				odd = even > odd ? even : odd;
			}

		}

		return even > odd ? even : odd;
	}
	
	public static void main(String[] args) {
	   House_Robber robber = new House_Robber();
	  // System.out.println(robber.rob(new int[] {1,2,3,1}));
	   System.out.println(robber.robUsingOddEven(new int[] {2,1,1,2}));
	  // System.out.println(robber.rob(new int[] {2,7,9,3,1}));
	}
}
