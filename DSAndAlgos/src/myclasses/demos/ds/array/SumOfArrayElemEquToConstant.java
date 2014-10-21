package myclasses.demos.ds.array;

// TODO: Auto-generated Javadoc
/**
 * The Class SumOfArrayElemEquToConstant. Problem: finding the pair of array
 * elements which should equal to a target value in order O(n).
 */
public class SumOfArrayElemEquToConstant {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		int[] ipArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int constant = 6;
		int[] hashArray = new int[ipArray.length];
		System.out.print("input array--> ");
		for (int ia = 0; ia < ipArray.length; ia++) {
			System.out.print(" " + ipArray[ia]);
		}
		// calculate hashcode and insert into an hashArray with hashcode as
		// index.
		for (int i = 0; i < ipArray.length; i++) {
			int diff = constant - ipArray[i];
			int hash = diff % ipArray.length;
			if (hash > 0) {
				hashArray[hash] = ipArray[i];
			}
		}
		System.out.print("\nPairs:    ");
		for (int j = 0; j < ipArray.length; j++) {
			int elem2 = constant - ipArray[j];
			int hash = elem2 % ipArray.length;
			// searching through the hashArray for the diff, if present then
			// printing the pair.
			if (hash > 0 && hashArray[elem2] != 0) {
				System.out.print(" (" + ipArray[j] + "," + elem2 + ") ");
			}
		}

	}
}
