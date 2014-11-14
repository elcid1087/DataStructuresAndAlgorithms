package myclasses.demos.ds.recursion.binarysearch;

// TODO: Auto-generated Javadoc
/**
 * The Class BinarySearch.
 */
public class BinarySearch {
	
	/** The search array. */
	private int[] searchArray;
	
	/** The max size. */
	private int maxSize;
	
	/** The search num. */
	private int searchNum;

	/**
	 * Instantiates a new binary search.
	 *
	 * @param size the size
	 */
	public BinarySearch(int size) {
		maxSize = size;
		searchArray = new int[maxSize];
	}

	/**
	 * Populare array.
	 */
	public void populareArray() {
		for (int i = 0; i < maxSize; i++) {
			searchArray[i] = i + 1;
		}
	}

	/**
	 * Binary recursion.
	 *
	 * @param num the num
	 * @return the int
	 */
	public int binaryRecursion(int num) {
		populareArray();
		searchNum = num;
		int lBound = 0;
		int hBound = maxSize - 1;
		return search(lBound, hBound);
	}

	/**
	 * Search.
	 *
	 * @param lBound the l bound
	 * @param hBound the h bound
	 * @return the int
	 */
	public int search(int lBound, int hBound) {
		int mid = (lBound + hBound) / 2;
		if (searchArray[mid] == searchNum) {
			return searchArray[mid];
		} else if (lBound != hBound) {
			if (searchNum > mid) {
				return search(mid + 1, hBound);
			} else {
				return search(lBound, mid - 1);
			}
		} else {
			return -1;
		}
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		BinarySearch binary = new BinarySearch(100);
		int i = binary.binaryRecursion(33);
		System.out.println("Num: " + i);
	}

}
