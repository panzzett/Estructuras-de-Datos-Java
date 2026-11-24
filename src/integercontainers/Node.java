package integercontainers;

class Node {
	Node next;
	Integer value;
	
	Node(Integer value) {
		this.value = value;
		this.next = null;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
