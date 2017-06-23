
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class HanoiIterativo {
	private int qtDiscos;
	
	private List<Pilha> arrayDiscos = new ArrayList<Pilha>();
	Pilha p = new Pilha();

	// apenas ler os dados
	public void dados() {
		System.out.println("Digite a quantidade de  discos");
		Scanner rc = new Scanner(System.in);
		qtDiscos = rc.nextInt();
		try {
		} catch (InputMismatchException e) {
			System.out.println("Apenas números");
			dados();
		}
	}

	public void move() {
		// implementa a fórmula
		int maxP = (int) Math.pow(2, qtDiscos);
		int y = 1;
		int pos = 1;
		while (y <= qtDiscos) {
			int ctPulos = (int) Math.pow(2, y);
			pos *= 2;
			if (y == 1) {
				pos = 1;
			}
			if (qtDiscos % 2 == 0) {
				hanoi(pos, ctPulos, maxP, y);

				y++;
			}
		}
	}

	// realiza os movimentos
	private void hanoi(int pos, int intervalos, int maxP, int y) {
		int index = 0;
		if (y % 2 == 0) {
			for (int i = pos; i <= maxP; i += intervalos) {
				
				arrayDiscos.add(p);
				index++;
				if (index > 2) {
					index = 0;
				}
			}
		} else {
			for (int i = pos; i < maxP; i += intervalos) {
				Pilha p = new Pilha();
				arrayDiscos.add(p);
				index++;
				if (index > 2) {
					index = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		HanoiIterativo h = new HanoiIterativo();
		h.dados();
		h.move();

		for (Pilha d : h.arrayDiscos) {
			System.out.println("execute: " + d + "  " + d);
		}
	}
}