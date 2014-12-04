package myclasses.demos.ds.string.replacespace;

// TODO: Auto-generated Javadoc
/**
 * The Class ReplaceString.
 * 
 * @author shashi.
 * @Question Write a method to replace all spaces in a string with '%20'. You
 *           may assume that the string has sufficient space at the end of the
 *           string to hold the additional characters, and that you are given
 *           the "true" length of the string. (Note: if implementing in Java,
 *           please use a character array so that you can perform this operation
 *           in place.)
 */

public class ReplaceString {

	/**
	 * Replace string.
	 * 
	 * @param str
	 *            the str
	 */
	public static void replaceString(String str) {
		StringBuffer sb = new StringBuffer();
		for (char c : str.toCharArray()) {
			if (c == ' ') {
				sb.append("%20");
				continue;
			}
			sb.append(c);
		}
		System.out.println("replaced string: " + sb.toString());
	}

	/**
	 * Replace1.
	 * 
	 * @param str
	 *            the str
	 */
	public static void replace1(String str) {
		int spaceSize = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				spaceSize++;
			}
		}
		char[] charArray = new char[str.length() + (spaceSize * 3)];
		int charIndex = 0;
		for (int j = 0; j < str.length(); j++) {
			char c = str.charAt(j);
			if (c == ' ') {
				replaceSpace(charArray, charIndex);
				charIndex += 3;
				continue;
			}
			charArray[charIndex++] = c;
		}
		System.out.print("Replaced string: ");
		for (char c : charArray) {
			System.out.print(c);
		}
	}

	/**
	 * Replace space.
	 * 
	 * @param charArray
	 *            the char array
	 * @param index
	 *            the index
	 */
	private static void replaceSpace(char[] charArray, int index) {
		// TODO Auto-generated method stub
		String str = "%20";
		for (int i = 0; i < str.length(); i++) {
			charArray[index++] = str.charAt(i);
		}
	}

	// 1.5
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
			System.out.print((int) finalCharArray[k]);
		}
	}
//1.5 using StringBuffer.
	public static void replaceWithCountStringBuffer(String str) {
		System.out.println("InputString: " + str);
		int stringSize = str.length();
		StringBuffer sb = new StringBuffer();
		int charCount =1;
		for (int i = 0; i < stringSize; i++) {
			if((i+1)<stringSize&&str.charAt(i)==str.charAt(i+1)){
				charCount++;
			}else{
				sb.append(str.charAt(i));
				sb.append(charCount);
				charCount=1;
			}
		}
		System.out.println("OutputString: "+ sb.toString());
	}

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		String str = "a bc d ef ";
		System.out.println("i/p string: " + str);
		replaceString(str);
		// reTaylor Schillingplace1(str);
		// replaceWithCount1("aabbbcdddeeeee");
		replaceWithCount1("abcde");
		replaceWithCountStringBuffer("aabbbcdddeeeee");
	}
}
