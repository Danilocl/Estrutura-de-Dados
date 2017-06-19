

/**
 * 
 * @author Danilo
 *
 */
public class Pilha {

	int elementos[];
	int topo;

	/**
	 * Construtor da Classe
	 */
	public Pilha() {
		this.elementos = new int[10];
		this.topo = -1;
	}

	/***
	 * Implementa o empilhamento
	 * @param content
	 */
	public void push(int content) {
		this.topo++;
		if (isFull()) {
			throw new RuntimeException("A lista está cheia");
		}
		this.elementos[topo] = content;
	}

	/**
	 * Implementa o desempilhamento
	 * @return
	 */
	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("\n A lista está vazia");
		}
		int e;
		e = elementos[topo];
		topo--;
		return e;

	}

	/**
	 * Verifi se está vazia
	 * @return
	 */
	public boolean isEmpty() {
		return (topo == -1);
	}

	/**
	 * Verfiica se está cheia
	 * @return
	 */
	public boolean isFull() {
		return (this.elementos[topo] >= 9);
	}

	/**
	 * Retorna o topo da Pilha
	 * @return
	 */
	public int topo() {
		if (isEmpty()) {
			throw new RuntimeException("A lista está vazia");
		}
		return elementos[topo];
	}

	/**
	 * retorna o tamanho da Pilha
	 * @return
	 */
	public int tamanho() {
		if (isEmpty()) {
			throw new RuntimeException(" A lista está vazia");
		}
		return topo + 1;
	}

	/**
	 * Concatena os elementos
	 */
	public String toString() {
		String str = "";

		for (int i = 0; i <= topo; i++)
			str += " " + elementos[i] + "\n";

		return str;

	}

}
