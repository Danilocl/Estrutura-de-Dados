package lista;

public class Teste {

public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		lista.addStart(100);
		lista.addFinal(35);
		lista.addFinal(90);
		lista.addFinal(70);
		lista.addFinal(76);
	//	lista.addPos(2, 6);
	    
		System.out.println(lista.toString());
		

//		lista.linearSearch(35);
//		lista.binarySearch(76);
		
		System.out.println(lista.toString());
		
		
   
		

	}
}
