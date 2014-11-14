package myclasses.demos.ds.link.linkedlist;

// TODO: Auto-generated Javadoc
/**
 * The Class LinkedListApp.
 */
public class LinkedListApp {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.insertFirst(1);
		linkedList.insertFirst(2);
		linkedList.insertFirst(3);
		linkedList.insertFirst(1);
		linkedList.display();
		linkedList.reverse();
		linkedList.display();
		linkedList.removeFirst();
		linkedList.removeFirst();
		linkedList.display();
		linkedList.insertLast(2);
		linkedList.insertLast(3);
		linkedList.display();
		linkedList.removeLast();
		linkedList.display();
		Link link = linkedList.find(1);
		System.out.println("Found link: " + link.iData);
		linkedList.delete(1);
		linkedList.display();
		linkedList.insertLast(3);
		linkedList.insertLast(4);
		linkedList.insertLast(5);
		linkedList.display();
		linkedList.removeDuplicates(5);
		// linkedList.display();
		linkedList.findKthRecursively();

	}
}
