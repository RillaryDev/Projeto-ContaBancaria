package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Sequencial1021 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int x, resto, nota, moeda;
		double n;

		n = sc.nextDouble();

		resto = (int) (n * 100.0 + 0.5);

		System.out.println("NOTAS:");

		nota = 100;
		x = resto / (nota * 100);
		resto = resto % (nota * 100);
		System.out.printf("%d nota(s) de R$ %d.00%n", x, nota);

		nota = 50;
		x = resto / (nota * 100);
		resto = resto % (nota * 100);
		System.out.printf("%d nota(s) de R$ %d.00%n", x, nota);

		nota = 20;
		x = resto / (nota * 100);
		resto = resto % (nota * 100);
		System.out.printf("%d nota(s) de R$ %d.00%n", x, nota);

		nota = 10;
		x = resto / (nota * 100);
		resto = resto % (nota * 100);
		System.out.printf("%d nota(s) de R$ %d.00%n", x, nota);

		nota = 5;
		x = resto / (nota * 100);
		resto = resto % (nota * 100);
		System.out.printf("%d nota(s) de R$ %d.00%n", x, nota);

		nota = 2;
		x = resto / (nota * 100);
		resto = resto % (nota * 100);
		System.out.printf("%d nota(s) de R$ %d.00%n", x, nota);

		System.out.println("MOEDAS:");

		moeda = 100;
		x = resto / moeda;
		resto = resto % moeda;
		System.out.printf("%d moeda(s) de R$ 1.00%n", x);

		moeda = 50;
		x = resto / moeda;
		resto = resto % moeda;
		System.out.printf("%d moeda(s) de R$ 0.50%n", x);

		moeda = 25;
		x = resto / moeda;
		resto = resto % moeda;
		System.out.printf("%d moeda(s) de R$ 0.25%n", x);

		moeda = 10;
		x = resto / moeda;
		resto = resto % moeda;
		System.out.printf("%d moeda(s) de R$ 0.10%n", x);

		moeda = 5;
		x = resto / moeda;
		resto = resto % moeda;
		System.out.printf("%d moeda(s) de R$ 0.05%n", x);

		moeda = 1;
		x = resto / moeda;
		resto = resto % moeda;
		System.out.printf("%d moeda(s) de R$ 0.01%n", x);

		sc.close();

	}
}