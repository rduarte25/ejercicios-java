package array_bidimencional;

import java.util.Scanner;

public class Practica002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array_numero = new int[4][5];
		Scanner entrada = new Scanner(System.in);
		for (int y = 0; y < array_numero.length; y++) {
			for (int x = 0; x < array_numero[0].length; x++) {
				System.out.println("Ingresa el numero");
				array_numero[y][x] = entrada.nextInt();
			}			
		}
		entrada.close();
		for (int y = 0; y < array_numero.length; y++) {
			for (int x = 0; x < array_numero[0].length; x++) {
				System.out.print("|" + array_numero[y][x] + "|");
			}
			System.out.println();
		}
	}

}
