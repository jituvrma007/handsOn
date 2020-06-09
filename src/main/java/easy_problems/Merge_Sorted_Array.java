package easy_problems;

import java.util.Arrays;

/**
 88. Merge Sorted Array
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]
 */
public class Merge_Sorted_Array {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
	
		m--;
		n--;
		int k = m + n + 1;
		while (m >= 0 && n >= 0) {
			if (nums1[m] > nums2[n]) {
				nums1[k] = nums1[m];
				m--;
				k--;
			} else {
				nums1[k] = nums2[n];
				n--;
				k--;
			}

		}
		
		while (m >= 0) {
			nums1[k] = nums1[m];
			m--;
			k--;

		}

		while (n >= 0) {
			nums1[k] = nums2[n];
			n--;
			k--;

		}

		System.out.println(Arrays.toString(nums1));
    }
    
    public static void main(String[] args) {
		Merge_Sorted_Array array =  new Merge_Sorted_Array();
		int[] nums1 = new int[] {1,2,3,0,0,0,0};
		int[] nums2 = new int[] {2,5,6, 7};
		int m = 3;
		int n = 4;
		
		array.merge(nums1, m, nums2, n);
	}
}
