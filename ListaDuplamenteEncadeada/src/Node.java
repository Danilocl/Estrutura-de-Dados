
public class Node {

	private Produto conteudo;
	private Node anterior;
	private Node proximo;

	public Node(Produto conteudo,Node anterior,Node proximo) {
		// TODO Auto-generated constructor stub
	}

	public Produto getConteudo() {
		return conteudo;
	}

	public void setConteudo(Produto conteudo) {
		this.conteudo = conteudo;
	}

	public Node getAnterior() {
		return anterior;
	}

	public void setAnterior(Node anterior) {
		this.anterior = anterior;
	}

	public Node getProximo() {
		return proximo;
	}

	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}
}
