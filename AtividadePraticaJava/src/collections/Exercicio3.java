package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> valores = new HashSet<Integer>();

		Integer num = 0;

		for (int i = 1; i < 11; i++) {

			System.out.printf("Digite o %d número:%n", i);
			num = sc.nextInt();
			valores.add(num);
		}

		System.out.println("\nListar dados do Set: ");

		Iterator<Integer> ivalores = valores.iterator();

		while (ivalores.hasNext()) {
			System.out.println(ivalores.next());
		}

		sc.close();

	}
}