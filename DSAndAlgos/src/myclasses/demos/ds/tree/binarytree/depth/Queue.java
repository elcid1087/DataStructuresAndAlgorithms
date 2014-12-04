package myclasses.demos.ds.tree.binarytree.depth;

public class Queue {
	private Node[] queueArray;
	private int head;
	private int tail;
	private int elemCount;
	private int maxSize;

	public Queue(int size) {
		maxSize = size;
		queueArray = new Node[maxSize];
		head = 0;
		tail = -1;
		elemCount = 0;
	}

	public Node peek() {
		return queueArray[maxSize];
	}

	public boolean isEmpty() {
		return elemCount == 0;
	}

	public boolean isFull() {
		return elemCount == maxSize;
	}

	public void enqueue(Node iValue) {
		if (!isFull()) {
			if (tail == maxSize - 1) {
				tail = -1;
			}
			queueArray[++tail] = iValue;
//			System.out.println("Queued element: " + iValue);
			elemCount++;
		}
	}

	public Node dequeue() {
		if (!isEmpty()) {
			if (head == maxSize) {
				head = 0;
			}
			Node out = queueArray[head++];
//			System.out.println("Dequeued element: " + out);
			elemCount--;
			return out;
		}
		return null;
	}

	public void displayQueue() {
		System.out.print("Queue: ");
		if (isEmpty()) {
			System.out.print("Queue is empty");
		} else {
			int headIndex = head;
			if(tail<head){
				for (int i = headIndex; i <= maxSize-1; i++) {
					System.out.print(queueArray[i] +" ");
				}
				headIndex=0;
			}
			for (int i = headIndex; i <= tail; i++) {
				System.out.print(queueArray[i] +" ");
			}
		}
		System.out.println();
	}
	
	
	public void displayQueueEff(){
		System.out.print("Queue: First --> Last ");
		
		if(isEmpty()){
			System.out.print("Queue is empty");
		}else{
			int headIndex= head;
			do{
				if(headIndex>=maxSize){
					headIndex=0;
				}
				System.out.print(queueArray[headIndex] +" ");
				headIndex++;
				
			}while(headIndex!=tail+1);
			
			/*for(int i=headIndex;i!=tail+1;i++){
				if(i>=maxSize){
					headIndex=0;
				}
				System.out.print(queueArray[headIndex] +" ");
			}*/
		}
		System.out.println();
	}
	
}
