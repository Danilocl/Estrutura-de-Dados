package test;

import java.util.Random;

import search.BubbleSort;
import search.Linear;

public class SearchTest {

	public static void main(String[] args) {

		int[] array = new int[10];

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(50);
			System.out.print(array[i] + " ");
		}

		System.out.println();

		Linear search = new Linear();

		BubbleSort sort = new BubbleSort();

		System.out.println();

		array = sort.bubbleSort(array);

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		System.out.println("\n" + search.LinearSearch(array, 12));

	}
}
