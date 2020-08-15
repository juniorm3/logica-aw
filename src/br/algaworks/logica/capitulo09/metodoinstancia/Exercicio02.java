package br.algaworks.logica.capitulo09.metodoinstancia;

public class Exercicio02 {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "Notebook";
		produto.precoUnitario = 2500.0;
		produto.quantidade = 8;

		System.out.println("É necessário repor o estoque?");
		if (produto.reporEstoque()) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
