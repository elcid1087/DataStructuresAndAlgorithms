package myclasses.demos.ds.tree.binarytree;

// TODO: Auto-generated Javadoc
/**
 * The Class Tree.
 */
public class Tree {

	/** The parent. */
	public Node parent;

	/**
	 * Insert.
	 * 
	 * @param iValue
	 *            the i value
	 */
	public void insert(int iValue) {
		Node newNode = new Node(iValue);
		if (parent == null) {
			parent = newNode;
		} else {
			Node cNode = parent;
			Node pNode = parent;
			while (cNode != null) {
				if (iValue < cNode.iData) {
					pNode = cNode;
					cNode = cNode.left;
				} else {
					pNode = cNode;
					cNode = cNode.right;
				}
			}
			if (iValue < pNode.iData) {
				pNode.left = newNode;
			} else {
				pNode.right = newNode;
			}
		}
	}

	/**
	 * Find.
	 * 
	 * @param iValue
	 *            the i value
	 */
	public void find(int iValue) {
		Node cNode = parent;
		while (cNode != null) {
			if (cNode.iData == iValue) {
				System.out.println("key found: " + iValue);
				break;
			} else if (iValue < cNode.iData) {
				cNode = cNode.left;
			} else {
				cNode = cNode.right;
			}
		}
		if (cNode == null) {
			System.out.println("key not found");
		}
	}

	/**
	 * Find min.
	 * 
	 * @return the int
	 */
	public int findMin() {
		Node cNode = parent;
		Node pNode = parent;

		while (cNode != null) {
			pNode = cNode;
			cNode = cNode.left;
		}
		return pNode.iData;
	}

	/**
	 * Find max.
	 * 
	 * @return the int
	 */
	public int findMax() {
		Node cNode = parent;
		Node pNode = parent;
		while (cNode != null) {
			pNode = cNode;
			cNode = cNode.right;
		}
		return pNode.iData;
	}

