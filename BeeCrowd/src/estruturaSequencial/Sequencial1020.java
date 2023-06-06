/*Leia um valor inteiro correspondente à idade de uma pessoa em dias e
 *informe-a em anos, meses e dias.
 *Obs: apenas para facilitar o cálculo, considere todo ano com 365 dias e 
 *todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que 
 *permite 12 meses e alguns dias, como 360, 363 ou 364. 

*/
package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Sequencial1020 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int anos, mes, dias, idade, resto;

		dias = sc.nextInt();

		anos = dias / 365;
		resto = dias % 365;
		mes = resto / 30;
		dias = resto % 30;

		System.out.println(anos + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dias + " dia(s)");

		sc.close();
	}
}
