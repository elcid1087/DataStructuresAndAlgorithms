package myclasses.demos.ds.string.onepermutationofother;

/**
 * The Class OneStirngPermuationOfOther.
 * 
 * @author shashi. Given two strings,write a method to decide if one is a
 *         permutation of the other.
 */

public class OneStirngPermuationOfOther {
	// TODO: Can also be implemented, by sorting both the strings and comparing
	// them
	/**
	 * Permutation.
	 * 
	 * @param str1
	 *            the str1
	 * @param str2
	 *            the str2
	 * @return true, if successful
	 */
	public static boolean permutation(String str1, String str2) {
		int[] asciiLeters = new int[256];// Can also use boolean array.
		if (str1.length() == str2.length()) {
			for (int i = 0; i < str1.length(); i++) {
				int c = str1.charAt(i);
				asciiLeters[c] = 1;
			}
			for (int j = 0; j < str2.length(); j++) {
				int c = str2.charAt(j);
				if (asciiLeters[c] == 0) {
					System.out.println("one is not a permutation of the other");
					return false;
				}
			}
			System.out.println("one is a permutation of the other");
			return true;
		}
		System.out.println("one is not a permutation of the other");
		return false;
	}

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		permutation("avaJ", "Java");
		permutation("aJva", "Java");
	}

}
