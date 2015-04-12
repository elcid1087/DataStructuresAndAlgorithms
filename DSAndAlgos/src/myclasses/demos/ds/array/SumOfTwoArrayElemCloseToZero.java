/**
 * 
 */
package myclasses.demos.ds.arrays;

// TODO: Auto-generated Javadoc
/**
 * The Class SumOfTwoArrayElemCloseToZero.
 *
 * @author shashi
 */
public class SumOfTwoArrayElemCloseToZero {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {	1,60, -10,		70,	 -80,		85};
		pairsClosetToZeroBruteForce(arr);
		int[] arr1 = {-80,-10,1,60,70,85};
		pairsClosetToZeroSortApproach(arr1);
	}
	
	
	/**
	 * Pairs closet to zero. Exhaustively search for the pairs having minimum sum.
	 ** Time Complexity = O(n*n); 
	 * Space Complexity = O(1);
	 * @param arr the arr
	 */
	public static void pairsClosetToZeroBruteForce(int[] arr){
		int min =Math.abs(arr[0]+arr[1]);
		int size = arr.length;
		int index1 = 0;
		int index2 = 1;
		for(int i=0;i<size-1;i++){
			for(int j=i+1;j<size;j++){
				int sum = Math.abs(arr[i]+arr[j]);
				if(sum<min){
					min = sum;
					index1 = i;
					index2 = j;
				}
			}
		}
		System.out.println(" val1: "+ arr[index1] + " val2: "+ arr[index2] + " min: "+min);
	}
	
	/**
	 * Pairs closet to zero sort approach. In this approach have two pointer, one starting from start of the array and another one starting from end of an array.
	 * compare first and last elements, if it is greater than the min reduce last index, if it is smaller than min replace the min value and increase first index. 
	 * Time Complexity = O(n);--> if the array is sorted or else it would be O(nlogn) + O(n) = O(nlogn);  
	 * Space Complexity = O(1);
	 * @param arr the arr
	 */
	public static void pairsClosetToZeroSortApproach(int[] arr){
		int leftIndex = 0;
		int rightIndex = arr.length-1;
		int min =Math.abs(arr[0]+arr[1]);
		int index1 = 0;
		int index2 = 1;
		while(rightIndex >leftIndex){
			int sum = Math.abs(arr[leftIndex] + arr[rightIndex]);
			if(sum>min){
				rightIndex--;
			}else if(sum<=min){
				min = sum;
				index1 = leftIndex;
				index2 = rightIndex;
				leftIndex++;
			}
		}
		System.out.println(" val1: "+ arr[index1] + " val2: "+ arr[index2] + " min: "+min);
		System.out.println("---------");
	}

}
