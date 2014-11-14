package myclasses.demos.ds.recursion.power;

// TODO: Auto-generated Javadoc
/**
 * The Class RaisingPower.
 */
public class RaisingPower {
	/*
	 * public void power(int x,int y){ System.out.println("x: "+x+" y: "+y);
	 * if(y==1){ return ; }else{ int xx = x*x; power(xx,(y/2));
	 * System.out.println("x"+(xx)); // return p; } }
	 */
	/*
	 * public int power(int x,int y){ System.out.println("x: "+x+" y: "+y);
	 * if(y==0){ return 1; } if(y==1){ return x; } if(y%2==0){ int xx = x*x;
	 * return power(xx,(y/2)); } else{ int xx = x*x; return xx*power(xx,(y/2));
	 * // System.out.println("x"+(xx)); // return p; } }
	 */

	/**
	 * Power.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the long
	 */
	public long power(long x, long y) {
		// System.out.println("x: " + x + " y: " + y);

		if (y == 1) {
			return x;
		}

		else if (y % 2 == 0) {
			long xx = x * x;
			return power(xx, (y / 2));
		} else {
			long xx = x * x;
			return xx * power(xx, (y / 2));
		}
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		RaisingPower p = new RaisingPower();
		long i = p.power(2, 18);
		System.out.println("i: " + i);
		long i1 = p.power(2, 3);
		System.out.println("i1: " + i1);

	}
}
