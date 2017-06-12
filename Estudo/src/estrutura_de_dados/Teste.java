package estrutura_de_dados;

public class Teste {

	public static void main(String[] args) {

		Pilha p = new Pilha();

		for (int i = 0; i < p.elementos.length; i++) {
			p.push(i);
		}

		
		
		System.out.println(p.toString());
		
		System.out.println(" " + p.topo());
		
		System.out.println("\n " +p.tamanho());
		
		System.out.println("\n " +p.isFull());
		
		System.out.println("\n " +p.isEmpty());

		while (!p.isEmpty()) {
			int e = p.pop();
			System.out.print("\n Desmpilhei " + e);
		}
		System.out.println(" ");
		

	}
}
