package br.algaworks.logica.capitulo10.escritaarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivos {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> linhas = new ArrayList<String>();
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Jogador " + i + ": ");
			String nome = scanner.nextLine();
			
			linhas.add(nome);			
		}
		
		
		Path arquivo = Paths.get("D:\\ESTUDO\\tmp\\aula\\arquivo.txt");
		Files.write(arquivo, linhas);
		
		System.out.println("Fim...");
		
	}
}
