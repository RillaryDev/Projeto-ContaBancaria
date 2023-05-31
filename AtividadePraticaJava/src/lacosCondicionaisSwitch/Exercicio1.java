package lacosCondicionaisSwitch;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
	int codigoProduto, quantidade;
	float valorProduto;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Código do Produto:");
	codigoProduto = leia.nextInt();
	
	System.out.println("Quantidade:");
	quantidade = leia.nextInt();
		
	switch (codigoProduto) {
	
	   case  1: 
		   
		   valorProduto = quantidade*10;
		   System.out.println("\nProduto: Cachorro Quente");
			System.out.printf("\nValor total: %.2f" , valorProduto);
		   break;
		   
	   case  2: 
		   
		   valorProduto = quantidade*15;
		   System.out.println("\nProduto: X-Salada");
			System.out.printf("\nValor total: %.2f" , valorProduto);
		   break;
		   
	   case  3: 
		   
		   valorProduto = quantidade*18;
		   System.out.println("\nProduto: X-Bacon");
			System.out.printf("\nValor total: %.2f" , valorProduto);
		   break;
		   
	   case  4: 
		   
		   valorProduto = quantidade*12;
		   System.out.println("\nProduto: Bauru");
			System.out.printf("\nValor total: %.2f" , valorProduto);
		   break;
		   
	   case  5: 
		   
		   valorProduto = quantidade*8;
		   System.out.println("\nProduto: Refrigerante");
			System.out.printf("\nValor total: %.2f" , valorProduto);
		   break;
		   
	   case  6: 
		   
		   valorProduto = quantidade*13;
		   System.out.println("\nProduto: Suco de laranja");
			System.out.printf("\nValor total: %.2f" , valorProduto);
		   break;
		      
	    }
	
	
	   leia.close();

	
	
	}
}