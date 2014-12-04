package myclasses.demos.ds.string.replacespace;

import java.util.Arrays;

// TODO: Auto-generated Javadoc
/**
 * The Class RotateTwoDArrayByNinety.
 * Q 1.6
 */
public class RotateTwoDArrayByNinety {

	/** The i array. */
	public int[][] iArray = new int[4][4];

	/** The array. */
	public int[][] fArray = new int[4][4];

	/**
	 * Rotate90.
	 */
	/**
	 * 
	 */
	public void rotate90() {
		populateArray();
		System.out.println("2D Array: " + Arrays.deepToString(iArray));
		rotateUsingSingleArray();
		System.out.println("After rotation 2D Array: "
				+ Arrays.deepToString(iArray));
	}

	/**
	 * Rotate.
	 */
	private void rotate() {
		// TODO Auto-generated method stub
		for (int i = 0; i < iArray.length; i++) {
			int k = 0;
			for (int j = iArray.length - 1; j >= 0; j--) {
				fArray[j][i] = iArray[i][k++];
			}
		}
	}

	/**
	 * Rotate using single array.
	 */
	public void rotateUsingSingleArray() {
		for (int i = 0; i < iArray.length; i++) {
			for (int j = 0; j < iArray.length; j++) {
				if (i != j && j > i) {
					int temp = iArray[i][j];
					iArray[i][j] = iArray[j][i];
					iArray[j][i] = temp;

				}
			}
		}
	}

	/**
	 * Populate 2D array.
	 */
	private void populateArray() {
		// TODO Auto-generated method stub
		System.out.println("leng " + iArray.length);
		int value = 1;
		for (int i = 0; i < iArray.length; i++) {
			for (int j = 0; j < iArray.length; j++) {
				iArray[i][j] = value++;
			}
		}
	}

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		RotateTwoDArrayByNinety rotateArr = new RotateTwoDArrayByNinety();
		rotateArr.rotate90();
	}

}
