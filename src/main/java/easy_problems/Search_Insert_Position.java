package easy_problems;

/**
 35. Search Insert Position
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Example 1:
Input: [1,3,5,6], 5
Output: 2

Example 2:
Input: [1,3,5,6], 2
Output: 1

Example 3:
Input: [1,3,5,6], 7
Output: 4

Example 4:
Input: [1,3,5,6], 0
Output: 0
 
 
 */

public class Search_Insert_Position {

	
	public int searchInsert(int[] nums, int target) {

		if (nums == null || nums.length == 0)
			return -1;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] >= target) {
				return i;
			}

		}

		return nums.length;
	}
	   
	public static void main(String[] args) {
		Search_Insert_Position position = new Search_Insert_Position();
		System.out.println(position.searchInsert(new int[] {1, 3,5,6}, 5)); //2
		System.out.println(position.searchInsert(new int[] {1,3,5,6}, 2)); //1
		System.out.println(position.searchInsert(new int[] {1,3,5,6}, 7)); //4
		System.out.println(position.searchInsert(new int[] {1,3,5,6}, 0)); //0
	}
}
