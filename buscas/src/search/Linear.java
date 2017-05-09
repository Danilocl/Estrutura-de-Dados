package search;

public class Linear {
	/**
	 * Busca Linear. o método irá percorre todo array e compara cada posição com
	 * o key
	 * 
	 * @param array
	 * @param key
	 * @return
	 */
	public boolean LinearSearch(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {

			if (array[i] == key) {
				return true;
			}
		}
		return false;
	}
}
