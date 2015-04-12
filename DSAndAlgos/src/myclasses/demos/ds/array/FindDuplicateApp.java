package myclasses.demos.ds.arrays;

// TODO: Auto-generated Javadoc
/**
 * The Class FindDuplicateApp. Solution for: Given an array of numbers. Give an
 * algorithm for checking whether there are any duplicated elements in the array
 * or not?
 * 
 * @author shashi
 */
public class FindDuplicateApp {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr1 = { 3, 2, 1, 5, 4, 0 };
		int[] arr1 = { 3, 2, 1, 2, 2, 3 };
		int duplicateElem = findDuplicateBruteForce(arr1);
		System.out.println("duplicate Elemnt BruteForce " + duplicateElem);
		int[] arr2 = { 1, 2, 2, 2, 3, 3 };
		int duplicateSortApproach = findDuplicateSortedArrayApproach(arr2);
		System.out.println("duplicate element Sorted Approach "
				+ duplicateSortApproach);
		int duplicateHashtableApproach = findDuplicateHashtableApproach(arr1);
		System.out.println("duplicate element Hashtable Approach "+duplicateHashtableApproach);
		int duplicateSpecial = findDuplicateSpecialCase(arr1);
		System.out.println("duplicate element Special Approach "+duplicateSpecial);
	}

	/**
	 * Find duplicate brute force, exhaustively searching the array for
	 * duplicate element. Time Complexity = O(n*n); Space Complexity = O(1);
	 * 
	 * @param arr
	 * @return array element
	 */
	public static int findDuplicateBruteForce(int[] arr) {
		int size = arr.length;
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] == arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
	}

	/**
	 * Find duplicate sorted array approach. In this approach the array is
	 * sorted, this arranges all the duplicate elements adjacent to each other.
	 * Now compare the adjacent elements. 
	 * Time Complexity = O(nlogn)+O(n) = O(nlogn); 
	 * Space Complexity = O(1);
	 * 
	 * @param arr
	 *            the arr
	 * @return array element
	 */
	public static int findDuplicateSortedArrayApproach(int[] arr) {
		// assuming the array is sorted or can be sorted using any of the
		// sorting technique. Presuming it is QuickSort

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				return arr[i];
			}
		}
		return -1;
	}

	
		
	/**
	 * Find duplicate hash table approach.
	 * In this approach an extra hashtable is used to store the array elements, if the hashtable is empty insert into it, 
	 * if not it implies that same element is already present in the table. This approach requires an extra space.
	 * Time Complexity = O(n); 
	 * Space Complexity = O(n);
	 *
	 * @param arr the arr
	 * @return array element
	 */
	public static int findDuplicateHashtableApproach(int[] arr) {
		int size = arr.length;
		int[] hashtable = new int[size];
		for(int i=0;i<size;i++){
			int hashFunction = arr[i]%size;
			if(hashtable[hashFunction]==0){
			hashtable[hashFunction]= arr[i];
			}else{
				return arr[i];
			}
		}
		return -1;
	}
	
	/**
	 * Find duplicate special case.
	 * Assuming that the elements range falls between [0 to n-1], we can achieve the following complexities
	 * Time Complexity = O(n); 
	 * Space Complexity = O(1);
	 * @param arr the arr
	 * @return array element
	 */
	public static int findDuplicateSpecialCase(int[] arr){
		//Another approach is to make the arr[arr[i]] element negative first time when we visit that index, and check if the value is negative. 
		for(int i=0;i<arr.length;){
			if(arr[i]==i){
				i++;
			}else {
				if(arr[arr[i]]==arr[i]){
				return arr[i];
				}
				//swap
				int temp = arr[i];
				arr[i] = arr[temp];
				arr[temp] = temp;
			}
		}
		
		return -1;
		
	}
	

}
