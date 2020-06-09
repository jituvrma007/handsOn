package easy_problems;

import java.util.Arrays;

public class Minimum_Number_Platforms_Required {

	public int findPlatform(int arr[], int dep[]) {
		if (arr.length != dep.length || arr == null || dep == null) {
			return -1;
		}

		Arrays.sort(arr);
		Arrays.sort(dep);
		
		int result = 0;
		int i = 0;
		int j = 0;
		int platform = 0;

		while (i < arr.length && j < dep.length) {
			if (arr[i] <= dep[j]) {
				platform++;
				i++;
			} else if (arr[i] >= dep[j]) {
				platform--;
				j++;
			}
				result = Integer.max(platform, result);
		}

		return result;
	}
	
	public static void main(String[] args) {
		Minimum_Number_Platforms_Required required = new Minimum_Number_Platforms_Required();
		
//		int arr[] = { 900, 940, 950, 1100, 1500, 1800 }; 
//      int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 }; 

		int arr[] = { 900, 910}; 
        int dep[] = { 905, 950}; 
        
		System.out.println(required.findPlatform(arr, dep));
	}
	
}
