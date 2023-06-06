/*Calcule o consumo médio de um automóvel sendo fornecidos a distância total 
 * percorrida (em Km) e o total de combustível gasto (em litros).
 */
package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Sequencial1014 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int distancia;
		double litros, gasto;

		distancia = sc.nextInt();
		litros = sc.nextDouble();

		gasto = (distancia / litros);

		System.out.printf("%.3f km/l%n", gasto);

		sc.close();

	}

}
