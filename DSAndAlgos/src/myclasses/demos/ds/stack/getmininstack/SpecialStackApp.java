package myclasses.demos.ds.stack.getmininstack;

public class SpecialStackApp {
public static void main(String[] args) {
	SpecialStack specialStack = new SpecialStack(5);
	specialStack.push(16);
	specialStack.push(15);
	specialStack.push(29);
	specialStack.push(19);
	specialStack.push(18);
	System.out.println("Min Value: "+ specialStack.getMin());
}
}
