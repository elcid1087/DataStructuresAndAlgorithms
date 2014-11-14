package myclasses.demos.ds.hashtable.rehashLP;

// TODO: Auto-generated Javadoc
/**
 * The Class HashTableRehashingLPApp.
 */
public class HashTableRehashingLPApp {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		System.out.println("Start");
		HashTableRehashingLP ht = new HashTableRehashingLP(11);
		ht.insert(1);
		ht.insert(2);
		ht.insert(199);
		ht.insert(99);
		ht.insert(89);
		ht.insert(89);
		ht.insert(89);
		ht.insert(89);
		ht.insert(89);
		ht.insert(89);
		ht.displayHashTable();
		ht.find(199);
		ht.find(99);
		ht.find(89);
		ht.find(3);
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
