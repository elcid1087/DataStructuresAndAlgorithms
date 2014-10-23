package myclasses.demos.ds.stack.getmininstack;

// TODO: Auto-generated Javadoc
/**
 * How would you design a stack which, in addition to push and pop, also has a
 * function min which returns the minimum element? Push, pop and min should all
 * operate in 0(1) time.
 */
public class SpecialStackApp {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		System.out
				.println("This example is for getting minimum value in the stack with time complexity of order 1 O(1) and needs an extra stack to "
						+ "store the minimum values which takes twice the memory ");
		System.out
				.println("***********************************************************");
		SpecialStack specialStack = new SpecialStack(5);
		specialStack.pop();
		specialStack.push(16);
		specialStack.push(15);
		specialStack.push(29);
		specialStack.push(19);
		specialStack.push(18);
		System.out.println("Min Value after all elements push: "
				+ specialStack.getMin());
		specialStack.pop();
		System.out.println("Min Value after 1 element pop: "
				+ specialStack.getMin());
		specialStack.push(1);
		System.out.println("Min Value after pushing 1: "
				+ specialStack.getMin());
		specialStack.pop();
		System.out
				.println("Min Value after poping 1: " + specialStack.getMin());
		System.out
				.println("***********************************************************");
	}
}
