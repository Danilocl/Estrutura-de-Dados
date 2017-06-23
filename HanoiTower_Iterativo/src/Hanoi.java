
import pilha.Pilha;

/**
 * 
 * @author Danilo
 *
 */
public class Hanoi {

	Pilha p = new Pilha();

	// realiza e imprimi os movimentos do souce para o destination
	public void move(int source, int destination) {
		System.out.println(source + " -> " + destination);
	}

	// implementa a torre de hanoi
	public void execute(int n, int source, int destination, int aux) {

		Comand currentComand = new Comand(n, source, destination, aux);
		// empilha os novos comandos
		p.push(currentComand);
		// verifica se está vazia
		while (!p.isEmpty()) {

			if (n > 1) {
				n--;
				n = currentComand.getN();
				source = currentComand.getSource();
				destination = currentComand.getDestination();
				aux = currentComand.getAux();
				// guarda os movimentos a serem empilhados
				currentComand = new Comand(n, source, destination, aux);
				// empilha os movimentos
				p.push(currentComand);
			} else {
				source = currentComand.getSource();
				destination = currentComand.getDestination();
				aux = currentComand.getAux();
				// desempilha os movimentos
				currentComand = (Comand) p.pop();
				// executa os movimentos
				move(currentComand.getSource(), currentComand.getDestination());

			}
			// Ultimo empilhamento
			if (n > 1) {
				n--;
				currentComand = new Comand(n, aux, destination, source);
				p.push(currentComand);
			}

			// int a = 0;
			// float s = (float) a;
		}
	}
}
