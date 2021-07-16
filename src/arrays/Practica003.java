package arrays;

import java.util.Scanner;

public class Practica003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in); 
		int[] array_1 = new int[10];
		for (int i = 1; i <= 10; i++) {
			System.out.println("Introduce el número");
			array_1[(i-1)] = entrada.nextInt();
		}
		entrada.close();
		System.out.println("Introdujiste estos números");
		for (int num: array_1) {
			System.out.println(num);
		}
	}

}
