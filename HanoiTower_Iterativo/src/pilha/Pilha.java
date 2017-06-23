package pilha;


import java.util.NoSuchElementException;

public class Pilha {

	private Node top;
	private int size;

	/*
	 * Contrutor da Clsse
	 */
	public Pilha() {
		this.top = null;
		this.size = 0;
	}

	/*
	 * Retorna o tamanho da lista
	 */
	public int size() {
		return this.size;
	}

	/*
	 * Retorna true se a lista estiver vazia e false se estiver cheia
	 */
	public boolean isEmpty() {
		return (this.top == null);
	}

	public void push(Object content) {
		Node oldTop = top;

		top = new Node(content);
		top.setNext(oldTop);
		size++;

		// É a mesma coisa
		// Node newnode = new Node(content);
		// top = newNode;

	}

	/*
	 * Implementa o desempilhamento
	 */
	public Object pop() {
		// lança uma execessão caso a pilha esteja vazia
		if (isEmpty()) {
			throw new NoSuchElementException("A pilha está vazia");
		}

		Node oldTop = top;
		Object content = oldTop.getdisk();
		top = oldTop.getNext();
		oldTop.setNext(null);
		this.size--;
		return content;

	}

	// verifica a pilha e joga uma excessão caso necessário
	public Object peek() {

		if (isEmpty()) {
			throw new NoSuchElementException("A pilha está vazia");
		}
		return top.getdisk();
	}

	public String toString() {
		String str = "";
		Node tmp = top;

		for (int i = 0; i < this.size; i++) {
			str += tmp.getdisk() + "\n";
			tmp = tmp.getNext();
		}
		return str;
	}
}
