package Teste;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.Vetor;

public class TesteTAmanhoLista {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		a1.setNome("Fernando");
		a2.setNome("Pietro");
		
		Vetor lista = new Vetor();
		
		lista.adicionafim(a1);
		lista.adicionafim(a2);
		
		System.out.println(lista.tamanho());
		
		lista.adicionafim(a3);
		
		System.out.println(lista.tamanho());
	}
}
