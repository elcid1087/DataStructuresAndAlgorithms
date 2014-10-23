package myclasses.demos.ds.cc.queue;

import java.util.LinkedList;

// TODO: Auto-generated Javadoc
/**
 * An animal shelter holds only dogs and cats, and operates on a strictly
 * "first in, first out" basis. People must adopt either the "oldest" (based on
 * arrival time) of all animals at the shelter, or they can select whether they
 * would prefer a dog or a cat (and will receive the oldest animal of that
 * type). They cannot select which specific animal they would like. Create the
 * data structures to maintain this system and implement opera- tions such as
 * enqueue, dequeueAny, dequeueDog and dequeueCat. You may use the built-in L
 * inkedL ist data structure.
 */
public class Queue {

	/** The front. */
	private int front;

	/** The rear. */
	private int rear;

	/** The dogs. */
	private final LinkedList<Dog> dogs;

	/** The cats. */
	private final LinkedList<Cat> cats;

	/** The insertion order. */
	private int insertionOrder;

	/**
	 * Instantiates a new queue.
	 */
	public Queue() {
		dogs = new LinkedList<Dog>();
		cats = new LinkedList<Cat>();
	}

	/**
	 * En queue.
	 * 
	 * @param animal
	 *            the animal
	 */
	public void enQueue(Animal animal) {
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
			dog.setOrder(insertionOrder++);
			System.out.println("Dog " + dog.getName() + " is enqueued");
			dogs.add(dog);
		} else if (animal instanceof Cat) {
			Cat cat = (Cat) animal;
			cat.setOrder(insertionOrder++);
			System.out.println("Cat " + cat.getName() + " is enqueued");
			cats.add(cat);
		}
	}

	/**
	 * Dequeue any.
	 */
	public void dequeueAny() {
		Dog dog = dogs.peek();
		Cat cat = cats.peek();
		Animal a = null;
		if (dog != null && cat != null) {
			if (dog.getOrder() < cat.getOrder()) {
				a = dogs.poll();
			} else {
				a = cats.poll();
			}
			System.out.println("Animal polled is is " + a.getName());
		}
	}

	/**
	 * Dequeue dog.
	 */
	public void dequeueDog() {
		Dog d = dogs.poll();
		System.out.println("Dog polled: " + d.getName());
	}

	/**
	 * Dequeue cat.
	 */
	public void dequeueCat() {
		Cat c = cats.poll();
		System.out.println("Cat polled: " + c.getName());
	}

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		Queue queue = new Queue();
		Dog d1 = new Dog("d1");
		Dog d2 = new Dog("d2");
		Dog d3 = new Dog("d3");
		Dog d4 = new Dog("d4");
		Cat c1 = new Cat("c1");
		Cat c2 = new Cat("c2");
		Cat c3 = new Cat("c3");
		queue.enQueue(d1);
		queue.enQueue(c1);
		queue.enQueue(d2);
		queue.enQueue(c2);
		queue.enQueue(c3);
		queue.enQueue(d3);
		queue.dequeueAny();
		queue.dequeueDog();
		queue.dequeueCat();
		queue.dequeueAny();
		queue.enQueue(d4);

	}

}
