package myclasses.demos.ds.stack.getmininstack.optimization;

public class SpecialStackApp {
	public static void main(String[] args) {
		System.out
				.println("This example is for getting minimum value in the stack with time complexity of order 1 O(1) "
						+ "and reducing the duplicate minimum values that are being stored in the min stack. This is done by checking " +
						"this condition where if the new value is smaller that the already available min value then " +
						"push into the min stack else do nothing, this way if the new value is min of all the elements then we push into the min stack.");
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
		specialStack.pushSuper(1);
		System.out.println("Min Value after pushing 1: "
				+ specialStack.getMin());
		specialStack.pop();
		System.out
				.println("Min Value after poping 1: " + specialStack.getMin());
		System.out
				.println("***********************************************************");
	}
}
