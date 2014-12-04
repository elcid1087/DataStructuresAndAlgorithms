package myclasses.demos.ds.sort.quicksort;

// TODO: Auto-generated Javadoc
/**
 * The Class QuickSort.
 */
public class QuickSort {
	// public int[] qArray = { 42, 89, 63, 12, 94, 27, 78, 3, 50, 36 };
	// public int[] qArray = { 0, 8, 19, 13, 12, 19, 56, 54, 1, 82 };
	// public int[] qArray = {90, 100, 20,60,80,110,120,40,10,30,50,70 };
	// public int[] qArray = {7,9,5, 4,2,6,1,8,3,11,10 };
	/** The q array. */
	public int[] qArray = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
	// public int[] qArray;
	/** The size. */
	public int size;

	// public int left;
	// public int right;
	/**
	 * Instantiates a new quick sort.
	 * 
	 * @param size
	 *            the size
	 */
	public QuickSort(int size) {
		this.size = size;
		// qArray = new int[size];
		// left = 0;
		// right = size - 1;
	}

	/**
	 * Populate array.
	 */
	public void populateArray() {
		for (int i = 0; i < size; i++) {
			int r = (int) (Math.random() * i * 10);
			qArray[i] = r;
		}
	}

	/** The rec l. */
	int recL = 1;

	/**
	 * Quick sort.
	 * 
	 * @param left
	 *            the left
	 * @param right
	 *            the right
	 */
	public void quickSort(int left, int right) {

		if (left >= right) {

			return;
		} else {

			int part = partition(left, right, qArray[right]);
			quickSort(left, part - 1);
			quickSort(part + 1, right);
		}
	}

	/**
	 * Partition.
	 * 
	 * @param left
	 *            the left
	 * @param right
	 *            the right
	 * @param pivot
	 *            the pivot
	 * @return the int
	 */
	public int partition(int left, int right, int pivot) {
		int leftPtr = left - 1;
		int rightPtr = right;
		while (true) {
			while (leftPtr < rightPtr && qArray[++leftPtr] < pivot) {
				;
			}
			while (rightPtr > leftPtr && qArray[--rightPtr] > pivot) {
				;
			}
			if (leftPtr >= rightPtr) {
				swap(leftPtr, right);
				return leftPtr;
			}
			swap(leftPtr, rightPtr);
		}
	}

	/**
	 * Swap.
	 * 
	 * @param leftPtr
	 *            the left ptr
	 * @param rightPtr
	 *            the right ptr
	 */
	private void swap(int leftPtr, int rightPtr) {
		// TODO Auto-generated method stub
		int temp = qArray[leftPtr];
		qArray[leftPtr] = qArray[rightPtr];
		qArray[rightPtr] = temp;
	}

	/**
	 * Display.
	 */
	public void display() {
		System.out.print(" qArray: ");
		for (int i = 0; i < size; i++) {
			System.out.print(qArray[i] + " ");
		}
		System.out.println();
	}

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		QuickSort q = new QuickSort(10);
		// q.populateArray();
		q.display();
		// q.partition(36);

		q.quickSort(0, 10);
		q.display();

	}

}
