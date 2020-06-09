package easy_problems;

/**
 14. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:
Input: ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: ["dog","racecar","car"]
Output: ""

Explanation: There is no common prefix among the input strings.

Note:All given inputs are in lowercase letters a-z.
 */




public class Longest_Common_Prefix {

	public String longestCommonPrefix(String[] strs) {

		if (strs == null || strs.length == 0)
			return "";

		String prefix = strs[0];

		for (int i = 0; i < strs.length; i++) {

			while (strs[i].indexOf(prefix) < 0) {

				prefix = prefix.substring(0, prefix.length() - 1);
			}

			if (!strs[i].startsWith(prefix)) {
				prefix = prefix.substring(0, prefix.length() - 1);
			}

			if (prefix.isEmpty())
				return "";
		}

		return prefix;
	}

	public static void main(String[] args) {
		Longest_Common_Prefix prefix = new Longest_Common_Prefix();
		System.out.println(prefix.longestCommonPrefix(new String[] {"flower", "flow", "flight" })); // fl
		System.out.println(prefix.longestCommonPrefix(new String[] {"dog","racecar","car" })); // ""
		System.out.println(prefix.longestCommonPrefix(new String[] {"c","acc","ccc"})); // ""
		System.out.println(prefix.longestCommonPrefix(new String[] {"abca","aba","aaab"})); // a
		
	
	}

}
