package myclasses.demos.ds.stack.reversestackelements;

// TODO: Auto-generated Javadoc
/**
 * The Class ReverseStackApp.
 */
public class ReverseStackApp {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		ReverseStack reverseStack = new ReverseStack(5);
		reverseStack.push(1);
		reverseStack.push(2);
		reverseStack.push(3);
		reverseStack.push(4);
		reverseStack.push(5);
		reverseStack.display();
		reverseStack.reverseStackElements();
		reverseStack.display();
	}
}
