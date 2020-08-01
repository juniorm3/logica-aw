package br.algaworks.logica.capitulo03.variavies;

import java.util.Scanner;

public class TipoLogico {
	
	static final Integer IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		final Integer idadeMinimaParaTirarCarteira = 18;

		System.out.print("Idade: ");
		Integer idade = scanner.nextInt();

		Boolean podeTirarCarteira = idade >= IDADE_MINIMA_PARA_TIRAR_CARTEIRA;

		if (podeTirarCarteira) {
			System.out.println("Sim! Ele(a) pode tirar carteira!");

		} else {
			System.out.println("Não! Ele(a) não pode tirar carteira!");
		}

		scanner.close();
	}

}