package ejercicios001;

import funciones.Matematicas;

public class Practica001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 1000; i++) {
			if (Matematicas.esPrimo(i)) {
				System.out.println(i);
			}			
		}
	}

}
