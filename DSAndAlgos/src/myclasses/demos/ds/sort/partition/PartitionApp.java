
/**
 * @author Shashi
 *Modify the partition.java program (Listing 7.2) so that the partitionIt() method always uses the highest-index (right) element as the pivot, 
 *rather than an arbitrary number. (This is similar to what happens in the quickSort1.java program in Listing 7.3.) 
 *Make sure your routine will work for arrays of three or fewer elements. To do so, you may need a few extra statements.
 */
package myclasses.demos.ds.sort.partition;

import myclasses.demos.ds.recursion.mergesort.MergeSort;

public class PartitionApp {
//	public int[] qArray = { 6, 4, 3 };
	public int[] qArray = { 13,7,9,5, 4,2,6,1,8,3,11,10,12 };
	int size = qArray.length;

	public int partition() {
		int leftPtr = -1;
		int rightPtr = size - 1;
//		int pivot = qArray[rightPtr];
		int pivot = median(leftPtr+1, rightPtr);
		System.out.println("pivot: " + pivot);
		while (true) {

			while (leftPtr < rightPtr && qArray[++leftPtr] < pivot) {
				;
			}
			while (rightPtr > leftPtr && qArray[--rightPtr] > pivot) {
				;
			}
			if (leftPtr >= rightPtr) {
				swap(leftPtr, size - 1);
				return leftPtr;
			}
			swap(leftPtr, rightPtr);
		}

	}
	private int median(int left, int right) {
		// TODO Auto-generated method stub
		int center = (left + right) / 2;
		
		if(qArray[left]>qArray[center]){
			swap(left,center);
		}	
		if(qArray[left]>qArray[right]){
		swap(left,right);	
		}
		if(qArray[center]>qArray[right]){
		swap(center,right);	
		}
		return qArray[center];
	}
	private void swap(int leftPtr, int rightPtr) {
		// TODO Auto-generated method stub
		System.out.println("left: " + leftPtr + " right: " + rightPtr);
		int temp = qArray[leftPtr];
		qArray[leftPtr] = qArray[rightPtr];
		qArray[rightPtr] = temp;
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.print(qArray[i] + " ");
		}
	}

	public static void main(String[] args) {
		PartitionApp p = new PartitionApp();
		p.partition();
		p.display();
	}
}
