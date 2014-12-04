package myclasses.demos.ds.stack.queue;

public class QueueFromStack {

	private Stack mainStack;
	private Stack tempStack;
	private int maxSize;

	public QueueFromStack(int size) {
		maxSize = size;
		mainStack = new Stack(maxSize);
		tempStack = new Stack(maxSize);
	}

	public void enQueue(int iValue) {

		if (!mainStack.isFull()) {
			while (!mainStack.isEmpty()) {
				tempStack.push(mainStack.pop());
			}
			mainStack.push(iValue);
			while (!tempStack.isEmpty()) {
				mainStack.push(tempStack.pop());
			}
		}
	}

	public void deQueue() {
		mainStack.pop();
	}

	public void displayQueue() {
		mainStack.display();

	}

	public void enQueueOptimzed(int iValue) {
		if (!mainStack.isFull()) {
			mainStack.push(iValue);
		}
	}
	
	public void deQueueUnOptimized(){
		if(!mainStack.isEmpty()){
			while(!mainStack.isEmpty()){
				tempStack.push(mainStack.pop());
			}
			tempStack.pop();
			while(!tempStack.isEmpty()){
				mainStack.push(tempStack.pop());
			}
		}
		
	}
	

}
