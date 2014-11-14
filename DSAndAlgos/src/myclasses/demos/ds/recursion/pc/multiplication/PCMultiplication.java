package myclasses.demos.ds.recursion.pc.multiplication;

// TODO: Auto-generated Javadoc
/**
 * The Class PCMultiplication.
 */
public class PCMultiplication {
	
	/**
	 * Mult.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the int
	 */
	public int mult(int x, int y) {
		
		if (y == 1) {
//			System.out.println("return y");
			return x;
		} else {
//			System.out.println("X: " + x + " Y: " + y);
			return x + mult(x, y - 1);
		}
		
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		PCMultiplication pc = new PCMultiplication();
		int x=5;
		int y=5;
		System.out.print(x+" * "+y);
		int m = pc.mult(x, y);
		System.out.print(" = " + m);
	}
}
