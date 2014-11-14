package myclasses.demos.ds.link.linkedlist;

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
		if (first.iData == iValue) {
			first = first.next;
		} else {
			while (current != null) {
				if (current.iData == iValue) {
					System.out.println("Deleted successfully");
					previous.next = current.next;
					break;
				}
				previous = current;
				current = current.next;
			}
		}
	}

	/**
	 * Removes the duplicates.
	 * 
	 * @param size
	 *            the size
	 */
	public void removeDuplicates(int size) {
		Link uniqueList = null;
		int[] hashTable = new int[size];
		Link current = first;
		while (current != null) {
			int iValue = current.iData;
			int hashCode = iValue % size;
			hashTable[hashCode] = iValue;
			current = current.next;
		}
		System.out.print("List ");
		for (int i = 0; i < hashTable.length; i++) {
			int iData = hashTable[i];
			if (0 != iData) {
				Link newLink = new Link(iData);
				newLink.next = uniqueList;
				uniqueList = newLink;
				uniqueList.displayLink();
			}
		}

	}

	/**
	 * Find kth recursively.
	 */
	public void findKthRecursively() {
		System.out.print("\nKth to Last: ");
		Link kthLink = findKthLink(first, 2, 0);

		while (kthLink != null) {
			// kthLink.displayLink();
			kthLink = kthLink.next;
		}
	}

	/**
	 * Find kth link.
	 * 
	 * @param link
	 *            the link
	 * @param k
	 *            the k
	 * @param i
	 *            the i
	 * @return the link
	 */
	public Link findKthLink(Link link, int k, int i) {

		if (link == null) {
			return null;
		}
		Link newLink = findKthLink(link.next, k, i + 1);
		if (k <= i) {
			link.displayLink();
			return link;
		}
		return newLink;

	}

	/**
	 * Reverse.
	 */
	public void reverse() {
		System.out.println("reverse ");
		Link current = first;
		Link previous = null;
		Link link = null;
		while (current != null) {
			link = current;
			current = current.next;
			link.next = previous;
			previous = link;
		}
		first = link;
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
