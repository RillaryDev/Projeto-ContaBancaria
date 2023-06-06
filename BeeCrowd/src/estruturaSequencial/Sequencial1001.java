package estruturaSequencial;

import java.util.Scanner;
import java.util.Locale;               

public class Sequencial1001 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int A, B, X;

		A = sc.nextInt();
		B = sc.nextInt();

		X = A + B;

		System.out.printf("X = %d%n", X);

		sc.close();
	}
}