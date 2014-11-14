package myclasses.demos.ds.queue.priorityqueue;

// TODO: Auto-generated Javadoc
/**
 * The Class PriorityQueueApp.
 */
public class PriorityQueueApp {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		PriorityQueue priority = new PriorityQueue(5);
		priority.insert(3);
		priority.insert(5);
		priority.insert(1);
		priority.insert(4);
		priority.insert(2);
		priority.display();
		priority.remove();
		priority.remove();
		priority.display();
		priority.insert(5);
		priority.insert(4);
		priority.display();// Just displaying the queue.
	}
}
