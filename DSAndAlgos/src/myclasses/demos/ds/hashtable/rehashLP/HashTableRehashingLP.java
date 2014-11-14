package myclasses.demos.ds.hashtable.rehashLP;

// TODO: Auto-generated Javadoc
/**
 * The Class HashTableRehashingLP.
 */
public class HashTableRehashingLP {

	/** The hash table. */
	public int[] hashTable;

	/** The array size. */
	public int arraySize;

	/** The n elem. */
	public int nElem;

	/**
	 * Instantiates a new hash table rehashing lp.
	 * 
	 * @param size
	 *            the size
	 */
	public HashTableRehashingLP(int size) {
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
			if (isLoadFactorBigger()) {
				rehashing();
			}
			int hIndex = hashFunction(key);
			while (hashTable[hIndex] != 0 && hashTable[hIndex] != -1) {
				hIndex++;
				if (hIndex == arraySize) {
					hIndex = 0;
				}
			}
			hashTable[hIndex] = key;
			nElem++;
		}
	}

	/**
	 * Checks if is load factor bigger.
	 * 
	 * @return true, if is load factor bigger
	 */
	public boolean isLoadFactorBigger() {
		float loadFactor = (float) nElem / arraySize;
		if (loadFactor > 0.5) {
			System.out.println("loadFactor: " + loadFactor);
			return true;
		}
		return false;
	}

	/**
	 * Rehashing.
	 */
	public void rehashing() {
		System.out.println("Inside rehashing");
		arraySize = getNewSize();
		nElem = 0;
		int[] newHashTable = new int[arraySize];
		for (int hashElem : hashTable) {
			if (hashElem != 0 && hashElem != -1) {
				int newHIndex = hashFunction(hashElem);
				while (newHashTable[newHIndex] != 0) {
					newHIndex++;
				}
				newHashTable[newHIndex] = hashElem;
				nElem++;
			}
		}
		hashTable = newHashTable;
	}

	/**
	 * Gets the new size.
	 * 
	 * @return the new size
	 */
	public int getNewSize() {
		arraySize *= 2;
		while (true) {
			if (isPrimeNumber(arraySize)) {
				return arraySize;
			}
			arraySize++;
		}
	}

	/**
	 * Checks if is prime number.
	 * 
	 * @param num
	 *            the num
	 * @return true, if is prime number
	 */
	public boolean isPrimeNumber(int num) {
		for (int i = 2; i * i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
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
		while (hashTable[hIndex] != 0) {
			if (hashTable[hIndex] == key) {
				System.out.println("Found the key");
				break;
			}

			hIndex++;
			hIndex = hIndex % arraySize;
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
		while (hashTable[hIndex] != 0) {
			if (hashTable[hIndex] == key) {
				hashTable[hIndex] = -1;
				nElem--;
				System.out.println("deleted the key");
				break;
			}

			hIndex++;
			hIndex = hIndex % arraySize;
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
