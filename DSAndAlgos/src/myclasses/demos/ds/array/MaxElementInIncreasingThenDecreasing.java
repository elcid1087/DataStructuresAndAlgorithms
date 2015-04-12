package myclasses.demos.ds.arrays;

import java.util.Arrays;

// TODO: Auto-generated Javadoc
/**
 * The Class MaxElementInIncreasingThenDecreasing.
 */
public class MaxElementInIncreasingThenDecreasing {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Integer[] arr = { 8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1 };
		int max = findMax(arr);
		int maxi = findMaxi(arr);
		System.out.println("array: " + Arrays.deepToString(arr) + "   max "
				+ max + " maxi " + maxi);
		for (int r = 0; r <= max; r++) {
			// rotation times
			// for(int i=0;i<1;i++){
			// rotate array
			int j = 0;
			int temp = arr[j];
			for (; j < max; j++) {
				arr[j] = arr[j + 1];
			}
			arr[j] = temp;
			// }
			max = findMax(arr);
			maxi = findMaxi(arr);
			System.out.println("array: " + Arrays.deepToString(arr) + "   max "
					+ max + " maxi " + maxi);
			r = 0;
		}
		Integer[] arr1 = { 1, 2, 3, 8, 10, 20, 80, 100, 200, 400, 500 };
		max = findMax(arr1);
		maxi = findMaxi(arr1);
		System.out.println("array: " + Arrays.deepToString(arr1) + "   max "
				+ max + " maxi " + maxi);
	}

	/**
	 * Find max.
	 * 
	 * @param arr
	 *            the arr
	 * @return the int
	 */
	public static int findMax(Integer[] arr) {
		// first increasing and then decreasing
		int arrLength = arr.length - 1;
		int left = 0;
		int right = arrLength;
		// corner case 1: No decreasing
		if (arr[arrLength] > arr[0]) {
			return arrLength;
		}
		// corner case 2: No increasing
		if (arr[0] > arr[1]) {
			return 0;
		}
		while (right >= left) {

			int mid = (left + right) / 2;

			if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
				return mid;

			}
			if (arr[mid] > arr[mid + 1]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return -1;
	}

	/**
	 * Find maxi.
	 *
	 * @param arr the arr
	 * @return the int
	 */
	public static int findMaxi(Integer[] arr) {
		// first increasing and then decreasing
		int arrLength = arr.length - 1;
		int left = 0;
		int right = arrLength;
		// corner case 1: No decreasing
		if (arr[arrLength] > arr[0]) {
			return arrLength;
		}
		// corner case 2: No increasing
		if (arr[0] > arr[1]) {
			return 0;
		}
		while (right >= left) {

			int mid = (left + right) / 2;

			if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
				return mid;

			}
			if (arr[mid] >= arr[0]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return -1;
	}

	public static int findKey(int[] arr, int key){
		//TODO implement this!!!!
		
		return -1;
	}
	
}
