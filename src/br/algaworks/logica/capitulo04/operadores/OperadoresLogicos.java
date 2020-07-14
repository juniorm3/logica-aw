package br.algaworks.logica.capitulo04.operadores;

public class OperadoresLogicos {

	public static void main(String[] args) {
		Boolean carrinhoMiorQue100 = false;
		Boolean periodoDePromocao = true;
		Boolean jaFezCompraNaLoja = false;
		Boolean pagamentoAVista = true;
		
//		Boolean aplicarDesconto = carrinhoMiorQue100 && periodoDePromocao;
		
//		Boolean aplicarDesconto = carrinhoMiorQue100 || periodoDePromocao;
		
//		Boolean aplicarDesconto = periodoDePromocao && carrinhoMiorQue100 && jaFezCompraNaLoja;
		
//		Boolean aplicarDesconto = periodoDePromocao || carrinhoMiorQue100 || jaFezCompraNaLoja;
		
		Boolean aplicarDesconto = periodoDePromocao && (carrinhoMiorQue100 || jaFezCompraNaLoja) && pagamentoAVista;
		
		if(aplicarDesconto) {
			System.out.println("Sim! Aplique o desconto.");
		} else {
			System.out.println("Não aplique o desconto");
		}

	}

}
