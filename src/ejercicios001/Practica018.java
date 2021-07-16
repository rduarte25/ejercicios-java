package ejercicios001;

import java.util.Scanner;

import funciones.Matematicas;

public class Practica018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("Introduce el número");
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		int exponente = 0;
		double decimal = 0;
		int digito = 0;
		int cont = 0;
		String binario = "";
		while (numero > 0) {
			digito = numero % 2;
			if (digito == 1) {
				cont++;
			}
			
			binario = digito + "" + binario;
			numero = numero / 2;
			
		}
		
		System.out.println(binario);
	}
}
