package Teste;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.Vetor;

public class TesteRemovePorPosicao {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		a1.setNome("João");
		a2.setNome("Alberto");
		
		Vetor lista = new Vetor();
		
		lista.adicionafim(a1);
		lista.adicionafim(a2);
		
		lista.remove(0);
		
		System.out.println(lista);
		
	}
}
