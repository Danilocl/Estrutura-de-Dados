package lista;

public class Lista {

	private Node primeiro;
	private Node ultimo;
	private int countSize = 0;

	/**
	 * Cria um novo nó, faz com que o primeiro aponte para o nó, atualiza a
	 * referÊncia e cria uma verificação
	 * 
	 * @param Conteudo
	 */
	public void addInicio(Produto Conteudo) {
		Node no = new Node(Conteudo, this.primeiro, null);
		if (this.countSize == 0) {
			this.primeiro = no;
			this.ultimo = this.primeiro;
		} else {
			this.primeiro.setAnterior(no);
			this.primeiro = no;
		}
		if (countSize == 0) {
			this.ultimo = no;
			countSize++;
		}
	}

	/**
	 * Cria um novo nó referenciando para o ultimo,seta o ultimo para o novo,
	 * atualiza a referência
	 * 
	 * @param Conteudo
	 */

	public void addFim(Produto Conteudo) {
		if (countSize == 0) {
			this.addInicio(Conteudo);
		} else {
			Node no = new Node(Conteudo, this.ultimo, null);
			this.ultimo.setProximo(no);
			this.ultimo = no;
			countSize++;
		}
	}

	/**
	 * Adiciona em uma Posição especifíca
	 * 
	 * Pega o nó anterior e a posicao do usuario cria um novo nó referenciando
	 * para o anterior e próximo, seta o anterior e o próximo
	 * 
	 * @param Posicao
	 * @param Conteudo
	 */
	public void addPos(int Posicao, Produto Conteudo) {
		if (countSize == 0) {
			this.addInicio(Conteudo);
		} else if (this.countSize == Posicao) {
			this.addFim(Conteudo);
		}
		Node temp1 = this.getNode(Posicao - 1);
		Node temp2 = temp1.getProximo();
		Node newNode = new Node(Conteudo, temp1, temp2);
		temp1.setProximo(newNode);
		temp2.setAnterior(newNode);
		countSize++;
	}

	/**
	 * Remove no ínicio pega o proximo nó do primeiro,seta o anterior para null,
	 * atualiza a referência
	 * 
	 * @param Posicao
	 */
	public void removeInicio(int Posicao) {
		if (this.countSize == 0) {
			System.out.println("A lista esta vazia");
		} else {

			Node temp = this.primeiro.getProximo();
			this.primeiro.setProximo(null);
			temp.setAnterior(null);
			this.primeiro = temp;
			countSize--;

			if (countSize == 0) {
				this.ultimo = null;
			}
		}
	}

	/**
	 * remove no final pega o anterior do ultimo,seta o proximo para null e
	 * atualiza a referência
	 * 
	 * @param Posicao
	 */
	public void removeFinal(int Posicao) {
		Node anterior = this.ultimo.getAnterior();
		anterior.setProximo(null);
		this.ultimo.setAnterior(null);
		this.ultimo = anterior;
		countSize--;

	}

	/**
	 * remove em uma posicao especifica pega a posicao do usuario e o
	 * anterior,seta o proximo para o proximo do "node" seta o proximo e o
	 * anterior para null
	 * 
	 * @param Posicao
	 * 
	 */
	public void removePos(int Posicao) {
		if (Posicao == 0) {
			this.removeInicio(Posicao);
		} else if (Posicao == countSize - 1) {
			this.removeFinal(Posicao);
		} else {
			////////////////////////
			Node node = this.getNode(Posicao);
			Node anterior = node.getAnterior();
			Node proximo = node.getProximo();
			anterior.setProximo(proximo);
			proximo.setAnterior(anterior);
			node.setProximo(null);
			node.setAnterior(null);
			countSize--;

		}
	}

	/**
	 * Pega o nó cria um no temporario referenciando para o primeiro, faz com
	 * que percorra a lista e pegue o proximp
	 * 
	 * @param Posicao
	 * @return
	 */
	public Node getNode(int Posicao) {

		Node tempNode = this.primeiro;

		for (int i = 0; i < Posicao; i++) {
			tempNode = tempNode.getProximo();
		}
		
		return tempNode;
	}

	/**
	 * troca as posicoes
	 * 
	 * @param Posicao
	 */
	public void troca(int Posicao) {

	}

	/**
	 * retorna o tamanho da lista
	 * 
	 * @return
	 */
	public int tamanho() {
		return this.countSize;
	}

	/**
	 * Método que concatena os conchetes
	 * 
	 */
	public String toString() {
		Node temp = this.primeiro;
		String list = " ";

		for (int i = 0; i < countSize; i++) {
			list += "[" + temp.getConteudo() + "]";
			temp = temp.getProximo();
		}
		return list;
	}
}
