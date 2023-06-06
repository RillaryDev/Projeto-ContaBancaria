/*
 * Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento
 *  em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.
 */
package estruturaSequencial;

import java.util.Scanner;

public class Sequencial1019 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n, resto, horas, minutos, segundos;
		
		n = sc.nextInt();
		
		horas = n / 3600;
		resto = n % 3600;
		
		minutos = resto / 60;
		segundos = resto % 60;

		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		sc.close();
	}
}