package arrays;

import java.util.Scanner;

public class Practica005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_1 = new int[10];
		Scanner entrada = new Scanner(System.in);
		int min = 0;
		int max = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce el número");
			array_1[i] = entrada.nextInt();
		}
		
		for (int j = 0; j < array_1.length; j++) {
			
			if (min == 0) {
				min = array_1[j];
			} else if (min > array_1[j]) {
				min = array_1[j];
			}
			
			if (max == 0) {
				max = array_1[j];
			} else if (max < array_1[j]) {
				max = array_1[j];
			}			
		}
		
		for (int num: array_1) {
			if (num == min) {
				System.out.println("El numero: " + num + "es el minimo");
			} else if (num == max) {
				System.out.println("El numero: " + num + "es el maximo");
			} else {
				System.out.println("El numero: " + num);
			}
		}
		entrada.close();
	}

}
