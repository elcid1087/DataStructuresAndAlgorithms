package myclasses.demos.ds.stack.brackets.removeredundant;

// TODO: Auto-generated Javadoc
/**
 * The Class RedundantBrackets.
 *  Given a mathematical expression, find and remove
 * the redundant brackets from the expression.
 */
public class RedundantBrackets {

	/** The index array. */
	private int[] indexArray;

	/** The stack. */
	private Stack stack;

	/** The input array. */
	private char[] inputArray;

	/**
	 * Find redundants.
	 * 
	 * @param input
	 *            the input
	 */
	public void findRedundants(String input) {
		indexArray = new int[input.length()];
		inputArray = input.toCharArray();
		stack = new Stack(input.length());
		int indexCount = 0;
		for (int index = 0; index < input.length(); index++) {
			char c = input.charAt(index);

			System.out.println("c: " + c);

			if (c == '(') {
				System.out.println("inputString: " + input);
				System.out.println("3Count: " + index);
				int i = index;
				for (; i < input.length(); i++) {
					char c1 = input.charAt(i);
					if ((stack.isEmpty() && c1 == '(')) {
						System.out.println("Index: " + i);
						indexArray[indexCount++] = i;
						stack.push(c1);
						continue;
					} else if ((stack.peekAtZero() && c1 == ')')) {
						System.out.println("index: " + i);
						indexArray[indexCount++] = i;
						stack.pop();
						break;
					} else if (c1 == '(') {
						stack.push(c1);
					} else if (c1 == ')') {
						stack.pop();
					}

				}
				System.out.println("String: ");
				for (int j = 0; j < input.length(); j++) {
					if (!stack.isEmpty()) {
						stack.pop();
					} else {
						break;
					}
				}
			}

		}

		for (int in = 0; in < indexArray.length; in++) {
			System.out.print("indexArray: " + indexArray[in] + " ");
		}
		System.out.println("input.length()" + input.length());
		System.out.println("char: " + input.charAt(input.length() - 1));
		if (indexArray[0] == 0 && indexArray[1] == input.length() - 1) {
			replaceString(indexArray[0], indexArray[1]);
			printString(indexArray[0] + 1, indexArray[1] - 1, input);
			indexArray[0] = 0;
			indexArray[1] = 0;
		}

		for (int in = 0; (in < indexArray.length)
				&& (in + 1 < indexArray.length); in = in + 2) {
			if (!(indexArray[in] == 0 && indexArray[in + 1] == 0)) {
				boolean isPositive = false;
				boolean isOthers = false;
				for (int inString = indexArray[in] + 1; inString < indexArray[in + 1] - 1; inString++) {
					if (input.charAt(inString) == '+') {
						isPositive = true;
						// printString(indexArray[in], indexArray[in+1], input);
					} else if (input.charAt(inString) == '*'
							|| input.charAt(inString) == '/') {
						isOthers = true;
					}
				}
				if ((isPositive == true && isOthers == false)
						|| (isPositive == false && isOthers == true)) {
					replaceString(indexArray[in], indexArray[in + 1]);
					printString(indexArray[in] + 1, indexArray[in + 1] - 1,
							input);
				} else {
					printString(indexArray[in], indexArray[in + 1], input);

				}
			}
		}
		System.out.println("********************");
		System.out.println("Actual Input            :  : " + input);
		System.out.print("After Removing Redundancies: ");
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i]);
		}
		System.out.println("");
		System.out.print("********************");

	}

	/**
	 * Replace string.
	 * 
	 * @param start
	 *            the start
	 * @param end
	 *            the end
	 */
	public void replaceString(int start, int end) {
		inputArray[start] = 0;
		inputArray[end] = 0;
	}

	/**
	 * Prints the string.
	 * 
	 * @param i
	 *            the i
	 * @param j
	 *            the j
	 * @param input
	 *            the input
	 */
	public void printString(int i, int j, String input) {
		for (int start = i; start <= j; start++) {

			System.out.print(input.charAt(start));
		}
		System.out.println("");
	}

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		RedundantBrackets redundant = new RedundantBrackets();
		// String str = "(a+(b+c))";
		// String str = "((a * b) + c * (e + f))";//Check the Condition for
		// this*************(*(a+b))||((a+b)*)
		// String str = "(( a + b ) + (( c + d )))";
		// String str = "((c+d))";
		// String str = "(a/(b-c)+d)";
		// String str = "(a+b)/(c*d) ";//Check the condition for
		// this****************
		// String str = "(a-(b+c))";
		String str = "(( a + b ) * (( c + d )))";// Same check for the condition
													// make the check dynamic
		// String str = "(a + (b*c)) * (d * ( f * j) )";

		redundant.findRedundants(str);
	}
}
