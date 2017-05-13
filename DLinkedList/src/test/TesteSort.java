package test;

import java.util.Random;

import list.DLinkedList;
import list.SelectionSort;

public class TesteSort {
	/**
	 * Não está correto. A classe não está implementada para ordenar os nós da
	 * lista
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Random rand = new Random();
		int[] array = new int[15];

		DLinkedList list = new DLinkedList();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);
			list.insertTail(array[i]);
		}
		System.out.println(list.toString());

		SelectionSort sl = new SelectionSort();

		sl.selectionSort(array);

		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + " ");
		}
	}
}
