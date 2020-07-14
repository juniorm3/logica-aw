package br.algaworks.logica.capitulo04.operadores;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o valor do produto: ");
		Double valorProduto = scanner.nextDouble();

		Double valorCompra = 0.0;

		if (valorProduto < 100) {
			valorCompra = valorProduto + 15.00;
		} else {
			valorCompra = valorProduto;
		}

		System.out.printf("Valor final da compra é de R$" + valorCompra);

		scanner.close();
	}

}
