package variaveisOperadores;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Salário Bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.print("Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.print("Horas Extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.print("Descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = (salarioBruto + adicionalNoturno + (horasExtras*5) - descontos);
				
		System.out.print("Salário Líquido: "+ salarioLiquido);
				
		leia.close();
				
	}

}
