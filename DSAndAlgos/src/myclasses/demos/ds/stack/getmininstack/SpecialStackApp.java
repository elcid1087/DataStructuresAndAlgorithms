package myclasses.demos.ds.stack.getmininstack;

public class SpecialStackApp {
	public static void main(String[] args) {
		System.out
				.println("This example is for getting minimum value in the stack with time complexity of order 1 O(1) and needs an extra stack to " +
						"store the minimum values which takes twice the memory ");
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
