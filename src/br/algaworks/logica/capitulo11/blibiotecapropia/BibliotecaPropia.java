package br.algaworks.logica.capitulo11.blibiotecapropia;

import br.algaworks.logica.capitulo11.algaworksconsole.Interacao;

public class BibliotecaPropia {

	public static void main(String[] args) {
//		Scanner scannner = new Scanner(System.in);
		
		Interacao interacao = new Interacao();
		
		Integer numero = interacao.lerNumero("Digite um número: ");
		interacao.imprimir("Número: " + numero);
		
		Double decimal = interacao.lerDecimal("Digite um número decimal: ");
		interacao.imprimir("Decimal: " + decimal);
		
		interacao.erro("Essa é uma mensagem de erro!");
		
		interacao.fechar();
	}
}
