package arrays;

import java.util.Scanner;

public class Practica007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_1 = new int[100];
		Scanner entrada = new Scanner(System.in);
		int valor_cambiar;
		int valor_por;
		for (int i = 0; i < array_1.length; i++) {
			 array_1[i] = (int)(Math.random()*21);
		}
		
		for (int num: array_1) {
			System.out.print(" " + num);
		}
		System.out.println();
		System.out.println("Valores a cambiar");
		valor_cambiar = entrada.nextInt();
		System.out.println("Por");
		valor_por = entrada.nextInt();
		entrada.close();
		
		for (int j = 0; j < array_1.length; j++) {
			if (array_1[j] == valor_cambiar) {
				array_1[j] = valor_por;
				System.out.print(" '" + array_1[j] + "'");
			} else {
				System.out.print(" " + array_1[j]);
			}
		}
		
	}

}
