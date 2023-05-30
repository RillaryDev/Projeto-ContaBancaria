package vetores;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		int vetorNumero[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 }, num, posicao = -1;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o número que você deseja encontrar: ");
		num = leia.nextInt();

		for (int i = 0; i < vetorNumero.length; i++) {

			if (num == vetorNumero[i]) {

				posicao = i;
			}

		}

		if (posicao != -1) {

			System.out.println("O número está localizado na posição: " + posicao);

		} else {

			System.out.println("O número " + num + " não foi encontrado!");
		}

		leia.close();

	}

}
