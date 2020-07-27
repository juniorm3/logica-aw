package br.algaworks.logica.capitulo03.variavies;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o valor do produto: ");
		double valorProduto = scanner.nextDouble();

		System.out.print("Informe a quantidade do produto: ");
		int quantidadeProduto = scanner.nextInt();

		double subTotal = valorProduto * quantidadeProduto;

		double desconto = 0.0;

		if (quantidadeProduto > 10) {
			desconto = subTotal * 10 / 100;
		}
		
		double totalFinal = subTotal - desconto;
		
		System.out.println("O valor final do pedido e: R$" + totalFinal);
		
		scanner.close();
	}

}
