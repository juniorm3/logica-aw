package br.algaworks.logica.capitulo02;
import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a Altura: ");
		Double altura = scanner.nextDouble();
		
		System.out.print("Digite o Peso: ");
		Double peso = scanner.nextDouble();
		
		Double IMC = peso / (altura * altura);
		
		System.out.println("O índice de massa corporal (IMC): " + IMC);
	}

}
