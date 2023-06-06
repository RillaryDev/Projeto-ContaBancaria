package lacosRepeticaoFor;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numPar = 0, numImpar = 0, num;

		for (int i = 1; i <= 4; i++) {
			System.out.printf("Digite o %dº número: ", i);
			num = sc.nextInt();

			if (num % 2 == 0) {

				numPar++;
			}

			else {
				numImpar++;
			}
		}

		System.out.println("Total de números pares: " + numPar);
		System.out.println("Total de números ímpares: " + numImpar);
		
		sc.close();
	}

}
