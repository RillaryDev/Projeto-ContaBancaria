package estruturaDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionQueue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Queue<String> fila = new LinkedList<String>();

		int opcao = 1;
		String nome;

		while (opcao != 0) {

			System.out.println("1 - Adicionar Cliente na fila");
			System.out.println("2 - Listar todos os clientes");
			System.out.println("3 - Retirar Cliente da fila");
			System.out.println("0 - Sair");
			opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("\nDigite o nome do cliente: ");
				nome = sc.next();
				fila.add(nome);

				System.out.println("\nCliente Adicionado!!");
				break;

			case 2:
				System.out.println("Lista de Clientes na Fila: ");
				System.out.println(fila);
				System.out.println("");

				break;

			case 3:
				if (fila.isEmpty()) {
					System.out.println("A Fila está vazia!!");
				} else {
					System.out.println(fila.poll());
					System.out.println("O Cliente foi Chamado!");
					System.out.println("\nFila: ");
					System.out.println(fila + "\n");
				}
				break;

			case 0:
				System.out.println("Programa Finalizado!!");
				break;

			default:
				System.out.println("Opcão Invalida!!");
				break;

			}
		}
		sc.close();

	}
}
