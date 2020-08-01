package br.algaworks.logica.capitulo08.Metodos;

import java.util.Scanner;

public class Exerecicio_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o numero multiplicando: ");
		int multiplicando = scanner.nextInt();

		imprimirTabuada(multiplicando, 0);
	}

	private static void imprimirTabuada(int multiplicando, int multiplicador) {
		System.out.println(multiplicando + " x " + multiplicador + " = " + multiplicando * multiplicador);

		if (multiplicador < 10) {
			imprimirTabuada(multiplicando, ++multiplicador);

		}
	}

}
