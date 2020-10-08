package br.algaworks.logica.capitulo11.blibliotecaemail;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.mail.EmailException;

public class Exercicio {

	public static void main(String[] args) throws EmailException {
		Scanner scanner = new Scanner(System.in);
		
		List<String> tarefas = new ArrayList<String>();
		String tarefa = "";
		
		while(!tarefa.equals("x")) {
			System.out.println("Informar atividade: ");
			tarefa = scanner.nextLine();
			tarefas.add(tarefa);
		}
		
		System.out.println("Fim da coleat de tarefas...");
		System.out.println("Incio do envio de tarefas por e-mail...");
		
		Carteiro.enviar("juniorm33@gmail.com", "Tarefas para execução", tarefas);
		
		System.out.println("Envio realizado...");
		
	}
}
