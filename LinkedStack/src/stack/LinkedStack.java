package stack;

import java.util.NoSuchElementException;

/**
 * Lista que irá implementa o conceito de pilha adicionado e remove no início
 * LIFO - ultimo a entrar, primeiro a sair.
 * 
 * @author Danilo
 *
 */
public class LinkedStack {

	private Node top;
	private int size;

	/*
	 * Contrutor da Clsse
	 */
	public LinkedStack() {
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

	public void push(int content) {
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
	public int pop() {
		// lança uma execessão caso a pilha esteja vazia
		if (isEmpty()) {
			throw new NoSuchElementException("A pilha está vazia");
		}

		Node oldTop = top;
		int content = oldTop.getContent();
		top = oldTop.getNext();
		oldTop.setNext(null);
		this.size--;
		return content;

	}

	// verifica a pilha e joga uma excessão caso necessário
	public int peek() {

		if (isEmpty()) {
			throw new NoSuchElementException("A pilha está vazia");
		}
		return top.getContent();
	}

	public String toString() {
		String str = "";
		Node tmp = top;

		for (int i = 0; i < this.size; i++) {
			str += tmp.getContent() + "\n";
			tmp = tmp.getNext();
		}
		return str;
	}
}
