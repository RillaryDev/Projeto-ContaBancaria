package lacosRepeticaoWhile;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		String continua = "s";
		int idade, sexo, categoria, pessoasBack=0, mulheresFront=0, homensDevMob=0, mulheresFullStack=0;

		Scanner leia = new Scanner(System.in);

	while(continua.equals("s")) {
		System.out.println("\nDigite a Idade(Número Inteiro): ");
		idade = leia.nextInt();
		System.out.println("\nDigite o Sexo(Número Inteiro): \n" + 
							"1 – Masculino\n" + 
							"2 – Feminino\n" + 
							"3 – Outros\n");
		sexo = leia.nextInt();
		System.out.println("\nDigite a Categoria(Número Inteiro): \n" + 
							"1 – Backend\n" + 
							"2 – Frontend\n" + 
							"3 – Mobile\n" + 
							"4 – FullStack\n");
        categoria = leia.nextInt();
        
        if (categoria == 1) {
        	
        	pessoasBack++;
        }
        if (categoria == 2 && sexo == 2) {
        	
        	mulheresFront++;
        }
        if (categoria == 3 && sexo == 1 && idade > 40) {
        	
        	homensDevMob++;
        }
        
        if (categoria == 4 && sexo == 2 && idade < 30) {
        	
        	mulheresFullStack++;
        }
        
        System.out.println("\nDeseja continuar(S/N)?");
        continua = leia.next();
	  }
		System.out.println("Total de pessoas desenvolvedoras Backend: " + pessoasBack);
		System.out.println("Total de mulheres desenvolvedoras Frontend: " + mulheresFront);
		System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: " + homensDevMob);
		System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: " + mulheresFullStack);
		
		
	    leia.close();

	}

}
