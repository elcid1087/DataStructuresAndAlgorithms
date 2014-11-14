package myclasses.demos.ds.link.crackingCIsolutions.deleteNode;

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
		linkedList.insertLast(3);
		// linkedList.delete(2);
		linkedList.deleteMiddle(2);
		linkedList.display();
		linkedList.insertLast(5);
		linkedList.insertLast(4);
		linkedList.insertLast(3);
		linkedList.insertLast(2);
		linkedList.insertLast(6);

		Link dLink = linkedList.findMiddle(3);
		boolean b = linkedList.deleteMiddle2(dLink);
		linkedList.display();
	}
}
