package myclasses.demos.ds.cc.linkedlist;


// TODO: Auto-generated Javadoc
/**
 * Write code to remove duplicates from an unsorted linked list.
 * 
 * @author shashi
 */
public class RemoveDupFromUnsortedList {

	/** The head. */
	private Link head;
	public int[] hashTable;
	public int htSize;

	public RemoveDupFromUnsortedList(int size) {
		htSize = size;
		hashTable = new int[htSize];
	}

	/**
	 * Insert.
	 * 
	 * @param iData
	 *            the i data
	 */
	public void insert(int iData) {
		Link newLink = new Link(iData);
		if (null == head) {
			head = newLink;
		} else {
			Link current = head;
			Link previous = current;
			while (null != current) {
				previous = current;
				current = current.next;
			}
			previous.next = newLink;
		}
	}

	/**
	 * Display list.
	 */
	public void displayList() {
		Link current = head;
		while (null != current) {
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}

	/**
	 * Removes the duplicates linear search. Which compare each element of the
	 * list with all the remaining elements. Things to consider, i) No need to
	 * compare each element with the entire list, eg: take 1st element and
	 * compare it with remaining elements and once iterated through entire list,
	 * that means all the duplicate elements have been removed, move to next
	 * element.
	 */
	public void removeDuplicatesLinearSearch() {
		System.out.println("Remove Duplicates in the linked list");
		Link oLink = head;
		while (null != oLink) {
			int iData = oLink.iData;
			Link iLink = oLink;
			while (null != iLink.next) {// Check if the next element is null if
										// not check it is the a duplicate
										// element
				if (iData == iLink.next.iData) {// If it is a duplicate element
												// the update the current link
												// to duplicates next link.s
					iLink.next = iLink.next.next;
				} else {// Else iterate to next link
					iLink = iLink.next;
				}
			}
			oLink = oLink.next;// Increment to next element
		}
	}

	/**
	 * Removes the duplicates hash table. Each elements value is inserted in the
	 * hashtable which stores only the uniques values (Runtime is O(1)) if the
	 * hashtabel is empty. if HT is not empty that means the element is
	 * duplicate, it is removed by updating the previous link to the duplicates
	 * next link; Things to look out for, ***** This way of implementation is
	 * fast runtime is O(n) since iterating through the list. But requires an
	 * extra hashtable. i)doesn't support for zero, since hashtable is user
	 * defined(my implementation) which is an array whose default values are
	 * zeros.s so it is hard to determine the emptiness of the hashtable when
	 * zeros are present. ii) Hashtable: key is array index and value is array
	 * value.
	 */
	public void removeDuplicatesHashTable() {
		System.out.println("Remove Duplicates in the linked list");
		Link current = head;
		Link previous = current;
		while (current != null) {
			int key = current.iData;
			int hf = hashFunction(key);
			if (key == hashTable[hf]) {
				previous.next = current.next;
			}
			hashTable[hf] = key;
			previous = current;
			current = current.next;
		}

	}

	public int hashFunction(int key) {
		return key % htSize;
	}

	// ////////////////////////////////////////////////
	// /////////TODO ********Implement using merge sort.
	// ////////////////////////////////////////////////

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		int size = 5;
		RemoveDupFromUnsortedList linkedList = new RemoveDupFromUnsortedList(
				size);
		linkedList.insert(1);
		linkedList.insert(4);
		for (int i = 1; i < size; i++) {
			linkedList.insert(i);
		}
		linkedList.displayList();
		// linkedList.removeDuplicatesLinearSearch();
		linkedList.removeDuplicatesHashTable();
		linkedList.displayList();
	}

}
