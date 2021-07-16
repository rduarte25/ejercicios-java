package arrays;

import java.util.Scanner;

public class Practica012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_numero =  new int [10];
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < array_numero.length; i++) {
			System.out.println("Ingresa el numero");
			array_numero[i] = entrada.nextInt();
		}
		
		
		for(int j = 0; j < array_numero.length; j++) {
			System.out.print(j + "  ");;
		}
		
		System.out.println();
		
		for(int k = 0; k < array_numero.length; k++) {
			if (array_numero[k] >= 10) {
				System.out.print(array_numero[k] + " ");
			} else {
				System.out.print(array_numero[k] + "  ");
			}			
		}
		System.out.println();
		System.out.println("Ingresa la posición inicial");
		int posicion_inicial = entrada.nextInt();
		System.out.println("Ingresa la posición final");
		int posicion_final = entrada.nextInt();
		entrada.close();
		int aux_1 = 0;
		int aux_2 = 0;
		if (posicion_inicial >= posicion_final) {
			System.out.println("La posicion inicial no es correcta");
		} else {
			if (posicion_inicial < array_numero.length && posicion_final < array_numero.length) {
				aux_1 = array_numero[posicion_inicial];
				 
				for (int l = posicion_inicial; l > 0; l--) {
					array_numero[l] = array_numero[(l-1)];
				}
				aux_2 = array_numero[(array_numero.length-1)];
				for (int m = (array_numero.length -1); m >= posicion_final ;m--) {
					if (m > posicion_final) {
						array_numero[m] = array_numero[(m-1)];
					} else {
						array_numero[0] = aux_2;
						array_numero[posicion_final] = aux_1;
						
					}
					
				}
				
			} else {
				System.out.println("Las posiciones no estan en la longitud del array");
			}
		}
		
		for(int k = 0; k < array_numero.length; k++) {
			if (array_numero[k] >= 10) {
				System.out.print(array_numero[k] + " ");
			} else {
				System.out.print(array_numero[k] + "  ");
			}			
		}
		
	}	

}
