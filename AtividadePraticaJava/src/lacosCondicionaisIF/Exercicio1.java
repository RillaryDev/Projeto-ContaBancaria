package lacosCondicionaisIF;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		int numA, numB, numC, soma;
		
		Scanner leia = new Scanner(System.in);
		
	    System.out.println("Digite o número A:");
	    numA = leia.nextInt();
	    
	    System.out.println("Digite o número B:");
	    numB = leia.nextInt();
	    
	    System.out.println("Digite o número C:");
	    numC = leia.nextInt();
	    
	    soma = numA + numB;
	    
	    if (soma > numC) {
	    	
	    	System.out.println("A Soma de A + B é Maior do que C");
	    }
	    
	    else if (soma < numC) {
	    	
	    	System.out.println("A Soma de A + B é Menor do que C");
	    }
	    
	    else {
	    	
	    	System.out.println("A Soma de A + B é Igual a C");
	    }
	    
	    
		leia.close();

		
	}


}
