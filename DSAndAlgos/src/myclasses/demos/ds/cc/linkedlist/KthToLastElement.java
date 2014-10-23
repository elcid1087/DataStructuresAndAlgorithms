package myclasses.demos.ds.cc.linkedlist;

// TODO: Auto-generated Javadoc
/**
 * Implement an algorithm to find the kth to last element of a singly linked
 * list.
 */
public class KthToLastElement {

	/** The head. */
	private static Link head;

	/** The in. */
	public int in;

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
	 * Find kth from last recursive.
	 * 
	 * @param k
	 *            the k
	 */
	public void findKthFromLastRecursive(int k) {
		System.out.println("findKthFromLastRecursive");
		Link current = findKthFromLastRecursive1(head, k);

		while (null != current) {
			current.displayLink();
			current = current.next;
		}
	}

	/** The i. */
	static int i = 0;

	/**
	 * Find kth from last recursive.
	 * 
	 * @param current
	 *            the current
	 * @param k
	 *            the k
	 */
	public void findKthFromLastRecursive(Link current, int k) {
		if (null == current) {
			return;
		}
		findKthFromLastRecursive(current.next, k);
		if (k > i) {
			current.displayLink();
			i++;
		}
	}

	/** The temp. */
	static int temp;

	/**
	 * Find kth from last recursive1.
	 * 
	 * @param current
	 *            the current
	 * @param k
	 *            the k
	 * @return the link
	 */
	public Link findKthFromLastRecursive1(Link current, int k) {

		if (current == null) {
			return null;
		}
		Link link = findKthFromLastRecursive1(current.next, k);
		temp++;
		if (k == temp)
			return current;
		return link;
	}

	/**
	 * Rec.
	 * 
	 * @param k
	 *            the k
	 */
	public void rec(int k) {
		System.out.println("rec");
		nthToLast(head, k);
	}

	/**
	 * Nth to last.
	 * 
	 * @param head
	 *            the head
	 * @param k
	 *            the k
	 * @return the int
	 */
	public static int nthToLast(Link head, int k) {
		if (head == null) {
			return 0;
		}
		int i = nthToLast(head.next, k);
		i++;
		// System.out.println("i "+ i);
		if (i <= k) {
			head.displayLink();
		}
		return i;
	}

	/**
	 * Find kth to last elem by finding len.
	 * 
	 * @param kThElement
	 *            the k th element
	 */
	public void findKthToLastElemByFindingLen(int kThElement) {
		int length = 0;
		Link current = head;
		while (null != current) {
			length++;
			current = current.next;
		}
		current = head;
		int i = 0;
		int kElem = length - kThElement;
		while (true) {
			if (i == kElem) {
				break;
			}
			i++;
			current = current.next;
		}
		while (null != current) {
			current.displayLink();
			current = current.next;
		}
	}

	/**
	 * Find kth to last element.
	 * 
	 * @param kThElement
	 *            the k th element
	 */
	public void findKthToLastElement(int kThElement) {
		int length = 0;
		Link lPtr = head;
		Link rPtr = head;
		for (int i = 0; i < kThElement - 1; ++i) {
			lPtr = lPtr.next;
		}
		while (lPtr.next != null) {
			rPtr = rPtr.next;
			lPtr = lPtr.next;
		}
		while (rPtr != null) {
			rPtr.displayLink();
			rPtr = rPtr.next;
		}
		System.out.println("length: " + length);
	}

	/**
	 * Reverse link.
	 */
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
		KthToLastElement findKth = new KthToLastElement();
		int size = 10;
		for (int i = 1; i <= size; i++) {
			findKth.insert(i);
		}
		findKth.displayList();
		// findKth.findKthToLastElement(3);
		// findKth.findKthToLastElemByFindingLen(3);
		findKth.findKthFromLastRecursive(3);
		// findKth.rec(3);
	}

}
