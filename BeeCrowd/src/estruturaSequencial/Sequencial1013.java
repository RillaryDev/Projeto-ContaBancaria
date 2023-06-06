/*Faça um programa que leia três valores e apresente o maior dos três valores lidos 
 * seguido da mensagem “eh o maior”.
*/
package estruturaSequencial;

import java.util.Scanner;

public class Sequencial1013 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a, b, c, num, maiorNum;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		num = (a+b+Math.abs(a-b))/2;
		maiorNum = (num+c+Math.abs(num-c))/2;
		
		System.out.printf("%d eh o maior%n", maiorNum);
		
		sc.close();
	}
}