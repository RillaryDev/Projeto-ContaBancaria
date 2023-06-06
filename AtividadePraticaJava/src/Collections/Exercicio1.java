package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();

		String cor;

		for (int i = 0; i < 4; i++) {

			cor = sc.nextLine();
			cores.add(cor);
		}

		System.out.println("\nCores selecionas: ");

		for (String listaCor : cores) {

			System.out.println(listaCor);

		}

		Collections.sort(cores);
		

		System.out.println("\nCores organizadas em ordem: ");

		for (String listaCor : cores) {

			System.out.println(listaCor);
		}

		sc.close();

	}

}
