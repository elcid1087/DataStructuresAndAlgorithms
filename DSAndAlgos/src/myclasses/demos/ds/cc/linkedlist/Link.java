package myclasses.demos.ds.cc.linkedlist;

public class Link {
	public int iData;
public Link next;
	public Link(int id) {
		this.iData = id;
	}

	public void displayLink() {
		System.out.print(iData + " ");
	}
}
