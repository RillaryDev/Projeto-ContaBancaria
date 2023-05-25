package variaveisOperadores;

import java.util.Scanner;

public class exercicio2 {

	public static void exercicio(String[] args) {

		float nota1, nota2, nota3, nota4, mediaFinal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite sua primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.print("Digite sua segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.print("Digite sua terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.print("Digite sua quarta nota: ");
		nota4 = leia.nextFloat();
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
				
		System.out.print("Média final: "+ mediaFinal);
				
		leia.close();
		
				
	}

}
