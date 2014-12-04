package myclasses.demos.ds.string.replacespace;

public class ReplaceRepeatingStringWithCount {
	// 1.5
	/**
	 * Method1: Replace with count1.
	 * 
	 * @param str
	 *            the str
	 */
	public static void replaceWithCount1(String str) {
		System.out.println("Input String: " + str);
		int stringSize = str.length();
		int[] finalCharArray = new int[stringSize * 2];
		int charIndex = 0;
		for (int i = 0; i < stringSize;) {
			int charCount = 1;
			finalCharArray[charIndex++] = str.charAt(i);
			while ((i + charCount + 1) <= stringSize
					&& str.charAt(i + charCount - 1) == str.charAt(i
							+ charCount)) {
				charCount++;
			}

			i = i + charCount;
			finalCharArray[charIndex++] = charCount;
		}
		for (int k = 0; k < finalCharArray.length; k++) {
			System.out.print((char) finalCharArray[k++]);
			System.out.print(finalCharArray[k]);
		}
	}

	/**
	 * Method 2: String compression.
	 * 
	 * @param str
	 *            the str
	 */
	public static void stringCompression(String str) {
		boolean printString = true;
		int count = 0;
		char previousChar = 0;
		for (int i = 0; i < str.length(); i++) {
			if (printString) {
				System.out.print(str.charAt(i));
				count++;
				printString = false;
				previousChar = str.charAt(i);
			}
			if ((i + 1) != str.length() && previousChar == str.charAt(i + 1)) {
				count++;
			} else {
				System.out.print(count);
				count = 0;
				printString = true;
			}
			previousChar = str.charAt(i);
		}

	}

	/**
	 * 1.5 using StringBuffer. The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		String str = "a bc d ef ";
		System.out.println("i/p string: " + str);
		// reTaylor Schillingplace1(str);
		// replaceWithCount1("aabbbcdddeeeee");
		replaceWithCount1("abcde");
		System.out.println("InputString: " + "aabbbcdddeeeee");
		int stringSize = "aabbbcdddeeeee".length();
		StringBuffer sb = new StringBuffer();
		int charCount = 1;
		for (int i = 0; i < stringSize; i++) {
			if ((i + 1) < stringSize
					&& "aabbbcdddeeeee".charAt(i) == "aabbbcdddeeeee"
							.charAt(i + 1)) {
				charCount++;
			} else {
				sb.append("aabbbcdddeeeee".charAt(i));
				sb.append(charCount);
				charCount = 1;
			}
		}
		System.out.println("OutputString: " + sb.toString());
	}
}
