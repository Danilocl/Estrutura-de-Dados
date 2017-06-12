package estrutura_de_dados;

public class Pilha {

	int elementos[];
	int topo;

	public Pilha() {
		this.elementos = new int[10];
		this.topo = -1;
	}

	public void push(int content) {
		this.topo++;
		if (isFull()) {
			throw new RuntimeException("A lista está cheia");
		}
		this.elementos[topo] = content;
	}

	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("\n A lista está vazia");
		}
		int e;
		e = elementos[topo];
		topo--;
		return e;

	}

	public boolean isEmpty() {
		return (topo == -1);
	}

	public boolean isFull() {
		return (this.elementos[topo] >= 9);
	}

	public int topo() {
		if (isEmpty()) {
			throw new RuntimeException("A lista está vazia");
		}
		return elementos[topo];
	}

	public int tamanho() {
		if (isEmpty()) {
			throw new RuntimeException(" A lista está vazia");
		}
		return topo + 1;
	}

	public String toString() {
		String str = "";

		for (int i = 0; i <= topo; i++)
			str += " " + elementos[i] + "\n";

		return str;

	}

}
