package variaveisOperadores;

import java.util.Scanner;

public class exercicio1 {

	public static void exercicio(String[] args) {

		float salario, abono, novoSalario;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o sálario: ");
		salario = leia.nextFloat();
		
		System.out.print("Digite o abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.print("Novo salário: "+ novoSalario);
				
		leia.close();

		
		
	}

}
