/**
 * 
 */
package myclasses.demos.ds.arrays;

import java.util.Arrays;

/**
 * @author shashi
 * 
 */
public class MergeSort {
	static Integer[] newArr = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 38, 27, 43, 3, 9, 82, 10 };
//		Integer[] arr = {2, 4, 1, 3, 5};
		newArr = new Integer[arr.length];
		mergeSort(arr);
		System.out.println("\nInteger "+ Arrays.deepToString(newArr));
	}

	public static void mergeSort(Integer[] arr) {
		System.out.println("Inside mergeSort");
		mergeSort(arr, 0, arr.length - 1);
	}

	public static int mergeSort(Integer[] arr, int leftIndex, int rightIndex) {
		if (leftIndex == rightIndex) {
			return leftIndex;
		} else {
			int mid = (leftIndex + rightIndex) / 2;

			System.out.println("leftIndex " + leftIndex + " mid " + mid);
			mergeSort(arr, leftIndex, mid);
			mergeSort(arr, mid + 1, rightIndex);
			mergeSubarrays(arr, leftIndex, mid, mid + 1, rightIndex);
			return rightIndex;
		}

	}
	private static void mergeSubarrays(Integer[] arr, int leftIndex, int mid, int i,
			int rightIndex) {
		// TODO Auto-generated method stub
		System.out.println("leftIndex " + leftIndex + " mid " + mid + " mid+1 "
				+ i + " rightIndex " + rightIndex);
		int l = leftIndex;
		while (true) {
			
			while(leftIndex > mid&&i<=rightIndex){
				newArr[l++]=arr[i++];
			}
			while(i>rightIndex&&leftIndex<=mid){
				newArr[l++]=arr[leftIndex++];
			}
			
			if(leftIndex > mid&&i>rightIndex){
				break;
			}
			
			if(arr[leftIndex]<arr[i]){
				newArr[l++]=arr[leftIndex++];
			}else{
				newArr[l++]=arr[i++];
			}
		}
		for(int j=0;j<l;j++){
			arr[j] = newArr[j];
		}
	}
}
