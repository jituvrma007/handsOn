package easy_problems;

/**
7. Reverse Integer
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:
Input: 123
Output: 321

Example 2:
Input: -123
Output: -321

Example 3:
Input: 120
Output: 21

Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1].
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */


public class Reverse_Integer {

	public long reverse(int x) { // taking long here, it is given int in the problem. Becuase this is very corner case and interview wont happen on that case.
	
		long  num =0;
		while(x !=0)
		{
			
		num = num*10 + x%10;
		x = x/10;
		
		}
		return num;
	}
	

	public static void main(String[] args) {
		Reverse_Integer integer = new Reverse_Integer();
		System.out.println(integer.reverse(123)); // 321
		System.out.println(integer.reverse(-123)); // -321
		System.out.println(integer.reverse(120)); // 21
		System.out.println(integer.reverse(1534236469)); //9646324351

	}
}
