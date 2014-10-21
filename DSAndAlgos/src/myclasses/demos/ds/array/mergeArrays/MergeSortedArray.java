package myclasses.demos.ds.array.mergeArrays;

// TODO: Auto-generated Javadoc
/**
 * The Class MergeSortedArray. Problem: Merge two sorted arrays.
 */
public class MergeSortedArray {

	/** The Constant array1. */
	private static final int[] array1 = { 1, 2, 3, 4 };

	/** The Constant array2. */
	private static final int[] array2 = { 5, 6, 7, 8, 9, 10 };

	/** The out array lenght. */
	private final int outArrayLenght = array1.length + array2.length;

	/** The out array. */
	private final int[] outArray = new int[outArrayLenght];

	/**
	 * Merge sorted array.
	 * 
	 * @param array1
	 *            the array1
	 * @param array2
	 *            the array2
	 */
	public void mergeSortedArray(int[] array1, int[] array2) {

		int index1 = 0;
		int index2 = 0;
		int outIndex = 0;
		while (index1 < array1.length && index2 < array1.length) {

			if (array1[index1] <= array2[index2]) {
				outArray[outIndex++] = array1[index1++];
			} else {
				outArray[outIndex++] = array2[index2++];
			}

		}
		while (index1 < array1.length) {
			outArray[outIndex++] = array2[index1++];
		}
		while (index2 < array2.length) {
			outArray[outIndex++] = array2[index2++];
		}

	}

	/**
	 * Display out.
	 */
	public void displayOut() {
		for (int i = 0; i < outArrayLenght; i++) {
			System.out.print(" " + outArray[i]);
		}
	}

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		MergeSortedArray merge = new MergeSortedArray();
		merge.mergeSortedArray(array1, array2);
		merge.displayOut();
	}

}
