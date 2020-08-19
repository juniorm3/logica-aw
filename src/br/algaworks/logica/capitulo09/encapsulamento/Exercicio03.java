package br.algaworks.logica.capitulo09.encapsulamento;

public class Exercicio03 {

	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		pedido.setCodigo("01");
		pedido.setSubtotal(100.0);
		pedido.setDesconto(10.0);
//		pedido.setTotal(pedido.getSubtotal() - (pedido.getSubtotal() * pedido.getDesconto()) / 100);
		
		System.out.println("Codigo: " + pedido.getCodigo());
		System.out.println("SubToal: " + pedido.getSubtotal());
		System.out.println("Desconto: " + pedido.getDesconto());
		System.out.println("Total: " + pedido.getTotal());

	}

}
