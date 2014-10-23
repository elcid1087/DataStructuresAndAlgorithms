package myclasses.demos.ds.queue.dequeue;

public class DequeueApp {
public static void main(String[] args) {
	System.out.println("**********************************");
	Dequeue dequeue = new Dequeue(5);
	dequeue.insertFirst(1);
	dequeue.insertFirst(2);
	dequeue.insertFirst(3);
	dequeue.insertFirst(4);
	dequeue.insertFirst(5);
	dequeue.display();
	dequeue.removeFirst();
	dequeue.removeFirst();
	dequeue.removeFirst();
	dequeue.display();
	dequeue.insertFirst(6);
	dequeue.insertFirst(7);
	dequeue.insertFirst(8);
	dequeue.display();
	dequeue.removeLast();
	dequeue.removeLast();
	dequeue.display();
	dequeue.insertLast(5);
	dequeue.insertLast(4);
	dequeue.display();
	dequeue.removeFirst();
	dequeue.display();
	dequeue.insertLast(3);
	dequeue.display();
	dequeue.removeFirst();
	dequeue.display();
//	dequeue.removeLast();
	/*dequeue.display();
	dequeue.removeFirst();
	dequeue.display();
	dequeue.insertFirst(6);
	dequeue.display();
	dequeue.removeFirst();
	dequeue.removeFirst();
	dequeue.removeFirst();
	dequeue.removeFirst();
	dequeue.display();
	dequeue.insertFirst(7);
	dequeue.insertFirst(8);
	dequeue.insertFirst(9);
	dequeue.insertFirst(10);
	dequeue.display();
	dequeue.removeFirst();
	dequeue.removeFirst();
	dequeue.insertFirst(11);
	dequeue.insertFirst(12);
//	dequeue.insertFirst(13);
	dequeue.display();*/
	System.out.println("***********************");
}
}
