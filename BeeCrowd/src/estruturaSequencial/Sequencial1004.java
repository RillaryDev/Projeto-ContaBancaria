package estruturaSequencial;

import java.util.Scanner;

public class Sequencial1004 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, y, prod;

		x = sc.nextInt();
		y = sc.nextInt();

		prod = x * y;

		System.out.printf("PROD = %d%n", prod);

		sc.close();
	}
}
