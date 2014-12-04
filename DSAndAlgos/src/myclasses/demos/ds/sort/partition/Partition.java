package myclasses.demos.ds.sort.partition;

public class Partition {
	
//	  public int[] pArray = { 149, 192, 47, 152, 159, 195, 61, 66, 17, 167,
//	  118, 64, 27, 80, 30, 105 };
//	public int[] pArray = {3,1,2,4,5,6,7 };
	public int[] pArray = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0 };
//	public int[] pArray = { 42, 89, 63, 12, 94, 27, 78, 3, 50, 36 };36
//	public int[] pArray = {1,2,3,4,6,7,8,9,10};5
//	public int[] pArray;
	public int size;
	public int comparisions;
	public int swaps;
	public int left;
	public int right;

	public Partition(int size) {
		this.size = size;
		// pArray = new int[size];
	}

	public void populateArray() {
		for (int i = 0; i < size; i++) {
			int r = (int) (Math.random() * i * 10);
			pArray[i] = r;
		}
	}

	// pivot = 99;
	public void partition(int pivot) {
		int leftPtr = -1;
		int rightPtr = size - 1;
		System.out.println("pivot: " + pivot);
		while (true) {

			while (comparisions++ < size + 100 && leftPtr != size - 1
					&& pArray[++leftPtr] < pivot) {
			}
			while (comparisions++ < size + 100 && rightPtr != 0
					&& pArray[--rightPtr] >= pivot) {
			}
			left = leftPtr;
			right = rightPtr;
			if (leftPtr >= rightPtr) {
				break;
			}

			swap(leftPtr, rightPtr);
			
		}

	}

	private void swap(int left, int right) {
		// TODO Auto-generated method stub
		swaps++;
		int temp = pArray[left];
		pArray[left] = pArray[right];
		pArray[right] = temp;
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.print(pArray[i] + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		System.out.println("START");
		Partition p = new Partition(10);
		// p.populateArray();
		p.display();
		p.partition(0);
		p.display();
		System.out.println("size: " + p.size + " comparisions: "
				+ p.comparisions + " swaps: " + p.swaps + " left: " + p.left
				+ " right: " + p.right);
		System.out.println("END");
	}
}
