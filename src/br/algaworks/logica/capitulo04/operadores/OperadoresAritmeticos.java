package br.algaworks.logica.capitulo04.operadores;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		Integer adicao = 1 + 1;
		System.out.println("Adição: " + adicao);

		Integer subtracao = 1 - 1;
		System.out.println("Subtração: " + subtracao);

		Integer multiplicacao = 2 * 2;
		System.out.println("Multiplicação: " + multiplicacao);

		Integer divisao = 4 / 2;
		System.out.println("Divisão: " + divisao);

		Integer modulo = 7 % 4;
		System.out.println("Modulo: " + modulo);

		Integer precedencia01 = 1 + 1 * 5;
		System.out.println("Precedência: " + precedencia01);

		Integer precedencia02 = (1 + 1) * 5;
		System.out.println("Precedência: " + precedencia02);

		Integer precedencia03 = 5 * (1 + 1);
		System.out.println("Precedência: " + precedencia03);

		Integer precedencia04 = 5 * (1 + 1) + 2;
		System.out.println("Precedência: " + precedencia04);

		Integer precedencia05 = 5 * ((1 + 1) + 2);
		System.out.println("Precedência: " + precedencia05);

		Integer cinco = 5;
		Integer um = 1;

		Integer precedenciaComVariaveis = cinco * (um + um);
		System.out.println("Precedência com variavéis: " + precedenciaComVariaveis);
	}
}
