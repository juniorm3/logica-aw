package br.algaworks.logica.capitulo11;

import br.algaworks.logica.capitulo11.algaworksconsole.Interacao;

public class Exercicio {

	public static void main(String[] args) {

		Interacao interacao = new Interacao();

		Double valorProduto = interacao.lerDecimal("Digite o valor do produto: ");

		Double valorPassadoPeloCliente = interacao.lerDecimal("Digite quantidade passado pelo cliente: ");

		Double resultado = valorPassadoPeloCliente - valorProduto;

		interacao.imprimir("Troco: " + resultado);

		interacao.fechar();
	}

}
