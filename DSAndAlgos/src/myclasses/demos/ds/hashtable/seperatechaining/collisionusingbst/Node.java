package myclasses.demos.ds.hashtable.seperatechaining.collisionusingbst;

// TODO: Auto-generated Javadoc
/**
 * The Class Node.
 */
public class Node {

	/** The i data. */
	public int iData;
	
	/** The right. */
	public Node right;
	
	/** The left. */
	public Node left;

	/**
	 * Instantiates a new node.
	 *
	 * @param iData the i data
	 */
	public Node(int iData) {
		this.iData = iData;
	}

	/**
	 * Display node.
	 */
	public void displayNode() {
		System.out.print(" " + iData);
	}

}
