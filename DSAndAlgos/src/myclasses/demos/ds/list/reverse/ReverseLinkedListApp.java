package myclasses.demos.ds.list.reverse;

// TODO: Auto-generated Javadoc
/**
 * The Class ReverseLinkedListApp.
 */
public class ReverseLinkedListApp {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
	ReverseLinkedList reverseList = new ReverseLinkedList();
reverseList.insertLast(1);	
reverseList.insertLast(2);	
reverseList.insertLast(3);	
reverseList.insertLast(4);	
reverseList.insertLast(5);
reverseList.display();
reverseList.reverse();
reverseList.display();
	}

}
