package aleatorios;

import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = (int) (Math.random()*100);
		Scanner entrada = new Scanner(System.in);
		System.out.println("Adivina el numero");
		for (int i = 4; i >= 0; i--) {
			System.out.println("Ingresa el numero que crees que se genero");
			int num_adivina = entrada.nextInt();
			
			if (numero == num_adivina) {
				System.out.println("Es correcto el numero: " + numero + " es el que se genero");
			} else {
				if (i == 0) {
					System.out.println("Te jodiste, el numero era: " + numero);
				} else{
					System.out.println("Intenta de nuevo, te quedan: " + (i) + " oportunidades");
				}
			}
			
			
		}
	}

}
