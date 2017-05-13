package search;

public class Linear {

	public boolean search(int[] array, int key) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				System.out.println("O número " + key + " foi encontrado");
				return true;
			}

		}
		return false;

	}

}
