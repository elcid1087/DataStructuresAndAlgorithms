/**
 * 
 */
package myclasses.demos.ds.arrays;

// TODO: Auto-generated Javadoc
/**
 * The Class BinearySearchAlmostSortedArray.
 * 
 * @author shashi
 */
public class BinearySearchAlmostSortedArray {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 10, 3, 40, 20, 50, 80, 70 };
		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			int index = binarySearch(arr, key);
			System.out.println("key " + key + " index " + index);
		}

	}

	/**
	 * Binary search.
	 * 
	 * @param arr
	 *            the arr
	 * @param key
	 *            the key
	 * @return the int
	 */
	public static int binarySearch(Integer[] arr, int key) {

		return binarySearch(arr, key, 0, arr.length - 1);
	}

	/**
	 * Binary search, Logic is same as binary search plus some additional
	 * checks. Additional checks are, the array is not completely sorted and can
	 * fall at the left of its ideal position or to the right. So after checking
	 * the key at the mid position, check also at its adjacent positions.
	 * Time Complexity = O(logn); 
	 * Space Complexity = O(1);
	 * 
	 * 
	 * @param arr
	 *            the arr
	 * @param key
	 *            the key
	 * @param left
	 *            the left
	 * @param right
	 *            the right
	 * @return the int
	 */
	public static int binarySearch(Integer[] arr, int key, int left, int right) {

		if (left > right) {
			return -1;
		}

		int mid = (left + right) / 2;

		if (arr[mid] == key) {
			return mid;
		}
		if (mid > left && arr[mid - 1] == key) {
			return mid - 1;
		} else if (mid < right && arr[mid + 1] == key) {
			return mid + 1;
		}

		if (arr[mid] < key) {
			return binarySearch(arr, key, mid + 1, right);
		} else {
			return binarySearch(arr, key, left, mid - 1);
		}

	}

}
