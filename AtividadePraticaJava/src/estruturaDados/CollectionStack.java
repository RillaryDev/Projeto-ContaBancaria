package estruturaDados;

import java.util.Scanner;
import java.util.Stack;

public class CollectionStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Stack<String> pilha = new Stack<String>();

		int opcao = 1;
		String livro;

		while (opcao != 0) {

			System.out.println("\n1 - Adicionar Livro na pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar Livro da pilha");
			System.out.println("0 - Sair\n");
			System.out.println("Digite uma opção: ");

			opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("\nDigite o nome: ");
				livro = sc.next();
				pilha.add(livro);
				System.out.println("Pilha: ");
				System.out.println(pilha);

				System.out.println("\nLivro Adicionado!!");
				break;

			case 2:
				
			if (pilha.isEmpty()) {
				System.out.println("A pilha está vazia! Adicione um livro.");
			}else {
				System.out.println("Lista de livros na pilha: ");
				System.out.println(pilha);
				System.out.println("");
			}
				break;

			case 3:
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia!!");
				} else {
					System.out.println(pilha.pop());
					System.out.println("Um Livro foi retirado da pilha!!");
					System.out.println("Pilha: ");
					System.out.println(pilha + "\n");
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