	/**
	 * Delete.
	 * 
	 * @param iValue
	 *            the i value
	 */
	public void delete(int iValue) {
		Node cNode = parent;
		Node pNode = parent;
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
				if (parent.iData == iValue) {
					parent = null;
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
				if (parent.iData == cNode.iData) {
					parent = successor;
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

	public void deleteleaf(int iData) {
		// find the node
		Node current = parent;
		Node previous = current;
		while (current.iData != iData) {
			previous = current;
			if (iData < current.iData) {
				current = current.left;
			} else {
				current = current.right;
			}
			if (current == null) {
				return;
			}
		}
		if (current.left == null && current.right == null) {
			if (previous.left != null && previous.left.iData == iData) {
				previous.left = null;
			} else if (previous.right.iData == iData) {
				previous.right = null;
			}
		}

	}

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(63);
		tree.insert(27);
		tree.insert(80);
		tree.insert(13);
		tree.insert(51);
		tree.insert(70);
		tree.insert(92);
		tree.insert(8);
		tree.insert(9);
		tree.insert(95);
		tree.insert(91);
		tree.insert(83);
		tree.insert(65);
		tree.insert(68);
		tree.insert(45);
		tree.insert(43);
		tree.insert(42);
		tree.insert(69);
		tree.display();
		tree.deleteleaf(100);
		tree.display();
	}

	/**
	 * Gets the successor.
	 * 
	 * @param cNode
	 *            the c node
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
	 * Inorder.
	 * 
	 * @param node
	 *            the node
	 */
	public void inorder(Node node) {
		if (node == null) {
			return;
		} else {
			inorder(node.left);
			node.displayNode();
			inorder(node.right);
			// node.displayNode();
		}
	}

	/**
	 * Left view.
	 */
	public void leftView() {

		Node current = parent;
		Stack stack = new Stack(10);
		while (current != null) {
			stack.push(current);
			current.displayNode();
			if (current.left == null) {
				current = current.right;
			} else
				current = current.left;

		}
		while (!stack.isEmpty()) {
			Node node = stack.pop();
			// node.displayNode();
		}

	}

	/**
	 * Left n right view.
	 */
	public void leftNRightView() {
		System.out.println("Left and Right View.");
		Node lCurrent = parent.left;
		Node rCurrent = parent.right;
		Queue lQueue = new Queue(26);
		Queue rQueue = new Queue(26);
		lQueue.enqueue(parent);
		rQueue.enqueue(parent);
		Node previous = null;
		while (lCurrent != null || rCurrent != null) {

			previous = lCurrent;
			if (lCurrent != null) {
				lQueue.enqueue(lCurrent);
				// lCurrent.displayNode();
				lCurrent = lCurrent.left;
			}
			if (lCurrent == null) {
				lCurrent = previous.right;
			}
			if (rCurrent != null) {
				// rCurrent.displayNode();
				rQueue.enqueue(rCurrent);
				previous = rCurrent;
				rCurrent = rCurrent.right;
			}
			if (rCurrent == null) {
				rCurrent = previous.left;
			}

		}
		System.out.print("LeftView ");
		while (!lQueue.isEmpty()) {
			lQueue.dequeue().displayNode();
		}
		System.out.println();
		System.out.print("RightView ");
		while (!rQueue.isEmpty()) {
			rQueue.dequeue().displayNode();
		}
	}

	/**
	 * In level order2 bst.
	 * 
	 * @param lArray
	 *            the l array
	 * @param inArray
	 *            the in array
	 */
	public void inLevelOrder2BST(int[] lArray, int[] inArray) {
		for (int i = 0; i < inArray.length; i++) {

		}

		Node node = null;
	}

	/**
	 * Construct bst.
	 * 
	 * @param node
	 *            the node
	 * @param lSubArray
	 *            the l sub array
	 * @param inSubArray
	 *            the in sub array
	 * @param l
	 *            the l
	 * @param in
	 *            the in
	 * @return the node
	 */
	public Node constructBST(Node node, int[] lSubArray, int[] inSubArray,
			int l, int in) {
		Node parent = new Node(lSubArray[0]);
		if (l == in) {
			Node node1 = new Node(lSubArray[l]);
			return node1;
		}

		// node.iData=lSubArray[0];
		// subArrays(lSubArray,inSubArray,node.iData);
		int end = inSubArray(inSubArray, lSubArray, l, in);
		inSubArray = subArrays(l, end - 1, inSubArray);
		int[] rSubArray = subArrays(end + 1, in, inSubArray);
		parent.left = constructBST(node, lSubArray, inSubArray, l, end);
		System.out.println("in: " + in);
		// node.left = node;
		parent.right = constructBST(node, lSubArray, rSubArray, l, end);
		System.out.println("in+1 " + in + 1);
		// node.right = node;
		return parent;

	}

	/**
	 * In sub array.
	 * 
	 * @param inSubArray
	 *            the in sub array
	 * @param lSubArray
	 *            the l sub array
	 * @param str
	 *            the str
	 * @param end
	 *            the end
	 * @return the int
	 */
	public int inSubArray(int[] inSubArray, int[] lSubArray, int str, int end) {
		for (int i = 0; i < lSubArray.length; i++) {
			for (int j = str; j < end; j++) {
				if (lSubArray[i] == inSubArray[j]) {
					return j;
				}
			}
		}
		return end;
	}

	/**
	 * Sub arrays.
	 * 
	 * @param str
	 *            the str
	 * @param end
	 *            the end
	 * @param subArray
	 *            the sub array
	 * @return the int[]
	 */
	public int[] subArrays(int str, int end, int[] subArray) {
		System.out.println("end-str: " + (end - str));
		int[] newArray = null;
		if ((end - str) > -1) {
			newArray = new int[end - str];
			for (int i = 0; i < end - str; i++) {
				newArray[i] = subArray[i];
			}
		}
		return newArray;
	}

	/**
	 * Display.
	 */
	public void display() {
		System.out.println("Binary Search Tree");
		Stack stack = new Stack(32);
		Stack tempStack = new Stack(32);
		stack.push(parent);
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
