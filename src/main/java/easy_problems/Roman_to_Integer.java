package easy_problems;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 13. Roman to Integer
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II.
The number twenty seven is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. 
However, the numeral for four is not IIII. Instead, the number four is written as IV. 
Because the one is before the five we subtract it making four. 
The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.

Example 1:

Input: "III"
Output: 3

Example 2:
Input: "IV"
Output: 4

Example 3:
Input: "IX"
Output: 9

Example 4:
Input: "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.

Example 5:
Input: "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */


public class Roman_to_Integer {

	public int romanToInt(String s) {

		if (s == null || s.equals(""))
			return -1;

		int num = 0;
		int prev = 0, curr = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			curr = returnPairValue(s.charAt(i));
			if (prev > curr)
				num = num - curr;
			else
				num = num + curr;
			prev = curr;

		}

		System.out.println(num);
		return num;
	}
	 
	 
	 public int returnPairValue(char key)
	 {
		Map<String, Integer> mp = new LinkedHashMap<>();
		mp.put("I", 1);
		mp.put("V", 5);
		mp.put("X", 10);
		mp.put("L", 50);
		mp.put("C", 100);
		mp.put("D", 500);
		mp.put("M", 1000);		 
		
		return mp.get(String.valueOf(key));
	 }
	
	 public static void main(String[] args) {
		Roman_to_Integer integer =  new Roman_to_Integer();
		integer.romanToInt("III"); //3
		integer.romanToInt("IV"); //4
		integer.romanToInt("MCMXCIV"); //1994
		integer.romanToInt("IX"); //9
		integer.romanToInt("LVIII"); //58
	}
	
}
