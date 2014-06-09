package myclasses.demos.ds.stack.reversestackelements;

public class ReverseStack {
	private Stack mainStack;
	private Stack tempStack;
	private int temp;
	private int maxSize;

	public ReverseStack(int size) {
		maxSize = size;
		mainStack = new Stack(maxSize);
		tempStack = new Stack(maxSize);
	}

	public void push(int iValue) {
		mainStack.push(iValue);
	}

	public void reverseStackElements() {

		for (int i = 0; i < maxSize - 1; i++) {
			temp = mainStack.pop();
			for (int j = 0; j < maxSize - 2; j++) {
				if (!mainStack.isEmpty()) {
					tempStack.push(mainStack.pop());
				}
			}
			mainStack.push(temp);
			for (int k = 0; k < maxSize - 1; k++) {
				if(!tempStack.isEmpty()){
				mainStack.push(tempStack.pop());
				}
			}
		}

	}
	
	public void display(){
		mainStack.displayStack();
	}

}
