package arrays;

import java.util.Scanner;

public class Practica013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_numero = new int[100];
		for(int i = 0; i < array_numero.length; i++) {
			array_numero[i] = (int) (Math.random()*501);
		}
		int cont = 0;
		for(int j = 0; j < array_numero.length; j++) {
			if (cont == 10) {
				System.out.println();
				cont = 0;
			}
			cont++;
			System.out.print(array_numero[j] + " ");
		}
		
		int min = 0;
		int max = 0;
		System.out.println();
		System.out.println("1. minino, 2. maximo");
		Scanner entrada = new Scanner(System.in);
		int seleccion = entrada.nextInt();
		entrada.close();
		if (seleccion == 1) {
			min = array_numero[0];
			for(int k = 0; k < array_numero.length; k++) {				
				if (min > array_numero[k]) {
					min = array_numero[k];
				}
			}
			for(int l = 0; l < array_numero.length; l++) {
				if (cont == 10) {
					System.out.println();
					cont = 0;
				}
				if (array_numero[l] == min) {
					System.out.print("**"+array_numero[l] + "**");
				} else {
					System.out.print(array_numero[l] + " ");
				}
				cont++;
			
			}
		} else if (seleccion == 2) {
			max = array_numero[0];
			for(int k = 0; k < array_numero.length; k++) {
				if (max < array_numero[k]) {
					max = array_numero[k];
				}
			}
			for(int l = 0; l < array_numero.length; l++) {
				if (cont == 10) {
					System.out.println();
					cont = 0;
				}
				if (array_numero[l] == max) {
					System.out.print("**"+array_numero[l] + "**");
				} else {
					System.out.print(array_numero[l] + " ");
				}
				cont++;
			
			}
		}
		
	}

}
