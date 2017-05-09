package lista;

public class Node {

	private Node previous;
	private int Content;
	private Node next;

	public Node(Node previous,int content, Node next) {
		super();
		Content = content;
		this.previous = previous;
		this.next = next;
	}

	public int getContent() {
		return Content;
	}

	public void setContent(int content) {
		Content = content;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
