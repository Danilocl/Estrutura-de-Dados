package Teste;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.Vetor;

public class TesteContemAluno {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();

		a1.setNome("Alberto");
		a2.setNome("Júlio");

		Vetor lista = new Vetor();

		lista.adicionafim(a1);
		lista.adicionafim(a2);

		System.out.println(lista.contem(a1));
		System.out.println(lista.contem(a2));

		Aluno aluno = new Aluno();
		aluno.setNome("Pedro");
		
		System.out.println(lista.contem(aluno));

	}
}
