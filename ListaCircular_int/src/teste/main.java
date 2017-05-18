package teste;

import lista.Lista;

public class main {

	public static void main(String[] args) {

		Lista lista = new Lista();

		lista.addStart(1000);
		lista.addFinal(35);
		lista.addFinal(90);
		lista.addFinal(770);
		lista.addFinal(76);
		lista.addPos(2, 6);

		System.out.println(lista.toString());

		lista.bubbleSort();
		// lista.linearSearch(35);
		// lista.binarySearch(76);

		System.out.println("\n" + lista.toString());
		
		System.out.println("\n" + lista.linearSearch(10));
		System.out.println("\n" + lista.binarySearch(0));

	}
}
