package myclasses.demos.ds.recursion.makebrackets;

// TODO: Auto-generated Javadoc
/**
 * The Class PrintBST.
 */
public class PrintBST {
	
	/** The brancehes. */
	public char[] brancehes;
	
	/** The s. */
	int s;

	/**
	 * Make branches.
	 *
	 * @param left the left
	 * @param right the right
	 */
	public void makeBranches(int left, int right) {
		System.out.println("Left: " + left + " Right: " + right);
		if (left == right){
			return;
		}else if(right==(int)15/2||left==(16/2)) {
			s = 0;

		} else {
			display();
			s = 1;
			int m = (left + right) / 2;
			// if(){
			makeBranches(left, m);
			s = 1;
			// }else{
			makeBranches(m + 1, right);
			// }

		}
	}

	/**
	 * Display.
	 */
	private void display() {
		// TODO Auto-generated method stub
		System.out.println("-------------");
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		PrintBST print = new PrintBST();
		print.makeBranches(0, 15);
	}
}
