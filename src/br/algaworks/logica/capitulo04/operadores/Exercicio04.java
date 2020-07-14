package br.algaworks.logica.capitulo04.operadores;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		
		System.out.print("Informe sua idade: ");
		Integer idade = scanner.nextInt();
		
		System.out.print("Quantos anos de contribuição com a previdência: ");
		Integer tempoContribuicao = scanner.nextInt();
		
		Boolean podeAposentar = idade >= 55 && tempoContribuicao >= 25;
		
		if(podeAposentar) {
			System.out.println("A pessoa pode se aposentar");
		} else {
			System.out.println("A pessoa não pode se aposentar");
		}
		
		scanner.close();
	}

}
