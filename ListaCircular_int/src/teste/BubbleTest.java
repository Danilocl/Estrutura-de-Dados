package teste;

import java.util.Random;

import lista.Lista;
import oredenacao.BubbleSort;
import search.Linear;

public class BubbleTest {

	public static void main(String[] args) {

		Lista lista = new Lista();

		int[] array = new int[10];

		Random rand = new Random();

		Linear search = new Linear();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(20);
			lista.addFinal(array[i]);
			}
		System.out.println(lista.toString());

		BubbleSort sort = new BubbleSort();

		sort.bubbleSort(array);
		
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i] + " ");
		}
		System.out.println("\n");
		
		System.out.println("\n" + search.search(array,15));
	}
}