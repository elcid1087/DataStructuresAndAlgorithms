package myclasses.demos.ds.link.circularlist.q3;

// TODO: Auto-generated Javadoc
/**
 * The Class CircularListApp.
 */
public class CircularListApp {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		CircularList circular = new CircularList();
		circular.insert(1);
		circular.insert(2);
		circular.insert(3);
		circular.insert(4);
		circular.insert(5);
		circular.insert(6);
		circular.insert(7);
		circular.insert(8);
		circular.insert(9);
		circular.display();
		circular.search(5);
		// circular.delete(5);
		// circular.delete(3);
		// circular.delete(1);
		// circular.delete(2);
		// circular.delete(4);
		circular.display();
		Link headLink = circular.findHeadLink();
		System.out.println("headLink " + headLink.iData);

	}
}
