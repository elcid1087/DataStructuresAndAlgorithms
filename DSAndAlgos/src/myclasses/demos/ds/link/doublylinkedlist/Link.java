package myclasses.demos.ds.link.doublylinkedlist;

// TODO: Auto-generated Javadoc
/**
 * The Class Link.
 */
public class Link {
	
	/** The i data. */
	public int iData;
	
	/** The next. */
	public Link next;
	
	/** The previous. */
	public Link previous;

	/**
	 * Instantiates a new link.
	 *
	 * @param data the data
	 */
	public Link(int data) {
		iData = data;
	}

	/**
	 * Display link.
	 */
	public void displayLink() {
		System.out.print(" " + iData);
	}

}
