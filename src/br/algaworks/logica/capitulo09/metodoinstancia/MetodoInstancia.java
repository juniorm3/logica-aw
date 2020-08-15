package br.algaworks.logica.capitulo09.metodoinstancia;

public class MetodoInstancia {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.primeiroNome = "Mario";
		cliente.ultimoNome = "Junior";
		cliente.telefone = "129999999";
		cliente.email = "juniorm3@msn.com";
		
		Cliente cliente2 = new Cliente();
		cliente2.primeiroNome = "Andreia";
		cliente2.ultimoNome = "Martins";
		cliente2.telefone = "129999980";
		cliente2.email = "familiaandreia@msn.com";

		System.out.println("Nome cliente: " + cliente.obterNomeCompleto() + ", DDD: " + cliente.obterDDD());
		System.out.println("Nome cliente: " + cliente2.obterNomeCompleto() + ", DDD: " + cliente2.obterDDD());
	}

//	static String obterNomeCompletoCliente(Cliente cliente) {
//		String nomeCompleto = cliente.primeiroNome + " " + cliente.ultimoNome;
//
//		return nomeCompleto;
//	}
	
	

}
