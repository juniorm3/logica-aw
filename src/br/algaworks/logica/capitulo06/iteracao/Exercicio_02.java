package br.algaworks.logica.capitulo06.iteracao;

public class Exercicio_02 {

	public static void main(String[] args) {
		Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		int resultado = 0;
		int indice = 0;
		while (indice < numeros.length) {
			resultado = numeros[indice] % 3;
			if (resultado != 0) {				
				indice++;
			} else {
				System.out.println(numeros[indice]);				
			}
			indice++;
		}

	}

}
