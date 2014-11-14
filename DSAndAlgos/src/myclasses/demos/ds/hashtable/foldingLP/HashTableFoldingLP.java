package myclasses.demos.ds.hashtable.foldingLP;

// TODO: Auto-generated Javadoc
/**
 * The Class HashTableFoldingLP.
 */
public class HashTableFoldingLP {

	/** The hash table. */
	public int[] hashTable;

	/** The array size. */
	public int arraySize;

	/**
	 * Instantiates a new hash table folding lp.
	 * 
	 * @param size
	 *            the size
	 */
	public HashTableFoldingLP(int size) {
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
			int hIndex = hashFunction1(key);
			while (hashTable[hIndex] != 0 && hashTable[hIndex] != -1) {
				hIndex++;
				if (hIndex == arraySize) {
					hIndex = 0;
				}
			}
			hashTable[hIndex] = key;
		}
	}

	/**
	 * Find denominator to divide.
	 * 
	 * @return the int
	 */
	public int findDenominatorToDivide() {

		// check if multiple of 10
		if (arraySize != 10 && arraySize % 10 == 0) {
			return String.valueOf(arraySize).length() - 1;
		}

		return String.valueOf(arraySize).length();

	}

	/**
	 * Hash function1.
	 * 
	 * @param key
	 *            the key
	 * @return the int
	 */
	public int hashFunction1(int key) {
		String keyString = String.valueOf(key);
		int nGroups = findDenominatorToDivide();
		int sum = 0;
		int kStringLength = keyString.length();
		for (int i = 0; i < kStringLength;) {
			if (i + nGroups > keyString.length()) {
				nGroups = kStringLength - i;
			}
			sum = sum
					+ (Integer.parseInt(keyString.substring(i, i + nGroups)) % arraySize);
			i += nGroups;
		}
		return sum % arraySize;
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
		int hIndex = hashFunction1(key);
		int nIterations = hIndex;
		while (hashTable[hIndex] != 0) {
			if (hashTable[hIndex] == key) {
				System.out.println("Found the key " + key);
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

		int hIndex = hashFunction1(key);
		int nIterations = hIndex;
		while (hashTable[hIndex] != 0) {
			if (hashTable[hIndex] == key) {
				hashTable[hIndex] = -1;
				System.out.println("deleted the key " + key);
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
