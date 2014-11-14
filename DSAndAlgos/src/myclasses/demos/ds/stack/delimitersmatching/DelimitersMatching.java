package myclasses.demos.ds.stack.delimitersmatching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TODO: Auto-generated Javadoc
/**
 * The Class DelimitersMatching.
 */
public class DelimitersMatching {

	/** The stack. */
	private final Stack stack;

	/**
	 * Instantiates a new delimiters matching.
	 * 
	 * @param size
	 *            the size
	 */
	public DelimitersMatching(int size) {
		stack = new Stack(size);
	}

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws IOException {

		String inputString = getString();
		DelimitersMatching delimiter = new DelimitersMatching(
				inputString.length());
		delimiter.delimitermatch(inputString);

	}

	/**
	 * Delimitermatch.
	 * 
	 * @param inputString
	 *            the input string
	 */
	private void delimitermatch(String inputString) {

		for (int i = 0; i < inputString.length(); i++) {
			char c = inputString.charAt(i);
			switch (c) {
			case '{':
			case '(':
			case '[':
				stack.push(c);
				break;
			case '}':
			case ')':
			case ']':
				char popChar = stack.pop();
				if (popChar == '{' && c == '}' || popChar == '(' && c == ')'
						|| popChar == '[' && c == ']') {
					;
				} else {
					System.out.println("Missmatch in the expression");
				}
				break;
			}
		}

	}

	/**
	 * Gets the string.
	 * 
	 * @return the string
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static String getString() throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(in);
		String s = b.readLine();
		// a{b(c[d]e)f}
		return s;
	}

}
