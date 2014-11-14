package myclasses.demos.ds.hashtable.stringlinearprobing;

// TODO: Auto-generated Javadoc
/**
 * The Class HashTableStringLPApp.
 */
public class HashTableStringLPApp {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.println("Start");
		HashTableStringLP ht = new HashTableStringLP(11);
		ht.insert("dogs1");
		ht.insert("dogs2");
		ht.insert("gods1");
		ht.insert("god");
		ht.insert("gods");
		ht.insert("god");
		ht.insert("god");
		ht.insert("god");
		ht.insert("gods2");
		ht.insert("god");
		ht.displayHashTable();
		ht.find("dogs1");
		ht.find("god");
		ht.find("gods2");
//		ht.find("3");
		ht.delete("dogs1");
		ht.displayHashTable();
		ht.delete("dogs2");
		ht.displayHashTable();
		ht.insert("dogs1");
		ht.displayHashTable();
		System.out.println("End");
	}
	
	/**
	 * Prime.
	 *
	 * @param size the size
	 * @return the int
	 */
	public static int prime(int size){
		
		
		return 0;
	}
}
