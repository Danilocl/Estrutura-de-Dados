package stack;

import java.util.NoSuchElementException;
import java.util.Random;

public class Teste {

	public static void main(String[] args) {
		/*
		 * Trata a excessão do método peek da classe LinkedStack
		 */
		LinkedStack stack = new LinkedStack();
		try {
			stack.peek();
		} catch (NoSuchElementException e) {
			System.out.println("A pilha está vazia!!" + "\n" + e.toString());
		}

		System.out.println("\n");

		Random rand = new Random();
		/*
		 * Empilha randomicamente 5 veses
		 */
//		for (int i = 0; i < 5; i++) {
//			stack.push(rand.nextInt(10));
//		}
		stack.push(5);
		stack.push(6);
		stack.push(7);
		/*
		 * Imprimi os métodos
		 */
		System.out.println("Peek: " + stack.peek());
		System.out.println("\n");

		System.out.println(stack.toString());

		System.out.println("\n");

		System.out.println("Pop: " + stack.pop());
		System.out.println("Pop: " + stack.pop());
		
		
		

		System.out.println("\n");
		
		System.out.println(stack.toString());

		System.out.println("Peek: " + stack.peek());
		
		

	}
}
