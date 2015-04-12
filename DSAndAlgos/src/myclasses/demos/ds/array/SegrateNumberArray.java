/**
 * 
 */
package myclasses.demos.ds.arrays;

import java.util.Arrays;

// TODO: Auto-generated Javadoc
/**
 * The Class SegrateNumberArray.
 *
 * @author shashi
 */
public class SegrateNumberArray {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {1,1,1,1,0,0,0,0};
		segregate01UsingCount(arr);
		Integer[] arr1 = {1,1,1,1,0,0,0,0};
		segregate01UsingPointers(arr1);
		Integer[] arr2 = {2,2,2,2,1,1,1,1,0,0,0,0};
		segregate012UsingPointers(arr2);
		Integer[] arr3 = {2,2,2,2,2,2,2};
		segregate012UsingPointers(arr3);
		Integer[] arr6 = {1,1,1,1,2,2,2,2,0,0,0,0};
		segregate012UsingPointers(arr6);
		Integer[] arr4 = {3,3,3,3,2,2,2,2,1,1,1,1,0,0,0,0};
		segregate0123UsingPointers(arr4);
		Integer[] arr5 = {2,2,2,2,3,3,3,3,1,1,1,1,0,0,0,0};
		segregate0123UsingPointers(arr5);
		Integer[] arr7 = {1,1,1,1,2,2,2,2,3,3,3,3,0,0,0,0};
		segregate0123UsingPointers(arr7);
		Integer[] arr8 = {0,0,0,0,2,2,2,2,3,3,3,3,1,1,1,1};
		segregate0123UsingPointers(arr8);
		Integer[] arr9 = {0,0,0,0,1,1,1,1,2,2,2,2,3,3,3,3};
		segregate0123UsingPointers(arr9);
		Integer[] arr10 = {0,2,1,3,1,2,0,3,2,3,0,1,3,0,1,2};
		segregate0123UsingPointers(arr10);
		segrateEvenOdd(arr9);
		segrateEvenOdd(arr8);
		segrateEvenOdd(arr10);
		Integer[] arr11 = {1,2,3,4,0,-1,-2,-3,-4};
		segrateNegativePositive(arr11);
	}
	
	/**
	 * Segregate01 usintg count. Count number of 0s or 1s in an array, update the counter if we encounter the number we are looking for.
	 * In the next step, fill the new array with counter number of the actual number we were looking for and fill the remaining array with the 
	 * other number.
	 * Time Complexity = O(n); 
	 * Space Complexity = O(1) or O(n);
	 *
	 * @param arr the arr
	 */
	public static void segregate01UsingCount(Integer[] arr){
		System.out.println("[segregate01UsingCount] Array before arrangement: "+Arrays.deepToString(arr));
		int count0s = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				count0s++;
			}
		}
		//we can modify the same array or use a new array where it is initialized to either with 0s or 1s. 
		for(int j=0;j<arr.length;j++){
			if(count0s>0){
				arr[j]=0;
				count0s--;
			}else{
				arr[j]=1;
			}
		}
		System.out.println("[segregate01UsingCount] Array after arrangement: "+Arrays.deepToString(arr));
	}

	
	/**
	 * Segregate01 using pointers. Using a left pointer which starts from 0 and right pointer which start from size-1.
	 * iterate through the array and swap if left index encounter 1 with the right index. Continue this until left >= right.
	 * Time Complexity = O(n); 
	 * Space Complexity = O(1);
	 *
	 * @param arr the arr
	 */
	public static void segregate01UsingPointers(Integer[] arr){
//		System.out.println("[segregate01UsingPointers] Array before arrangement: "+Arrays.deepToString(arr));
		int left = 0;
		int right = arr.length-1;
		while(left<right){
			if(arr[left]==1){
				swap(arr, left, right);
			}
			left++;
			right--;
		}
		System.out.println("[segregate01UsingPointers] Array after arrangement: "+Arrays.deepToString(arr));
	}
	
	/**
	 * Swap.
	 *
	 * @param arr the arr
	 * @param left the left
	 * @param right the right
	 */
	private static void swap(Integer[] arr, int left, int right) {
		// TODO Auto-generated method stub
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;

	}
	
	
	/**
	 * Segregate012 using pointers. Use three pointers here left=0;mid=0;right=size-1;
	 * if left comes across 0 increment left and mid;
	 * if left comes across 1, swap left, mid and  increment mid;
	 * if left comes across 2, swap left, right and decrement right;
	 * Time Complexity = O(n); 
	 * Space Complexity = O(1);
	 *
	 * @param arr the arr
	 */
	public static void segregate012UsingPointers(Integer[] arr){
//		System.out.println("[segregate012UsingPointers] Array before arrangement: "+Arrays.deepToString(arr));
		int left = 0;
		int mid = 0;
		int right = arr.length-1;
		while(mid<=right){
			if(arr[mid]==0){
				swap(arr,left,mid);
				left++;
				mid++;
			}else if(arr[mid]==1){
				mid++;
			}else{
				swap(arr, mid, right);
				right--;
			}
		}
		System.out.println("[segregate012UsingPointers] Array after arrangement:  "+Arrays.deepToString(arr));
	}
	
	
	
	/**
	 * Segregate0123 using pointers.
	 *
	 * @param arr the arr
	 */
	public static void segregate0123UsingPointers(Integer[] arr){
//		System.out.println("[segregate012UsingPointers] Array before arrangement: "+Arrays.deepToString(arr));
		int left = 0;
		int mid = 0;
		int midRight = arr.length-1;
		int right = arr.length-1;
		while(mid<=midRight){
			if(arr[mid]==0){
				swap(arr,left,mid);
				left++;
				mid++;
			}else if(arr[mid]==1){
				
				mid++;
			}else if(arr[mid] ==2){
				swap(arr, mid, midRight);
				midRight--;
			}else if(arr[mid]==3){
				swap(arr, mid, right);
				if(midRight>=right){
				midRight--;
				}
				right--;
			}
		}
		System.out.println("[segregate012UsingPointers] Array after arrangement:  "+Arrays.deepToString(arr));
	}
	
	/**
	 * Segrate even odd.
	 *
	 * @param arr the arr
	 */
	public static void segrateEvenOdd(Integer[] arr){
		int left = 0;
		int right = arr.length-1;
		while(left<right){
			if(arr[left]%2!=0){
				swap(arr, left, right);
			}
			left++;
			right--;
		}
		System.out.println("[segregate01UsingPointers] Array after arrangement: "+Arrays.deepToString(arr));
	}
	
	
	/**
	 * Segrate negative positive.
	 *
	 * @param arr the arr
	 */
	public static void segrateNegativePositive(Integer[] arr){

		int left = 0;
		int right = arr.length-1;
		while(left<right){
			if(arr[left]>0){
				swap(arr, left, right);
			}
			left++;
			right--;
		}
		System.out.println("[segregate01UsingPointers] Array after arrangement: "+Arrays.deepToString(arr));
	
	}
	
	
}
