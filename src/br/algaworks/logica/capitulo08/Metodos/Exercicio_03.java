package br.algaworks.logica.capitulo08.Metodos;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o primeiro número: ");
		Double primeroNumero = scanner.nextDouble();

		System.out.print("Informe o segundo número: ");
		Double segundoNumero = scanner.nextDouble();

		String[] opcoes = new String[] { "+", "-" };

		System.out.println("Escolha a operação que deseja realizar: ");
		for (int i = 0; i < opcoes.length; i++) {
			System.out.println("[" + i + "] " + opcoes[i]);
		}
		
		Integer escolha = scanner.nextInt();
		
		validarOpcao(opcoes, escolha);
		
		somarNumeros(primeroNumero, segundoNumero, escolha);
		
		subtrairNumeros(primeroNumero, segundoNumero, escolha);
				
			
		scanner.close();
	}

	private static void subtrairNumeros(Double primeroNumero, Double segundoNumero, Integer escolha) {
		if(escolha == 1) {
			System.out.println("A SUBTRAÇÃO de " + primeroNumero +" - " + segundoNumero + " é igual a: " + (primeroNumero - segundoNumero));
		}
	}

	private static void somarNumeros(Double primeroNumero, Double segundoNumero, Integer escolha) {
		if(escolha == 0) {			
			System.out.println("A SOMA de " + primeroNumero +" + " + segundoNumero + " é igual a: " + primeroNumero + segundoNumero);
		}
	}

	private static void validarOpcao(String[] opcoes, Integer escolha) {
		if(escolha < 0 || escolha >= opcoes.length) {
			System.out.println("A opção escolhida nõo é válida!");
		}
	}

}
