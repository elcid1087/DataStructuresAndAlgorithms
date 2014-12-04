package myclasses.demos.ds.tree.binarytree.stringoflettersQ1;


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

	// public void inOrderNonRec(Node node) {
	// Stack stack = new Stack(26);
	// Node current = parent;
	//
	// stack = findLeft(current, stack);
	// while (!stack.isEmpty()) {
	// Node cNode = stack.pop();
	// if (cNode != null) {
	// if (cNode.left == null && cNode.right == null) {
	// cNode.displayNode();
	// } else if (cNode.left == null) { //
	// cNode.displayNode();
	// if (cNode.right != null && cNode.right.left != null) {
	// stack = findLeft(cNode, stack);
	// }
	//
	// } else {
	// cNode.displayNode();
	// if (cNode.right != null && cNode.right.left != null) {
	// stack = findLeft(cNode.right, stack);
	// } else {
	// stack.push(cNode.right);
	// }
	// }
	// }
	// }
	// }

	/**
	 * In order node rec. Non recursive approach for the inorder traversal.
	 */
	public void inOrderNodeRec() {

		Stack stack = new Stack(26);
		Node current = parent;
		stack = findLeftMost(current, stack);
		while (!stack.isEmpty()) {
			Node node = stack.pop();
			node.displayNode();
			if (node.right != null) {
				stack = findLeftMost(node.right, stack);
			}
		}
	}

	/**
	 * Find left most. To find the left most node for any subtree.
	 * 
	 * @param current
	 *            the current
	 * @param stack
	 *            the stack
	 * @return the stack
	 */
	public Stack findLeftMost(Node current, Stack stack) {
		while (current.left != null) {
			stack.push(current);
			current = current.left;
		}
		stack.push(current);
		return stack;
	}

	public void preOrder(Node node) {
		if (node == null) {
			return;
		} else {
			node.displayNode();
			preOrder(node.left);
			preOrder(node.right);
		}
	}

	public void leftView() {
		Node current = parent;
		Stack stack = new Stack(10);
		while (current != null) {
			stack.push(current);
			if (current.left == null) {
				current = current.right;
			} else
				current = current.left;
		}
		while (!stack.isEmpty()) {
			Node node = stack.pop();
			node.displayNode();
		}
	}

	public void leftViewWithoutStack() {
		System.out.println("Left View Without Stack.");
		Node current = parent;
		while (current != null) {
			current.displayNode();
			if (current.left == null) {
				current = current.right;
			} else
				current = current.left;
		}

		System.out.println("End of Left View Without Stack.");
	}
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

	public void leftViewRec(Node node) {
		if (node == null) {
			return;
		} else {
			if (node.left == null) {
				leftViewRec(node.right);
			} else{
			leftViewRec(node.left);
		}
			node.displayNode();
		}
	}

	public void breadthFirstSearch() {
		System.out.println("Breadth First Search Using Stacks");
		Stack mStack = new Stack(26);
		Stack tStack = new Stack(26);
		mStack.push(parent);
		while (!mStack.isEmpty()) {

			while (!mStack.isEmpty()) {
				tStack.push(mStack.pop());
			}
			while (!tStack.isEmpty()) {
				Node node = tStack.pop();
				if (node != null) {
					node.displayNode();

					mStack.push(node.left);
					mStack.push(node.right);
				}
			}

		}
		System.out.println("End of Breadth First Search Using Stacks");
	}

	public void breadthFirstSearchQueue() {
		System.out.println("Breadth First Search Using Queue ");
		Queue queue = new Queue(26);
		queue.enqueue(parent);
		while (!queue.isEmpty()) {
			Node node = queue.dequeue();
			node.displayNode();
			if (node.left != null)
				queue.enqueue(node.left);
			if (node.right != null)
				queue.enqueue(node.right);
		}
		System.out.println("End of Breadth First Search Using Queue ");
	}

	/**
	 * Insert letter. Solution for Programming Projects 8.1
	 * 
	 * @param letter
	 *            the letter
	 */
	public void insertLetter(char letter) {
		Node plusNode = new Node('+');
		Node newNode = new Node(letter);

		if (parent == null) {
			plusNode.left = newNode;
			parent = plusNode;
		} else if (parent.right == null) {
			parent.right = newNode;
		} else {
			plusNode.right = newNode;
			plusNode.left = parent;
			parent = plusNode;

		}

	}

	/**
	 * Insert letter balanced. We can go with two approaches: 1) Given as Hint.
	 * 2) Insert expand the tree every time a new node comes.
	 * 
	 * @param letter
	 *            the letter
	 */
	public void insertLetterBalanced(char letter) {

	}

	/**
	 * Balance tree.
	 */
	public void balanceTree() {
		Stack levelStack = new Stack(14);
		Stack elemStack = new Stack(14);
		Node node = parent;
		while (node.left.left != null && node.left.right != null) {
			elemStack.push(node.right);
			node.right = null;
			// levelStack.push(node);
			node = node.left;
		}
		elemStack.push(node.right);
		elemStack.push(node.left);

		while (elemStack.size() != 0) {
			while (!elemStack.isEmpty()) {
				Node node1 = createRec(elemStack, 0, new Node('+'));
				levelStack.push(node1);
			}
			while (!levelStack.isEmpty()) {
				elemStack.push(levelStack.pop());
			}
		}
		parent = elemStack.pop();
	}

	/**
	 * Creates the rec.
	 * 
	 * @param eStack
	 *            the e stack
	 * @param i
	 *            the i
	 * @param newNode
	 *            the new node
	 * @return the node
	 */
	public Node createRec(Stack eStack, int i, Node newNode) {

		if (!eStack.isEmpty()) {
			if (i == 0) {
				Node c = eStack.pop();
				i++;
				newNode.left = c;
				return createRec(eStack, i++, newNode);

			} else if (i == 1) {
				Node c = eStack.pop();
				i++;
				newNode.right = c;
				return createRec(eStack, i++, newNode);

			}
		}
		return newNode;
	}

	// TODO -- IMPLEMENT THIS METHOD
	/**
	 * Delete letter. Not completely implemented yet.
	 * 
	 * @param letter
	 *            the letter
	 */
	public void deleteLetter(int letter) {
		Node current = parent;
		Node previous = parent;
		while (current != null && current.right != null) {
			if (current.right.iData == letter) {
				System.out.println("found");
				current.right.iData = 0;
				break;
			}
			previous = current;
			current = current.left;
		}
		System.out.println((char) previous.left.iData);
		if (previous.left.iData == letter) {
			System.out.println("found");
		}
	}

	/**
	 * Delete parent.
	 */
	public void deleteParent() {
		parent = null;
	}

	/**
	 * Order from top down.
	 * 
	 * @param cValue
	 *            the c value
	 */
	public void orderFromTopDown(char cValue) {
		Node newNode = new Node(cValue);
		Node current = parent;
		Node previous = parent;
		Stack mStack = new Stack(15);
		Stack tStack = new Stack(15);
		mStack.push(parent);

		if (parent == null) {
			parent = newNode;
		} else {
			while (!mStack.isEmpty()) {

				while (!mStack.isEmpty()) {
					tStack.push(mStack.pop());
				}
				while (!tStack.isEmpty()) {
					previous = current;
					current = tStack.pop();
					if (current.left == null) {
						current.left = newNode;
						emptyStack(mStack);
						break;
					} else if (current.right == null) {
						current.right = newNode;
						emptyStack(mStack);
						break;
					} else {
						mStack.push(current.left);
						mStack.push(current.right);

					}

				}
			}

		}
	}

	/**
	 * Empty stack.
	 * 
	 * @param tStack
	 *            the t stack
	 */
	public void emptyStack(Stack tStack) {
		while (!tStack.isEmpty()) {
			tStack.pop();
		}
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

		int l = 2;
		while (l != 128 && !stack.isEmpty()) {
			int nElem1 = nElem;
			nElem1 = nElem1 / l;
			while (!stack.isEmpty()) {
				tempStack.push(stack.pop());
			}

			while (!tempStack.isEmpty()) {

				for (int i = 0; i < nElem1 - 1; i++) {
					System.out.print(" ");
				}
				Node node = tempStack.pop();
				if (node != null) {
					System.out.print((char) node.iData);
					stack.push(node.left);
					stack.push(node.right);
				} else {
					System.out.print("--");
					stack.push(null);
					stack.push(null);
				}

				for (int i = 0; i < nElem1; i++) {
					System.out.print(" ");
				}

			}
			System.out.println();
			l = l * 2;

		}
		System.out.println();
		System.out.println("End of BST");
	}

}
