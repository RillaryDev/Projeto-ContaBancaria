package matrizes;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double matrizNotas[][] = new double[10][4];
		double media[] = new double[10];
		double soma = 0.0f;

		for (int i = 0; i < matrizNotas.length; i++) {

			for (int j = 0; j < matrizNotas[i].length; j++) {

				System.out.println("Digite a nota do aluno(a): ");
				matrizNotas[i][j] = leia.nextDouble();

				soma += matrizNotas[i][j];
			}

			media[i] = soma / 4;
			soma = 0;

		}
		         System.out.println("Media das notas: ");

		    for (int i = 0; i < matrizNotas.length; i++) {

			     System.out.println("Aluno(a) " + (i + 1) + ": " + media[i]); 
			
		    }

		leia.close();

	}
}
