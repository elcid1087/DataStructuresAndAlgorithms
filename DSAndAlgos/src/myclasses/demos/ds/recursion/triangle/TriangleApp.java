package myclasses.demos.ds.recursion.triangle;

// TODO: Auto-generated Javadoc
/**
 * The Class TriangleApp.
 */
public class TriangleApp {

	/**
	 * Triangle.
	 *
	 * @param n the n
	 * @return the int
	 */
	public int triangle(int n){
		if(n==1){
			return 1;
		}else {
			return n + triangle(n-1);
		}
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.println("Triangle App");
		TriangleApp triangleApp = new TriangleApp();
		int triangleSum=triangleApp.triangle(4);
		System.out.println("triangleSum: "+triangleSum);
	}
}
