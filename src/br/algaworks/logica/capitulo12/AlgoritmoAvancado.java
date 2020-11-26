package br.algaworks.logica.capitulo12;

public class AlgoritmoAvancado {

	public static void main(String[] args) {
		ListaAlunos listaAlunos = new ListaAlunos();

		Aluno aluno_01 = new Aluno();
		aluno_01.nome = "Thiago";
		listaAlunos.adicionar(aluno_01);

		Aluno aluno_02 = new Aluno();
		aluno_02.nome = "Maria";
		listaAlunos.adicionar(aluno_02);

		Aluno aluno_03 = new Aluno();
		aluno_03.nome = "Alexandre";
		listaAlunos.adicionar(aluno_03);

		Aluno aluno_04 = new Aluno();
		aluno_04.nome = "Normandes";
		listaAlunos.adicionar(aluno_04);

		Aluno aluno_05 = new Aluno();
		aluno_05.nome = "João";
		listaAlunos.adicionar(aluno_05);

		iterar(listaAlunos);

		listaAlunos.ordenar();

		iterar(listaAlunos);

		listaAlunos.remover(aluno_03);
		
		iterar(listaAlunos);
	}

	static void iterar(ListaAlunos listaAlunos) {
		for (int i = 0; i < listaAlunos.tamanho(); i++) {
			Aluno a = listaAlunos.obter(i);
			if (a != null) {
				System.out.println("Aluno: " + a.nome);
			} else {
				System.out.println("Aluno sem nome");
			}
		}

		System.out.println("-----------------------------------");
	}

}
