package easy_problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Check_Two_Strings_Are_Anagram {

	public boolean checkAnagramUsingMap(String first, String second) {

		if (first == null || second == null) {
			return false;
		}

		Map<Character, Integer> fMap = new HashMap<>();
		for (Character ch : first.toCharArray()) {
			fMap.put(Character.toLowerCase(ch), fMap.getOrDefault(ch, 0) + 1);

		}

		Map<Character, Integer> sMap = new HashMap<>();
		for (Character ch : second.toCharArray()) {
			sMap.put(Character.toLowerCase(ch), sMap.getOrDefault(ch, 0) + 1);

		}

		return fMap.equals(sMap);
	}
	
	
	
	public boolean checkAnagramUsingSet(String first, String second) {

		if (first == null || second == null) {
			return false;
		}

		char[] fCh = first.toLowerCase().toCharArray();
		char[] sCh = second.toLowerCase().toCharArray();
		Arrays.sort(fCh);
		Arrays.sort(sCh);

		return Arrays.equals(fCh, sCh);
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		Check_Two_Strings_Are_Anagram anagram = new Check_Two_Strings_Are_Anagram();
//		System.out.println(anagram.checkAnagramUsingMap("geeksforgeeks", "forgeeksgeeks")); //true
//		System.out.println(anagram.checkAnagramUsingMap("allergy", "allergic")); //false
//		System.out.println(anagram.checkAnagramUsingMap("LISTEN", "SILENT")); //true
//		System.out.println(anagram.checkAnagramUsingMap("TRIANGLE", "INTEGRAL")); //true

		System.out.println(anagram.checkAnagramUsingSet("LISTEN", "SILENT")); //true
		System.out.println(anagram.checkAnagramUsingSet("TRIANGLE", "INTEGRAL")); //true
		System.out.println(anagram.checkAnagramUsingSet("geeksforgeeks", "forgeeksgeeks")); //true
		System.out.println(anagram.checkAnagramUsingSet("allergy", "allergic")); //false

		
		System.out.println(anagram.checkAnagramUsingMap("School MASTER", "ClassROOM")); //false
		
	}
}
