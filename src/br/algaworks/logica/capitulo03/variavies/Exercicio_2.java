package br.algaworks.logica.capitulo03.variavies;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entre com o nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Entre com o sobrenome: ");
		String sobreNome = scanner.nextLine();
		
		System.out.println("Olá "+ nome + " "+ sobreNome);
		
		scanner.close();
	}

}
