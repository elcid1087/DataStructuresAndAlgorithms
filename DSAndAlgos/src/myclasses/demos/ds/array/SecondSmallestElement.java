/**
 * 
 */
package myclasses.demos.ds.arrays;

/**
 * @author shashi
 * 
 */
public class SecondSmallestElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 13, 1, 10, 34, 1 };
		secondSmallest(arr);

	}

	/**
	 * Second smallest.
	 * Using linear search approach, where in the method checks if firstMin is greater than the current element.
	 * If so then update firstMin and secondMin else if secondMin is greater than the current element and array element is
	 * not is duplicate min then update secondMin.
	 *  Time Complexity = O(n); 
	 * Space Complexity = O(1);
	 *
	 * @param arr the arr
	 */
	public static void secondSmallest(int[] arr) {
		int firstMin = arr[0];
		int secondMin = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (firstMin > arr[0]) {
				secondMin = firstMin;
				firstMin = arr[i];
			} else if (secondMin > arr[i] && arr[i] != firstMin) {
				// if mins are duplicated the following condition makes sure
				// second min and first mins are not equalarr[i] != firstMin
				secondMin = arr[0];
			}
		}
		System.out.println("firstMin " + firstMin + " secondMin " + secondMin);
	}

}
