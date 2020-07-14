package br.algaworks.logica.capitulo04.operadores;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o primeiro numero: ");
		Double primeiroNumero = scanner.nextDouble();

		System.out.print("Informe o segundo numero: ");
		Double segundoNumero = scanner.nextDouble();

		System.out.println("Sendo as operações: ");
		System.out.println("1 -  SOMA");
		System.out.println("2 -  SUBTRAÇÃO");
		System.out.println("3 -  MULTIPLICAÇÃO");
		System.out.println("4 -  DIVISÃO");

		System.out.print("Informe a operação que deseja realizar: ");
		Integer operacao = scanner.nextInt();

		Double resultado = 0.0;
		String operador = "";

		if (operacao == 1) {
			resultado = primeiroNumero + segundoNumero;
			operador = "+";
		} else if (operacao == 2) {
			resultado = primeiroNumero - segundoNumero;
			operador = "-";
		} else if (operacao == 3) {
			resultado = primeiroNumero * segundoNumero;
			operador = "x";
		} else if (operacao == 4) {
			resultado = primeiroNumero / segundoNumero;
			operador = "/";
		}

		System.out.println("O resultado da operação " + primeiroNumero + operador + segundoNumero + " é: " + resultado);

		scanner.close();

	}

}
