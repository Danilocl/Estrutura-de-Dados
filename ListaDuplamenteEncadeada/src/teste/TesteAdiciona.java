package teste;

import lista.Lista;
import lista.Produto;

public class TesteAdiciona {

	public static void main(String[] args) {
		Lista lista = new Lista();
		Produto p1 = new Produto("Danilo");
		Produto p2 = new Produto("julio");
		Produto p3 = new Produto("Pedro");
		Produto p4 = new Produto("fernando");
		Produto p5 = new Produto("alvarez");

		lista.addInicio(p1);
		lista.addFim(p2);
		lista.addFim(p3);

		lista.addPos(1, p4);
//		lista.addPos(3, p5);

//		lista.removePos(0);
		System.out.println(lista.toString());
	}
}
