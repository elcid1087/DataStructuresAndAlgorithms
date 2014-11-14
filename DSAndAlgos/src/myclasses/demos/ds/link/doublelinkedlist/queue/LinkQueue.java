package myclasses.demos.ds.link.doublelinkedlist.queue;

// TODO: Auto-generated Javadoc
/**
 * The Class LinkQueue.
 */
public class LinkQueue {
	
	/** The double ended list. */
	public DoubleEndedList doubleEndedList;

	/**
	 * Instantiates a new link queue.
	 */
	public LinkQueue() {
		doubleEndedList = new DoubleEndedList();
	}

	/**
	 * En queue.
	 *
	 * @param iValue the i value
	 */
	public void enQueue(int iValue) {
		doubleEndedList.insertLast(iValue);
		
	}
	
	/**
	 * De queue.
	 */
	public void deQueue(){
		doubleEndedList.deleteFirst();
	}
	
	/**
	 * Peek.
	 *
	 * @return the link
	 */
	public Link peek(){
		return doubleEndedList.peekList();
	}

/**
 * Display.
 */
public void display(){
	doubleEndedList.display();
}
	
}
