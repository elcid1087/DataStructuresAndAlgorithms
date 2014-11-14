package myclasses.demos.ds.recursion.knapsack;

// TODO: Auto-generated Javadoc
/**
 * The Class Knapsack.
 */
public class Knapsack {
	// private int[] kArray = { 11, 5, 8, 6, 7, 2,1 };j
	// private int[] kArray = { 11, 8, 6, 7, 5 };
	/** The k array. */
	private final int[] kArray = { 1, 3, 5, 7, 9, 11, 13, 15 };

	/** The i. */
	int i;

	/** The size. */
	int size = kArray.length;

	/** The aux. */
	int[] aux = new int[size];

	/** The a. */
	int a;

	// TODO
	// If sum is greater than target && reaches max length(Here I'm just
	// checking for sum greater than target)
	// go back to the item where sum is greater and sub previous item and add
	// current item.

	/**
	 * Knap.
	 * 
	 * @param sum
	 *            the sum
	 * @param index
	 *            the index
	 * @param target
	 *            the target
	 */
	public void knap(int sum, int index, int target) {
		System.out.println("Sum: " + sum + " index: " + index + " target: "
				+ target + " i: " + i);
		if (sum == target) {
			return;
		}
		if (sum < target && index < kArray.length) {
			sum = sum + kArray[index++];
			aux[a++] = kArray[index - 1];
			knap(sum, index, target);
		} else if (index >= kArray.length && i != kArray.length - 2) {
			System.out.println("a: " + a);
			if ((a - 1) != 0) {
				aux[i + 1] = kArray[i + 2];
				a = i + 1;
				index = i + 3;
				sum = 0;
				for (int in = 0; in <= a; in++) {
					sum = sum + aux[in];
				}
				a++;
			} else {
				index = ++i;
				a = i - 1;
				sum = kArray[index++];
			}
			knap(sum, index, target);
		} else if (sum > target) {
			/*
			 * if (index == kArray.length - 1) { sum = (sum - kArray[index - 1])
			 * + kArray[index++]; } else sum = (sum - kArray[index - 1]) +
			 * kArray[index++];
			 */
			sum = (sum - kArray[index - 1]) + kArray[index++];
			aux[a - 1] = kArray[index - 1];
			// a++;
			knap(sum, index, target);
		}
	}

	// WORKING METHOD
	/**
	 * Knapsk.
	 * 
	 * @param sum
	 *            the sum
	 * @param index
	 *            the index
	 * @param target
	 *            the target
	 */
	public void knapsk(int sum, int index, int target) {
		System.out.println("Sum: " + sum + " index: " + index + " target: "
				+ target + " i: " + i + " a: " + a);
		if (sum == target) {
			System.out.println("Success");
			return;
		} else {
			if (sum < target && index <= size - 1) {
				aux[a++] = index;
				sum = sum + kArray[index++];
				knapsk(sum, index, target);
			} else if (index >= size && i != size - 2) {
				if (a != 2) {
					int aa = aux[1];
					aux[1] = aa + 1;
					a = 1;

					index = aa + 2;
					sum = kArray[aux[0]] + kArray[aux[1]];
				} else {
					sum = kArray[++i];
					a = 0;
					aux[a] = i;
					index = i + 1;
				}
				a++;
				knapsk(sum, index, target);
			} else if (sum > target) {
				sum = (sum - kArray[index - 1]) + kArray[index++];
				aux[a - 1] = index - 1;
				knapsk(sum, index, target);
			} else {
				System.out.println("Failure");
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
		Knapsack k = new Knapsack();
		k.knapsk(0, 0, 30);
		for (int i = 0; i < k.a; i++) {
			System.out.print(k.aux[i] + " ");
		}
	}
}
