package test;

import java.util.Random;

import search.BinarySearch;
import search.BubbleSort;

public class BinaryTest {

	public static void main(String[] args) {

		int[] array = new int[10];

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);
			System.out.print(array[i] + " ");
		}                                                                                                                                                                                                                                                         
		System.out.println();
		
		BubbleSort sort = new BubbleSort();
		
		array = sort.bubbleSort(array);
		
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		BinarySearch bn = new BinarySearch();
		
		System.out.print(bn.binarySearch(array,12));
	}
}
