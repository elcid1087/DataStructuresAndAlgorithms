package myclasses.demos.ds.link.doublylinkedlist;

// TODO: Auto-generated Javadoc
/**
 * The Class DoublyLinkdedListApp.
 */
public class DoublyLinkdedListApp {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		DoublyLinkedList doublyLinked = new DoublyLinkedList();
		doublyLinked.insertfirst(1);
		doublyLinked.insertfirst(2);
		doublyLinked.insertfirst(3);
		doublyLinked.insertfirst(4);
		doublyLinked.display();
		
		doublyLinked.deleteLast();
		doublyLinked.deleteLast();
		doublyLinked.display();
		doublyLinked.deleteLast();
		doublyLinked.deleteLast();
		doublyLinked.display();
		
		doublyLinked.deleteBefore(1);
		doublyLinked.display();
		doublyLinked.insertLast(-1);
		doublyLinked.insertLast(-2);
		doublyLinked.insertLast(-3);
		doublyLinked.display();
		doublyLinked.deleteFirst();
		doublyLinked.deleteFirst();
		doublyLinked.display();
		doublyLinked.deleteFirst();
		doublyLinked.display();
		doublyLinked.deleteLast();
		doublyLinked.display();
		doublyLinked.insertfirst(1);
		doublyLinked.insertAfter(1, 2);
		doublyLinked.insertAfter(1, -1);
		doublyLinked.insertAfter(2, 3);
		doublyLinked.insertAfter(-2, -3);
		doublyLinked.display();
		doublyLinked.insertBefore(-1, 0);
		doublyLinked.insertBefore(0, 4);
		doublyLinked.display();
		doublyLinked.insertBefore(1, 0);
		doublyLinked.display();
		doublyLinked.deleteBefore(0);
		doublyLinked.display();
		doublyLinked.deleteBefore(-2);
		doublyLinked.display();
		doublyLinked.deleteBefore(1);
		doublyLinked.display();
		
		
		
	}
}
