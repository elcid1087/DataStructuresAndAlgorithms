package myclasses.demos.ds.link.crackingCIsolutions.deleteNode;

// TODO: Auto-generated Javadoc
/**
 * 2.3 Implement an algorithm to delete a node in the middle of a singly linked
 * list, given only access to that node.
 */
public class LinkedList {

	/** The first. */
	public Link first;

	/**
	 * Insert first.
	 * 
	 * @param iData
	 *            the i data
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
	 * @param iData
	 *            the i data
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
	 * @param iValue
	 *            the i value
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
	 * @param iValue
	 *            the i value
	 */
	public void delete(int iValue) {
		Link current = first;
		Link previous = current;
		while (current != null) {
			if (current.iData == iValue) {
				System.out.println("Deleted successfully");
				previous.next = null;
			}
			previous = current;
			current = current.next;
		}
	}

	/**
	 * Delete middle.
	 * 
	 * @param iValue
	 *            the i value
	 */
	public void deleteMiddle(int iValue) {
		Link current = first;
		while (current != null && current.next != null) {
			if (current.iData == iValue) {
				current.iData = current.next.iData;
				current.next = current.next.next;
				break;
			}
			current = current.next;
		}
	}

	/**
	 * Find middle.
	 * 
	 * @param iValue
	 *            the i value
	 * @return the link
	 */
	public Link findMiddle(int iValue) {
		Link current = first;
		while (current != null) {
			if (current.iData == iValue) {
				return current;
			}
			current = current.next;
		}
		return current;
	}

	/**
	 * Delete middle2.
	 * 
	 * @param link
	 *            the link
	 * @return true, if successful
	 */
	public boolean deleteMiddle2(Link link) {
		if (link.next == null) {
			return false;
		}
		link.iData = link.next.iData;
		link.next = link.next.next;
		return true;
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
