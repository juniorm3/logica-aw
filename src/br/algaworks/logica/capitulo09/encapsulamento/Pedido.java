package br.algaworks.logica.capitulo09.encapsulamento;

public class Pedido {

	String codigo;
	Double subtotal;
	Double desconto;
//	Double total;

	String getCodigo() {
		return codigo;
	}

	void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	Double getSubtotal() {
		return subtotal;
	}

	void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	Double getDesconto() {
		return desconto;
	}

	void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	Double getTotal() {
		return subtotal - ((subtotal * desconto) / 100);
	}

	void setTotal(Double total) {
	}

}
