package myclasses.demos.ds.cc.stack;

// TODO: Auto-generated Javadoc
/**
 * Write a program to sort a stack in ascending order (with biggest items on
 * top). You may use at most one additional stack to hold items, but you may not
 * copy the elements into any other data structure (such as an array). The stack
 * supports the following operations: push, pop, peek, and isEmpty.
 */
public class StackInAscendingOrder {

	/** The original stack. */
	private final Stack1 originalStack;

	/** The new stack. */
	private final Stack1 newStack;

	/** The temp stack. */
	private final Stack1 tempStack;

	/**
	 * Instantiates a new stack in ascending order.
	 * 
	 * @param size
	 *            the size
	 */
	public StackInAscendingOrder(int size) {
		originalStack = new Stack1(size);
		newStack = new Stack1(size);
		tempStack = new Stack1(size);
	}

	/**
	 * Populate original stack.
	 */
	public void populateOriginalStack() {
		originalStack.push(5);
		originalStack.push(1);
		originalStack.push(3);
		originalStack.push(2);
		originalStack.push(4);
	}

	/**
	 * Sort.
	 */
	public void sort() {
		int min = 0;
		while (!originalStack.isEmpty()) {

			int temp = originalStack.pop();
			if (temp < min) {
				min = temp;
			}
			tempStack.push(temp);
			if (originalStack.isEmpty()) {
				newStack.push(min);
				while (!tempStack.isEmpty()) {
					originalStack.push(tempStack.pop());
				}
			}
		}
	}

	/**
	 * Sort stack.
	 */
	public void sortStack() {
		Stack1 newStack = new Stack1(5);
		while (!originalStack.isEmpty()) {

			int temp = originalStack.pop();
			if (!newStack.isEmpty()) {
				System.out.println("temp " + temp + " peek " + newStack.peek());
				System.out.println("(!newStack.isEmpty()) "
						+ (!newStack.isEmpty()));

			}
			while ((!newStack.isEmpty() && !(temp > newStack.peek()))) {
				int temp1 = newStack.pop();
				System.out.println("temp1 " + temp1);
				if (temp < temp1) {
					originalStack.push(temp1);
				} else {
					newStack.push(temp1);
				}
			}
			System.out.println("temp " + temp);
			newStack.push(temp);
		}
		while (!newStack.isEmpty()) {
			originalStack.push(newStack.pop());
		}
	}

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		StackInAscendingOrder aStack = new StackInAscendingOrder(5);
		aStack.populateOriginalStack();
		aStack.sortStack();
		// aStack.originalStack.

	}
}
