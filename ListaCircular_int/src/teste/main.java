package teste;

import lista.Lista;
import oredenacao.BubbleSort;


public class main {

	public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		lista.addStart(90);
		lista.addFinal(35);
		lista.addFinal(90);
		lista.addFinal(70);
		lista.addFinal(76);
		lista.addPos(2, 6);
	    
		System.out.println(lista.toString());
		
		lista.selectionSort();
		
		System.out.println(lista.toString());
		
		
   
		

	}
}
