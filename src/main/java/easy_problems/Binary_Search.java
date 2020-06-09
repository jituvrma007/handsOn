package easy_problems;

public class Binary_Search {

	public int returnIndex(int[] nums, int target) {
		if (nums.length == 0 || nums == null)
			return -1;

		int left = 0;
		int right = nums.length - 1;
		int mid = right / 2;

		while (left <= right) {

			if (nums[mid] == target)
				return mid;
			else if (nums[mid] < target)
				left = mid + 1;
			else
				right = mid - 1;
			mid = left + (right - left) / 2;

		}

		return -1;
	}
	
	
	public int returnIndexRecursive(int[] nums, int leftIndex, int rightIndex, int target) {

		if (nums.length == 0 || nums == null)
			return -1;

		if (leftIndex <= rightIndex) {
			int mid = (leftIndex + rightIndex) / 2;

			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				return returnIndexRecursive(nums, leftIndex, mid - 1, target);
			} else {
				return returnIndexRecursive(nums, mid + 1, rightIndex, target);
			}
		}
		return -1;
	}
	
	public static void main(String args[]) 
    { 
        Binary_Search search = new Binary_Search(); 
        System.out.println(search.returnIndex(new int[] {5,10,15,20,25,30,35}, 35)); //6
        System.out.println(search.returnIndex(new int[] {2, 3, 4, 10, 40}, 10));  //3
        System.out.println(search.returnIndex(new int[] {5,10,15,20,25,30,35}, -5)); //-1
        System.out.println(search.returnIndex(new int[] {2, 3, 4, 10, 40}, 45));  //-1
        System.out.println(search.returnIndex(new int[] {2, 3, 4, 10, 40}, 4));  //2
        System.out.println(search.returnIndex(new int[] {5,10,15,20,25,30,35}, 20)); //3
        System.out.println();
        System.out.println(search.returnIndexRecursive(new int[] {5,10,15,20,25,30,35}, 0, 6, 35)); //6
        System.out.println(search.returnIndexRecursive(new int[] {2, 3, 4, 10, 40},0, 4, 10));  //3
        System.out.println(search.returnIndexRecursive(new int[] {5,10,15,20,25,30,35},0, 6, -5)); //-1
        System.out.println(search.returnIndexRecursive(new int[] {2, 3, 4, 10, 40}, 0, 4, 45));  //-1
        System.out.println(search.returnIndexRecursive(new int[] {2, 3, 4, 10, 40}, 0, 4, 4));  //2
        System.out.println(search.returnIndexRecursive(new int[] {5,10,15,20,25,30,35}, 0, 6, 20)); //3
    } 
	
}
