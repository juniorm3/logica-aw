package br.algaworks.logica.capitulo05.estruturasdedecisao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a nota de Português: ");
		Double portugues = scanner.nextDouble();
		
		System.out.print("Informe a nota de Matemática: ");
		Double matematica = scanner.nextDouble();
		
		Boolean notaPortugues = portugues < 60;
		Boolean notaMatematica = matematica < 60;
		
		System.out.println(notaPortugues);
		System.out.println(notaMatematica);
		
		if(notaPortugues || notaMatematica || (portugues + matematica) < 150) {
			System.out.println("O Candidato não conseguiu ser aprovado!");
		} else {
			System.out.println("O candidato conseguiu ser aprovado!");
		}
			
		
		scanner.close();
	}

}
