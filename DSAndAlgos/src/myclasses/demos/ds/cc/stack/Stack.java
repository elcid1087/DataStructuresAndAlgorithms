package myclasses.demos.ds.cc.stack;

public class Stack {

	private int[] stackArray;
	private int[] minStack;
	private int size;
	private int top = -1;
	private int minIndex = -1;

	public Stack(int size) {
		this.size = size;
		stackArray = new int[size];
		minStack = new int[size];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == size - 1;
	}

	public int peek() {
		return stackArray[top];
	}

	public void push(int iData) {
		if (!isFull()) {
			System.out.println("push--> " + iData);
			stackArray[++top] = iData;
			if (minIndex == -1 || iData < minStack[minIndex]) {
				System.out.println("min--> "+ iData);
				minStack[++minIndex] = iData;
			}
		} else {
			System.out.println("Cannot push since stack is full");
		}
	}

	public void min() {
		if (minIndex != -1){
			System.out.println("min: " + minStack[minIndex]);
		}
	}

	public void pop() {
		if (!isEmpty()) {
			int i = stackArray[top--];
			System.out.println("pop--> " + i);
			if (i == minStack[minIndex]) {
				minIndex--;
			}
		} else {
			System.out.println("Cannot pop since stack is empty");
		}
	}

	public static void main(String[] args) {
		Stack stack = new Stack(10);
		stack.push(4);
		stack.push(5);
		stack.push(3);
		stack.min();
		stack.push(4);
		stack.push(1);
		System.out.println("peek: " + stack.peek());
		stack.pop();
		stack.pop();
		stack.pop();
		stack.min();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.min();
	}
}
