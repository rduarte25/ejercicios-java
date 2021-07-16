package arrays;

import java.util.Scanner;

public class Practica006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_1 = new int[15];
		Scanner entrada = new Scanner(System.in);	
		for (int i = 0; i < array_1.length; i++) {
			System.out.println("Introduce el numero");
			array_1[i] = entrada.nextInt();
		}
		entrada.close();
		int aux_1 = 0;
		int aux_2 = 0;
		for (int j = 0; j < array_1.length; j++) {			
			if (j <= (array_1.length-1)) {				
				if (j == 0) {
					aux_1 = array_1[(j+1)];
					array_1[(j+1)] = array_1[j];
					aux_2 = aux_1;
				} else if ((j > 0) && (j < array_1.length-1)) {
					aux_1 = array_1[(j+1)];
					array_1[(j+1)] = aux_2;
					aux_2 = aux_1;
				} else if (j == (array_1.length-1)) {
					aux_1 = array_1[j];
					array_1[j] = aux_1;
					array_1[(array_1.length - array_1.length)] = aux_2;
				}
			} 
		}
		
		for (int num: array_1) {
			System.out.println(num);
		}
		
	}

}
