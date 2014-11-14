package myclasses.demos.ds.link.circularlist.q3;

// TODO: Auto-generated Javadoc
/**
 * The Class MakeCircularListApp.
 */
public class MakeCircularListApp {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.insertLast(5);
		linkedList.insertLast(4);
		linkedList.insertLast(3);
		linkedList.insertLast(2);
		linkedList.insertLast(6);
		linkedList.insertLast(7);
		linkedList.insertLast(8);
		linkedList.insertLast(1);
		linkedList.display();
		linkedList.makeCircular(9, 3);
		//
		Link headLink = linkedList.findHeadLink();// Finds the head link and
													// removes the loop.
		System.out.println("headLink " + headLink.iData);
		linkedList.display();
	}
}
