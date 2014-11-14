package myclasses.demos.ds.queue.priorityqueue.q44;

// TODO: DO WITHOUT USING REAR AND FRONT
//?????????????

/**
 * The Class PriorityQueue.
 */
public class PriorityQueue {

	/** The priority queue array. */
	private final int[] priorityQueueArray;

	/** The front. */
	private int front;

	/** The rear. */
	private int rear;

	/** The n elem. */
	private int nElem;

	/** The max size. */
	private final int maxSize;

	/**
	 * Instantiates a new priority queue.
	 * 
	 * @param size
	 *            the size
	 */
	public PriorityQueue(int size) {
		maxSize = size;
		priorityQueueArray = new int[maxSize];
		front = 0;
		rear = -1;
		nElem = 0;
	}

	/**
	 * Checks if is empty.
	 * 
	 * @return true, if is empty
	 */
	public boolean isEmpty() {
		return (nElem == 0);
	}

	/**
	 * Checks if is full.
	 * 
	 * @return true, if is full
	 */
	public boolean isFull() {
		return nElem == maxSize;
	}

	/**
	 * Insert.
	 * 
	 * @param iValue
	 *            the i value
	 */
	public void insert(int iValue) {
		if (!isFull()) {
			if (rear == maxSize - 1) {
				rear = -1;
			}
			priorityQueueArray[++rear] = iValue;
			nElem++;
		}
	}

	/**
	 * Removes the.
	 */
	public void remove() {
		if (!isEmpty()) {
			if (front == maxSize) {
				front = 0;
			}
			if (front != rear) {
				int temp = priorityQueueArray[front];
				for (int i = front; i != rear; i++) {
					if (i == maxSize - 1) {
						i = -1;
					}
					if (temp < priorityQueueArray[i + 1]) {
						// Swap

						priorityQueueArray[front] = priorityQueueArray[i + 1];
						priorityQueueArray[i + 1] = temp;
						temp = priorityQueueArray[front];

					}
				}
			}
			System.out.println("Removed elem: " + priorityQueueArray[front++]);
			nElem--;
		}
	}

	/**
	 * Display.
	 */
	public void display() {
		System.out.print("Priority Queue First --> Last: ");

		int i = front;
		do {
			if (i == maxSize) {
				i = 0;
			}
			System.out.print(priorityQueueArray[i] + " ");
			i++;

		} while (i != rear + 1);

		System.out.println("");
	}
}
