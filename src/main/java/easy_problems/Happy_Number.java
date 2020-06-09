package easy_problems;

import java.util.HashSet;
import java.util.Set;

/**
 202. Happy Number
Write an algorithm to determine if a number n is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. 
Those numbers for which this process ends in 1 are happy numbers.

Return True if n is a happy number, and False if not.

Example: 

Input: 19
Output: true
Explanation: 
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
 */

public class Happy_Number {

	public boolean isHappy(int n) {
		Set<Integer> numbers = new HashSet<>();

		int num = n;
		while (true) {
			num = sumOfNumber(num);
			if (numbers.contains(num))
				return false;
			else if (num == 1)
				return true;
			else
				numbers.add(num);
			continue;
		}

	}

	public int sumOfNumber(int n) {

		int rem = 0;
		int total = 0;
		while (n != 0) {
			rem = n % 10;
			n = n / 10;
			total = total + rem * rem;
		}
		System.out.println(total);
		return total;
	}

    public static void main(String[] args) {
		Happy_Number number = new Happy_Number();
		System.out.println(number.isHappy(20));
	}
}
