package br.algaworks.logica.capitulo08.Metodos;

import java.util.Scanner;

public class RetornandoValores {

//	public static void main(String[] args) {
//		// 50 --- 100%
//		// X --- 20%
//		// 50 * 20 = x * 100
//		// x = (50 * 20) / 100
//		Double[] premissaInicial = new Double[] {725.5, 100.0};
//		Double proporcao = 20.0;
//		Double resultadoFinal = regraDeTres(premissaInicial, proporcao);
//		System.out.println("Resultado: " + resultadoFinal);
//	}
//
//	static Double regraDeTres(Double[] premissa, Double proporcao) {
//		Double resultado = (premissa[0] * proporcao) / premissa[1];
//		return resultado;
//	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		imprimirTraco();

		String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avançado" };

		imprimir("Escolha dentre os cursos abaixo: ");

		iterarEExibirPosicoesDoVetorString(cursos);

		Integer posicaoCursoEscolhido = receberNumeroInteiroDoUsuario("O curso que você deseja é o: ", scanner);

		Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(cursos, posicaoCursoEscolhido);

		if (!posicaoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}

		imprimirTraco();

		String[] formasPagamento = new String[] { "Cartão", "Boleto" };

		imprimir("Escolha dentre as formas de pagamento abaixo: ");

		iterarEExibirPosicoesDoVetorString(formasPagamento);

		Integer posicaoFormaPagamentoEscolhida = receberNumeroInteiroDoUsuario("Sua forma de pagamento escolhida é: ", scanner);

		posicaoValida = verificarPosicaoEscolhidaPeloUsuario(formasPagamento, posicaoFormaPagamentoEscolhida);

		if (!posicaoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}

		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

		imprimirTraco();

		imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);

		scanner.close();

	}

	private static Integer receberNumeroInteiroDoUsuario(String texto, Scanner scanner) {
		imprimirEContinuarNaMesmaLinha(texto);
		Integer numero = scanner.nextInt();

		return numero;
	}

	private static boolean verificarPosicaoEscolhidaPeloUsuario(String[] vetor, Integer posicao) {
		return posicao >= 0 && posicao < vetor.length;
	}

	private static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			imprimir("[" + i + "]" + vetor[i]);
		}
	}

	private static void imprimir(String texto) {
		System.out.println(texto);
	}

	private static void imprimirEContinuarNaMesmaLinha(String texto) {
		System.out.print(texto);
	}

	private static void encerrarProgramaPorCausaDaPosicaoInvalida() {
		System.err.println("Posição inválida!");
		System.exit(1);
	}

	private static void imprimirTraco() {
		imprimir("******************************************************");
	}

}
