package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Sequencial1002 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double area, n = 3.14159, raio;

		raio = sc.nextDouble();

		area = n * Math.pow(raio, 2);

		System.out.printf("A=%.4f%n", area);

		sc.close();
	}
}