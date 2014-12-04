package myclasses.demos.ds.tree.binarytree;

/**
 * The Class Stack.
 */
public class Stack {

	/** The stack array. */
	private Node[] stackArray;

	/** The size. */
	private int size;

	/** The top. */
	private int top;

	/**
	 * Instantiates a new stack.
	 * 
	 * @param s
	 *            the s
	 */
	public Stack(int s) {
		size = s;
		stackArray = new Node[s];
		top = -1; // The initial value of the top is set to -1.
	}
	public int size() {
		return top;
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
	public Node peek() {

		return stackArray[top];// Gives the top value.
	}

	/**
	 * Push.
	 * 
	 * @param iValue
	 *            the i value Checks if the stack is full if not inserts the
	 *            item in the stack.
	 */
	public void push(Node newNode) {
		if (isFull()) {
//			System.out.println("Stack is full");
		} else {
			stackArray[++top] = newNode;
//			System.out.println("successfully inserted: " + newNode.iData);
		}
	}

	/**
	 * Pop. Checks if the stack is empty if not pops the item from the stack.
	 */
	public Node pop() {
		if (isEmpty()) {
//			System.out.println("Stack is empty");
		} else {
			 return stackArray[top--];
//			System.out.println("Popped value: " + out.iData);
		}
		return null;
	}
}
