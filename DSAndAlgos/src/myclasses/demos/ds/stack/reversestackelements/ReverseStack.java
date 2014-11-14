package myclasses.demos.ds.stack.reversestackelements;

// TODO: Auto-generated Javadoc
/**
 * The Class ReverseStack.
 */
public class ReverseStack {

	/** The main stack. */
	private final Stack mainStack;

	/** The temp stack. */
	private final Stack tempStack;

	/** The temp. */
	private int temp;

	/** The count. */
	private int count;

	/**
	 * Instantiates a new reverse stack.
	 * 
	 * @param size
	 *            the size
	 */
	public ReverseStack(int size) {
		mainStack = new Stack(size);
		tempStack = new Stack(size);
	}

	/**
	 * Push.
	 * 
	 * @param iValue
	 *            the i value
	 */
	public void push(int iValue) {
		mainStack.push(iValue);
		count++;
	}

	/**
	 * Reverse stack elements.
	 */
	public void reverseStackElements() {

		for (int i = 0; i < count - 1; i++) {
			temp = mainStack.pop();
			for (int j = 0; j < count - (i + 1); j++) {
				if (!mainStack.isEmpty()) {
					tempStack.push(mainStack.pop());
				}
			}
			mainStack.push(temp);
			for (int k = 0; k < count - (i + 1); k++) {
				if (!tempStack.isEmpty()) {
					mainStack.push(tempStack.pop());
				}
			}
		}

	}

	/**
	 * Display.
	 */
	public void display() {
		mainStack.displayStack();
	}

}
