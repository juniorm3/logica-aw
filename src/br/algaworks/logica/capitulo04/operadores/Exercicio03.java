package br.algaworks.logica.capitulo04.operadores;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double gastoTotal = 0.0;
		
		System.out.print("Informe o valor da conta de luz: ");
		gastoTotal += scanner.nextDouble();
		
		System.out.print("Informe o valor da conta de água: ");
		gastoTotal += scanner.nextDouble();
		
		System.out.print("Informe o valor da conta de telefone: ");
		gastoTotal += scanner.nextDouble();
		
		System.out.print("Informe o valor da conta do colégio: ");
		gastoTotal += scanner.nextDouble();
		
		System.out.print("Informe o valor da fatura do cartão: ");
		gastoTotal += scanner.nextDouble();
		
		System.out.print("Informe o valor dos gastos com supermercado: ");
		gastoTotal += scanner.nextDouble();
		
		System.out.println("");
		
		System.out.println("O Gasto total da família é de: R$" + gastoTotal);
		
		
		scanner.close();

	}

}
