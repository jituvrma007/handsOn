package easy_problems;

import java.util.ArrayList;
import java.util.List;

/**
 119. Pascal's Triangle II
Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
Note that the row index starts from 0.

In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example:
Input: 3
Output: [1,3,3,1]
 */


public class Pascals_Triangle_II {
	
	public List<Integer> getRow(int rowIndex) {
		List<Integer> list = new ArrayList<>();
		if (rowIndex < 0)
			return list;

		for (int i = 1; i <= rowIndex + 1; i++) {

			long l = 1;
			for (int j = 1; j <= i; j++) {

				if (i == (rowIndex + 1))
					list.add((int) l);
				l = l * (i - j) / j;
			}
		}

		return list;
	}

	public static void main(String[] args) {
		Pascals_Triangle_II triangle = new Pascals_Triangle_II();
		System.out.println(triangle.getRow(30));
	}
}
 