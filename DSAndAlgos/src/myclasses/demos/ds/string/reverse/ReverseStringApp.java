package myclasses.demos.ds.string.reverse;

public class ReverseStringApp {
	public static void main(String[] args) {

		String str = "Hello World";
		char[] reverseStr = reverse(str);
		for (int i = 0; i < reverseStr.length; i++) {
			System.out.print(reverseStr[i]);
		}
		System.out.println();
		reverse1("dlroW olleH");
	}

	// Another solution is to use Stack as data structure.
	private static char[] reverse(String str) {

		int strLength = str.length();
		char[] charArray = new char[strLength];
		for (int i = 0; i < strLength; i++) {
			charArray[i] = str.charAt(i);
		}
		for (int j = 0; j < strLength / 2; j++) {
			// swap firstIndex and lastIndex
			char temp = charArray[j];
			charArray[j] = charArray[strLength - 1 - j];
			charArray[strLength - 1 - j] = temp;
		}

		return charArray;
	}

	public static void reverse1(String str) {

		reverseRec(str, str.length() - 1);
	}

	public static void reverseRec(String str, int index) {
		if (index != -1) {

			System.out.print(str.charAt(index));
			reverseRec(str, index - 1);
		}
	}

}
