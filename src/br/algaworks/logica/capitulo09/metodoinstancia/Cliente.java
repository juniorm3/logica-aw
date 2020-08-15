package br.algaworks.logica.capitulo09.metodoinstancia;

public class Cliente {

	String primeiroNome;
	
	String ultimoNome;
	
	String telefone;
	
	String email;
	
	String obterNomeCompleto() {
		String nomeCompleto = primeiroNome + " " + ultimoNome;

		return nomeCompleto;
	}

	public String obterDDD() {		
		return telefone.substring(0, 2);
	}
}
