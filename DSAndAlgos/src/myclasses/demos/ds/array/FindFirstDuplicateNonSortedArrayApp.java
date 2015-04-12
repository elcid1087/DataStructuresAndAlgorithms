/**
 * 
 */
package myclasses.demos.ds.arrays;

// TODO: Auto-generated Javadoc
/**
 * The Class FindFirstDuplicateApp.
 *
 * @author shashi
 */
public class FindFirstDuplicateNonSortedArrayApp {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr1 = { 3, 2, 1, 5, 4, 3 };
		int[] arr1 = { 0, 4, 1, 5, 2, 3 };
		int duplicateElem = findFirstDuplicateBruteForce(arr1);
		//if duplicateElem is -1 that implies array doesnt contains duplicate elements.
		System.out.println("duplicate Elemnt BruteForce " + duplicateElem);
		int duplicateElemHashtable = findFirstDuplicateHashtable(arr1);
		if(duplicateElemHashtable>arr1.length){
			System.out.println("no duplicate elements");
		}else
		System.out.println("duplicate Elemnt hashtable index is: " + duplicateElemHashtable);
		
	}
	
	/**
	 * Find duplicate brute force, exhaustively searching the array for
	 * duplicate element. Time Complexity = O(n*n); Space Complexity = O(1);
	 *
	 * @param arr the arr
	 * @return array element
	 */
	public static int findFirstDuplicateBruteForce(int[] arr) {
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
	 * Find first duplicate using hashtable. Instead of setting the value in the hashtable set the index of the 
	 * hashtable and make the index negative, indicating the index has been visited.
	 *
	 * @param arr the arr
	 * @return the int
	 */
	public static int findFirstDuplicateHashtable(int[] arr){

		int size = arr.length;
		int[] hashtable = new int[size];
		for(int i=0;i<size;i++){
			int hashFunction = arr[i]%size;
			if(hashtable[hashFunction]==0){
			hashtable[hashFunction]= (i+1);
			}else{
				hashtable[hashFunction]=negate(hashtable[hashFunction]);
			}
		}
		int min = size+1;
		for(int j=0;j<hashtable.length;j++){
			int absValue= Math.abs(hashtable[j]);
			if(hashtable[j]<0&&min>absValue){
				min =j;
			}
		}
		return min;
	}
	
	/**
	 * Negate.
	 *
	 * @param i the i
	 * @return the int
	 */
	public static int negate(int i){
		return i>=0?-i:i;
	}
	
}
