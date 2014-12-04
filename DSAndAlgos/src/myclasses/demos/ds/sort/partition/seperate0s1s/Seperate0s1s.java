package myclasses.demos.ds.sort.partition.seperate0s1s;

// TODO: Auto-generated Javadoc
/**
 * The Class Seperate0s1s.
 */
public class Seperate0s1s {

	/** The s array. */
	public int[] sArray = { 0, 1, 0, 1, 0, 0, 1, 1, 1, 0 };

	/** The size. */
	int size = sArray.length;

	// Method 1
	/**
	 * Segregate method1.
	 */
	public void segregateMethod1() {
		int leftPtr = -1;
		int rightPtr = size;

		while (true) {
			while (leftPtr < rightPtr && sArray[++leftPtr] == 0) {
				;
			}
			while (rightPtr > leftPtr && sArray[--rightPtr] == 1) {
				;
			}
			if (leftPtr >= rightPtr) {
				break;
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
		int temp = sArray[leftPtr];
		sArray[leftPtr] = sArray[rightPtr];
		sArray[rightPtr] = temp;

	}

	// Method 2
	/**
	 * Segregate method2.
	 */
	public void segregateMethod2() {
		// count of number of zeros
		int count = 0;
		int maxSize = size;
		for (int i = 0; i < size; i++) {
			if (sArray[i] == 0) {
				count++;
			}
		}
		System.out.print("sArray: ");
		// display
		for (int j = 0; j < count; j++) {
			System.out.print("0" + " ");
		}
		for (int k = 0; k < size - count; k++) {
			System.out.print("1" + " ");
		}
		System.out.println();
	}

	// Method 3
	// TODO
	/**
	 * Segregate method3.
	 */
	public void segregateMethod3() {
		int leftPtr = 0;
		int rightPtr = size - 1;
		while (leftPtr < rightPtr) {
			if (sArray[leftPtr] == 0) {
				leftPtr++;
			}
			if (sArray[rightPtr] == 1) {
				rightPtr--;
			}
			// if(sArray==1&&sArray==0){
			//
			// }
		}
	}

	/**
	 * Display.
	 */
	public void display() {
		System.out.print("sArray: ");
		for (int i = 0; i < size; i++) {
			System.out.print(sArray[i] + " ");
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
		Seperate0s1s s = new Seperate0s1s();
		System.out.println("Method1: ");
		s.display();
		s.segregateMethod2();
		System.out.println("Method2: ");
		s.display();
		s.segregateMethod1();
		s.display();
	}
}
