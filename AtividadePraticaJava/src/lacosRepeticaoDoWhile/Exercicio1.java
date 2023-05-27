package lacosRepeticaoDoWhile;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {

		int soma = 0, num;

		Scanner leia = new Scanner(System.in);

		do {

			System.out.println("Digite um número: ");
			num = leia.nextInt();

			if (num > 0) {

				soma += num;
			}
			

		} while (num != 0);
		
		System.out.println("A soma dos números positivos é: " + soma);
		soma = leia.nextInt();
		
	    leia.close();

	}

}
