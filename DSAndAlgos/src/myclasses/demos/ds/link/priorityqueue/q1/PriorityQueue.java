package myclasses.demos.ds.link.priorityqueue.q1;

// TODO: Auto-generated Javadoc
/**
 * The Class PriorityQueue.
 */
public class PriorityQueue {
	
	/** The sorted list. */
	public SortedList sortedList;

	/**
	 * Instantiates a new priority queue.
	 */
	public PriorityQueue() {
		sortedList = new SortedList();
	}

	/**
	 * En queue.
	 *
	 * @param iValue the i value
	 */
	public void enQueue(int iValue) {
		sortedList.insertsortedList(iValue);
	}

	/**
	 * De queue.
	 */
	public void deQueue() {
		sortedList.deleteFirst();
	}

	/**
	 * Display.
	 */
	public void display() {
		sortedList.displaySortedList();
	}
}
