package br.algaworks.logica.capitulo09.metodoinstancia;

public class Produto {

	String nome;

	Double precoUnitario;

	Integer quantidade;

	boolean reporEstoque() {
		if (quantidade < 10) {
			return true;
		}

		return false;
	}
}
