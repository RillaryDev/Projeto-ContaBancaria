/*
 Escreva um programa que leia o número de um funcionário, 
 seu número de horas trabalhadas, o valor que recebe por hora e 
 calcula o salário desse funcionário. A seguir, mostre o número e o 
 salário do funcionário, com duas casas decimais.
 */
package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Sequencial1008 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num, horasTrabalhadas;
		double salario, novoSalario;

		num = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		salario = sc.nextDouble();

		novoSalario = horasTrabalhadas * salario;

		System.out.printf("NUMBER = %d%n", num);
		System.out.printf("SALARY = U$ %.2f%n", novoSalario);

		sc.close();

	}
}