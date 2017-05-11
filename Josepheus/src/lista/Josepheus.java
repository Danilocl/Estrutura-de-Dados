package lista;

public class Josepheus {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int m, n;
		int countSize = 0;

		Lista soldiers = new Lista();

		n = 7;
		m = 2;
		do {
			for (int i = 1; i <= n; i++) {
				soldiers.addFinal(i);
			}

			System.out.println(soldiers.toString());

			while (soldiers.tamanho() > 1) {
				for (int i = 0; i < m; i++) {
					if (countSize == soldiers.tamanho()) {
						countSize = 0;
					}
					countSize++;

					if (countSize == soldiers.tamanho()) {
						countSize = 0;
					}

				}

				soldiers.RemovePos(countSize);

				System.out.println(soldiers.toString());
			}
		} while (countSize > 1);
		System.out.println("\n sobreviente" + soldiers.toString());
	}
}