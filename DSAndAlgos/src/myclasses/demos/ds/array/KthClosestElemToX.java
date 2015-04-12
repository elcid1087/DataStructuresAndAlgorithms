/**
 * 
 */
package myclasses.demos.ds.arrays;

// TODO: Auto-generated Javadoc
/**
 * Q: Find k closest elements to a given value?.
 * 
 * @author shashi
 */
public class KthClosestElemToX {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56 };
		findKthClosest(arr, 41, 4);
	}

	/**
	 * Find kth closest.
	 * 
	 * @param arr
	 *            the arr
	 * @param key
	 *            the key
	 * @param k
	 *            the k
	 */
	public static void findKthClosest(Integer[] arr, int key, int k) {

		// find the crossover point, can be done in two ways
		// i) using linear search: find an elem which is <= to X
		// ii) Binary search
		int size = arr.length;
		int crossoverIndex = findCrossoverBinarySearch(arr, key);
		// int crossoverIndex = findCrossoverLinearSearch(arr, key);

		System.out.println("crossover " + crossoverIndex);
		int leftPtr = -1;
		int rightPtr = -1;
		
///******Optional
		if (crossoverIndex == -1) {
			// return first four
			for (int i = 0; i < k; i++) {
				System.out.print(" " + arr[i]);
			}
			return;
		} else if (crossoverIndex == size - 1) {
			// return last four
			for (int i = size - 1; i > size - 1 - k; i--) {
				System.out.print(" " + arr[i]);
			}
			return;
		}
///******Optional
		
		if (arr[crossoverIndex] == key) {
			leftPtr = crossoverIndex - 1;
			rightPtr = crossoverIndex + 1;
		} else {
			leftPtr = crossoverIndex - 1;
			rightPtr = crossoverIndex;
		}
		Integer[] closeArray = new Integer[k];
		int i = 0;

		while (!((leftPtr < 0 && rightPtr > size - 1) || i == k)) {

			if ((key - arr[leftPtr]) <= (arr[rightPtr] - key)) {
				closeArray[i++] = arr[leftPtr--];
			} else {
				closeArray[i++] = arr[rightPtr++];
			}
			// when index reaches maximum or minimum
			while (leftPtr < 0 && rightPtr <= size - 1 && i < k) {
				closeArray[i++] = arr[rightPtr++];
			}
			while (rightPtr > size - 1 && leftPtr >= 0 && i < k) {
				closeArray[i++] = arr[leftPtr--];
			}
		}

		System.out.println("CloseArray :");
		for (int j = 0; j < i; j++) {
			System.out.print(" " + closeArray[j]);
		}

	}

	/**
	 * Find crossover, Linear approach.
	 * 
	 * @param arr
	 *            the arr
	 * @param key
	 *            the key
	 * @return the int
	 */
	public static int findCrossoverLinearSearch(Integer[] arr, int key) {
		int crossoverIndex = -1;
		if (arr[0] >= key) {
			return 0;
		}

		int size = arr.length;
		if (arr[size - 1] < key) {
			return size - 1;
		}
		for (int i = 0; i < size; i++) {
			if (arr[i] == key) {
				crossoverIndex = i;
			} else if (true) {

			}
		}
		return crossoverIndex;
	}

	/**
	 * Find crossover binary search.
	 * 
	 * @param arr
	 *            the arr
	 * @param key
	 *            the key
	 * @return the int
	 */
	public static int findCrossoverBinarySearch(Integer[] arr, int key) {
		int size = arr.length;
		int leftIndex = 0;
		int rightIndex = size - 1;

		while (leftIndex <= rightIndex) {

			if (arr[0] > key) {
				return -1;
			}

			if (arr[size - 1] < key) {
				return size - 1;
			}

			int mid = (leftIndex + rightIndex) / 2;

			if (arr[mid] == key) {
				return mid;
			} else if ((int) arr[mid] > key && arr[mid - 1] < key) {
				if (key - arr[mid - 1] < arr[mid] - key) {
					return mid - 1;
				} else {
					return mid;
				}
			}

			if (arr[mid] < key) {
				leftIndex = mid + 1;
			} else {
				rightIndex = mid - 1;
			}

		}

		return -1;

	}
}
