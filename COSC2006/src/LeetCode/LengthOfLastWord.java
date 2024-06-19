package LeetCode;

public class LengthOfLastWord {

	public static void main(String[] args) {
		//String str1 = "Hello World";
		//String str2 = "   fly me   to   the moon  ";
		String str3 = "luffy is still joyboy";
		//String str4 = "";
		int length = lengthOfLastWord(str3);
		System.out.println(length);
	}
	
	/*
	 * Return the length of the last word in s
	 */
	public static int lengthOfLastWord(String s) {
      
		String[] str = s.split(" ");
		return str[str.length-1].length();
    }
	
}
