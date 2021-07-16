package ejercicios001;

import funciones.Matematicas;

public class Practica016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 99999; i++) {
			if (Matematicas.esCapicua(i)) {
				System.out.println(i);
			}			
		}
	}

}
