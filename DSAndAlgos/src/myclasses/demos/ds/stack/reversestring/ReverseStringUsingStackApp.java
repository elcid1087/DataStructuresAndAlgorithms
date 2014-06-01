package myclasses.demos.ds.stack.reversestring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TODO: Auto-generated Javadoc
/**
 * The Class ReverseStringUsingStackApp.
 */
public class ReverseStringUsingStackApp {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws IOException {

		String inputString = getString();
		System.out.println("Input String: "+ inputString);
		Stack stack = new Stack(inputString.length());
		for (int i = 0; i < inputString.length(); i++){
			stack.push(inputString.charAt(i));
		}
		System.out.println();
		System.out.print("Reverse String: ");
		for(int j=0;j<inputString.length();j++){
			char c = stack.pop();
			System.out.print(c);
		}
	}

	/**
	 * Reads the string from the console.
	 *
	 * @return the string
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private static String getString() throws IOException {
		System.out.println("Enter the input String: ");
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(in);
		String stringStream = b.readLine();
		return stringStream;
	}

}
