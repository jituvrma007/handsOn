package easy_problems;

/**
 * 
 * 58. Length of Last Word Given a string s consists of upper/lower-case
 * alphabets and empty space characters ' ', return the length of last word
 * (last word means the last appearing word if we loop from left to right) in
 * the string.
 * 
 * If the last word does not exist, return 0.
 * 
 * Note: A word is defined as a maximal substring consisting of non-space
 * characters only.
 * 
 * Example:
 * 
 * Input: "Hello World" Output: 5
 * 
 * 
 */

public class Length_of_Last_Word {

    public int lengthOfLastWord(String s) {
        
    	if(s.isEmpty() || s == null || s.trim().equals("")) return 0;
    	
    	String[] strArr = s.split(" ");
    	return strArr[strArr.length-1].length();
    }
    
    public static void main(String[] args) {
		Length_of_Last_Word word = new Length_of_Last_Word();
		System.out.println(word.lengthOfLastWord("Hello World"));
		System.out.println(word.lengthOfLastWord("    "));

    
    }
	
	
}
