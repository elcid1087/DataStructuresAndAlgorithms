package myclasses.demos.ds.hashtable.stringlinearprobing;

// TODO: Auto-generated Javadoc
/**
 * The Class HashTableStringLP.
 */
public class HashTableStringLP {

	/** The hash table. */
	public String[] hashTable;

	/** The array size. */
	public int arraySize;

	/**
	 * Instantiates a new hash table string lp.
	 * 
	 * @param size
	 *            the size
	 */
	public HashTableStringLP(int size) {
		arraySize = size;
		hashTable = new String[arraySize];
	}

	/**
	 * Insert.
	 * 
	 * @param key
	 *            the key
	 */
	public void insert(String key) {
		if (hashTable.length != arraySize - 1) {
			// int hIndex = hashFunction1(key);
			// int hIndex = hashFunction2(key);
			int hIndex = hashFunction2(key);
			while (hashTable[hIndex] != null && hashTable[hIndex] != "-1") {
				hIndex++;
				if (hIndex == arraySize) {
					hIndex = 0;
				}
			}
			hashTable[hIndex] = key;
		}
	}

	/**
	 * This function takes a string as argument. Here the hashcode is calculated
	 * as sum of multiples of 27 power position-1 and asci values of the char
	 * -97. This method calculating the power kind of redundantly, first nth
	 * power of 27 is calculated and (n-1)th and so on. Instead we can come from
	 * 0th and store it in a variable and we can increase the power just by
	 * multiplying it with 27 like int pow1 = 27 power 1, pow2 = pow1 * 27, pow3
	 * = pow2*27 and so on.
	 * 
	 * @param inputString
	 *            the input string
	 * @return hashcode of the string.
	 */
	public int hashFunction1(String inputString) {
		int sum = 0;
		int length = inputString.length();
		for (int i = 0; i < length; i++) {
			int cIndex = inputString.charAt(i) - 96;
			sum = sum + (power(27, length - 1 - i) * cIndex);
		}
		return sum % arraySize;
	}

	/**
	 * Power.
	 * 
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @return the int
	 */
	public static int power(int x, int y) {
		if (y == 0) {
			return 1;
		} else {
			return x * power(x, y - 1);
		}
	}

	/**
	 * This methods functionality is similar to hashFunction1 method except the
	 * fact that the multiplication starts from the last character in the
	 * string.
	 * 
	 * @param inputString
	 *            the input string
	 * @return the int
	 */
	public int hashFunction2(String inputString) {

		int sum = 0;
		int power = 1;
		int length = inputString.length();
		for (int i = length - 1; i >= 0; i--) {
			int cIndex = inputString.charAt(i) - 96;
			sum = sum + power * cIndex;
			power *= 27;
		}

		return sum % arraySize;
	}

	/**
	 * Here we can eliminate the multiplication by taking the advantage of
	 * Horner's method. where var4*n4 + var3*n3 + var2*n2 + var1*n1 + var0*n0
	 * can be written as (((var4*n + var3)*n + var2)*n + var1)*n + var0
	 * 
	 * @param inputString
	 *            the input string
	 * @return the int
	 */
	public int hashFunction3(String inputString) {
		int sum = 0;
		int length = inputString.length();
		for (int index = 0; index < length - 2; index++) {
			int cIndex = inputString.charAt(index) - 96;
			sum = (sum + cIndex) * 27;
			sum = sum % arraySize;
		}
		sum += inputString.charAt(length - 1);
		return sum % arraySize;
	}

	/**
	 * Find.
	 * 
	 * @param key
	 *            the key
	 */
	public void find(String key) {
		int hIndex = hashFunction1(key);
		int nIterations = hIndex;
		while (hashTable[hIndex] != null) {
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
	public void delete(String key) {

		int hIndex = hashFunction1(key);
		int nIterations = hIndex;
		while (hashTable[hIndex] != null) {
			if (hashTable[hIndex] == key) {
				hashTable[hIndex] = "-1";
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
