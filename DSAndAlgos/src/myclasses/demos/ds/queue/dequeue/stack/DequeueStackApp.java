package myclasses.demos.ds.queue.dequeue.stack;

public class DequeueStackApp {
	public static void main(String[] args) {
		DequeueStack dequeueStack = new DequeueStack(5);
		dequeueStack.push(1);
		dequeueStack.push(2);
		dequeueStack.push(3);
		dequeueStack.push(4);
		dequeueStack.push(5);
		dequeueStack.pop();
		dequeueStack.pop();
		dequeueStack.pop();
		dequeueStack.pop();
		dequeueStack.display();
	}
}
