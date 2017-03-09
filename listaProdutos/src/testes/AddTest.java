package testes;

import lista.Lista;
import lista.Produto;

public class AddTest {

	public static void main(String[] args) {

		Lista lista = new Lista();
		
		Produto p = new Produto();
		p.setNome("Arroz");
		
		Produto p2 = new Produto();
		p2.setNome("Feijao");
		
		Produto p3 = new Produto();
		p3.setNome("Carne");
		
		Produto p4 = new Produto();
		p4.setNome("Farofa");
		
		lista.add(p);
		
		System.out.println(lista.toString());
		
		lista.add(p2);
		
		System.out.println(lista.toString());
		
		lista.add(p3);
		lista.add(p4);
		
		Produto p5 = new Produto();
		p5.setNome("Peixe");
		
		Produto p6 = new Produto();
		p6.setNome("Figado");
		
		lista.add(p5);
		lista.add(p6);
		
		System.out.println(lista.toString());

	}

}







