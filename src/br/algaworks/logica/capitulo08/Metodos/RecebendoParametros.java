package br.algaworks.logica.capitulo08.Metodos;

import java.util.Scanner;

public class RecebendoParametros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		imprimirTraco();

		String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avançado" };

		System.out.println("Escolha dentre os cursos abaixo: ");

		iterarEExibirPosicoesDoVetorString(cursos);

		System.out.println("O curso que você deseja é o: ");
		Integer posicaoCursoEscolhido = scanner.nextInt();

		Boolean posicaoValida = validarPosicaoEscolhida(cursos, posicaoCursoEscolhido);

		if (!posicaoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}

		imprimirTraco();

		String[] formasPagamento = new String[] { "Cartão", "Boleto" };

		System.out.println("Escolha dentre as formas de pagamento abaixo: ");

		iterarEExibirPosicoesDoVetorString(formasPagamento);
		
		System.out.println("Sua forma de pagamento escolhida é: ");
		Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();
		
		posicaoValida = validarPosicaoEscolhida(formasPagamento, posicaoFormaPagamentoEscolhida);
		
		if (!posicaoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);

		scanner.close();

	}


	private static boolean validarPosicaoEscolhida(String[] vetor, Integer selecao) {
		return selecao >= 0 && selecao < vetor.length;
	}


	private static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("[" + i + "]" + vetor[i]);
//			System.out.println(+ i + ". " + vetor[i]);
		}
	}


	private static void encerrarProgramaPorCausaDaPosicaoInvalida() {
		System.err.println("Posição inválida!");
		System.exit(1);
	}


	private static void imprimirTraco() {
		System.out.println("******************************************************");
	}

}
