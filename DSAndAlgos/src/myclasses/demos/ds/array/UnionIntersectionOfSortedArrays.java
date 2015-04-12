/**
 * 
 */
package myclasses.demos.ds.arrays;

import java.util.Arrays;

// TODO: Auto-generated Javadoc
/**
 * The Class UnionIntersectionOfSortedArrays.
 * 
 * @author shashi
 */
public class UnionIntersectionOfSortedArrays {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr1 = { 1, 3, 4, 5, 7 };
		Integer[] arr2 = { 2, 3, 5, 6 };
		findUnionIntersection(arr1, arr2);
	}

	/**
	 * Find union intersection.
	 * 
	 * @param arr1
	 *            the arr1
	 * @param arr2
	 *            the arr2
	 */
	public static void findUnionIntersection(Integer[] arr1, Integer[] arr2) {
		int l = 0, r = 0;
		int lm = arr1.length - 1;
		int rm = arr2.length - 1;
		Integer[] union = new Integer[lm + rm + 2];
		Integer[] intersection = new Integer[lm + rm];
		int u = 0;
		int i = 0;
		while (true) {
			while (l > lm && r <= rm) {
				union[u++] = arr2[r++];
			}
			while (r > rm && l <= lm) {
				union[u++] = arr1[l++];
			}
			if (l > lm && r > rm) {
				break;
			}
			if (arr1[l] < arr2[r]) {
				union[u++] = arr1[l++];
			} else if (arr2[r] < arr1[l]) {
				union[u++] = arr2[r++];
			} else if (arr1[l] == arr2[r]) {
				union[u++] = arr1[l++];
				intersection[i++] = arr2[r++];
			}
			// while(l<=lm&&arr1[l]<arr2[r]){
			// union[u++] = arr1[l++];
			// }
			// while(r<=rm && arr2[r]<arr1[l]){
			// union[u++] = arr2[r++];
			// }
			// while((l<=lm&&r<=rm)&&arr1[l] == arr2[r]){
			// union[u++] = arr1[l++];
			// intersection[i++] = arr2[r++];
			// }
		}
		System.out.println("Intersecton " + Arrays.deepToString(intersection));
		System.out.println("Union " + Arrays.deepToString(union));
	}

}
