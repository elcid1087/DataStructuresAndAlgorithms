package myclasses.demos.ds.link.sortedlist;

// TODO: Auto-generated Javadoc
/**
 * The Class SortedListApp.
 */
public class SortedListApp {

/**
 * The main method.
 *
 * @param args the arguments
 */
public static void main(String[] args) {
	SortedList sortedList = new SortedList();
	sortedList.insertionSort(5);
	sortedList.insertionSort(2);
	sortedList.insertionSort(3);
	sortedList.insertionSort(4);
	sortedList.insertionSort(1);
	sortedList.display();
	
}

}
