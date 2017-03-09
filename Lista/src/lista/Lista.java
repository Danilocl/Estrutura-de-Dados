package lista;

public class Lista {
// arraylist 
//23/02/2017
	private Produto[] listaProdutos = new Produto[2];
	private int countSize = 0;
/**
 * Adiciona os setnomes do produto nas posiçoes vasias da listaProduto
 * @param produto
 */
	public void add(Produto produto) {
		this.givemorespace();
		for (int i = 0; i < listaProdutos.length; i++) {
			if (listaProdutos[i] == (null)) {
				listaProdutos[i] = produto;
				this.countSize++;
				break;
			} else if (i == 9) {
				System.out.println("A lista esta cheia.");
			}
		}
	}
	/**
	 * Dobra o espaço da lista após atingis o limite
	 */
private void givemorespace () {
	if(this.countSize == this.listaProdutos.length) {
		System.out.println("aumentou");
		Produto[] newList = new Produto[listaProdutos.length*2];
		for(int i = 0;i<listaProdutos.length;i++) {
			newList[i] = listaProdutos[i];
		}
		this.listaProdutos = newList;
	}
}
	public void add(int pos, Produto produto) {
		this.givemorespace();
		for (int i = countSize - 1; i >= pos; i--) {
			listaProdutos[i + 1] = listaProdutos[i];
		}
		listaProdutos[pos] = produto;
		this.countSize++;
	}

	public void remove(int pos) {
		for (int i = pos; i < countSize - 1; i++) {
			listaProdutos[i] = listaProdutos[i + 1];
		}
		listaProdutos[countSize - 1] = null;
		this.countSize--;
	}

	public boolean contain(Produto produto) {
		for (int i = 0; i < listaProdutos.length; i++) {
			if (listaProdutos[i].getNome() == produto.getNome()) {
				return true;
			}
		}
		return false;
	}

	public int search(Produto produto) {
		for (int i = 0; i < listaProdutos.length; i++) {
			if (listaProdutos[i].getNome() == produto.getNome()) {
				return i;
			}
		}
		return -1;
	}

	public int size() {
		return this.countSize;
	}

	public String toString() {
		String tmp = "";
		for (int i = 0; i < countSize; i++) {
			tmp += listaProdutos[i].getNome() + " ";
		}
		return tmp;
	}

}
