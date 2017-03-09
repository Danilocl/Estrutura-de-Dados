package Teste;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.Vetor;

public class TesteAdicionaPorPosicao {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		a1.setNome("Danilo");
		a2.setNome("Rafael");
		a3.setNome("Pedro");
		
		Vetor lista = new Vetor();
		
		lista.adicionafim(a1);
		lista.adicionapos(0,a2);
		lista.adicionapos(1,a3);
		
		System.out.println(lista);
	}
}
