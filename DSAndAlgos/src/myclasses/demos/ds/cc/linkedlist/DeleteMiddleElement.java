package myclasses.demos.ds.cc.linkedlist;

// TODO: Auto-generated Javadoc
/**
 * Implement an algorithm to delete a node in the middle of a singly linked
 * list, given only access to that node.
 */
public class DeleteMiddleElement {

	/** The head. */
	private static Link head;

	/**
	 * Insert.
	 * 
	 * @param iData
	 *            the i data
	 */
	public void insert(int iData) {
		Link newLink = new Link(iData);
		if (null == head) {
			head = newLink;
		} else {
			Link current = head;
			Link previous = current;
			while (null != current) {
				previous = current;
				current = current.next;
			}
			previous.next = newLink;
		}
	}

	/**
	 * Display list.
	 */
	public void displayList() {
		Link current = head;
		while (null != current) {
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}

	/**
	 * Delete middle.
	 * 
	 * @param mLink
	 * 
	 */
	public void deleteMiddle(Link mLink) {
		// Overrides the current link to next link and updates the current-links
		// next to next-links-next.
		mLink.iData = mLink.next.iData;
		mLink.next = mLink.next.next;
	}

	public void reverseLink() {
		Link previous = null;
		Link current = head;
		Link temp = current;
		while (null != current) {
			temp = current;
			current = current.next;
			temp.next = previous;
			previous = temp;

		}

		head = temp;
	}

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		DeleteMiddleElement del = new DeleteMiddleElement();
		int size = 5;
		for (int i = 0; i < size; i++) {
			del.insert(i);
		}
		del.displayList();
		int j = 0;
		Link current = head;
		while (true) {
			if (size / 2 == j) {
				del.deleteMiddle(current);
				break;
			}
			j++;
			current = current.next;
		}
		del.displayList();

	}

}
