package myclasses.demos.ds.cc.linkedlist;

// TODO: Auto-generated Javadoc
/**
 * You have two numbers represented by a linked list, where each node contains a
 * singledigit.The digits are stored in reverse order,such that the 1's digit is
 * at the head of the list. Write a function that adds the two numbers and
 * returns the sum as a linked list.
 */
public class AddingLinks {

	/** The head. */
	private Link head;

	/** The resultant list. */
	private static Link resultantList;

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
	 * Adds the reverse order list.
	 * 
	 * @param link1
	 *            the link1
	 * @param link2
	 *            the link2
	 */
	public static void addReverseOrderList(Link link1, Link link2) {

		int sum = 0;
		int nthDigit = 0;
		while (link1 != null || link2 != null) {

			int link1Digit = 0;
			int link2Digit = 0;
			if (link1 != null) {
				link1Digit = link1.iData;
				link1 = link1.next;
			}

			if (link2 != null) {
				link2Digit = link2.iData;
				link2 = link2.next;
			}
			nthDigit *= 10;
			if (nthDigit == 0) {
				nthDigit = 1;
			}
			sum = sum + (link1Digit + link2Digit) * nthDigit;
		}
		System.out.println("sum: " + sum);
		while (sum != 0) {
			Link newLink = new Link(sum % 10);
			sum = sum / 10;
			if (resultantList == null) {
				resultantList = newLink;
				continue;
			}
			newLink.next = resultantList;
			resultantList = newLink;

		}
		Link current = resultantList;
		while (null != current) {
			current.displayLink();
			current = current.next;
		}

	}

	/**
	 * Adds the reverse order list1.
	 * 
	 * @param link1
	 *            the link1
	 * @param link2
	 *            the link2
	 */
	public static void addReverseOrderList1(Link link1, Link link2) {
		int sum = 0;

		while (link1 != null || link2 != null) {
			int link1Digit = 0;
			int link2Digit = 0;
			if (link1 != null) {
				link1Digit = link1.iData;
				link1 = link1.next;
			}
			if (link2 != null) {
				link2Digit = link2.iData;
				link2 = link2.next;
			}
			sum = sum + link1Digit + link2Digit;

			Link newLink = new Link(sum % 10);
			sum = sum / 10;
			newLink.next = resultantList;
			resultantList = newLink;
		}
		if (sum != 0) {
			Link newLink = new Link(sum % 10);
			newLink.next = resultantList;
			resultantList = newLink;
		}

		Link current = resultantList;
		while (null != current) {
			current.displayLink();
			current = current.next;
		}

	}

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		AddingLinks add1 = new AddingLinks();
		add1.insert(9);
		add1.insert(9);
		// add1.insert(9);
		add1.displayList();
		/*
		 * for (int i = 1; i <= size; i++) { add1.insert(i); }
		 * 
		 * 
		 * 
		 * for (int j = size; j >= 1; j--) { add2.insert(j); }
		 */
		AddingLinks add2 = new AddingLinks();
		add2.insert(9);
		add2.insert(9);
		add2.insert(1);

		add2.displayList();
		addReverseOrderList1(add1.head, add2.head);

	}

}
