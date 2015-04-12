/**
 * 
 */
package myclasses.demos.ds.arrays;

import java.util.Arrays;

// TODO: Auto-generated Javadoc
/**
 * The Class RearrangePositiveNegative.
 * 
 * @author shashi
 */
public class RearrangePositiveNegative {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Integer[] arr = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
		Integer[] arr = { -1, -2, -3, -4, -5, -6 };
		int pivot = 0;
		rearrange(arr);
		System.out.println("array " + Arrays.deepToString(arr));
	}

	/**
	 * Rearrange.
	 * 
	 * @param arr
	 *            the arr
	 */
	public static void rearrange(Integer[] arr) {

		int left = -1;
		int pivot = 0;
		int right = partition(arr, pivot);
		System.out.println("right " + right);
		while (true) {

			while (left < right && ++left % 2 == 0 && arr[left] < pivot) {
				;
			}
			if (left >= right || right >= arr.length) {
				break;
			} else {
				// swap
				swap(arr, left, right++);

			}
		}
	}

	/**
	 * Partition.
	 * 
	 * @param arr
	 *            the arr
	 * @param pivot
	 *            the pivot
	 * @return the int
	 */
	public static int partition(Integer[] arr, int pivot) {

		int left = -1;
		int right = arr.length;

		while (true) {

			while (left < right - 1 && arr[++left] < pivot) {
				;
			}

			while (left < right && arr[--right] > pivot) {
				;
			}
			if (left >= right) {
				break;
			} else {
				// swap
				swap(arr, left, right);
			}

		}

		return left;
	}

	/**
	 * Swap.
	 * 
	 * @param arr
	 *            the arr
	 * @param left
	 *            the left
	 * @param right
	 *            the right
	 */
	public static void swap(Integer[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}

}
