/*
 * Neste problema, deve-se ler o código de uma peça 1, o número de peças 1,
 * o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 
 * e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
 */
package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Sequencial1010 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo, codigo2, quantidade2, quantidade;
		double valor, valor2, valorPagar;

		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		valor = sc.nextDouble();
		codigo2 = sc.nextInt();
		quantidade2 = sc.nextInt();
		valor2 = sc.nextDouble();

		valorPagar = (quantidade * valor) + (quantidade2 * valor2);

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPagar);

		sc.close();
	}
}
