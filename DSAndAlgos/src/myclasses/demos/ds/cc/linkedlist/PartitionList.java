package myclasses.demos.ds.cc.linkedlist;

// TODO: Auto-generated Javadoc
/**
 * Write code to partition a linked list around a value x, such that all nodes
 * less than x come before alt nodes greater than or equal to x.
 */
public class PartitionList {
	/** The head. */
	private static Link head;

	/** The root. */
	private static Link root;
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
	 * Partition.
	 * 
	 * @param p
	 *            the p
	 */
	public void partition(int p) {
		Link current = head;
		Link previous = current;
		Link temp = null;

		while (current != null) {

			if (current.iData <= p) {

				previous.next = current.next;
				Link newLink = new Link(current.iData);
				if (current.iData == p && temp != null) {
					newLink.next = temp.next;
					temp.next = newLink;
					current = current.next;
					continue;
				}

				newLink.next = head;
				head = newLink;
				if (temp == null) {
					temp = head;
				}
				current = current.next;
				continue;
			}
			previous = current;
			current = current.next;
		}
	}

	/**
	 * Partition1. first finding the partition value link and its previous link,
	 * then adding node with the value less than p to the left otherwise to the
	 * right;
	 * 
	 * @param p
	 *            the p
	 */
	public void partition1(int p) {
		System.out.println("partition1");
		Link current = head;
		Link previous = current;
		while (current != null && current.iData != p) {
			previous = current;
			current = current.next;
		}
		Link pLink = new Link(p);
		root = pLink;
		Link temp = head;
		while (temp != null) {
			Link newLink = new Link(temp.iData);
			if (temp.iData < p) {
				newLink.next = root;
				root = newLink;
			} else if (temp.iData > p) {
				newLink.next = pLink.next;
				pLink.next = newLink;
				pLink = newLink;
			}
			temp = temp.next;
		}
		while (null != root) {
			root.displayLink();
			root = root.next;
		}

	}

	/**
	 * Partition list.
	 * 
	 * @param part
	 *            the part
	 */
	public void partitionList(int part) {
		Link root = head;
		Link current = head;
		Link previous = current;
		while (current != null) {
			// System.out.print(" " + current.iData);
			if (current.iData < part) {
				// remove
				Link newLink = current;
				previous.next = current.next;
				newLink.next = null;
				root = root;
				// insertFirst
				newLink.next = head;
				head = newLink;
				current = previous.next;
				continue;
			}
			previous = current;
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
		PartitionList part = new PartitionList();
		int size = 10;
		int[] arr = { 80, 90, 10, 60, 7, 5, 1, 2, 3, 4 };
		// int[] arr = { 8, 9, 4, 2, 7, 3, 1, 10, 6, 5 };
		int val = 1;
		for (int i = 0; i < size; i++) {
			val = (int) (i * Math.random() * 100);
			part.insert(arr[i]);
		}
		part.displayList();
		System.out.println("val: " + arr[9]);
		// part.partition(5);
		part.partitionList(5);
		part.displayList();

		// part.partition1(5);
	}
}
