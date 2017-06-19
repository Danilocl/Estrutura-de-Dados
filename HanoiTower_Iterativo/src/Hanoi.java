import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//
public class Hanoi {

	int disks;
	private List<Pilha> discos = new ArrayList<Pilha>();

	Scanner in = new Scanner(System.in);

	// Apenas pega os dados necessários
	public void dados() {

		Pilha p = new Pilha();

		System.out.println("Digite o número de discos");
		disks = in.nextInt();

	}

	// realiza os movimentos
	public void mover() {
		int b = 1;
		while (disks >= b) {
			int jump = (int) Math.pow(2, b);
		}
	}

	private void printf(String string, int o2, int d2) {
		// TODO Auto-generated method stub

	}
}
