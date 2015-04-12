/**
 * 
 */
package myclasses.demos.ds.arrays;

// TODO: Auto-generated Javadoc
/**
 * The Class MaximumOccurancesInArray.
 *
 * @author shashi
 */
public class MaximumOccurancesInArray {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = { 1, 2, 2, 3, 5, 2 };
		int max = findMaxOccuranceBruteForce(arr1);
		System.out.println(" max "+ max);
		int maxHash = findMaxOccuranceHashtable(arr1);
		System.out.println(" maxHash "+ maxHash);
		int[] arr2 = { 1, 2, 2, 2, 2, 3,3,3,3,3,5,5,5 };
		int maxSort = findMaxOccuranceSortApproach(arr2);
		System.out.println("maxSort "+ maxSort);
	}
	
	/**
	 * Find max occurance brute force.
	 *
	 * @param arr the arr
	 * @return the int
	 */
	public static int findMaxOccuranceBruteForce(int[] arr){
		
		int maxOcc = 1;
		int size = arr.length;
		for(int i=0;i<size-1;i++){
			int individualMax = 1;
			for(int j=i+1;j<size;j++){
				if(arr[i]==arr[j]){
					individualMax++;
				}
			}
			if(individualMax>maxOcc){
				maxOcc = individualMax;
			}
		}
		return maxOcc;
	}
	
	/**
	 * Find max occurance hashtable.
	 *
	 * @param arr the arr
	 * @return the int
	 */
	public static int findMaxOccuranceHashtable(int[] arr){
		
		int size = arr.length;
		int[] hashtable = new int[size];
		for(int i=0;i<size;i++){
			int hash = arr[i]%size;
			hashtable[hash]++;
		}
		int max = 0;
		for(int j=0;j<size;j++){
			if(hashtable[j]>max){
				max = hashtable[j];
			}
		}
		return max;
	}
	
	/**
	 * Find max occurance sort approach.
	 *
	 * @param arr the arr
	 * @return the int
	 */
	public static int findMaxOccuranceSortApproach(int[] arr){
		
		int maxOcc = 1;
		int tempMax = 1;
		for(int i=0;i<arr.length-1;i++){
			
			if(arr[i]==arr[i+1] ){
				tempMax++;
				if(maxOcc<tempMax){
					maxOcc = tempMax;
				}
			}else{
				tempMax = 1;
			}
		}
		return maxOcc;
	}

	
	
}
