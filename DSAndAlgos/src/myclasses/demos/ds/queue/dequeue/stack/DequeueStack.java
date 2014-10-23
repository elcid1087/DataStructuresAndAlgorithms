package myclasses.demos.ds.queue.dequeue.stack;

public class DequeueStack extends Dequeue {

	public DequeueStack(int size) {
		super(size);
	}

	public int peek() {
		return super.peek();

	}

	public void push(int iValue) {
		super.insertLast(iValue);
	}

	public void pop() {
		super.removeFirst();
	}

	public void display() {
		super.display();
	}

}
