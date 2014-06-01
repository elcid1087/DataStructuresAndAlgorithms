package myclasses.demos.ds.stack;


public class StackApp {

	/**
	 * @param args
	 * Main method which creates a stack object of size 5.
	 */
	public static void main(String[] args) {
		
		Stack stack = new Stack(5);
		stack.pop();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.pop();
	}

}
