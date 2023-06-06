/*Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido
 * o valor de seu raio (R). A fórmula para calcular o volume é: (4/3) * pi * R3.
 *  Considere (atribua) para pi o valor 3.14159.
 */

package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Sequencial1011 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double r, pi = 3.14159, volume;
		
		r = sc.nextDouble();
		
		volume = (4/3.0) * pi * (Math.pow(r, 3 ));
		
		System.out.printf("VOLUME = %.3f%n", volume);
		
		sc.close();
	}

}
