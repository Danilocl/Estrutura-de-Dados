package Teste;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.Vetor;

public class TestePegaPorPosicao {
	public static void main(String[] args) {

		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();

		a1.setNome("Pedro");
		a2.setNome("Fernando");

		Vetor lista = new Vetor();

		lista.adicionafim(a1);
		lista.adicionafim(a2);

		Aluno aluno1 = lista.pega(0);
		Aluno aluno2 = lista.pega(1);

		System.out.println(aluno1);
		System.out.println(aluno2);
	}
}
