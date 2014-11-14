package myclasses.demos.ds.link.sortedlist;

import myclasses.demos.ds.link.linkedlist.Link;

// TODO: Auto-generated Javadoc
/**
 * The Class SortedList.
 */
public class SortedList {

	/** The first. */
	public Link first;

	/**
	 * Insertion sort.
	 *
	 * @param iValue the i value
	 */
	public void insertionSort(int iValue) {
		Link newLink = new Link(iValue);

		Link current = first;
		Link previous = current;
		while (current != null && iValue > current.iData) {
			previous = current;
			current = current.next;
		}
		if (previous == null) {

			first = newLink;
			newLink.next = current;
		} else {
			previous.next = newLink;
			newLink.next = current;
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
