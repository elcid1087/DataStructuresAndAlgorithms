package myclasses.demos.ds.link.priorityqueue.q1;

// TODO: Auto-generated Javadoc
/**
 * The Class SortedList.
 */
public class SortedList {

	/** The first. */
	public Link first;

	/**
	 * Insertsorted list.
	 *
	 * @param iValue the i value
	 */
	public void insertsortedList(int iValue) {
		
		Link newLink = new Link(iValue);
		Link current = first;
		Link previous = current;
		while(current!=null&&iValue>current.iData){
			previous = current;
			current = current.next;
		}
		if(current==first){
			newLink.next=first;
			first=newLink;
		}else{
			newLink.next=current;
			previous.next=newLink;
		}
	}
	
	/**
	 * Delete first.
	 */
	public void deleteFirst(){
		if(first!=null){
			System.out.println("dequeued item: "+first.iData);
			first = first.next;
		}
	}
	
	/**
	 * Display sorted list.
	 */
	public void displaySortedList(){
		System.out.print("First --> Last: ");
		
		Link current = first;
		while(current!=null){
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}
