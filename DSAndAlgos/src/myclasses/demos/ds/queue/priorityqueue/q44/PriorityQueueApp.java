package myclasses.demos.ds.queue.priorityqueue.q44;

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

		priority.display();
		priority.remove();
		priority.remove();
		priority.remove();
		priority.display();
		priority.insert(8);
		priority.insert(9);
		priority.display();
		priority.remove();
		priority.display();
		priority.insert(6);
		priority.display();
		priority.remove();
		priority.display();
	}
}
