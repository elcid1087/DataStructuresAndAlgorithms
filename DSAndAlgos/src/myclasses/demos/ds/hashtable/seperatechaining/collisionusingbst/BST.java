package myclasses.demos.ds.hashtable.seperatechaining.collisionusingbst;

import myclasses.demos.ds.tree.binarytree.Node;
import myclasses.demos.ds.tree.binarytree.Stack;

// TODO: Auto-generated Javadoc
/**
 * The Class BST.
 */
public class BST {

	/** The root. */
	public Node root;

	/**
	 * Insert.
	 *
	 * @param item the item
	 */
	public void insert(int item) {

		Node newNode = new Node(item);

		Node current = root;
		Node previous = root;
		while (current != null) {
			previous = current;
			if ( item > current.iData  ) {

				current = current.right;
				if (current == null) {
					previous.right = newNode;
				}
			} else {

				current = current.left;
				if (current == null) {
					previous.left = newNode;
				}
			}
		}
		if (root == null) {
			root = newNode;
		}
		 else if (item > previous.iData) {
		 previous.right = newNode;
		 } else {
		 previous.left = newNode;
		 }

	}

	/**
	 * Find.
	 *
	 * @param item the item
	 */
	public void find(int item) {
		Node current = root;
		while (current != null && current.iData != item) {

			if (current.right != null && item > current.right.iData) {

				current = current.right;
			} else {
				current = current.left;
			}
		}

		if (current == null) {
			System.out.println("item not found");
		} else {
			System.out.println("item found");
		}

	}

	/**
	 * Delete.
	 *
	 * @param iValue the i value
	 */
	public void delete(int iValue) {
		Node cNode = root;
		Node pNode = root;
		while (cNode.iData != iValue) {

			if (iValue < cNode.iData) {
				pNode = cNode;
				cNode = cNode.left;
			} else {
				pNode = cNode;
				cNode = cNode.right;
			}
			if (cNode == null) {
				break;
			}
		}
		if (cNode != null) {
			if ((cNode.left == null && cNode.right == null)) {
				if (root.iData == iValue) {
					root = null;
				} else if (pNode.left != null && pNode.left.iData == iValue) {
					pNode.left = null;
				} else {
					pNode.right = null;
				}
			} else if (cNode.right == null) {
				if (pNode.left != null && pNode.left.iData == iValue) {
					pNode.left = cNode.left;
				} else {
					pNode.right = cNode.left;
				}
			} else if (cNode.left == null) {
				if (pNode.right != null && pNode.right.iData == iValue) {
					pNode.right = cNode.right;
				} else {
					pNode.left = cNode.right;
				}
			} else {
				Node successor = getSuccessor(cNode);
				if (root.iData == cNode.iData) {
					root = successor;
					successor.left = cNode.left;

				} else if (pNode.right != null && pNode.right.iData == iValue) {
					successor.left = cNode.left;
					pNode.right = successor;
				} else {
					pNode.left = successor;
					successor.left = cNode.left;

				}
			}

		}
	}

	/**
	 * Gets the successor.
	 *
	 * @param cNode the c node
	 * @return the successor
	 */
	public Node getSuccessor(Node cNode) {

		Node successorParent = cNode;
		Node successor = cNode;
		Node current = cNode.right;

		while (current != null) {
			successorParent = successor;
			successor = current;
			current = current.left;
		}
		if (successor != cNode.right) {
			successorParent.left = successor.right;
			successor.right = cNode.right;
		}
		return successor;

	}

	/**
	 * Display.
	 */
	public void display() {
		System.out.println("Binary Search Tree");
		Stack stack = new Stack(32);
		Stack tempStack = new Stack(32);
		stack.push(root);
		int nElem = 128;
		int level = 0;
		int l = 2;
		while (l != 128 && !stack.isEmpty()) {
			int nElem1 = nElem;
			nElem1 = nElem1 / l;
			level++;
			while (!stack.isEmpty()) {
				tempStack.push(stack.pop());
			}

			while (!tempStack.isEmpty()) {

				for (int i = 0; i < nElem1 - 1; i++) {
					System.out.print(" ");
				}
				Node node = tempStack.pop();
				if (node != null) {
					System.out.print(node.iData);
					stack.push(node.left);
					stack.push(node.right);
				} else {
					System.out.print("--");
					stack.push(null);
					stack.push(null);
				}

				for (int i = 0; i < nElem1 - 1; i++) {
					System.out.print(" ");
				}

			}
			System.out.println();
			l = l * 2;

		}
		System.out.println();
		System.out.println("level: " + level);
		System.out.println("End of BST");
	}

}
