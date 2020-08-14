package br.algaworks.logica.capitulo09.primeiraclasse;

public class PrimeiraClasse {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "SmartPhone";
		produto.precoUnitario = 500.0;
		produto.quantidade = 15;
		
		exibirQuantidadeEmEstoque(produto);
		
	}

	static void exibirQuantidadeEmEstoque(Produto produto) {
		System.out.println("Quantidade em estoque do produto "+ produto.nome + " é de " + produto.quantidade + " unidades");
	}

}
