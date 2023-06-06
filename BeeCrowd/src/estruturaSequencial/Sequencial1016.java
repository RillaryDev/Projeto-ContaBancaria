/*
Dois carros (X e Y) partem em uma mesma direção.
O carro X sai com velocidade constante de 60 Km/h 
e o carro Y sai com velocidade constante de 90 Km/h.
Leia a distância (em Km) e calcule quanto tempo leva (em minutos) 
para o carro Y tomar essa distância do outro carro.
 */
package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Sequencial1016 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);


		int x, y;
		
		x = sc.nextInt();
		
		y = x*2;
		
		System.out.printf("%d minutos%n", y);
		
		sc.close();

	}

}
