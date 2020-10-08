package br.algaworks.logica.capitulo11.blibliotecaemail;

import java.util.List;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Carteiro {

	static void enviar(String para, String assunto, String msg) throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("juniorm33", "am05120326J"));
		email.setSSLOnConnect(true);
		email.setFrom("juniorm33@gmail.com");
		email.setSubject(assunto);
		email.setMsg(msg);
		email.addTo(para);
		email.send();

		System.out.println("Fim...");
	}

	public static void enviar(String para, String assunto, List<String> listaTarefas) throws EmailException {

		String tarefas = "";

		for (int iteracao = 0; iteracao < listaTarefas.size(); iteracao++) {
			tarefas += listaTarefas.get(iteracao) + "\n";
		}
		
		String mensagem = "Suas tarefas: \n" + tarefas;
		System.out.println(mensagem);
		
		enviar(para, assunto, mensagem);
		
	}

}
