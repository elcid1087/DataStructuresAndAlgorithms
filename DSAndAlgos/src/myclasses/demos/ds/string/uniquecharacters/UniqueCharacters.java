package myclasses.demos.ds.string.uniquecharacters;

// TODO: Auto-generated Javadoc
/**
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures
 */
public class UniqueCharacters {

	/**
	 * Unique char. We can either use byte array or boolean array which is used
	 * to update the array index based on the char as index. If we come across
	 * this index again we can return false. Time complexity: O(n) space
	 * complexity:
	 * 
	 * @param string
	 * 
	 * @return true, if successful
	 */
	public static boolean uniqueChar(String str) {
		boolean isUnique = false;
		byte[] asciiChars = new byte[256];
		for (int i = 0; i < str.length(); i++) {
			int c = str.charAt(i);
			if (asciiChars[c] != 1) {
				asciiChars[c] = 1;
				isUnique = true;
				continue;
			}
			System.out.println("Charactes in string is are not unique.");
			return isUnique = false;
		}
		return isUnique;

	}

	/**
	 * This has improved space complexity with O(1) linear at a cost of
	 * degrading time complexity with O(n2).
	 * 
	 * @param str
	 * @return
	 */
	public static boolean uniqueChar1(String str) {
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			for (int j = i + 1; j < str.length(); j++) {
				if (c == str.charAt(j)) {
					System.out
							.println("uniqueChar1: Charactes in string is are not unique.");
					return false;
				}
			}
		}
		System.out.println("uniqueChar1: Charactes in string is are unique.");
		return true;
	}

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		boolean isUnique = uniqueChar("Java");
		if (isUnique) {
			System.out.println("Charactes in string is are unique.");
		}
		uniqueChar1("Core");
		
		char c = '\0';
		System.out.println("char:>"+ c+"<");
	}
}
