/**
 * 
 */
package myclasses.demos.ds.arrays;

import myclasses.demos.ds.misc.Partition;

// TODO: Auto-generated Javadoc
/**
 * The Class MinUnsortedSubarray.
 * 
 * @author shashi
 */
public class MinUnsortedSubarray {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Integer[] arr = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
		// Integer[] arr = {0, 1, 15, 25, 6, 7, 30, 40, 50};
		Integer[] arr = { 0, 1, 7, 6,15, 25, 5, 40, 50 };
		minSubarray(arr);
	}

	/**
	 * Min subarray.
	 * 
	 * @param arr
	 *            the arr
	 */
	public static void minSubarray(Integer[] arr) {
		int size = arr.length;
		int leftMin = -1;
		int rightMin = -1;
		for (int i = 0; i < size - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				System.out.println("i " + i);
				leftMin = i;
				break;
			}
		}
		for (int j = size - 1; j > 0; j--) {
			if (arr[j] < arr[j - 1]) {
				rightMin = j;
				break;
			}
		}

		if (leftMin < rightMin) {
			// sort the subArray
			Partition.quickSort(arr, leftMin, rightMin);
		} else {
			System.out.println("subArray index startIndex" + leftMin
					+ " endIndex " + rightMin);
			return;
		}
		int subArrayMin = arr[leftMin];
		int subArrayMax = arr[rightMin];
		System.out.println("Intermediate subArray index startIndex" + leftMin + " endIndex "
				+ rightMin);
		System.out.println("min " + subArrayMin + " max " + subArrayMax);

		int startIndex = 0;
		int endIndex = 0;
		for (int i = 0; i < size - 1; i++) {
			if (arr[i] >= subArrayMin) {
				startIndex = i;
				break;
			}
		}
		for (int j = size - 1; j > startIndex; j--) {
			if (arr[j] <= subArrayMax) {
				endIndex = j;
				break;
			}
		}
		System.out
				.println("StartIndex " + startIndex + " EndIndex " + endIndex);
		System.out.print("Unsorted subArray :");
		for (int i = startIndex; i <= endIndex; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println("");
	}

}
