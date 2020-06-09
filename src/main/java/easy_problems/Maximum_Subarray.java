package easy_problems;

/**
 * 53. Maximum Subarray Given an integer array nums, find the contiguous
 * subarray (containing at least one number) which has the largest sum and
 * return its sum.
 * 
 * Example: Input: [-2,1,-3,4,-1,2,1,-5,4], Output: 6 Explanation: [4,-1,2,1]
 * has the largest sum = 6. Follow up: If you have figured out the O(n)
 * solution, try coding another solution using the divide and conquer approach,
 * which is more subtle.
 */

public class Maximum_Subarray {

	// Brute Force Way O(n2)
	public int maxSubArray(int[] nums) {

		int sum = Integer.MIN_VALUE;
		int startIndex =0;
		int endIndex =0;
		
		for (int i = 0; i < nums.length; i++) {
			int total = nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				total = total + nums[j];
				if (total > sum) {
					sum = total;
					startIndex = i;
					endIndex = j;
				}
			}

		}

		System.out.println("max sum = " + sum);
		System.out.println("startIndex = " + startIndex +" endIndex = " + endIndex);
		for(int i =startIndex; i<=endIndex; i++) {
			System.out.println("[ "+nums[i]+" ]");
		}
		System.out.println();
		
		return sum;
	}
	

	// Kadane's Algo O(n)
	public int maxSubArrayK(int[] nums) {

		if(nums.length ==0)
	         return 0;
	     if(nums.length == 1)
	         return nums[0];
	     if(nums.length == 2)
	         return Integer.max(nums[1]+nums[0], Integer.max(nums[0], nums[1]));
	     
		int total = nums[0];
		int sum = nums[0];
		
		for (int i = 0; i < nums.length; i++) {

			total = Integer.max(nums[i], total + nums[i]);
			if (total > sum) {
				sum = total;
			}

		}
		System.out.println(sum);
		return sum;
	}
	
	
	 public int maxSubArrayE(int[] nums) {
			if (nums.length == 0)
				return 0;
			if (nums.length == 1)
				return nums[0];
			if (nums.length == 2)
				return Integer.max(nums[0] + nums[1], Integer.max(nums[0], nums[1]));

			int max = 0;
			int so_max = 0;
			int min = Integer.MIN_VALUE;
			for (int i = 0; i < nums.length; i++) {
				max = max + nums[i];

				if (so_max < max) {
					so_max = max;
				}

				if (min < max) {
					min = max;
				}

				if (max < 0) {
					max = 0;
				}

			}
			if (so_max == 0) {
				return min;
			}
			return so_max;
		}
	
	
	public static void main(String[] args) {
		Maximum_Subarray subarray = new Maximum_Subarray();

		subarray.maxSubArray(new int[] { 2, 3, 4, 5, 7 }); // 21
		subarray.maxSubArray(new int[] {  -8, -3, -6, -2, -5, -4 }); // -2
		subarray.maxSubArray(new int[]  {8, -7, -3, 5, 6, -2, 3, -4, 2}); // 12
		subarray.maxSubArray(new int[] { -2, 3, -1}); // 3

System.out.println("=====");		

		subarray.maxSubArrayK(new int[] { 2, 3, 4, 5, 7 }); // 21 //23
		subarray.maxSubArrayK(new int[] {  -8, -3, -6, -2, -5, -4 }); // -2
		subarray.maxSubArrayK(new int[]  {8, -7, -3, 5, 6, -2, 3, -4, 2}); // 12 // 18
		subarray.maxSubArrayK(new int[] { -2, -3, -1}); // 3
		
System.out.println("=====");		

		System.out.println(subarray.maxSubArrayE(new int[] { 2, 3, 4, 5, 7 })); // 21
		System.out.println(subarray.maxSubArrayE(new int[] {  -8, -3, -6, -2, -5, -4 })); // -2
		System.out.println(subarray.maxSubArrayE(new int[]  {8, -7, -3, 5, 6, -2, 3, -4, 2})); // 12
		System.out.println(subarray.maxSubArrayE(new int[] { -2, -3, -1})); // -1


	}
}
