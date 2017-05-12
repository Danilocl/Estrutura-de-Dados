package list;

public class SelectionSort {

	public int[] selectioSort(int[] array) {

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
}
