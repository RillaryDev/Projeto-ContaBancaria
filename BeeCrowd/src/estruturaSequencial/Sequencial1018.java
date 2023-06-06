/*Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) 
 * no qual o valor pode ser decomposto. As notas consideradas são de 
 * 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.
 */
package estruturaSequencial;

import java.util.Scanner;

public class Sequencial1018 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, x, nota, resto;
		
		n = sc.nextInt();
		System.out.println(n);

		
		resto = n;
				
		nota = 100;
		x  = resto/nota;
		resto = resto % nota;
		System.out.printf("%d nota(s) de R$ %d,00%n", x, nota);
		
		nota = 50;
		x  = resto/nota;
		resto = resto % nota;
		System.out.printf("%d nota(s) de R$ %d,00%n", x, nota);
		
		nota = 20;
		x  = resto/nota;
		resto = resto % nota;
		System.out.printf("%d nota(s) de R$ %d,00%n", x, nota);
		
		nota = 10;
		x  = resto/nota;
		resto = resto % nota;
		System.out.printf("%d nota(s) de R$ %d,00%n", x, nota);
		
		nota = 5;
		x  = resto/nota;
		resto = resto % nota;
		System.out.printf("%d nota(s) de R$ %d,00%n", x, nota);
		
		nota = 2;
		x  = resto/nota;
		resto = resto % nota;
		System.out.printf("%d nota(s) de R$ %d,00%n", x, nota);
		
		
		System.out.printf("%d nota(s) de R$ 1,00%n", resto);
	
		sc.close();
		
	}
}
