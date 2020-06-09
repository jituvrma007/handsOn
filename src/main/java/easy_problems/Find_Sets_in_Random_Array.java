package easy_problems;

/* 
 
Find the sets in a random array which has the pairs according to their sum.

Example 
Input - [8,6,3, 4, 7, 5, 2,9,1]
Output 
[3, 4] = 7
[2, 3] = 5
[4, 5] = 9
[1, 2] = 3
[3, 5] = 8
[1, 3] = 4
[2, 4] = 6
[3, 6] = 9
[1, 4] = 5
[2, 5] = 7
[2, 6] = 8
[1, 5] = 6
[1, 6] = 7
[2, 7] = 9
[1, 7] = 8
[1, 8] = 9

Note : [2, 7] && [7, 2] are same set where sum is 9

 **/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Find_Sets_in_Random_Array {

	public Map<List<Integer>, Integer> allSets(Integer[] arr) {

		Map<List<Integer>, Integer> map = new HashMap<>();
		if (arr.length == 0 || arr == null) {
			return map;
		}

		Set<Integer> Arr = new TreeSet<>(Arrays.asList(arr));

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				List<Integer> l = new ArrayList<>();

				if (Arr.contains(arr[i] + arr[j]) && (i != j)) {
					l.add(arr[i]);
					l.add(arr[j]);
					Collections.sort(l);
					map.put(l, arr[i] + arr[j]);
				}
			}

		}
		return map;
	}

	public static void main(String[] args) {
		Find_Sets_in_Random_Array testClass = new Find_Sets_in_Random_Array();
		Map<List<Integer>, Integer> map = testClass.allSets(new Integer[] { 8, 6, 3, 4, 7, 5, 2, 9, 1 });
		map.forEach((K, V) -> System.out.println(K + " = " + V));
	}

}
