package oredenacao;

public class BubbleSort {

	public int[] bubbleSort(int[] array) {
		int aux = 0;

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					aux = array[j];
					array[j] = array[j+1];
					array[j+1] = aux;
					
				}
			}
		}
		return array;
	}
}
