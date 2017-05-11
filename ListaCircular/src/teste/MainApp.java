package teste;

import lista.Lista;
import lista.Produto;

public class MainApp {

	public static void main(String[] args) {

		Lista list = new Lista();

		Produto p1 = new Produto("Danilo");
		Produto p2 = new Produto("David");
		Produto p3 = new Produto("Júlia");
		Produto p4 = new Produto("Bruna");

		list.addStart(p1);
		list.addfinal(p2);
		list.addfinal(p3);
		list.addfinal(p4);

		list.removePos(03);
		// list.removeFinal();
		// list.removeStart();
		// list.removePos(0);

		System.out.println(list.toString());
	}
}
