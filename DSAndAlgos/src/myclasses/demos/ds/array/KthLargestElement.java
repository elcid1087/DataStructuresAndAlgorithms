/**
 * 
 */
package myclasses.demos.ds.arrays;

import java.util.Arrays;

// TODO: Auto-generated Javadoc
/**
 * The Class KthLargestElement.
 * 
 * @author shashi
 */
public class KthLargestElement {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = { 7, 10, 4,6, 3, 20, 15 };
		int k = 3;
		System.out.println("key " + k + " InputArray "
				+ Arrays.deepToString(arr));
		// kthLargestMergeSort(arr, k);
		kthLargestQuickSortApproach(arr, k);
		System.out.println("Output " + Arrays.deepToString(newArr));
		System.out.println("part "+ part);

	}
static int part ;
	/**
	 * Kth largest.
	 * 
	 * @param arr
	 *            the arr
	 * @param k
	 *            the k
	 */
	public static void kthLargestMergeSort(Integer[] arr, int k) {

		mergeSort(arr, k, 0, arr.length - 1);

	}

	/**
	 * Merge sort.
	 * 
	 * @param arr
	 *            the arr
	 * @param k
	 *            the k
	 * @param left
	 *            the left
	 * @param right
	 *            the right
	 */
	public static void mergeSort(Integer[] arr, int k, int left, int right) {

		if (left == right) {
			return;
		} else {
			int mid = (left + right) / 2;
			mergeSort(arr, k, left, mid);
			mergeSort(arr, k, mid + 1, right);
			merge(arr, k, left, mid, mid + 1, right);
		}

	}

	/** The new arr. */
	static Integer[] newArr = new Integer[6];

	/**
	 * Merge.
	 * 
	 * @param arr
	 *            the arr
	 * @param k
	 *            the k
	 * @param left
	 *            the left
	 * @param leftMid
	 *            the left mid
	 * @param rightMid
	 *            the right mid
	 * @param right
	 *            the right
	 */
	public static void merge(Integer[] arr, int k, int left, int leftMid,
			int rightMid, int right) {
		System.out.println("k " + k + " left " + left + " leftMid " + leftMid
				+ " rightMid " + rightMid + " right " + right);
		int i = left;
		while (true) {

			while (left > leftMid && rightMid <= right) {
				newArr[i++] = arr[rightMid++];
			}
			while (rightMid > right && left <= leftMid) {
				newArr[i++] = arr[left++];
			}

			if ((left > leftMid && rightMid > right)) {
				break;
			}
			if (arr[left] < arr[rightMid]) {
				newArr[i++] = arr[left++];
			} else {
				newArr[i++] = arr[rightMid++];
			}

		}
		for (int j = 0; j <= right; j++) {
			arr[j] = newArr[j];
		}
	}

	/**
	 * Kth largest quick sort approach.
	 * 
	 * @param arr
	 *            the arr
	 * @param k
	 *            the k
	 */
	public static void kthLargestQuickSortApproach(Integer[] arr, int k) {

		int i = kthSmallestQuickSelect(arr, k, 0, arr.length - 1);
		System.out.println(" index " + i + " val " + arr[part]);

	}

	/**
	 * Kth smallest quick select.
	 * 
	 * @param arr
	 *            the arr
	 * @param k
	 *            the k
	 * @param left
	 *            the left
	 * @param right
	 *            the right
	 * @return the int
	 */
	private static int kthSmallestQuickSelect(Integer[] arr, int k, int left,
			int right) {
		// TODO Auto-generated method stub

		if (left >= right) {
			return left;
		} else {
			// find pivot: considering it to be the last element of the array.
			int pivot = arr[right];
			// partition the array based on the pivot.
			int partition = selectPartition(arr, k, left, right, pivot);
			if (partition == arr.length - k - 1) {
				part = partition;
				return partition;
			} else {
				kthSmallestQuickSelect(arr, k, left, partition - 1);
				return kthSmallestQuickSelect(arr, k, partition + 1, right);
			}
		}

	}

	/**
	 * Select partition.
	 * 
	 * @param arr
	 *            the arr
	 * @param k
	 *            the k
	 * @param left
	 *            the left
	 * @param right
	 *            the right
	 * @param pivot
	 *            the pivot
	 * @return the int
	 */
	private static int selectPartition(Integer[] arr, int k, int left,
			int right, int pivot) {

		int l = left - 1;
		int r = right;

		while (true) {
			while (arr[++l] < pivot) {
				;
			}
			while (l < r && arr[--r] > pivot) {
				;
			}
			if (l >= r) {
				break;
			} else {
				// swap
				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
			}

		}
		int temp = arr[l];
		arr[l] = pivot;
		arr[right] = temp;

		return l;

	}

}
