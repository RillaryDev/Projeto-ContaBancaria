package lacosCondicionaisSwitch;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) { 
	
		String nome;
		int cargo;
		float salario, novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Nome do colaborador: ");
		nome = leia.next(); 
		
		System.out.println("Cargo: ");
		cargo = leia.nextInt(); 
		
		System.out.println("Salário: ");
		salario = leia.nextFloat();
		
		switch(cargo){
			
		case 1:
			
			novoSalario = salario + (0.1f * salario);
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("\nCargo: Gerente ");
			System.out.printf("\nSalário: %.2f" , novoSalario);
			break;
			
		case 2:
			
			novoSalario = salario + (0.07f * salario);
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("\nCargo: Vendedor ");
			System.out.printf("\nSalário: %.2f" , novoSalario);
			break;		
		case 3:
			
			novoSalario = salario + (0.09f * salario);
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("\nCargo: Supervisor ");
			System.out.printf("\nSalário: %.2f" , novoSalario);
			break;	
			
		case 4:
			
			novoSalario = salario + (0.06f * salario);
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("\nCargo: Motorista ");
			System.out.printf("\nSalário: %.2f" , novoSalario);
			break;	
			
		case 5:
	
			novoSalario = salario + (0.05f * salario);
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("\nCargo: Estoquista ");
			System.out.printf("\nSalário: %.2f" , novoSalario);
			break;	
			
		case 6:
			
			novoSalario = salario + (0.08f * salario);
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("\nCargo: Técnico de TI ");
			System.out.printf("\nSalário: %.2f" , novoSalario);
			break;	
				
			
		}
		
		
		leia.close();

		
		
	}
	
	
}