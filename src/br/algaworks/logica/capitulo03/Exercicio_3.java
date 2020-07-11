package br.algaworks.logica.capitulo03;
import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Entre com a nota: ");
		Double nota = scanner.nextDouble();

		Boolean resultado = nota >= 70;

		if (resultado) {
			System.out.print("O aluno foi aprovado !");
		} else {
			System.out.print("O aluno foi reprovado !");
		}

		scanner.close();
	}

}
