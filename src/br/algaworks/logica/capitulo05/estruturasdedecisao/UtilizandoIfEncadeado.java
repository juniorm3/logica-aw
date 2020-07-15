package br.algaworks.logica.capitulo05.estruturasdedecisao;

import java.util.Scanner;

public class UtilizandoIfEncadeado {

	private static final int PESO_MEDIO = 90;
	private static final int PESO_LEVE = 60;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o peso: ");
		Double peso = scanner.nextDouble();

//		Boolean pesoLeve = peso <= PESO_LEVE;
//		Boolean pesoMedio = (peso > PESO_LEVE) && (peso <= PESO_MEDIO);
//		Boolean pesoPesado = peso > PESO_MEDIO;

//		if (pesoLeve) {
//			System.out.println("O lutador(a) é peso leve!");
//		} else {
//			Boolean pesoMedio = (peso > PESO_LEVE) && (peso <= PESO_MEDIO);
//
//			if (pesoMedio) {
//				System.out.println("O lutador(a) é peso médio!");
//			} else {
//				Boolean pesoPesado = peso > PESO_MEDIO;
//				
//				if (pesoPesado) {
//					System.out.println("O lutador(a) é peso pesado!");
//				}
//			}
//		}

		Boolean pesoLeve = (peso <= PESO_LEVE) && (peso > 0);
		Boolean pesoMedio = (peso > PESO_LEVE) && (peso <= PESO_MEDIO);
		Boolean pesoPesado = peso > PESO_MEDIO;

		if (pesoLeve) {
			System.out.println("O lutador(a) é peso leve!");
		} else if (pesoMedio) {
			System.out.println("O lutador(a) é peso médio!");
		} else if (pesoPesado) {
			System.out.println("O lutador(a) é peso pesado!");
		} else {
			System.out.println("O lutador(a) não se encaixa em categoria alguma!");
		}

		scanner.close();
	}

}
