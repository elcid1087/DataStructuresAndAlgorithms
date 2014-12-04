package myclasses.demos.ds.tree.binarytree.stringoflettersQ1;

public class TreeApp1 {
	public static void main(String[] args) {
		Tree tree = new Tree();
		
		tree.insertLetter('A');
		tree.insertLetter('B');
		tree.insertLetter('C');
		tree.insertLetter('D');
		tree.insertLetter('E');
		tree.insertLetter('F');
		tree.insertLetter('G');
		tree.insertLetter('H');
		tree.insertLetter('I');
		tree.insertLetter('J');
		tree.insertLetter('K');
		tree.insertLetter('L');
		tree.insertLetter('M');
		tree.display();
		tree.balanceTree();
		tree.display();
		tree.deleteParent();
		tree.orderFromTopDown('A');
		tree.orderFromTopDown('B');
		tree.orderFromTopDown('C');
		tree.orderFromTopDown('D');
		tree.orderFromTopDown('E');
		tree.orderFromTopDown('F');
		tree.orderFromTopDown('G');
		tree.orderFromTopDown('H');
		tree.orderFromTopDown('I');
		tree.orderFromTopDown('J');
		tree.orderFromTopDown('K');
		tree.orderFromTopDown('L');
		tree.orderFromTopDown('M');
		tree.orderFromTopDown('N');
		tree.orderFromTopDown('O');
		tree.orderFromTopDown('P');
		tree.orderFromTopDown('Q');
		tree.orderFromTopDown('R');
		tree.orderFromTopDown('S');
		tree.orderFromTopDown('T');
		tree.orderFromTopDown('U');
		tree.orderFromTopDown('V');
		tree.orderFromTopDown('W');
		tree.orderFromTopDown('X');
		tree.orderFromTopDown('Y');
		tree.orderFromTopDown('Z');
		tree.display();
		System.out.println();
		tree.inorder(tree.parent);
		System.out.println();
//		tree.inOrderNonRec(tree.parent);
		System.out.println("InOrder traversal.");
		tree.inOrderNodeRec();
		System.out.println("Preorder traversing: ");
		tree.preOrder(tree.parent);
		System.out.println();
		System.out.println("Left View Non Recusive approach");
		tree.leftView();
		System.out.println();
		tree.leftViewWithoutStack();
		tree.leftNRightView();
		System.out.println();
		System.out.println("Left View Recusive approach");
		tree.leftViewRec(tree.parent);
		System.out.println();
		tree.breadthFirstSearch();
		System.out.println("BFS Queue: ");
		tree.breadthFirstSearchQueue();
		System.out.println("Construct a tree from level order.");
	}

}
