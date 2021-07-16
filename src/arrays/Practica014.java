package arrays;

import java.util.Scanner;

public class Practica014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array_palabras = new String[8];
		Scanner entrada = new Scanner(System.in);
		String[] array_colores = new String[] {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado",};
		for(int i = 0; i < array_palabras.length; i++) {
			System.out.println("Ingresa la palabra");
			array_palabras[i] = entrada.nextLine();
		}
		entrada.close();
		int cont_color = 0;
		int cont_nocolor = 0;
		for(int j = 0; j < array_palabras.length; j++) {
			for (int k = 0; k < array_colores.length; k++) {
				if (array_palabras[j].equalsIgnoreCase(array_colores[k])) {
					if (k < (array_colores.length-1)) {
						cont_color++;
					}
					break;
				} else {
					if (k == (array_colores.length-1)) {
						cont_nocolor++;
					}					
				}
			}
		}
		
		String[] array_color = new String[cont_color];
		String[] array_nocolor = new String[cont_nocolor];
		int cont_color_while = 0;
		int cont_nocolor_while = 0;
		for(int j = 0; j < array_palabras.length; j++) {
			for (int k = 0; k < array_colores.length; k++) {
				if (array_palabras[j].equalsIgnoreCase(array_colores[k])) {
					while(cont_color_while < array_color.length) {
						array_color[cont_color_while] = array_palabras[j];
						break;
					}
					cont_color_while++;
				} else {
					while(cont_nocolor_while < array_nocolor.length) {
						array_nocolor[cont_nocolor_while] = array_palabras[j];
						break;
					}
					cont_nocolor_while++;
				}
			}
		}
		
		for(int l = 0; l < array_color.length; l++) {
			array_palabras[l] = array_color[l];
		}
		

		for(int m = array_color.length; m < array_palabras.length; m++) {
			array_palabras[m] = array_nocolor[(m-array_color.length)];
		}
		
		for (int n = 0; n < array_palabras.length; n++) {
			System.out.print("__"+ n +"__");
		}
		System.out.println();
		for (int n = 0; n < array_palabras.length; n++) {			
			System.out.print("|"+ array_palabras[n]+"|");		
		}
		System.out.println();
		for (int n = 0; n < array_palabras.length; n++) {			
			System.out.print("_____");		
		}
	}

}
