package lacosCondicionaisIF;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		int n1;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		n1 = leia.nextInt();
		
		
		if (n1%2==0 && n1 >=0) {
			
			System.out.println("O Número " + n1 + " é par e positivo!");
		}
		
		else if(n1%2!=0 && n1 >= 0) {
			
			System.out.println("O Número " + n1 + " é ímpar e positivo!");
		}
		
		else if(n1%2==0 && n1 < 0) {
			
			System.out.println("O Número " + n1 + " é par e negativo!");
		}
		
		else if(n1%2!=0 && n1 < 0) {
			
			System.out.println("O Número " + n1 + " é ímpar e negativo!");
        }
        
        
		leia.close();


	}
		
}
