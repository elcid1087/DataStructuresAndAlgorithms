package myclasses.demos.ds.sort.shellsort;

public class ShellSort {
	public int[] shellArray;
	public int size;

	public ShellSort(int size) {
		this.size = size;
		shellArray = new int[size];
	}

	public void populateArray() {
		for (int i = 0; i < shellArray.length; i++) {
			int r = (int) (Math.random() * i * 10);
			shellArray[i] = r;
		}
	}

	public void sort() {
		int h = 1;
		while (h < size / 3) {
			h = 3 * h + 1;
		}

		while (h >= 1) {
			// do sortin
			System.out.println("h: " + h);
			h = (h - 1) / 3;
		}
	}

	long[] theArray = { 149, 192, 47, 152, 159, 195, 61, 66, 17, 167, 118, 64,
			27, 80, 30, 105 };

	public int partitionIt(int left, int right, long pivot) {
		int leftPtr = left;
		int rightPtr = right;
		while (true) {

			while (leftPtr <= right && theArray[leftPtr] < pivot)
				leftPtr++;
			;
			while (rightPtr >= left && theArray[--rightPtr] > pivot)
				;
			if (leftPtr >= rightPtr)
				break;
			else
				swap(leftPtr, rightPtr);
		}
		return leftPtr;
	}

	public void display() {
		for (int i = 0; i < theArray.length; i++) {
			System.out.print(" " + theArray[i]);
		}
	}

	public void swap(int dex1, int dex2) {
		long temp;
		temp = theArray[dex1];
		theArray[dex1] = theArray[dex2];
		theArray[dex2] = temp;
		// A into temp // B into A
		// temp into B
	}

	public static void main(String[] args) {
		ShellSort shell = new ShellSort(1000);
		// shell.populateArray();
		// shell.sort();
		shell.partitionIt(0, 15, 31);
		shell.display();
	}
}
