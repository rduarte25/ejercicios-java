package arrays;

import java.util.Scanner;

public class Practica009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[8];
		Scanner entrada = new Scanner(System.in);
		for(int i = 0; i < num.length; i++) {
			System.out.println("Introduce el número");
			num[i] = entrada.nextInt();
		}
		entrada.close();
		for(int j = 0; j < num.length; j++) {
			if ((num[j] % 2) == 0) {
				System.out.println("El número " + num[j] + " es par");
			} else {
				System.out.println("El número " + num[j] + " es impar");
			}
		}
	}

}
