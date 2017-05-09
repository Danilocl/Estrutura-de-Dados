package lista;

public class Node {

	private Produto conteudo;
	private Node next;
	private Node previous;

	public Node(Node next, Node previous, Produto conteudo) {
		this.next = next;
		this.previous = previous;
		this.conteudo = conteudo;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

	public Produto getConteudo() {
		return conteudo;
	}

	public void setConteudo(Produto conteudo) {
		this.conteudo = conteudo;
	}

}
