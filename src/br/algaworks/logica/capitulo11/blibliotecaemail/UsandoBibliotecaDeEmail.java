package br.algaworks.logica.capitulo11.blibliotecaemail;

import org.apache.commons.mail.EmailException;

public class UsandoBibliotecaDeEmail {

	public static void main(String[] args) throws EmailException {

		Carteiro.enviar("juniorm3@msn.com", "Aula sobre uso de bibliotecas de terceiros",
				"Se estiver vendo este e-mail, e porque nosso envio funcionou! :-)");

		System.out.println("Fim...");
	}

}
