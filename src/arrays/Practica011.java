package arrays;

import java.util.Scanner;

public class Practica011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_numero = new int[10];
		Scanner entrada = new Scanner(System.in);
		int cont_primo = 0;
		int cont_noprimo = 0;
		for (int i = 0; i < array_numero.length; i++) {
			System.out.println("Ingresa el número");
			array_numero[i] = entrada.nextInt();
		}
		entrada.close();
		for(int num: array_numero) {
			if (esPrimo(num)) {
				cont_primo++;
			} else {
				cont_noprimo++;
			}
		}
		int[] array_primo = new int[cont_primo];
		int[] array_noprimo = new int[cont_noprimo];
		int cont_primo_while = 0;
		int cont_noprimo_while = 0;
		for (int j = 0; j < array_numero.length; j++) {			
			if (esPrimo(array_numero[j])) {
				while (cont_primo_while < array_primo.length){					
					array_primo[(cont_primo_while)] = array_numero[j];
					break;
				};
				cont_primo_while++;
			}
		}
		
		for (int k = 0; k < array_numero.length; k++) {
			
			if (!esPrimo(array_numero[k])) {
				while (cont_noprimo_while < array_noprimo.length){					
					array_noprimo[(cont_noprimo_while)] = array_numero[k];
					break;
				};
				cont_noprimo_while++;
			}
		}
		
		for (int m = 0; m < array_primo.length; m++) {
			array_numero[m] = array_primo[m];
		}
		
		for (int n = array_primo.length; n < array_numero.length; n++){
			array_numero[n] = array_noprimo[(n- array_primo.length)];
		}
		
		for (int num: array_numero) {
			System.out.println(num);
		}
	}
	
	public static boolean esPrimo(int numero) {
		int cont = 0;
		boolean esPrimo = false;
		for(int i = 1; i <=numero; i++) {
			if ((numero % i) == 0) {
				cont++;				
			}		
		}
		
		if (cont <= 2) {
			esPrimo = true;
		} else {
			esPrimo = false;
		}
			
		return esPrimo;		
	}

}


