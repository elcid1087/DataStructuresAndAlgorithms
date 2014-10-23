package myclasses.demos.ds.cc.linkedlist;

// TODO: Auto-generated Javadoc
/**
 * Implement a function to check if a linked list is a palindrome,
 */
public class PalindromeLink {
	/** The head. */
	private Link head;

	/** The reversed list. */
	private static Link reversedList;

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
	 * Palindrome.
	 * 
	 * @return true, if successful
	 */
	public boolean palindrome() {
		// call reverse
		reverse();
		Link cHead = head;
		Link rHead = reversedList;
		while (cHead != null) {
			if (cHead.iData != rHead.iData) {
				System.out.println("Not a palindrome");
				return false;
			}
			cHead = cHead.next;
			rHead = rHead.next;
		}
		return true;
	}

	/**
	 * Reverse.
	 */
	public void reverse() {
		Link current = head;
		while (current != null) {
			insertFirst(current.iData);
			current = current.next;
		}
	}

	/**
	 * Insert first.
	 * 
	 * @param iData
	 *            the i data
	 */
	public void insertFirst(int iData) {

		Link newLink = new Link(iData);
		newLink.next = reversedList;
		reversedList = newLink;
	}

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		PalindromeLink pd = new PalindromeLink();
		int size = 5;
		pd.insert(1);
		pd.insert(0);
		pd.insert(1);
		pd.insert(1);
		boolean isPalindrome = pd.palindrome();
		if (isPalindrome) {
			System.out.println("Is a palindrome");
		}
	}
}
