package myclasses.demos.ds.search.binarysearch;

public class BinarySearch {
	private int[] binarySearchArr;
private int maxSize;
	public BinarySearch(int size) {
		maxSize = size; 
		binarySearchArr = new int[size];
	}

	public void populareArray() {
		for (int i = 0; i < maxSize; i++) {
			binarySearchArr[i] = i + 1;
		}
	}

	public int binarySearch(int num) {
		populareArray();
		int lBound = 0;
		int hBound = 99;
		int mid = 0;
		while (true) {
			System.out.println("l: "+lBound+" h: "+hBound);
			
			mid = (lBound + hBound) / 2;
			System.out.println("mid: "+mid);
			if (binarySearchArr[mid] == num) {
				return num;
			} else if (lBound != hBound) {

				if (num > binarySearchArr[mid]) {
					lBound = mid + 1;
					hBound = hBound;
				} else {
					lBound = lBound;
					hBound = mid - 1;
				}

			} else {
				return -1;
			}
		}

	}

	public static void main(String[] args) {
		BinarySearch bSearch = new BinarySearch(100);
		int i = bSearch.binarySearch(33);
		if(i == -1){
			System.out.println("Number not found");
		}else
		System.out.println("Number found: " +i);
	}

}
