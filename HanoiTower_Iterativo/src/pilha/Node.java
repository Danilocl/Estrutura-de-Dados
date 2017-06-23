package pilha;

public class Node {

	private Object disk;
	private Node next;

	public Node(Object content) {
		super();
		this.disk = content;

	}

	public Object getdisk() {
		return disk;
	}

	public void setdisk(int disk) {
		this.disk = disk;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
