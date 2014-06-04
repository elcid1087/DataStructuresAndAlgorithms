package myclasses.demos.ds.stack.getmininstack.optimization;

/**
 * The Class Stack.
 */
public class Stack {

	/** The stack array. */
	private int[] stackArray;

	/** The size. */
	private int size;

	/** The top. */
	private int top;
	
	protected int min;
	
//	protected int[] minStackArray;

	/**
	 * Instantiates a new stack.
	 * 
	 * @param s
	 *            the s
	 */
	public Stack(int s) {
		size = s;
		stackArray = new int[s];
//		minStackArray = new int[s];
		top = -1; // The initial value of the top is set to -1.
	}

	/**
	 * Checks if is empty.
	 * 
	 * @return true, if is empty
	 */
	public boolean isEmpty() {
		return top == -1;// This implies the stack is empty.
	}

	/**
	 * Checks if is full.
	 * 
	 * @return true, if is full
	 */
	public boolean isFull() {
		return top == size - 1;// When the top reaches to the top, the stack is
								// full.
	}

	/**
	 * Peek.
	 * 
	 * @return the top item of the stack.
	 */
	public int peek() {

		return stackArray[top];// Gives the top value.
	}

	/**
	 * Push.
	 * 
	 * @param iValue
	 *            the i value Checks if the stack is full if not inserts the
	 *            item in the stack.
	 */
	public void pushSuper(int iValue) {
			stackArray[++top] = iValue;
			System.out.println("successfully inserted: " + iValue);
	}
	
	
	

	/**
	 * Pop. Checks if the stack is empty if not pops the item from the stack.
	 */
	public int popSuper() {
			int out = stackArray[top--];
			System.out.println("Popped value: " + out);
			return out;
	}
}
