package br.algaworks.logica.capitulo09.primeiraclasse;

public class Exercicio01 {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "Notebook";
		produto.precoUnitario = 2500.0;
		produto.quantidade = 8;

		System.out.println("É necessário repor o estoque?");
		if (reporEstoque(produto)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

	private static boolean reporEstoque(Produto produto) {
		if (produto.quantidade < 10) {
			return true;
		}
		
		return false;
	}

}
