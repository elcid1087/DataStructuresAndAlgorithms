package myclasses.demos.ds.recursion.printtree;

// TODO: Auto-generated Javadoc
/**
 * The Class TreeApp1.
 */
public class TreeApp1 {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		TreeApp1 t = new TreeApp1();
		t.twoPower(7);
	}

	
	/** The n elem. */
	public int nElem = 64;

	/**
	 * Two power.
	 *
	 * @param y the y
	 * @return the int
	 */
	public int twoPower(int y) {
		if (y == 1) {
			display(1);
			return 1;
		} else {
			int p = 2 * twoPower(y - 1);
			display(p);
			return p;
		}
	}

	/**
	 * Display.
	 *
	 * @param p the p
	 */
	public void display(int p) {
		int r = p;
		int q = p * 2;
		while (r > 0) {
			if (p < 10) {
				for (int i = 0; i < nElem / q; i++) {
					System.out.print("-");
				}
				System.out.print(p + "");
				for (int i = 0; i < nElem / q - 1; i++) {
					System.out.print("-");
				}
			} else {
				int elem = nElem / 2;
				while (elem > 0) {
					System.out.print(p);
					elem--;
				}
				break;
			}
			r--;
		}
		System.out.println("");
	}
}
