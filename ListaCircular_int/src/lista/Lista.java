package lista;

public class Lista {
	private int countSize = 0;
	private Node head;
	private Node tail;

	/**
	 * Adiciona um n� no come�o.
	 * 
	 * @param conteudo
	 */
	public void addStart(int conteudo) {

		Node newno = new Node(this.tail, conteudo, this.head);
		if (this.countSize == 0) {
			this.head = newno;
			this.tail = this.head;
			newno.setNext(this.head);
			newno.setPrevious(this.tail);
		} else {
			this.tail.setNext(newno);
			newno.setNext(this.head);
			newno.setPrevious(this.tail);
			this.head.setPrevious(newno);
			this.head = newno;

		}
		countSize++;
	}

	/**
	 * Adiciona um n� no final
	 * 
	 * @param conteudo
	 */
	public void addFinal(int conteudo) {
		Node newno = new Node(this.tail, conteudo, this.head);
		if (countSize == 0) {
			this.addStart(conteudo);
		} else {
			this.tail.setNext(newno);
			newno.setPrevious(this.tail);
			newno.setNext(this.head);
			this.head.setPrevious(newno);
			this.tail = newno;
			this.countSize++;
		}
	}

	/**
	 * Adiciona um n� em uma posi��o espec�fica
	 * 
	 * @param Posicao
	 * @param conteudo
	 */
	public void addPos(int Posicao, int conteudo) {
		if (Posicao == 0) {
			this.addStart(conteudo);
		} else if (Posicao == countSize) {
			this.addFinal(conteudo);
		} else {
			Node temp1 = this.getNode(Posicao - 1);
			Node temp2 = temp1.getNext();
			Node newnode = new Node(temp1, conteudo, temp2);
			temp1.setNext(newnode);
			temp2.setPrevious(newnode);
			countSize++;
		}
	}

	public Node getNode(int Posicao) {
		Node tempNode = this.head;

		for (int i = 0; i < Posicao; i++) {
			tempNode = tempNode.getNext();
		}

		return tempNode;
	}

	/**
	 * Remove o primeiro n�
	 * 
	 */
	public void removeStart() {
		if (this.countSize == 0) {
			System.out.println("A lista j� esta vazia");
		} else if (this.countSize == 1) {
			this.head = null;
			this.tail = this.head;
		} else {
			Node next = this.head.getNext();
			this.head.setNext(null);
			this.head.setPrevious(null);
			this.head = next;
			this.head.setPrevious(this.tail);
			this.tail.setNext(this.head);
		}
		countSize--;
	}

	/**
	 * Remove o ultimo n�
	 */
	public void removeFinal() {
		if (this.countSize <= 1) {
			this.removeStart();
		} else {
			Node newno = this.tail.getPrevious();
			newno.setNext(this.head);
			this.head.setPrevious(newno);
			this.tail.setNext(null);
			this.tail.setPrevious(null);
			this.tail = newno;
			countSize--;

			// this.tail.setPrevious(null);
			// this.tail = newno;
			// this.tail.setNext(this.head);
			// this.head.setPrevious(this.tail);

		}
	}

	/**
	 * remove o tamanho da lista
	 * 
	 * @return
	 */
	public int tamanho() {
		return this.countSize;
	}

	/**
	 * remove uma posi��o espec�fica
	 * 
	 * @param Posicao
	 */
	public void RemovePos(int Posicao) {
		if (Posicao == 0) {
			this.removeStart();
		} else if (Posicao >= countSize) {
			this.removeFinal();
		} else {
			Node node = this.getNode(Posicao);
			Node previous = node.getPrevious();
			Node next = node.getNext();

			previous.setNext(next);
			next.setPrevious(previous);

			node.setNext(null);
			node.setPrevious(null);
			countSize--;

		}
	}

