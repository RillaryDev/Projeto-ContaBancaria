/*
 * Faça um programa que leia o nome de um vendedor, 
 * o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
 * Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
 * informar o total a receber no final do mês, com duas casas decimais.
 */
package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Sequencial1009 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome;
		double vendas, salario, comissao, total;

		nome = sc.next();
		salario = sc.nextDouble();
		vendas = sc.nextDouble();

		comissao = vendas * 0.15;
		total = salario + comissao;

		System.out.printf("TOTAL = R$ %.2f%n", total);

		sc.close();
	}

}