/*
 * 
 */
package myclasses.demos.ds.hashtable.seperatechaining;

// TODO: Auto-generated Javadoc
/**
 * The Class LinkedList.
 */
public class LinkedList {

	/** The first. */
	public Link first;

	/**
	 * Insert first.
	 *
	 * @param iData the i data
	 */
	public void insertFirst(int iData) {
		Link newLink = new Link(iData);
		newLink.next = first;
		first = newLink;
	}

	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty() {
		return first == null;
	}

	/**
	 * Removes the first.
	 */
	public void removeFirst() {
		if (!isEmpty()) {
			first = first.next;
		}
	}

	/**
	 * Insert last.
	 *
	 * @param iData the i data
	 */
	public void insertLast(int iData) {
		Link newLink = new Link(iData);
		Link current = first;
		if (first == null) {
			first = newLink;
		} else {
			while (current.next != null) {
				current = current.next;
			}

			newLink.next = current.next;
			current.next = newLink;
		}
	}

	/**
	 * Removes the last.
	 */
	public void removeLast() {
		if (first != null) {
			Link current = first;
			Link previous = current;
			while (current.next != null) {
				previous = current;
				current = current.next;
			}
			previous.next = null;
		}
	}

	/**
	 * Find.
	 *
	 * @param iValue the i value
	 * @return the link
	 */
	public Link find(int iValue) {

		Link current = first;
		while (current != null) {
			if (current.iData == iValue) {
				return current;
			}
			current = current.next;
		}
		return null;
	}

	/**
	 * Delete.
	 *
	 * @param iValue the i value
	 */
	public void delete(int iValue) {
		Link current = first;
		Link previous = current;
		while (current != null) {
			if (current.iData == iValue) {
//				System.out.println("Deleted successfully");
				previous.next = null;
			}
			previous = current;
			current = current.next;
		}
	}

	/**
	 * Display.
	 */
	public void display() {
		System.out.print("List: ");
		Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}

}
