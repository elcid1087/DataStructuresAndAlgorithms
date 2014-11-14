package myclasses.demos.ds.recursion.reversestack;

// TODO: Auto-generated Javadoc
/**
 * The Class ReverseStack.
 */
public class ReverseStack {
	
	/** The stack. */
	private Stack stack;

	/**
	 * Instantiates a new reverse stack.
	 *
	 * @param size the size
	 */
	public ReverseStack(int size) {
		stack = new Stack(size);
	}

	/**
	 * Insert back.
	 *
	 * @param c the c
	 */
	public void insertBack(char c) {
		if (stack.isEmpty()) {
			stack.push(c);
		} else {
			char c1 = stack.pop();
			insertBack(c);
			stack.push(c1);
		}
	}

	/**
	 * Reverse.
	 */
	public void reverse() {
		if (stack.isEmpty()) {
			return;
		} else {
			char cc = stack.pop();
			// System.out.print(cc);
			reverse();
			insertBack(cc);

		}
	}

	/**
	 * Display.
	 */
	public void display() {
		stack.displayStack();
	}

	/**
	 * Push stack.
	 *
	 * @param c the c
	 */
	public void pushStack(char c) {
		stack.push(c);
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		String s = "4321";
		ReverseStack rs = new ReverseStack(s.length());
		for (int i = 0; i < s.length(); i++) {
			rs.pushStack(s.charAt(i));
		}
		rs.display();
		System.out.println();
		rs.reverse();
		System.out.println();
		rs.display();
	}

}
