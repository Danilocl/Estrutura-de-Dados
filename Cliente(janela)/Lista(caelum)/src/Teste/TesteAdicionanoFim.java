package Teste;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.Vetor;

public class TesteAdicionanoFim {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		a1.setNome("Danilo");
		a2.setNome("Marcos");
		
		Vetor lista = new Vetor();
		
		lista.adicionafim(a1);
		lista.adicionafim(a2);
		
		System.out.println(lista);

	}
	
}
