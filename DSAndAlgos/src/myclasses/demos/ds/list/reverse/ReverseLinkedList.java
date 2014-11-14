package myclasses.demos.ds.list.reverse;

// TODO: Auto-generated Javadoc
/**
 * The Class ReverseLinkedList.
 */
public class ReverseLinkedList {
	
	/** The first. */
	public Link first;

	/**
	 * Insert last.
	 *
	 * @param iValue the i value
	 */
	public void insertLast(int iValue) {

		Link newLink = new Link(iValue);
		if (first == null) {
			newLink.next = first;
			first = newLink;
		} else {
			Link current = first;
			while (current.next != null) {
				current = current.next;
			}
			if (current.next == null) {
				newLink.next = current.next;
				current.next = newLink;
			}
		}
	}

	/**
	 * Reverse.
	 */
	public void reverse() {

		if (first != null) {

			Link current = first;
			Link previous = null;
			Link temp=null;
			while (current.next != null) {
				 temp = current.next;
				current.next = previous;
				previous = current;
				current = temp;
			}
			current.next=previous;
			first  = current;

		}
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
