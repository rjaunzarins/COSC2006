package LeetCode;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs1 = {"flower","flow","flight"};
		String[] strs2 = {"dog","racecar","car"};
		String[] strs3 = {"qwertytt","qwertytt","qwerty"};
		String[] strs4 = {""};
		String[] strs5 = {"a"};
		String[] strs6 = {"ab", "a"};
		String prefix = longestCommonPrefix3( strs3 );
		System.out.println(prefix);

	}
	
	//	NOT WORKING!!!!!!!!!
	
	/*
	 * Write a function to find the longest common prefix string amongst an array of strings.
	 * If there is no common prefix, return an empty string "".
	 * 
	 * Example 1:
	 * 	Input: strs = ["flower","flow","flight"]
	 * 	Output: "fl"
	 * 
	 * Example 2:
	 * 	Input: strs = ["dog","racecar","car"]
	 * 	Output: ""
	 * 	Explanation: There is no common prefix among the input strings.
	 * 
	 * Constraints:
	 * 	1 <= strs.length <= 200
	 * 	0 <= strs[i].length <= 200
	 * 	strs[i] consists of only lowercase English letters.
	 */
	
	//Version that calls another function
	public static String longestCommonPrefix(String[] strs) {
		int idx = 0;
		String prefix = "";
		while(loop(strs, idx)) {
			prefix += strs[0].charAt(idx);
			++idx;
		}
		return prefix;
	}
	
	// Secondary function to longestCommonPrefix
	public static boolean loop(String[] strs, int idx) {
		int i = 1;
		while( (i < strs.length) && (strs[0].length() > idx) && (strs[i].length() > idx)) {
			if(strs[0].charAt(idx) != strs[i].charAt(idx)) {
				return false;
			}
			++i;
		}
		return true;
	}
	
	
	// Version as single function
	// i 	Element in array
	// idx 	characters in string
	public static String longestCommonPrefix2(String[] strs) {
		String prefix = "";
		int idx = 0;
		boolean common = true;
		if(strs.length == 1) { return strs[0]; }
		while(common && idx < strs.length) {
			int i = 1;
			if(strs[idx].length() == 0) { return ""; }
			while( (i < strs.length) && (strs[0].length() > idx) && (strs[i].length() > idx)) {
				if(strs[0].charAt(idx) != strs[i].charAt(idx) || idx >= strs[i].length() ) { 
					common = false; }
				++i;
			}
			if(common) prefix += strs[0].charAt(idx);
			++idx;
		}
		return prefix;
	}	
	
	// Third version
	public static String longestCommonPrefix3(String[] strs) {
        String prefix = "";
		int idx = 0;
		boolean common = true;
		if(strs.length == 1) { return strs[0]; }
		while(common && idx < strs.length) {
			int i = 1;
			if(strs[idx].length() == 0) { return ""; }
			while( (i < strs.length) && (strs[0].length() > idx) && (strs[i].length() > idx)) {
				if(strs[0].charAt(idx) != strs[i].charAt(idx)) { common = false; }
				++i;
			}
			if(common) prefix += strs[0].charAt(idx);
			++idx;
		}
		return prefix;
    }
}

// System.out.println("i: " + i);
// System.out.println("idx: " + idx);
// System.out.println("strs[0].length(): " + strs[0].length());
// System.out.println("strs[i].length(): " + strs[i].length());
// have to go through each character of each word one at a time
// so Flower, Flow, Flight
// then fLower, fLow, fLight
// then flOwer, flOw, flIght, etc
