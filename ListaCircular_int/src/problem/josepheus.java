package problem;

import lista.Lista;

public class josepheus {

	public static void main(String[] args) {

		int m = 2;
		int n = 7;
		int countsize = 0;

		Lista lista = new Lista();

		do {
			for (int i = 1; i <= n; i++) {
				lista.addFinal(i);
			}
			System.out.println(lista.toString());
			do {
				for (int i = 0; i < m; i++) {
					if (lista.tamanho() == countsize) {
						countsize = 0;
					}
					countsize++;

					if (lista.tamanho() == countsize) {
						countsize = 0;
					}
				}

				lista.RemovePos(countsize);
				System.out.println(lista.toString());

			} while (lista.tamanho() > 1);
			
		} while (countsize > 1);
		System.out.println("Sobreviventes: " + lista.toString());
	}
}
