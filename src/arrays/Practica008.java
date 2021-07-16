package arrays;

import java.util.Scanner;

public class Practica008 {
	public static void main (String[] args) {
		System.out.println("Ingresa la temperatura de cada mes");
		int[] temp_agno = new int[12];
		String[] meses = new String[]{
				"Enero",
				"Febrero",
				"Marzo",
				"Abril",
				"Mayo",
				"Junio",
				"Julio",
				"Agosto",
				"Septiembre",
				"Octubre",
				"Noviembre",
				"Diciembre"
				};
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < temp_agno.length; i++) {
			System.out.println("Ingresa la temperatura de " + meses[i]);
			temp_agno[i] = entrada.nextInt();
		}
		entrada.close();
		
		System.out.print("||0||||5||||10||||15||||20||||25||||30||||35||||40||||45||||50||||55||||60||||65||||70||");
		System.out.println();
		for(int temp:temp_agno) {
			System.out.print("||");
			for(int j = 0; j <= temp; j++) {
				System.out.print("#");
			}
			System.out.print("||");
			System.out.println();
		}
	}
}
