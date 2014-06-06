package myclasses.demos.ds.queue.priorityqueue;

import java.util.Queue;

public class PriorityQueue {
	private int[] priorityQueueArray;
	private int front;
	private int rear;
	private int nElem;
	private int maxSize;

	public PriorityQueue(int size) {
		maxSize = size;
		priorityQueueArray = new int[maxSize];
		front = 0;
		rear = -1;
		nElem = 0;
	}

	public boolean isEmpty() {
		return nElem == 0;
	}

	public boolean isFull() {
		return nElem == maxSize - 1;
	}

	public void insert(int iValue) {
		if (!isFull()) {

		}
	}

	public void remove() {
		if (!isEmpty()) {
			System.out.println("Removed elem: " + priorityQueueArray[rear]);
			nElem--;
		}
	}

	public void display() {
		System.out.println("Priority Queue First --> Last: ");
		for (int i = rear; i <= front; i++) {
			System.out.println(priorityQueueArray[i] + " ");
		}
	}
}
