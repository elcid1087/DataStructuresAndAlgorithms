
/**
 * @author Shashi
 *Modify the partition.java program (Listing 7.2) so that the partitionIt() method always uses the highest-index (right) element as the pivot, 
 *rather than an arbitrary number. (This is similar to what happens in the quickSort1.java program in Listing 7.3.) 
 *Make sure your routine will work for arrays of three or fewer elements. To do so, you may need a few extra statements.
 */
package myclasses.demos.ds.sort.partition.median;

public class PartitionApp {
//	public int[] qArray = { 13,7,9,5, 4,2,6,1,8,3,11,10,12 };//One corner scenario is failing.
	public int[] qArray = { 13,7,9,5, 4,16,6,15,8,17,11,10,12,14,1,2,3 };//Another corner case solved by making greater than or equal to pivot
//	public int[] qArray = {6,3,1,5,4,2,7 };
//	public int[] qArray = {6,3,1,4,5,2,7 };
	int size = qArray.length;

	public void medianPartition(){
		System.out.println("size: "+ size);
		partition(0, size-1,0);
	}
	
//	int pivot;
//	int pivot;
	public int partition(int left,int right,int pivot){
		int centerIndex = (size-1)/2;
		int center = qArray[centerIndex];
		if(pivot == center||left >= right){
			System.out.println("Median: "+ pivot+" center: "+center);
			return pivot;
		}else{
			int leftPtr = left-1;
			int rightPtr = right;
			
			 pivot = median(left, right);
			System.out.println("pivot: "+ pivot+" center: "+center);
			while (true) {

				while (leftPtr < rightPtr && qArray[++leftPtr] < pivot) {
					;
				}
				while (rightPtr > leftPtr && qArray[--rightPtr] >= pivot) {
					;
				}
				
				if (leftPtr >= rightPtr) {
					
//					swap(leftPtr, right);
					 {
						if(qArray[leftPtr]>qArray[centerIndex]){
						return partition(0, leftPtr,pivot);
					}else{
						return partition(leftPtr, size-1,pivot);
					}
					
				}
				}
				swap(leftPtr, rightPtr);
			}
		}
		
		
		
		
		
	}
	
	
	/*public int partition(int left, int right) {
		int leftPtr = left;
		int rightPtr = right;
		
//		int pivot = qArray[right];
		int center = (size)/2;
		System.out.println("pivot: " + pivot+" center: "+ center);
		if(pivot==qArray[center]){
			System.out.println("center: "+ qArray[left]);
			return left;
		}else{
			display();
			 pivot = median(left, right);
			 System.out.println("pivot: " + pivot+" center: "+ center);
		while (true) {

			while (leftPtr < rightPtr && qArray[++leftPtr] < pivot) {
				;
			}
			while (rightPtr > leftPtr && qArray[--rightPtr] > pivot) {
				;
			}
			
			if (leftPtr >= rightPtr) {
				swap(leftPtr, right);
				if(qArray[leftPtr]==qArray[center]){
					System.out.println("Median: "+ pivot);
//					break;
					return leftPtr;
				}else {
					if(qArray[leftPtr]>qArray[center]){
					partition(0, leftPtr);
				}else{
					partition(leftPtr, size-1);
				}
				
			}
			}
			swap(leftPtr, rightPtr);
		}
		}

	}*/
	
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
//		p.partition(0,10);
		p.medianPartition();
		p.display();
	}
}
