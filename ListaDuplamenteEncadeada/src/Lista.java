
public class Lista {

	private Node primeiro;
	private Node ultimo;
	private int countSize;

	public void addInicio(Produto Conteudo) {
		Node no = new Node(Conteudo, this.primeiro,null);
		this.primeiro.setAnterior(no);
		this.primeiro = no ;
		if (countSize == 0) {
			this.ultimo = no;
			countSize++;
		}
	}

	public void addFim(Produto Conteudo) {
		if (countSize == 0) {
			this.addInicio(Conteudo);
		} else {
			Node no = new Node(Conteudo, this.ultimo,null);
			this.ultimo.setProximo(no);
			this.ultimo = no;
			countSize++;
		}
	}

	public void addPos(int Posicao, Produto Conteudo) {
		if (countSize == 0) {
			this.addInicio(Conteudo);
		} else if (countSize == Posicao) {
			this.addFim(Conteudo);
		}
		Node anterior = this.getNode(Posicao - 1);
		Node newno = new Node(Conteudo, anterior.getProximo(), null);
		anterior.setProximo(newno);
		countSize++;
	}

	public void RemoveInicio(int Posicao) {
		Node temp = this.primeiro;
		this.primeiro = temp.getProximo();
		temp.setProximo(null);
		countSize--;

	}

	public void RemoveFinal(int Posicao) {
		Node anterior = this.ultimo.getAnterior();
		anterior.setProximo(null);
		this.ultimo = anterior;
		countSize--;
	}

	public void RemovePos(int Posicao) {

		Node no = this.getNode(Posicao); // Pega a posição especificada
		Node anterior = no.getAnterior(); // esta mesmo Pegando o Anterior ?
		anterior.setProximo(no.getProximo());
		no.setProximo(null); // É Preciso ?
		countSize--;

	}

	// pega o próximo nó ?
	public Node getNode(int posicao) {

		Node tempNode = this.primeiro;

		for (int i = 0; i <= posicao; i++) {
			tempNode = tempNode.getProximo();
		}
		return tempNode;
	}

	public void Troca(int Posicao) {

	}

	public int tamanho() {
		return this.countSize;
	}

	public String Tamanho() {
		return "";
	}

}
