package myclasses.demos.ds.hashtable.quadraticprobe;

// TODO: Auto-generated Javadoc
/**
 * The Class HashTable.
 */
public class HashTable {

	/** The hash table. */
	public int[] hashTable;

	/** The array size. */
	public int arraySize;

	/**
	 * Instantiates a new hash table.
	 * 
	 * @param size
	 *            the size
	 */
	public HashTable(int size) {
		arraySize = size;
		hashTable = new int[arraySize];
	}

	/**
	 * Insert.
	 * 
	 * @param key
	 *            the key
	 */
	public void insert(int key) {
		if (hashTable.length != arraySize - 1) {
			int hashCode = hashFunction(key);
			int hIndex = hashCode;
			int step = 1;

			while (hashTable[hIndex] != 0 && hashTable[hIndex] != -1) {
				System.out.println(hIndex);
				hIndex = hashCode + (step * step);
				step++;
				hIndex %= arraySize;
			}
			hashTable[hIndex] = key;
		}
	}

	/**
	 * Hash function.
	 * 
	 * @param key
	 *            the key
	 * @return the int
	 */
	public int hashFunction(int key) {
		System.out.println("HashCode: " + key % arraySize);
		return key % arraySize;
	}

	/**
	 * Find.
	 * 
	 * @param key
	 *            the key
	 */
	public void find(int key) {
		int hIndex = hashFunction(key);
		int nIterations = hIndex;
		int n = 1;
		while (hashTable[hIndex] != 0) {
			if (hashTable[hIndex] == key) {
				System.out.println("Found the key");
				break;
			}

			hIndex = hIndex + (n * n);
			n++;
			if (hIndex >= arraySize) {
				hIndex = 0;
				n = 1;
			}
			if (hIndex == nIterations) {
				System.out.println("Key not found");
				break;
			}
		}
	}

	/**
	 * Delete.
	 * 
	 * @param key
	 *            the key
	 */
	public void delete(int key) {

		int hIndex = hashFunction(key);
		int nIterations = hIndex;
		int n = 1;
		while (hashTable[hIndex] != 0) {
			if (hashTable[hIndex] == key) {
				hashTable[hIndex] = -1;
				System.out.println("deleted the key");
				break;
			}
			hIndex = hIndex + (n * n);
			n++;
			if (hIndex >= arraySize) {
				hIndex = 0;
				n = 1;
			}
			if (hIndex == nIterations) {
				System.out.println("Key not found");
				break;
			}
		}

	}

	/**
	 * Display hash table.
	 */
	public void displayHashTable() {
		System.out.print("HashTable--> ");
		for (int i = 0; i < arraySize; i++) {
			System.out.print(hashTable[i] + " ");
		}
		System.out.println(" ");
	}

}
