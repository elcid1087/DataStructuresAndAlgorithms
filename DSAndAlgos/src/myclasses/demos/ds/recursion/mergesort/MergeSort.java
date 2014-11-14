package myclasses.demos.ds.recursion.mergesort;

// TODO: Auto-generated Javadoc
/**
 * The Class MergeSort.
 */
public class MergeSort {
	// private int[] inSort = { 100, 21, 33, 70, 12, 85, 44, 3, 1 };
	// private int[] outSort = new int[inSort.length];
	// private int[] outSort = { 100, 21, 33, 70, 12, 85, 44, 3, 1 };
	/** The in sort. */
	private final int[] inSort;

	/** The out sort. */
	private final int[] outSort;

	/** The size. */
	private final int size;

	/**
	 * Instantiates a new merge sort.
	 * 
	 * @param s
	 *            the s
	 */
	public MergeSort(int s) {
		size = s;
		inSort = new int[size];
		outSort = new int[size];
	}

	/**
	 * Insert.
	 */
	public void insert() {
		for (int i = 0; i < size; i++) {
			int r = (int) (Math.random() * 100);
			inSort[i] = r;
			outSort[i] = r;
		}
	}

	/**
	 * Merge sort.
	 * 
	 * @param lPtr
	 *            the l ptr
	 * @param hPtr
	 *            the h ptr
	 */
	public void mergeSort(int lPtr, int hPtr) {
		int mid = 0;

		if (lPtr == hPtr) {
			// System.out.println("lPtr " + lPtr + " hPtr " + hPtr);
			return;
		} else {
			mid = (lPtr + hPtr) / 2;
			// System.out.println("lPtr " + lPtr + " hPtr " + hPtr);
			// System.out.println("mid " + mid);
			mergeSort(lPtr, mid);
			mergeSort(mid + 1, hPtr);
			// merge(lPtr, hPtr);
		}
	}

	/**
	 * Merge.
	 * 
	 * @param lP
	 *            the l p
	 * @param hP
	 *            the h p
	 */
	private void merge(int lP, int hP) {
		int i = lP;
		int mP = (lP + hP) / 2;
		int middle = mP;
		int higher = mP + 1;
		while (lP <= middle && hP >= higher) {
			if (inSort[lP] < inSort[higher]) {
				outSort[i++] = inSort[lP++];
			} else {
				outSort[i++] = inSort[higher++];
			}
		}
		while (hP >= higher) {
			outSort[i++] = inSort[higher++];
		}
		while (lP <= middle) {
			outSort[i++] = inSort[lP++];
		}
		for (int j = 0; j < i; j++) {
			inSort[j] = outSort[j];
		}

	}

	/**
	 * Display.
	 */
	public void display() {
		for (int i = 0; i < outSort.length; i++) {
			System.out.print(outSort[i] + " ");
		}
		System.out.println();
	}

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		MergeSort mSort = new MergeSort(9);
		mSort.insert();
		mSort.display();
		mSort.mergeSort(0, 8);

		mSort.display();
	}
}
