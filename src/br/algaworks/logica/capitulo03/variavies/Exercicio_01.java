package br.algaworks.logica.capitulo03.variavies;
import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entre com um numero: ");
		Double numero = scanner.nextDouble();
		
		Double quadrado = numero * numero;
		
		System.out.println("O quadrado de "+ numero +" é: " + quadrado);
	}

}
