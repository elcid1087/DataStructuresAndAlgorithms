package myclasses.demos.ds.tree.binarytree.stringoflettersQ1;

public class Node {
	public int iData;
	public Node left;
	public Node right;

	public Node(int iData) {
		this.iData = iData;
	}

	public void displayNode() {
		System.out.print((char) iData + " ");
	}
}
