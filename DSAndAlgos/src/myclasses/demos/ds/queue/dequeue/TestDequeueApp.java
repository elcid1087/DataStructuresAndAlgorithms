package myclasses.demos.ds.queue.dequeue;


public class TestDequeueApp {
	public static void main(String[] args) {
		
	Dequeue dequeue = new Dequeue(5);
	dequeue.insertLast(1);
	dequeue.insertLast(2);
	dequeue.insertLast(3);
	dequeue.insertLast(4);
	dequeue.insertLast(5);
	dequeue.removeFirst();
	dequeue.removeFirst();
	dequeue.removeFirst();
	dequeue.removeFirst();
	dequeue.display();
	dequeue.insertLast(6);
	dequeue.display();
	dequeue.insertFirst(7);
	dequeue.display();
	dequeue.removeFirst();
	dequeue.display();
	}
}
