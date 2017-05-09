package teste;

import lista.Lista;
import lista.Produto;

public class TesteAdiciona {

	public static void main(String[] args) {

		Lista list = new Lista();
/////////////////////////////////////////////////////////
		Produto p1 = new Produto("Danilo");
		Produto p2 = new Produto("David");
		Produto p3 = new Produto("Roberto");
		Produto p4 = new Produto("Alberto");
		Produto p5 = new Produto("Danilo");

		list.addInicio(p1);
		list.addFim(p2);
		list.addFim(p3);
		list.addFim(p4);
		
//		list.removeFinal(0);
//		list.removeInicio(0);
		list.removePos(3);
          
		System.out.println(list.toString());

	}
}
