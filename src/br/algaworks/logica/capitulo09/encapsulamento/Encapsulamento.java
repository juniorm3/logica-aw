package br.algaworks.logica.capitulo09.encapsulamento;

public class Encapsulamento {

	public static void main(String[] args) {

//		Cliente cliente = new Cliente();
//		cliente.nome = "Mario";
//		cliente.telefone = "21 8888-9999";
//		
//		System.out.println("Nome cliente: " + cliente.nome);
		
		
		Cliente cliente = new Cliente();
		cliente.setNome("Mario Mariano");
		cliente.setTelefone("21 8888-9999");
		
		System.out.println("Nome cliente: " + cliente.getNome());
		System.out.println("Primeiro Nome: " + cliente.getPrimeiroNome());
		System.out.println("Ultimo Nome: " + cliente.getUltimoNome());
		
	}

}
