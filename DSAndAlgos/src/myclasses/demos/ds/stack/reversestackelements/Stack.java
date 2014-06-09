package myclasses.demos.ds.stack.reversestackelements;

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

	/**
	 * Instantiates a new stack.
	 * 
	 * @param s
	 *            the s
	 */
	public Stack(int s) {
		size = s;
		stackArray = new int[s];
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
	public void push(int iValue) {
		if (isFull()) {
			System.out.println("Stack is full");
		} else {
			stackArray[++top] = iValue;
//			System.out.println("successfully inserted: " + iValue);
		}
	}

	/**
	 * Pop. Checks if the stack is empty if not pops the item from the stack.
	 */
	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return 0;
		} else {
			int out = stackArray[top--];
//			System.out.println("Popped value: " + out);
			return out;
		}
	}
	
	
	public void displayStack(){
		System.out.print("Stack: First --> Last: ");
		if(!isEmpty()){
			for(int i=0;i<=top;i++){
				System.out.print(stackArray[i]+" ");
			}
			System.out.println(" ");
		}
	}
	
}
