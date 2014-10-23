package myclasses.demos.ds.cc.stack;

// TODO: Auto-generated Javadoc
/**
 * Describe how you could use a single array to implement three stacks.
 */
public class ThreeStackSingleArray {

	/** The stack array. */
	private final int[] stackArray;

	/** The top array. */
	private int[] topArray;

	/** The size. */
	private final int size;

	/** The size array. */
	private final int[] sizeArray;

	/**
	 * Instantiates a new three stack single array.
	 * 
	 * @param size
	 *            the size
	 */
	public ThreeStackSingleArray(int size) {
		this.size = size;
		sizeArray = new int[size / 3 + 1];
		stackArray = new int[size];
		populateSizeArray(size);
	}

	/**
	 * Populate size array.
	 * 
	 * @param size
	 *            the size
	 */
	private void populateSizeArray(int size) {
		// TODO Auto-generated method stub
		sizeArray[0] = -1;
		sizeArray[1] = (size / 3) - 1;
		sizeArray[2] = 2 * (size / 3) - 1;
		sizeArray[3] = size - 1;
		int[] topArray2 = { -1, ((size / 3) - 1), (2 * (size / 3) - 1) };
		topArray = topArray2;
	}

	/**
	 * Checks if is empty.
	 * 
	 * @param stackNum
	 *            the stack num
	 * @return true, if is empty
	 */
	public boolean isEmpty(int stackNum) {
		return topArray[stackNum - 1] == sizeArray[stackNum - 1];
	}

	/**
	 * Checks if is full.
	 * 
	 * @param stackNum
	 *            the stack num
	 * @return true, if is full
	 */
	public boolean isFull(int stackNum) {
		return topArray[stackNum - 1] == sizeArray[stackNum];
	}

	/**
	 * Peek.
	 * 
	 * @param stackNum
	 *            the stack num
	 * @return the int
	 */
	public int peek(int stackNum) {
		return stackArray[topArray[stackNum - 1]];
	}

	/**
	 * Push.
	 * 
	 * @param iData
	 *            the i data
	 * @param stackNum
	 *            the stack num
	 */
	public void push(int iData, int stackNum) {
		if (!isFull(stackNum)) {
			System.out.println("pushing " + iData + " to stack " + stackNum);
			stackArray[++topArray[stackNum - 1]] = iData;
		} else {
			System.out.println(stackNum + " is full.");
		}
	}

	/**
	 * Pop.
	 * 
	 * @param stackNum
	 *            the stack num
	 */
	public void pop(int stackNum) {
		if (!isEmpty(stackNum)) {
			int i = stackArray[topArray[stackNum - 1]--];
			System.out.println("popping " + i + " from " + stackNum);
		} else {
			System.out.println(stackNum + " is Empty.");
		}
	}

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		ThreeStackSingleArray stack = new ThreeStackSingleArray(9);
		stack.push(1, 1);
		stack.push(2, 1);
		stack.push(3, 1);
		stack.push(4, 1);
		stack.push(4, 2);
		stack.push(5, 2);
		stack.push(6, 2);
		stack.push(7, 2);
		stack.push(7, 3);
		stack.push(8, 3);
		stack.push(9, 3);
		stack.push(10, 3);
		stack.pop(3);
		stack.pop(1);
		stack.pop(2);
		stack.push(11, 3);
		stack.push(12, 3);
		int peek = stack.peek(1);
		System.out.println("peek: " + peek);
	}

}
