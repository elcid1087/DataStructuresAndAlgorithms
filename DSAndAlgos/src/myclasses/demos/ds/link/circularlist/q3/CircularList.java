package myclasses.demos.ds.link.circularlist.q3;

// TODO: Auto-generated Javadoc
/**
 * The Class CircularList.
 */
public class CircularList {

	/** The first. */
	public Link first;

	/**
	 * Insert.
	 * 
	 * @param iValue
	 *            the i value
	 */
	public void insert(int iValue) {

		Link newLink = new Link(iValue);
		Link current = first;
		while (current != null && current.next.iData != first.iData) {
			current = current.next;
		}

		if (first == null) {
			first = newLink;
			newLink.next = first;
		} else {
			newLink.next = first;
			first = newLink;
			current.next = first;
		}
	}

	/**
	 * Search.
	 * 
	 * @param iValue
	 *            the i value
	 */
	public void search(int iValue) {
		// TODO
		Link current = first;
		while (current != null) {
			if (current.iData == iValue) {
				System.out.println(iValue + " found");
				break;
			}
			current = current.next;
		}

	}

	/**
	 * Delete.
	 * 
	 * @param iValue
	 *            the i value
	 */
	public void delete(int iValue) {
		// TODO
		Link current = first;
		Link previous = current;
		if (iValue == first.iData) {
			current = first.next;
		}
		while (current.iData != iValue) {
			previous = current;
			current = current.next;
		}
		if (iValue == first.iData) {
			if (first.iData != first.next.iData) {
				first = first.next;
				previous.next = first;
			} else {
				first = null;
			}
		} else
			previous.next = current.next;
	}

	/**
	 * Find head link.
	 * 
	 * @return the link
	 */
	public Link findHeadLink() {

		Link slowRunner = first.next;
		Link fastRunner = first.next;

		while (fastRunner != null && fastRunner.next != null) {
			slowRunner = slowRunner.next;
			fastRunner = fastRunner.next.next;
			if (slowRunner == fastRunner) {
				System.out.println("meeting point " + slowRunner.iData);
				break;
			}
		}

		if (fastRunner == null) {
			return null;
		}

		slowRunner = first.next;
		int i = 0;
		while (slowRunner != fastRunner) {
			i++;
			slowRunner = slowRunner.next;
			fastRunner = fastRunner.next;

		}
		System.out.println("i " + i);
		return slowRunner;
	}

	/**
	 * Display.
	 */
	public void display() {
		// TODO
		System.out.print("First --> Last: ");
		Link current = first;
		while (current != null) {

			current.displayLink();
			if (current.next.iData == first.iData) {
				break;
			}
			current = current.next;

		}
		System.out.println();
	}

}
