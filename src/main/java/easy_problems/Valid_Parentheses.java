package easy_problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 20. Valid Parentheses
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:
Input: "()"
Output: true

Example 2:
Input: "()[]{}"
Output: true

Example 3:
Input: "(]"
Output: false

Example 4:
Input: "([)]"
Output: false

Example 5:
Input: "{[]}"
Output: true
 
 */

public class Valid_Parentheses {

    static Map<Character, Character> map = new HashMap<>();
    static {
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
    }
	
	
	public boolean isValid(String s) {

		if (s.isEmpty() || s == null)
			return true;

		Stack<Character> stack = new Stack<>();
		for (Character ch : s.toCharArray()) {

			if (map.containsKey(ch))
				stack.push(map.get(ch));
			else if (stack.empty() || stack.pop() != ch)
				return false;

		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		Valid_Parentheses valid = new Valid_Parentheses();
		System.out.println(valid.isValid("{[]}")); // true
		System.out.println(valid.isValid("()")); // true
		System.out.println(valid.isValid("()[]{}")); // true
		System.out.println(valid.isValid("(]")); // false
		System.out.println(valid.isValid("([)]")); // false
		System.out.println(valid.isValid("{[()]}")); // true
		System.out.println(valid.isValid("")); // true
		System.out.println(valid.isValid("]")); // false

	}
}
