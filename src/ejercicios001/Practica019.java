package ejercicios001;

import java.util.Scanner;

import funciones.Matematicas;

public class Practica019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Solicitud de número.
		System.out.println("Introdusca el número");
		//Declaración de la variable entrada.
		Scanner entrada = new Scanner(System.in);
		//Declaración y asignación de la variable numero.
		int numero_ent =  entrada.nextInt();
		System.out.println(convertirHexadecimal(numero_ent));
		System.out.println(convertirOctal(numero_ent));
		System.out.println(convertirBinarioDecimal(Integer.parseInt(convertirBinario(numero_ent))));
		
		
		
		entrada.close();
	}
	
	//Declaración del metodo convertirHezadecimal.
	public static String convertirHexadecimal(int numero) {
		//Declaración de la variable digito.
		int digito = 0;
		//Declaración de la variable hexadecimal.
		String hexadecimal = "";
		//Declaración del array hexa_num.
		String [] array_hexa = new String [] {
				"0", "1", "2", "3",
				"4", "5", "6", "7",
				"8", "9", "A", "B",
				"C", "D", "E", "F",
		};
		
		//Declaración de la variable auxiliar digito_hexa.
		String digito_hexa = "";
		
		//Declaración del bucle while.
		while (numero > 0) {
			
			digito = numero % 16;
			for (int i = 0; i < array_hexa.length; i ++) {
				if (digito == i) {
					digito_hexa = array_hexa[i];
				}
			}
			hexadecimal = digito_hexa + "" + hexadecimal;
			numero = numero / 16;
		}
		
		return hexadecimal;
	}
	
	//Declaración del metodo convertirHezadecimal.
	public static String convertirOctal(int numero) {
		//Declaración de la variable digito.
		int digito = 0;
		//Declaración de la variable hexadecimal.
		String octal = "";
		//Declaración del bucle while.
		while (numero > 0) {
			
			digito = numero % 8;
			octal = digito + "" + octal;
			numero = numero / 8;
		}
		
		return octal;
	}
	
	//Declaración del metodo convertirHezadecimal.
	public static String convertirBinario(int numero) {
		//Declaración de la variable digito.
		int digito = 0;
		//Declaración de la variable hexadecimal.
		String binario = "";
		//Declaración del bucle while.
		while (numero > 0) {
			
			digito = numero % 2;
			binario = digito + "" + binario;
			numero = numero / 2;
		}
		
		return binario;
	}
	
	//Declaración del metodo convertirHezadecimal.
	public static double convertirBinarioDecimal(int numero) {
		//Declaración de la variable digito.
		int digito = 0;
		//Declaración del exponente.
		int exponente = 0;
		//Declaración de la variable hexadecimal.
		double decimal = 0;
		//Declaración del bucle while.
		while (numero != 0) {
			
			digito = numero % 10;
			decimal = decimal + digito * Matematicas.potencia(2, exponente) ;
			exponente++;
			numero = numero / 10;
		}
		
		return decimal;
	}

}
