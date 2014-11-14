package myclasses.demos.ds.hashtable.seperatechaining.collisionusingbst;

// TODO: Auto-generated Javadoc
/**
 * The Class HashTableSCBST.
 */
public class HashTableSCBST {

	/** The hash table. */
	public BST[] hashTable;
	
	/** The array size. */
	public int arraySize;

	/**
	 * Instantiates a new hash table scbst.
	 *
	 * @param size the size
	 */
	public HashTableSCBST(int size) {
		arraySize = size;
		hashTable = new BST[arraySize];
	}

	/**
	 * Insert.
	 *
	 * @param key the key
	 */
	public void insert(int key) {
		if (hashTable.length != arraySize - 1) {
			int hIndex = hashFunction(key);
			if (hashTable[hIndex] == null) {
				BST newList = new BST();
				hashTable[hIndex] = newList;
			}
			hashTable[hIndex].insert(key);
		}

	}

	/**
	 * Insert to list.
	 *
	 * @param key the key
	 */
	public void insertToList(int key) {

	}

	/**
	 * Hash function.
	 *
	 * @param key the key
	 * @return the int
	 */
	public int hashFunction(int key) {
//		System.out.println("HashCode: " + key % arraySize);
		return key % arraySize;
	}

	/**
	 * Find.
	 *
	 * @param key the key
	 */
	public void find(int key) {
		int hIndex = hashFunction(key);
		if (hashTable[hIndex] != null) {
			hashTable[hIndex].find(key);
		}

	}

	/**
	 * Delete.
	 *
	 * @param key the key
	 */
	public void delete(int key) {

		int hIndex = hashFunction(key);
		if (hashTable[hIndex] != null) {
			hashTable[hIndex].delete(key);
		}
	}

	/**
	 * Display hash table.
	 */
	public void displayHashTable() {
		System.out.print("HashTable--> ");
		for (int i = 0; i < arraySize; i++) {
			if (hashTable[i] != null) {
				hashTable[i].display();
			}
		}
		System.out.println(" ");
	}

}
