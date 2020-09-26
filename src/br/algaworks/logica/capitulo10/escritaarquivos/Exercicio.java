package br.algaworks.logica.capitulo10.escritaarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		ArrayList<String> atividades = new ArrayList<String>();
		String atividade = "";

		while (!atividade.equals("x")) {
			System.out.print("Informar atividade: ");
			atividade = scanner.nextLine();
			atividades.add(atividade);
		}
				
		System.out.println("Fim...");

		Path arquivo = Paths.get("D:\\ESTUDO\\tmp\\aula\\exercicio.txt");
		Files.write(arquivo, atividades);
	}

}
