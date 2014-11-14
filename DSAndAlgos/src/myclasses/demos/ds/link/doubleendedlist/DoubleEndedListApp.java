package myclasses.demos.ds.link.doubleendedlist;

// TODO: Auto-generated Javadoc
/**
 * The Class DoubleEndedListApp.
 */
public class DoubleEndedListApp {

/**
 * The main method.
 *
 * @param args the arguments
 */
public static void main(String[] args) {
	DoubleEndedList doubleEndedList = new DoubleEndedList();
	doubleEndedList.insertFirst(1);
	doubleEndedList.insertFirst(2);
	doubleEndedList.insertFirst(3);
	doubleEndedList.insertFirst(4);
	doubleEndedList.insertFirst(5);
	doubleEndedList.display();
	doubleEndedList.insertLast(0);
	doubleEndedList.display();
	doubleEndedList.deleteFirst();
	doubleEndedList.display();
	
}
}
