/**
 * 
 */
package myclasses.demos.ds.arrays;

import java.util.Arrays;

// TODO: Auto-generated Javadoc
/**
 * Two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
 *
 * @author shashi
 */
public class InversionCount {
	
	/** The new arr. */
	static Integer[] newArr = null;
	
	/** The inv count. */
	static int invCount;
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 38, 27, 43, 3, 9, 82, 10 };
//		Integer[] arr = {2, 4, 1, 3, 5};
		newArr = new Integer[arr.length];
		mergeSort(arr);
		System.out.println("\nInteger "+ Arrays.deepToString(newArr));
		System.out.println("Inversion Count Using mergeSort "+ invCount);
		Integer[] arr1 = { 38, 27, 43, 3, 9, 82, 10 };
		inversionCountExhaustiveSearch(arr1);
		
	}

	
	/**
	 * Inversion count exhaustive search.
	 *
	 * @param arr the arr
	 */
	public static void inversionCountExhaustiveSearch(Integer[] arr){
		System.out.println("Inside inversionCountExhaustiveSearch");
		invCount = 0;
		int size = arr.length;
		System.out.print("Inversion pairs: ");
		for(int i=0;i<size-1;i++){
			int temp = arr[i];
			for(int j=i+1;j<size;j++){
				if(temp >arr[j]){
					invCount++;  
					System.out.print(" ("+temp+","+arr[j]+") ");
				}
			}
		}
		System.out.println("\nInversion Count Using inversionCountExhaustiveSearch "+ invCount);
	}
	
	/**
	 * Merge sort.
	 *
	 * @param arr the arr
	 */
	public static void mergeSort(Integer[] arr) {
		System.out.println("Inside mergeSort");
		System.out.println("Two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j");
		System.out.print("Inversion pairs: ");
		mergeSort(arr, 0, arr.length - 1);
	}

	/**
	 * Merge sort.
	 *
	 * @param arr the arr
	 * @param leftIndex the left index
	 * @param rightIndex the right index
	 * @return the int
	 */
	public static int mergeSort(Integer[] arr, int leftIndex, int rightIndex) {
		if (leftIndex == rightIndex) {
			return leftIndex;
		} else {
			int mid = (leftIndex + rightIndex) / 2;

//			System.out.println("leftIndex " + leftIndex + " mid " + mid);
			mergeSort(arr, leftIndex, mid);
			mergeSort(arr, mid + 1, rightIndex);
			mergeSubarrays(arr, leftIndex, mid, mid + 1, rightIndex);
			return rightIndex;
		}

	}

	/**
	 * Merge subarrays.
	 *
	 * @param arr the arr
	 * @param leftIndex the left index
	 * @param mid the mid
	 * @param i the i
	 * @param rightIndex the right index
	 */
	private static void mergeSubarrays(Integer[] arr, int leftIndex, int mid, int i,
			int rightIndex) {
		// TODO Auto-generated method stub
//		System.out.println("leftIndex " + leftIndex + " mid " + mid + " mid+1 "
//				+ i + " rightIndex " + rightIndex);
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
				invCount += (mid-leftIndex)+1;
				for(int in=leftIndex;in<=mid;in++){
					System.out.print(" ("+arr[in]+","+arr[i]+") ");
				}
				newArr[l++]=arr[i++];
			}
		}
		for(int j=0;j<l;j++){
			arr[j] = newArr[j];
		}
	}
}
