package myclasses.demos.ds.link.doublylinkedlist;

// TODO: Auto-generated Javadoc
/**
 * The Class DoublyLinkedList.
 */
public class DoublyLinkedList {
	
	/** The first. */
	public Link first;
	
	/** The last. */
	public Link last;

	/**
	 * Insertfirst.
	 *
	 * @param iValue the i value
	 */
	public void insertfirst(int iValue) {
		Link newLink = new Link(iValue);
		if (first == null) {
			first = newLink;
			last = newLink;
		} else {
			newLink.next = first;
			newLink.previous = first.previous;
			first.previous = newLink;
			first = newLink;

		}
	}

	/**
	 * Insert first.
	 *
	 * @param dd the dd
	 */
	public void insertFirst(int dd) {
		Link newLink = new Link(dd);
		if (first == null)
			last = newLink;
		else
			newLink.previous = first.previous;
		first.previous = newLink;
		newLink.next = first;
		first = newLink;
	}

	/**
	 * Insert last.
	 *
	 * @param iValue the i value
	 */
	public void insertLast(int iValue) {
		Link newLink = new Link(iValue);
		if (last == null) {
			first = newLink;
			last = newLink;
		} else {
			newLink.next = last.next;
			last.next = newLink;
			newLink.previous = last;
			last = newLink;
		}
	}

	/**
	 * Delete first.
	 */
	public void deleteFirst() {
		if (first.next == null) {// how about first =null;
			first=null;
			
		} else {
			first.next.previous = first.previous;
			first = first.next;
		}
	}

	/**
	 * Delete last.
	 */
	public void deleteLast() {
		if (first != null) {
			last = last.previous;
			if (last != null) {
				last.next = null;
			}else{
				first=null;
			}
		}
	}

	/**
	 * Insert after.
	 *
	 * @param key the key
	 * @param iValue the i value
	 */
	public void insertAfter(int key, int iValue) {
		Link newLink = new Link(iValue);
		Link current = first;

		while (current != null) {

			if (current.iData == key) {
				if (current.next != null) {// try to optimize the code inside
											// the if else statements.
					newLink.next = current.next;
					newLink.previous = current;
					current.next.previous = newLink;
					// current.next = newLink;
				} else {
					newLink.previous = current;
					// current.next=newLink;
					last = newLink;
					;
				}
				current.next = newLink;
				break;
			}
			current = current.next;
		}

	}

	/**
	 * Insert before.
	 *
	 * @param key the key
	 * @param iValue the i value
	 */
	public void insertBefore(int key, int iValue) {
		Link newLink = new Link(iValue);
		Link current = first;
		Link previous = current;
		while (current != null) {
			if (current.iData == key) {
				if (current.iData != first.iData) {
					newLink.next = previous.next;
					newLink.previous = previous;
					previous.next.previous = newLink;
					previous.next = newLink;
				} else {
					newLink.next = first;
					newLink.previous = first.previous;
					first = newLink;
				}
				break;
			}
			previous = current;
			current = current.next;
		}
	}

	/*
	 * public void deleteBefore(int key) { Link current = first; Link previous =
	 * current; while (current != null && current.iData != key) { previous =
	 * current; current = current.next; } if(current!=null){
	 * if(current.previous.previous==null){
	 * current.previous=current.previous.previous; first =current; }else{
	 * 
	 * } } }
	 */

	/**
	 * Delete before.
	 *
	 * @param key the key
	 */
	public void deleteBefore(int key) {
		Link current = first;
		Link before = current;
		while (current != null) {
			if (current.iData == key && first.iData != current.iData) {
				if (first.next.iData == current.iData) {
					current.previous = first.previous;
					first = current;
				} else {

					current.previous = before.previous;
					before.previous.next = current;
				}
				break;
			}
			before = current;
			current = current.next;
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
