package ejercicios001;

import java.util.Scanner;

import funciones.Matematicas;

public class Practica017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce el número");
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		int exponente = 0;
		double decimal = 0;
		int digito = 0;
		while (numero != 0) {
			digito = numero % 10;
			decimal = decimal + digito * Matematicas.potencia(2, exponente);
			exponente++;
			numero = numero / 10;
		}
		
		System.out.println(decimal);
	}

}
