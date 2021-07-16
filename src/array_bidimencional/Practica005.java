package array_bidimencional;

public class Practica005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array_numero = new int [10][6];
		for (int y = 0; y < array_numero.length; y++) {
			for (int x = 0; x < array_numero[0].length; x++) {
				array_numero[y][x] = (int)(Math.random()*1001);
			}
		}
		int min = 0;
		int max = 0;
		for (int y = 0; y < array_numero.length; y++) {
			for (int x = 0; x < array_numero[0].length; x++) {
				if (min == 0) {
					min = array_numero[y][x];
				}
				if (max == 0) {
					min = array_numero[y][x];
				}
				
				if (min >  array_numero[y][x]) {
					min = array_numero[y][x];
				}
				
				if (max <  array_numero[y][x]) {
					max = array_numero[y][x];
				}
				
			}
		}
		
		int cont = 0;		
		for (int y = 0; y < array_numero.length; y++) {
			for (int x = 0; x < array_numero[0].length; x++) {
				System.out.print(array_numero[y][x] + " ");
				if (cont == 10) {
					System.out.println();
					cont = 0;
				} else {
					cont++;
				}
				if (min == array_numero[y][x]) {
					System.out.println("El minimo esta en la posición: " + y + "-" + x);
				}
				
				if (max == array_numero[y][x]) {
					System.out.println("El maximo esta en la posición: " + y + "-" + x);
				}
				
			}
		}
		
	}

}
