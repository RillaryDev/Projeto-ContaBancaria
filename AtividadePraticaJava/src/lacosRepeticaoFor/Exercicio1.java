package lacosRepeticaoFor;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		int num, impar = 0, par = 0, i;

		Scanner leia = new Scanner(System.in);

		for (i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "º número");
			num = leia.nextInt();

			if (num % 2 == 0) {

				par++;
			}

			else {

				impar++;
			}

		}
		System.out.println("Total de números pares: " + par);
		System.out.println("Total de números ímpares:" + impar);
		
		
	    leia.close();
	}

}	
