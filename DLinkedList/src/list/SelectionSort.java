package list;

import java.util.Random;

public class SelectionSort {

	public int[] selectionSort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {

			int smallerIndex = i;

			for (int j = i + 1; j < array.length; j++) {

				if (array[j] < array[smallerIndex]) {
					smallerIndex = j;

				}

			}
			int smallerContent = array[smallerIndex];
			array[smallerIndex] = array[i];
			array[i] = smallerContent;
		}
		return array;
	}

	/**
	 * Método de teste 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SelectionSort sc = new SelectionSort();

		int[] array = new int[10];
		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);
			System.out.print(array[i] + " ");
		}
		sc.selectionSort(array);
		System.out.println();

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
}
