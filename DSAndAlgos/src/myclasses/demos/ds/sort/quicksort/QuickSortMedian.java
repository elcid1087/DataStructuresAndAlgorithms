package myclasses.demos.ds.sort.quicksort;

public class QuickSortMedian {

//	public int[] qArray;
	public int size;
//	public int[] qArray = {7,9,5, 4,2,6,1,8,3,11,10 };
//	public int[] qArray = {6,1,2,3,4,5,7 };
	public int[] qArray = { 13,7,9,5, 4,2,6,1,8,3,11,10,12 };
	// public int left;
	// public int right;
	public QuickSortMedian(int size) {
		this.size = size;
//		 qArray = new int[size];
		// left = 0;
		// right = size - 1;
	}

	public void populateArray() {
		for (int i = 0; i < size; i++) {
			int r = (int) (Math.random() * i * 10);
			qArray[i] = r;
		}
	}

	public void quickSort(int left, int right) {
		if (left >= right) {
			return;
		} else {
			int pivot = median(left, right);
			int part = partition(left, right, pivot);
			quickSort(left, part - 1);
			quickSort(part + 1, right);
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

	public int partition(int left, int right, int pivot) {
		int leftPtr = left;
		int rightPtr = right;
		System.out.println("pivot: " + pivot);
		while (true) {

			while ( leftPtr != size - 1
					&& qArray[++leftPtr] < pivot) {
			}
			while (rightPtr != 0
					&& qArray[--rightPtr] > pivot) {
			}
			left = leftPtr;
			right = rightPtr;
			if (leftPtr >= rightPtr) {
				return leftPtr;
			}

			swap(leftPtr, rightPtr);
			
		}

	}
	public int median(){
		int center = (size)/2;
		return qArray[center];
	}
	public void display() {
		System.out.print(" qArray: ");
		for (int i = 0; i < size; i++) {
			System.out.print(qArray[i] + " ");
		}
		System.out.println();
	}
	private void swap(int leftPtr, int rightPtr) {
		// TODO Auto-generated method stub
		int temp = qArray[leftPtr];
		qArray[leftPtr] = qArray[rightPtr];
		qArray[rightPtr] = temp;
	}
	public static void main(String[] args) {
		QuickSortMedian q = new QuickSortMedian(13);
//		q.populateArray();
		q.display();
		q.quickSort(0, 12);
		q.display();
		System.out.println("center is "+ q.median());
	}
}
