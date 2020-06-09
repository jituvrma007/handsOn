package easy_problems;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. Pascal's Triangle Given a non-negative integer numRows, generate the
 * first numRows of Pascal's triangle.
 * 
 * 
 * In Pascal's triangle, each number is the sum of the two numbers directly
 * above it.
 * 
 * Example: Input: 5 Output: [ [1], [1,1], [1,2,1], [1,3,3,1], [1,4,6,4,1] ]
 **/

public class Pascals_Triangle {

	public List<List<Integer>> generate(int numRows) {

		List<List<Integer>> result = new ArrayList<>();
		if (numRows <= 0)
			return result;

		for (int i = 1; i <= numRows; i++) {
			List<Integer> list = new ArrayList<>();

			int c = 1;
			for (int j = 1; j <= i; j++) {
				list.add(c);
				c = c * (i - j) / j; //Mathematical formula
			}
			result.add(list);
		}

		return result;

	}

	public static void main(String[] args) {
		Pascals_Triangle triangle = new Pascals_Triangle();
		System.out.println(triangle.generate(5));
	}
}
