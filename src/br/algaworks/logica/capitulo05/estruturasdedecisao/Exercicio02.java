package br.algaworks.logica.capitulo05.estruturasdedecisao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Qual é a Meta anual da empresa para esse ano? ");
		Double metaAnual = scanner.nextDouble();
		
		System.out.print("Qual foi o faturamento real da empresa no ultimo ano? ");
		Double faturamentoUltimoAno = scanner.nextDouble();
		
		System.out.print("Qual a média salárial do funcionário(a) pra o ano anterior? ");
		Double mediaSalarial = scanner.nextDouble();
		
		Boolean bonusMeidaSalarial = faturamentoUltimoAno >= metaAnual;
		Boolean bonus80 = (faturamentoUltimoAno < metaAnual) && faturamentoUltimoAno >= (metaAnual * 0.8);
		Double premio = 0.0;
		
		if(bonusMeidaSalarial) {
			System.out.println("O Prémio do funcionario(a) será de: " + mediaSalarial);
			
		} else if(bonus80) {
			System.out.println("O Prémio do funcionario(a) será de: " + (metaAnual * 0.8));
			
		} else {
			System.out.println("O funcionário não receberá nenhum bonus!");
		}
		
		scanner.close();
	}

}
