package myclasses.demos.ds.hashtable.foldingLP;

// TODO: Auto-generated Javadoc
/**
 * The Class HashTableFoldingLPApp.
 */
public class HashTableFoldingLPApp {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		System.out.println("Start");
		HashTableFoldingLP ht = new HashTableFoldingLP(10);
		ht.insert(1);
		ht.insert(20);
		ht.insert(1990);
		ht.insert(9);
		ht.insert(89);
		ht.insert(99);
		ht.insert(89);
		ht.insert(89);
		ht.insert(89);
		ht.insert(89);
		ht.displayHashTable();
		ht.find(1990);
		ht.find(99);
		ht.find(89);
		ht.find(30);
		ht.delete(89);
		ht.displayHashTable();
		ht.delete(89);
		ht.displayHashTable();
		System.out.println("End");
	}

	/**
	 * Prime.
	 * 
	 * @param size
	 *            the size
	 * @return the int
	 */
	public static int prime(int size) {

		return 0;
	}
}
