package myclasses.demos.ds.tree.binarytree.depth;

import java.util.ArrayList;

public class Tree {
	public Node parent;

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

	public int findMin() {
		Node cNode = parent;
		Node pNode = parent;

		while (cNode != null) {
			pNode = cNode;
			cNode = cNode.left;
		}
		return pNode.iData;
	}

	public int findMax() {
		Node cNode = parent;
		Node pNode = parent;
		while (cNode != null) {
			pNode = cNode;
			cNode = cNode.right;
		}
		return pNode.iData;
	}

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
int depth;
	public void inorder(Node node) {
		if (node == null) {
			return;
		} else {
			inorder(node.left);
			node.displayNode();
			inorder(node.right);
		}
	}

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

	public void leftNRightView() {
		System.out.println("Left and Right View.");
		Node lCurrent = parent.left;
		Node rCurrent = parent.right;
		Queue lQueue = new Queue(26);
		Queue rQueue = new Queue(26);
		lQueue.enqueue(parent);
		rQueue.enqueue(parent);
		Node previous = parent;
		while (lCurrent != null || rCurrent != null) {

			if (lCurrent != null) {
				lQueue.enqueue(lCurrent);
				// lCurrent.displayNode();
				lCurrent = lCurrent.left;
			}
			if (lCurrent == null && previous != null) {
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
			previous = lCurrent;

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

	public int maxDepth(Node node) {
		
		if (node == null) {
			return 0;
		} else {
			int lMax = maxDepth(node.left);
			int rMax = maxDepth(node.right);
			if (lMax > rMax) {
				return lMax + 1;
			} else {
				return rMax + 1;
			}
		}

	}
public int depthOfKey(Node node) {
		
		if (node == null) {
			return 0;
		} 
			
			int lMax = depthOfKey(node.left);
			System.out.println("node: "+ node.iData+ " lMax "+ lMax);
			int rMax = depthOfKey(node.right);
			System.out.println("node: "+ node.iData+ " rMax "+ rMax);
			if (lMax > rMax) {
				return lMax + 1;
			} else {
				return rMax + 1;
			}

	}


	public void maxDepthNonRec() {
		Stack stack = new Stack(32);
		int level = findLeftMostNode(parent, stack, 0);
		while (!stack.isEmpty()) {
			Node node = stack.pop();
			if (node.right != null) {
				level = findLeftMostNode(node.right, stack, level);
			}
			level--;
		}
		System.out.println("level: " + level);
	}

	public int findLeftMostNode(Node node, Stack stack, int level) {
		while (node.left != null) {
			level++;
			stack.push(node);
			node = node.left;
		}
		return level;
	}

	public void display() {
		System.out.println("Binary Search Tree");
		Stack stack = new Stack(32);
		Stack tempStack = new Stack(32);
		stack.push(parent);
		int nElem = 256;
		int level = 0;
		int l = 2;
		while (l != 256 && !stack.isEmpty()) {
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
