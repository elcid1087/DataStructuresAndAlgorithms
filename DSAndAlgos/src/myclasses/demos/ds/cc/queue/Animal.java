package myclasses.demos.ds.cc.queue;

public abstract class Animal {
	public int order;
	public String name;

	public Animal(String name) {
		this.name = name;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal [order=" + order + ", name=" + name + "]";
	}

}
