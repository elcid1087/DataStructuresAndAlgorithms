package myclasses.demos.ds.cc.stack;

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * Imagine a (literal) stack of plates. If the stack gets too high, it migh t
 * topple. Therefore, in real life, we would likely start a new stack when the
 * previous stack exceeds some threshold. Implement a data structure SetOfStacks
 * that mimics this. SetOf- Stacks should be composed of several stacks and
 * should create a new stack once the previous one exceeds capacity.
 * SetOfStacks.push() and SetOfStacks. pop () should behave identically to a
 * single stack (that is, pop () should return the same values as it would if
 * there were just a single stack).
 */
public class SetOfStacks {

	/** The stacks. */
	List<Stack> stacks = new ArrayList<Stack>();

	/** The stack num. */
	private int stackNum;

	/**
	 * Push.
	 * 
	 * @param iData
	 *            the i data
	 */
	public void push(int iData) {
		if (stacks.size() == 0) {
			Stack newStack = new Stack(5);
			stacks.add(newStack);
		}
		Stack currentStack = stacks.get(stackNum);

		if (currentStack.isFull()) {
			System.out.println("creating a new Stack");
			Stack newStack = new Stack(5);
			stacks.add(newStack);
			currentStack = newStack;
			stackNum++;
		}
		currentStack.push(iData);
	}

	/**
	 * Pop.
	 */
	public void pop1() {
		if (stacks.size() != 0) {
			for (int i = stacks.size() - 1; i >= 0; i--) {
				Stack currentStack = stacks.get(i);
				if (currentStack.isEmpty()) {
					if (stackNum > 1) {
						stackNum--;
					}
					continue;
				}
				currentStack.pop();
				break;
			}
		}
	}

	public void pop() {
		if (stacks.size() != 0) {
			Stack currentStack = stacks.get(stackNum);
			if (currentStack.isEmpty() && stackNum != 0) {
				Stack newCurrentStack = stacks.get(--stackNum);
				newCurrentStack.pop();
				System.out.println("return");
				return;
			}
			currentStack.pop();
		}
	}

	/**
	 * Pop at.
	 * 
	 * @param index
	 *            the index
	 */
	public void popAt(int index) {
		if (stacks.size() >= index) {
			Stack currentStack = stacks.get(index);
			if (!currentStack.isEmpty()) {
				currentStack.pop();
			}
		}
	}

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		SetOfStacks setStacks = new SetOfStacks();
		setStacks.push(1);
		setStacks.push(2);
		setStacks.push(3);
		setStacks.push(4);
		setStacks.push(5);
		for (int i = 6; i < 15; i++) {
			setStacks.push(i);
		}
		setStacks.popAt(1);
		for (int i = 0; i < 8; i++) {
			setStacks.pop();
		}
		setStacks.push(16);
		setStacks.push(17);
		setStacks.popAt(1);

	}
}
