package br.algaworks.logica.capitulo07.vetores;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe 5 tarefas de seu dia");

		String[] tarefas = new String[5];

		for (int i = 0; i < tarefas.length; i++) {
			System.out.print("Informe a próxima tarefa: ");
			tarefas[i] = scanner.nextLine();
		}

		System.out.println("");

		for (int i = 0; i < tarefas.length; i++) {
			System.out.println("[" + i + "]" + tarefas[i]);
		}

		scanner.close();
	}

}
