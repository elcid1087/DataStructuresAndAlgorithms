package myclasses.demos.ds.link.doublelinkedlist.queue;

// TODO: Auto-generated Javadoc
/**
 * The Class DoubleEndedList.
 */
public class DoubleEndedList {
	
	/** The first. */
	public Link first;
	
	/** The last. */
	public Link last;

	/**
	 * Insert first.
	 *
	 * @param iValue the i value
	 */
	public void insertFirst(int iValue) {

		Link newLink = new Link(iValue);
		if (first == null) {
			first = newLink;
			last = newLink;
		} else {
			newLink.next = first;
			first = newLink;
		}
	}

	/**
	 * Insert last.
	 *
	 * @param iValue the i value
	 */
	public void insertLast(int iValue) {
		Link newLink = new Link(iValue);
		if (first == null) {
			first = newLink;
			last = newLink;
		} else {
			newLink.next = last.next;
			last.next = newLink;
			last = newLink;
		}
	}

	/**
	 * Delete first.
	 */
	public void deleteFirst() {
		if (first != null) {
			first=first.next;
		}
	}

	/**
	 * Delete last.
	 */
	public void deleteLast() {
		// Operation is similar to delete last operation of LinkedList.
	}
	
	/**
	 * Peek list.
	 *
	 * @return the link
	 */
	public Link peekList(){
		return first;
	}

	/**
	 * Display.
	 */
	public void display() {
		System.out.print("First --> Last: ");
		Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}