	/**
	 * concatena os n�s
	 */
	public String toString() {
		Node temp = this.head;
		String list = " ";

		for (int i = 0; i < countSize; i++) {
			list += " [ " + temp.getContent() + " ] ";
			temp = temp.getNext();
		}
		return list;
	}

	public boolean linearSearch(int key) {
		Node temp = this.head;
		for (int i = 0; i < this.countSize; i++) {
			if (key == temp.getContent()) {
				return true;
			}
			temp.getNext();
		}
		return false;
	}

	public boolean binarySearch(int key) {

		int first = 0;
		int last = this.countSize - 1;
		int middle;
		while (first <= last) {

			middle = (first + last) / 2;
			int middleContent = getNode(middle).getContent();

			if (key == middleContent) {
				return true;
			}
			if (key < middleContent) {
				last = middle - 1;
			}
			if (key > middleContent) {
				first = middle + 1;
			}
		}
		return false;
	}

	public void bubbleSort() {
		for (int i = 0; i < this.countSize; i++) {

			for (int j = 0; j < this.countSize - 1; j++) {

				Node temp1 = getNode(j);
				Node temp2 = getNode(j + 1);

				if (temp1.getContent() > temp2.getContent()) {

					temp1.setNext(temp2.getNext());

					if (temp1 == this.head) {
						temp2.getNext().setPrevious(temp1);
						temp2.setNext(temp1);
						temp1.setPrevious(temp2);
						temp2 = this.head;
						this.tail.setNext(this.head);

					}
					else if (temp2 == this.tail) {
						temp2.setNext(temp1);
						temp1.setPrevious(temp2);
						temp1.setNext(this.head);
						temp1 = this.tail;
					} else {
						temp2.getNext().setPrevious(temp1);
						temp1.setNext(temp2.getNext());
						temp1.getPrevious().setNext(temp2);
						temp2.setPrevious(temp1.getPrevious());
						temp2.setNext(temp1);
						temp1.setPrevious(temp2);

					}
				}
			}

		}
	}

	public void selectionSort() {

		// Node temp2 = this.head;
		Node smallerIndex;
		Node temp1 = this.head;

		for (int i = 0; i < this.countSize - 1; i++) {
			/*
			 * pega a posi��o e atribui ao node "smallerIndex" e "temp2" a
			 * medida que o for "for" rodado
			 */
			smallerIndex = getNode(i);
			Node temp2 = getNode(i);
			/**
			 * pega o pr�ximo n�
			 */
			for (int j = i + 1; j < this.countSize; j++) {
				temp1 = getNode(j);
				/**
				 * procura a posi��o que seja menor que o "smallerIndex" 
				 * caso ache "smallerIndex" ser� atualizado 
				 */
				//erro:esta pegando a menor posi��o e a pr�xima
				if (temp1.getContent() < smallerIndex.getContent()) {
					smallerIndex = temp1;
				}

			}
			//n�o sei se � necess�rio
			Node smallerContent = smallerIndex;
			/**
			 * move o "smallerIndex" na primeira posi��o
			 */
			//acredito est� perdendo refer�ncias
			if (temp2 == this.head) {
				smallerIndex.setNext(temp2);
				temp2.setPrevious(smallerIndex);
				smallerIndex.setPrevious(this.tail);
				smallerIndex = this.head;
				temp2 = smallerContent;
			}
			/**
			 * move para ultima posi��o
			 */
			if (temp1 == this.tail) {
				temp2.getPrevious().setNext(smallerIndex);
				smallerIndex.setNext(temp2);
				temp2.setPrevious(smallerIndex);
				temp2.setNext(this.head);
				temp2 = smallerIndex;
				
			} else {
				smallerIndex.setNext(temp2);
				temp2.setPrevious(smallerIndex);
			}

		}

		// Node smallerContent = temp1;
		// smallerIndex.getNext().setNext(this.head);
		// // smallerIndex = temp2;
		// smallerIndex = this.head;
		// }return array;
	}

}
