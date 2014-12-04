package myclasses.demos.ds.sort.mergesort;

public class MergeSort {
	private int[] arrayA = { 23, 47, 81, 95 };
	private int[] arrayB = { 7, 14, 39, 55, 62, 74 };
	private int[] arrayC;

	public MergeSort() {
		arrayC = new int[10];
	}

	public void mergeSort() {
		int aPtr = 0;
		int bPtr = 0;
		int size = arrayA.length + arrayB.length;
		for (int i = 0; i < size; i++) {
			if (aPtr > arrayA.length - 1) {
				arrayC[i] = arrayB[bPtr++];
			} else if (bPtr > arrayB.length - 1) {
				arrayC[i] = arrayA[aPtr++];
			} else if (arrayA[aPtr] < arrayB[bPtr]) {
				arrayC[i] = arrayA[aPtr++];
			} else {
				arrayC[i] = arrayB[bPtr++];
			}

		}

	}

	public void mergeSort2() {

		int aPtr = 0;
		int bPtr = 0;
		int cPtr = 0;
		while (aPtr < arrayA.length && bPtr < arrayB.length) {
			if (arrayA[aPtr] < arrayB[bPtr]) {
				arrayC[cPtr++] = arrayA[aPtr++];
			} else {
				arrayC[cPtr++] = arrayB[bPtr++];
			}
		}
		while (bPtr < arrayB.length) {
			arrayC[cPtr++] = arrayB[bPtr++];
		}
		while (aPtr < arrayA.length) {
			arrayC[cPtr++] = arrayA[aPtr++];
		}
	}

	public void display() {
		System.out.print("Array After Merging: ");
		for (int i = 0; i < arrayC.length; i++) {
			System.out.print(arrayC[i] + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		MergeSort mSort = new MergeSort();
		mSort.mergeSort();
		mSort.display();
	}
}
