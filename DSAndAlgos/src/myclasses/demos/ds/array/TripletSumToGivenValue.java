package myclasses.demos.ds.arrays;

import myclasses.demos.ds.dp.SortedArrayPair;

// TODO: Auto-generated Javadoc
/**
 * The Class TripletSumToGivenValue.
 */
public class TripletSumToGivenValue {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		int[] a = { 1, 4, 45, 6, 10, 8 };// 22
		// int[] a = {12, 3, 4, 1, 6, 7};//24
		tripletSumToAValue(a, 22);
		int[] b = { 1, 4, 6, 8, 10, 45 };// 22
		sortedArrayTripletSumToValue(b, 22);
		enhancedSortedArrayTripletSumToValue(b, 22);
		partitionSortedArrayTripletSumToValue(b, 22);
	}

	/**
	 * Triplet sum to a value. Exhaustively searching all the possible combinations.
	 * * Time Complexity = O(n*n*n); 
	 * Space Complexity = O(1);
	 *
	 * @param a the a
	 * @param x the x
	 */
	public static void tripletSumToAValue(int[] a, int x) {
		System.out.println("Inside tripletSumToAValue");
		int sum = 0;
		int arrayLen = a.length;
		for (int i = 0; i < arrayLen - 2; i++) {
			sum = x - a[i];
			if (sum > 0) {
				for (int j = i + 1; j < arrayLen - 1; j++) {
					sum = sum - a[j];
					if (sum > 0) {
						for (int k = j + 1; k < arrayLen; k++) {
							sum = sum - a[k];
							if (sum == 0) {
								System.out.println("true--> " + a[i] + ","
										+ a[j] + "," + a[k]);
								return;
							}
							sum = sum + a[k];
						}
					}
					sum = sum + a[j];
				}
			}
			sum = sum + a[i];
		}
		System.out.println("End tripletSumToAValue");
	}

	// method2 send sortedArray and use leftPointer and rightPointer concept
	/**
	 * Sorted array triplet sum to value. Use pointer left, middle and right concept. first take the left element and check with all the possible combinations of middle and right elements.
	 * if sum is greater decrease the right elements index, else if sum is less increase the middle elements index and if the sum == key then print the combination.
	 * * Time Complexity = O(n*n); 
	 * Space Complexity = O(1);
	 *
	 * @param a the a
	 * @param x the x
	 */
	public static void sortedArrayTripletSumToValue(int[] a, int x) {
		System.out.println("Inside sortedArrayTripletSumToValue");
		int sum = 0;
		int arrayLen = a.length;
		int leftPointer = 0;
		int middlePointer = 0;
		int rightPointer = arrayLen - 1;
		int innerSum = 0;
		for (int i = 0; i < arrayLen; i++) {

		}

		while (middlePointer < rightPointer) {
			middlePointer = leftPointer + 1;
			sum = x - (a[leftPointer] + a[middlePointer] + a[rightPointer]);
			if (sum == 0) {
				System.out.println("Print values");
				break;
			}
			if (sum < 0) {
				rightPointer--;
			} else {
				middlePointer++;
			}
			while (middlePointer < rightPointer) {
				innerSum = x
						- (a[leftPointer] + a[middlePointer] + a[rightPointer]);
				if (innerSum == 0) {
					System.out.println("Print values" + a[leftPointer]
							+ a[middlePointer] + a[rightPointer]);
					return;
				}
				if (innerSum < 0) {
					rightPointer--;
				} else {
					middlePointer++;
				}
			}

			if (innerSum > 0) {
				leftPointer++;
			}
			middlePointer = leftPointer + 1;
		}
		System.out.println("End sortedArrayTripletSumToValue");
	}

	/**
	 * Sorted array triplet sum to value. Use pointer left, middle and right concept. first take the left element and check with all the possible combinations of middle and right elements.
	 * if sum is greater decrease the right elements index, else if sum is less increase the middle elements index and if the sum == key then print the combination.
	 * * Time Complexity = O(n*n); 
	 * Space Complexity = O(1);
	 *
	 * @param a the a
	 * @param x the x
	 */
	public static void enhancedSortedArrayTripletSumToValue(int[] a, int x) {
		System.out.println("Inside enhansedSortedArrayTripletSumToValue");
		int sum = 0;
		int arrayLen = a.length;
		int leftPointer = 0;
		int middlePointer = 0;
		int rightPointer = arrayLen - 1;

		while (middlePointer < rightPointer) {
			middlePointer = leftPointer + 1;
		int iRightPointer = rightPointer;
			while (middlePointer < iRightPointer) {
				sum = (a[leftPointer] + a[middlePointer] + a[iRightPointer]);
				
				if (sum == x) {
					System.out.println("Print values" + a[leftPointer]
							+ a[middlePointer] + a[iRightPointer]);
					return;
				}
				if (sum > x) {
					iRightPointer--;
				} else {
					middlePointer++;
				}
			}
			middlePointer = leftPointer+1;
			leftPointer++;
		}
		System.out.println("End sortedArrayTripletSumToValue");
	}
	
	
	
	/**
	 * Partition sorted array triplet sum to value. Divide the array into half and for every element of the first half array check the combinations in the other array.
	 * * Time Complexity = O(n*n); 
	 * Space Complexity = O(n/2);
	 * @param a the a
	 * @param x the x
	 */
	public static void partitionSortedArrayTripletSumToValue(int[] a, int x) {
		System.out.println("Inside partitionSortedArrayTripletSumToValue");
		int halfArrayIndex = a.length / 2;
		int sum=0;
		int[] newArray = new int[halfArrayIndex];
		int k =0;
		for(int i=halfArrayIndex;i<a.length;i++){
			newArray[k++]=a[i];
		}
		for(int j=0;j<halfArrayIndex;j++){
			sum = x-a[j];
			boolean  foundPair=SortedArrayPair.closestPair(newArray, sum);
			if(foundPair){
				System.out.print("newArray["+j+"]-> " + a[j]);
				return;
			}
		}
		
		
		
	}

}
