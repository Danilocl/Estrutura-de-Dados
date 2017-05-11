package list;

public class DLinkedList {

	/**
	 * Lista duplamente encadeada com os metodos de ordenação e busca linear e
	 * binaria implementadas 11/05/2017
	 */
	private Node head;
	private Node tail;
	private int countSize = 0;

	/**
	 * inseri um nó na primeira posição
	 * 
	 * @param content
	 */
	public void insertHead(int content) {

		Node newNode = new Node(null, content, this.head);

		if (this.countSize == 0) {
			this.head = newNode;
			this.tail = this.head;
		} else {
			this.head.setPrevious(newNode);
			newNode.setNext(this.head);
			this.head = newNode;
		}

		countSize++;

	}

	/**
	 * inseri um nó na ultima posição
	 * 
	 * @param content
	 */
	public void insertTail(int content) {

		if (this.countSize == 0) {
			this.insertHead(content);
		} else {

			Node newNode = new Node(this.tail, content, null);
			this.tail.setNext(newNode);
			newNode.setPrevious(this.tail);
			this.tail = newNode;
			this.countSize++;
		}
	}

	/**
	 * Inseri um nó na posição especificada peloa usuário
	 * 
	 * @param position
	 * @param content
	 */
	public void insertPosition(int position, int content) {

		if (position == 0) {
			this.insertHead(content);
		} else if (position == this.countSize) {
			this.insertTail(content);
		} else {

			Node temp1 = this.getNode(position - 1);
			Node temp2 = temp1.getNext();

			Node newNode = new Node(temp1, content, temp2);
			temp1.setNext(newNode);
			temp2.setPrevious(newNode);

			this.countSize++;
		}

	}

	/**
	 * pega o nó especificado pelo usuário
	 * 
	 * @param position
	 * @return
	 */
	public Node getNode(int position) {

		Node temp = this.head;

		for (int i = 0; i < position; i++) {
			temp = temp.getNext();
		}

		return temp;
	}

	/**
	 * remove o primeiro nó
	 */
	public void removeHead() {
		if (this.countSize == 0) {
			System.out.println("A lista está vazia");
		} else {
			Node temp = this.head;
			this.head = temp.getNext();

			temp.setNext(null);
			head.setPrevious(null);

			this.countSize--;

			if (countSize == 0) {
				this.tail = null;
			}
		}
	}

	/**
	 * Remove o ultimo nó
	 */
	public void removeTail() {

		if (countSize <= 1) {
			this.removeHead();
		} else {
			Node temp = this.tail.getPrevious();
			temp.setNext(null);
			this.tail.setPrevious(null);
			this.tail = temp;

			this.countSize--;
		}
	}

	/**
	 * Remove o nó especifcado pelo usuário
	 * 
	 * @param position
	 */
	public void remove(int position) {

		if (position == 0) {
			this.removeHead();
		} else if (position == countSize - 1) {
			this.removeTail();
		} else {

			Node node = this.getNode(position);
			Node temp1 = node.getPrevious();
			Node temp2 = node.getNext();

			temp1.setNext(temp2);
			temp2.setPrevious(temp1);

			node.setNext(null);
			node.setPrevious(null);

			this.countSize--;
		}
	}

	/**
	 * percorre a lista e retorna o conteudos de todos os nós
	 */
	public String toString() {

		Node temp = this.head;
		String list = "";

		for (int i = 0; i < countSize; i++) {
			list += temp.getContent() + " ";
			temp = temp.getNext();
		}

		return list;
	}

	/**
	 * Percorre a lista e compara o conteúdo do nó com o valor especificado pelo
	 * usuário
	 * 
	 * @param key
	 * @return
	 */
	public boolean LinearSearch(int key) {
		Node temp = this.head;
		for (int i = 0; i < countSize; i++) {
			if (temp.getContent() == key) {
				System.out.println("O número: " + key + " está na posição: " + i);
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}

	/**
	 * Dividi a lista pela metade até encontra o valor especificado pelo usuário
	 * 
	 * @param key
	 * @return
	 */
	public boolean binarySearch(int key) {
		int first = 0;
		int last = this.countSize - 1;
		int middle;
		while (first <= last) {
			middle = (first + last) / 2;
			int middleContent = getNode(middle).getContent();

			if (key == middleContent) {
				System.out.println("O número " + key + " está " + " na posição: " + middleContent);
				return true;
			}
			// se o valor for menor que o meio, a ultima posição irá receber o
			// valor antecessor ao meio
			if (key < middleContent) {
				last = middle - 1;
				// Se o valor for maior que o meio, a primeira posição irá
				// receber
				// O valor sucessor ao meio.
			} else {
				first = middle + 1;
			}
		}
		return false;
	}

	/**
	 * Ordena a lista de forma crescente
	 */
	public void bubbleSort() {

		for (int i = 0; i < countSize; i++) {

			for (int j = 0; j < this.countSize - 1; j++) {
				Node tmp1 = getNode(j);
				Node tmp2 = getNode(j + 1);

				if (tmp1.getContent() > tmp2.getContent()) {

					tmp1.setNext(tmp2.getNext());

					if (tmp1 == this.head) {
						tmp2.getNext().setPrevious(tmp1);
						tmp2.setNext(tmp1);
						tmp2.setPrevious(null);
						this.head = tmp2;
						tmp1.setPrevious(tmp2);

					} else if (tmp2 == this.tail) {
						tmp2.setNext(tmp1);
						tmp1.setNext(null);
						this.tail = tmp1;
						tmp2.setPrevious(tmp1.getPrevious());
						tmp1.getPrevious().setNext(tmp2);
						tmp1.setPrevious(tmp2);

					} else {
						tmp2.getNext().setPrevious(tmp1);
						tmp2.setNext(tmp1);
						tmp1.getPrevious().setNext(tmp2);
						tmp2.setPrevious(tmp1.getPrevious());
						tmp1.setPrevious(tmp2);
					}
				}
			}
		}

	}
}
