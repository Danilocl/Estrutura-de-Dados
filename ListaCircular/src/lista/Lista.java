package lista;

public class Lista {

	private Node head;
	private Node tail;
	private int countsize = 0;

	public void addStart(Produto conteudo) {
		Node newno = new Node(this.tail, this.head, conteudo);
		if (this.countsize == 0) {
			this.head = newno;
			this.tail = this.head;
		} else {
			this.head.setPrevious(newno);
			this.tail.setNext(newno);
			this.head = newno;

		}
		countsize++;
	}

	public void addfinal(Produto conteudo) {
		if (countsize == 0) {
			this.addStart(conteudo);
		} else {
			Node newno = new Node(this.head, this.tail, conteudo);
			this.tail.setNext(newno);
			this.tail = newno;
			this.tail.setNext(this.head);
			this.head.setPrevious(this.tail);
			if (countsize == 0) {
				this.head = newno;
			}
			countsize++;
		}
	}

	public void addpos(int Posicao, Produto conteudo) {
		if (Posicao == 0) {
			this.addStart(conteudo);
		} else if (Posicao >= countsize) {
			this.addfinal(conteudo);
			return;
		} else {
			Node temp1 = this.getNode(Posicao - 1);
			Node temp2 = temp1.getNext();
			Node newnode = new Node(temp1, temp2, conteudo);
			temp1.setNext(newnode);
			temp2.setPrevious(newnode);
			countsize++;
		}
	}

	public void removeStart() {
		if (this.countsize == 0) {
			System.out.println("A lista esta vazia");
		} else if (this.countsize == 1) {
			this.head = null;
			this.tail = this.head;
		} else {
			Node next = this.head.getNext();
			this.head.setNext(null);
			this.head = next;
			this.head.setPrevious(this.tail);
			this.tail.setNext(this.head);
		}
		countsize--;
	}

	public void removeFinal() {
		if (this.countsize == 0) {
			System.out.println("A lista está vazia!");
		} else if (this.countsize == 1) {
			this.removeStart();
		} else {
			Node newno = this.tail.getPrevious();
			this.tail.setNext(null);
			this.tail = newno;
			this.tail.setNext(this.head);
			this.head.setPrevious(this.tail);
			countsize--;
		}
	}

	public void removePos(int Posicao) {
		if (Posicao == 0) {
			this.removeStart();
		} else if (Posicao >= countsize) {
			this.removeFinal();
		} else {
			Node node = this.getNode(Posicao);
			Node previous = node.getPrevious();
			Node next = node.getNext();
			node.setNext(null);
			node.setPrevious(null);
			previous.setNext(next);
			next.setPrevious(previous);
			countsize--;

		}
	}

	public int tamanho() {
		return this.countsize;

	}

	public void troca(int Posicao) {

	}

	public Node getNode(int Posicao) {
		Node tempNode = this.head;

		for (int i = 0; i < Posicao; i++) {
			tempNode = tempNode.getNext();
		}

		return tempNode;
	}

	public String toString() {
		Node temp = this.head;
		String list = " ";

		for (int i = 0; i < countsize; i++) {
			list += "[" + temp.getConteudo() + "]";
			temp = temp.getNext();
		}
		return list;
	}

}
