package array_bidimencional;

import java.util.Scanner;

public class Practica008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] tablero_ajedrez = new String [8][8]; 
		System.out.println("Introduce la posición del alfil");
		Scanner entrada = new Scanner(System.in);
		String posicion = entrada.nextLine().toLowerCase();
		String[] columna = new String[] {"a", "b", "c", "d","e", "f", "g", "h",};
		int columna1 = 0;
		int fila1 = 0;
		for (int y = (tablero_ajedrez.length-1); y >= 0 ; y--) {
			for (int x = 0; x < tablero_ajedrez[0].length; x++) {
				if(posicion.equals(columna[x]+(y+1))) {
					columna1 = x;
					fila1 = y +1;
					System.out.println("El alfil esta en: " + (columna[x]+(y+1)));
				}
			}
		}
		entrada.close();
		int cont = 1;
		do {
			if ((fila1+cont) <= 8) {
				if ((fila1+cont) <= 7) {
					System.out.println(columna[(columna1+cont)]+""+(fila1+cont));
					System.out.println(columna[(columna1-cont)]+""+(fila1-cont));
				}				
				System.out.println(columna[(columna1-cont)]+""+(fila1+cont));
				
			}
			if ((fila1-cont) >= 1) {
				
				System.out.println(columna[(columna1+cont)]+""+(fila1-cont));
			}
			
			cont++;
		} while ((fila1+cont) <= 9);
		
	}
}
