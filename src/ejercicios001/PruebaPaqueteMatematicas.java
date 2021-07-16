package ejercicios001;

import java.util.Scanner;
import funciones.Matematicas;

public class PruebaPaqueteMatematicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);		
		System.out.println("Introduce el número 1");
		int numero_1 = entrada.nextInt();
		System.out.println("Introduce el número 2");
		int numero_2 = entrada.nextInt();
		int numero_aux = Matematicas.juntaNumeros(numero_1, numero_2);
		System.out.println(numero_1 + " junto a: " + numero_2 + " es:" + numero_aux);
		entrada.close();
	}
}
