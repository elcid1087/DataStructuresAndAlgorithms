package myclasses.demos.ds.queue.dequeue;

public class Dequeue {

	private int[] dequeueArray;
	private int maxSize;
	private int front;
	private int rear;

	public Dequeue(int size) {
		maxSize = size;
		dequeueArray = new int[maxSize];
		front = -1;
		rear = -1;

	}

	public boolean isEmpty() {
		return (rear == -1 && front == -1) || (rear < front);
	}

	public boolean isFull() {
		return (front == 0 && rear == maxSize - 1);
	}

	public void insertFirst(int iValue) {
		swap(front, rear);
		if (front == -1) {
			dequeueArray[++front] = iValue;
			rear++;
//			System.out.println("Inserted: " + dequeueArray[front]);
		} else if (front > 0) {
			dequeueArray[--front] = iValue;
//			System.out.println("Inserted: " + dequeueArray[front]);
		} else if (!isFull()) {
			// Move the elements in the array.
			moveElementsForward(front, rear);
			dequeueArray[front] = iValue;
			rear++;
//			System.out.println("Inserted: " + dequeueArray[front]);
		} else {
			System.out.println("Queue is full");
		}
	}

	private void moveElementsForward(int front2, int rear2) {
		for (int i = rear2; i >= front2; i--) {
			dequeueArray[i + 1] = dequeueArray[i];

		}
	}

	public void moveArrayForwrd(int front, int rear) {
		for (int i = rear + 1; i >= front + 1; i--) {
			dequeueArray[i] = dequeueArray[i - 1];
		}
	}

	public void insertLast(int iValue) {
		swap(front, rear);
		if (!isFull()) {
			if (rear == maxSize - 1) {
				// Move the elements
				moveELementsBackward(front, rear);
				front--;	
			} else {
				rear++;
			}
			dequeueArray[rear] = iValue;
			System.out.println("Inserted Last: " + dequeueArray[rear]);
		}

	}

	private void moveELementsBackward(int front2, int rear2) {
		// TODO Auto-generated method stub
		for (int i = front2; i <= rear2; i++) {
			dequeueArray[i - 1] = dequeueArray[i];
		}

	}

	private void swap(int front2, int rear2) {
		if (rear < front) {
			int temp = front;
			front = rear;
			rear = temp;
		}

	}

	public void removeFirst() {
		if (!isEmpty()) {

			System.out.println("Removed Elem at first: "
					+ dequeueArray[front++]);
		}
	}

	public void removeLast() {
		if (!isEmpty()) {

			System.out.println("Removed Last: " + dequeueArray[rear--]);
		}
	}

	public void display() {
		System.out.print("Dequeue First--> Last: ");
		if (!isEmpty()) {
			for (int i = front; i <= rear; i++) {
				System.out.print(dequeueArray[i] + " ");
			}
		}
System.out.println(" ");
	}
}
